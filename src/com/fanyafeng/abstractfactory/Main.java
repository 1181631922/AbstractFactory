package com.fanyafeng.abstractfactory;

import com.fanyafeng.abstractfactory.abfactory.AbstractFactory;
import com.fanyafeng.abstractfactory.abfactory.FactoryProducter;
import com.fanyafeng.abstractfactory.mobilephonefactory.MobilePhone;
import com.fanyafeng.abstractfactory.vrfactory.VR;
import com.fanyafeng.abstractfactory.vrfactory.VRFactory;

/**
 * Created by fanyafeng on 16/7/1.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory vrFactory = FactoryProducter.getFactory("VRFactory");
        VR vr = vrFactory.getVR("DaPeng");
        vr.research();

        AbstractFactory mobilePhoneFactroy=FactoryProducter.getFactory("MobilePhoneFactory");
        MobilePhone mobilePhone=mobilePhoneFactroy.getMobilPhone("Mi");
        mobilePhone.create();
    }
}
