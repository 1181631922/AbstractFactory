package com.fanyafeng.abstractfactory.vrfactory;

import com.fanyafeng.abstractfactory.abfactory.AbstractFactory;
import com.fanyafeng.abstractfactory.mobilephonefactory.MobilePhone;
import com.fanyafeng.abstractfactory.vr.DaPeng;
import com.fanyafeng.abstractfactory.vr.HeadSet;

/**
 * Created by fanyafeng on 16/7/1.
 */
public class VRFactory extends AbstractFactory{
    @Override
    public MobilePhone getMobilPhone(String phone) {
        return null;
    }

    @Override
    public VR getVR(String vr) {
        switch (vr){
            case "DaPeng":
                return new DaPeng();
            case "HeadSet":
                return new  HeadSet();
            default:
                return null;
        }
    }
}
