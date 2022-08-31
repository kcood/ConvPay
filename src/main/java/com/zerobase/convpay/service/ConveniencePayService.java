package com.zerobase.convpay.service;

import com.zerobase.convpay.dto.*;
import com.zerobase.convpay.type.*;

public class ConveniencePayService {

    private final MoneyAdaptor moneyAdaptor = new MoneyAdaptor();
    private final CardAdaptor cardAdaptor = new CardAdaptor();
    private final DiscountInterface discountInterface = new DiscountByPayMethod();
    //private final DiscountInterface discountInterface = new DiscountByConvenience();

    public PayResponse pay(PayRequest payRequest) {

        PaymentInterface paymentInterface;

        if (payRequest.getPayMethodType() == PayMethodType.CARD){
            paymentInterface = cardAdaptor;
        } else {
            paymentInterface = moneyAdaptor;
        }

        Integer discountedAmount = discountInterface.getDiscountedAmount(payRequest);
        PaymentResult payment = paymentInterface.payment(discountedAmount);

        if (payment == PaymentResult.PAYMENT_FAIL) {
            return new PayResponse(PayResult.FAIL, 0);
        }

        //SUCCESS CASE
        return new PayResponse(PayResult.SUCCESS, discountedAmount);

    }

    public PayCancelResponse payCancel(PayCancelRequest payCancelRequest) {
        PaymentInterface paymentInterface;

        if (payCancelRequest.getPayMethodType() == PayMethodType.CARD) {
            paymentInterface = cardAdaptor;
        } else {
            paymentInterface = moneyAdaptor;
        }

        CancelPaymentResult cancelPaymentResult = paymentInterface.cancelPayment(payCancelRequest.getPayCancelAmount());

        if (cancelPaymentResult == CancelPaymentResult.CANCEL_PAYMENT_FAIL) {
            return new PayCancelResponse(PayCancelResult.PAY_CANCEL_FAIL,0);
        }

        //SUCCESS CASE
        return new PayCancelResponse(PayCancelResult.PAY_CANCEL_SUCCESS,
                payCancelRequest.getPayCancelAmount());
    }
}
