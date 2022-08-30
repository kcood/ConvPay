package com.zerobase.convpay.service;

import com.zerobase.convpay.type.MoneyUseCancelResult;
import com.zerobase.convpay.type.MoneyUseResult;

public class MoneyAdaptor {
    public MoneyUseResult use(Integer payAmount){
        System.out.println("MoneyAdaptor.use : " + payAmount);

        if (payAmount > 1000_000){
            return MoneyUseResult.USE_FAIL;
        }

        return MoneyUseResult.USE_SUCCESS;
    }

    public MoneyUseCancelResult useCancel(Integer payCancelAmount){
        System.out.println("MoneyAdaptor.useCancel : " + payCancelAmount);

        if (payCancelAmount < 100){
            return MoneyUseCancelResult.MONEY_USE_CANCEL_FAIL;
        }

        return MoneyUseCancelResult.MONEY_USE_CANCEL_SUCCESS;

    }
}
