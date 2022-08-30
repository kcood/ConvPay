package com.zerobase.convpay.dto;

public class PayRequest {
    //편의점 종류
    ConvenienceType convenienceType;

    //결제 금액
    Integer payAmount;



    public PayRequest(ConvenienceType convenienceType, Integer patAmount) {
        this.convenienceType = convenienceType;
        this.payAmount = patAmount;
    }

    public ConvenienceType getConvenienceType() {
        return convenienceType;
    }

    public void setConvenienceType(ConvenienceType convenienceType) {
        this.convenienceType = convenienceType;
    }

    public Integer getPatAmount() {
        return payAmount;
    }

    public void setPatAmount(Integer patAmount) {
        this.payAmount = patAmount;
    }
}
