package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentSerivce {

    int create(Payment payment);

    Payment getParameterById(@Param("id") Long id);
}
