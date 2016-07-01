package com.fanyafeng.abstractfactory.mobilephonefactory;

import com.fanyafeng.abstractfactory.abfactory.AbstractFactory;
import com.fanyafeng.abstractfactory.mobilephone.HTC;
import com.fanyafeng.abstractfactory.mobilephone.Iphone;
import com.fanyafeng.abstractfactory.mobilephone.Mi;
import com.fanyafeng.abstractfactory.vrfactory.VR;

/**
 * Created by fanyafeng on 16/7/1.
 */
public class MobilePhoneFactory extends AbstractFactory{
    @Override
    public MobilePhone getMobilPhone(String phone) {
        switch (phone){
            case "HTC":
                return new HTC();
            case "Iphone":
                return new Iphone();
            case "Mi":
                return new Mi();
            default:
                return null;
        }
    }

    @Override
    public VR getVR(String vr) {
        return null;
    }
}
