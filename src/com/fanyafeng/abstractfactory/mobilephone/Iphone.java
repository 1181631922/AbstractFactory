package com.fanyafeng.abstractfactory.mobilephone;

import com.fanyafeng.abstractfactory.mobilephonefactory.MobilePhone;

/**
 * Created by fanyafeng on 16/7/1.
 */
public class Iphone implements MobilePhone {
    @Override
    public void create() {
        System.out.println("苹果制造的手机");
    }
}
