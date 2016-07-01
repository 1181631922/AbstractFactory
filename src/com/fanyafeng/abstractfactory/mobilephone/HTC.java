package com.fanyafeng.abstractfactory.mobilephone;

import com.fanyafeng.abstractfactory.mobilephonefactory.MobilePhone;

/**
 * Created by fanyafeng on 16/7/1.
 */
public class HTC implements MobilePhone {
    @Override
    public void create() {
        System.out.println("HTC制造的手机");
    }
}
