package com.zerobase.convpay.config;

import com.zerobase.convpay.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@ComponentScan(basePackages = "com.zerobase.convpay")
public class ApplicationConfig {

//    public ConveniencePayService conveniencePayService(){
//        return new ConveniencePayService(
//                new HashSet<>(
//                        Arrays.asList(new MoneyAdaptor(), new CardAdaptor())
//                ),
//                new DiscountByPayMethod()
//        );
//    }

//    @Bean
//    public ConveniencePayService conveniencePayService() {
//        return new ConveniencePayService(
//                new HashSet<>(Arrays.asList(moneyAdaptor(), cardAdaptor())),
//                discountByConvenience()
//        );
//    }
//
//    @Bean
//    public CardAdaptor cardAdaptor() {
//        return new CardAdaptor();
//    }
//
//    @Bean
//    public MoneyAdaptor moneyAdaptor() {
//        return new MoneyAdaptor();
//    }
//
//    @Bean
//    public DiscountByConvenience discountByConvenience() {
//        return new DiscountByConvenience();
//    }

}
