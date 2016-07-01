package com.fanyafeng.abstractfactory.abfactory;

import com.fanyafeng.abstractfactory.mobilephonefactory.MobilePhoneFactory;
import com.fanyafeng.abstractfactory.vrfactory.VRFactory;

/**
 * Created by fanyafeng on 16/7/1.
 */
public class FactoryProducter {
    public static AbstractFactory getFactory(String factroy) {
        switch (factroy) {
            case "MobilePhoneFactory":
                return new MobilePhoneFactory();
            case "VRFactory":
                return new VRFactory();
            default:
                return null;
        }
    }
}
