package com.fanyafeng.abstractfactory.abfactory;

import com.fanyafeng.abstractfactory.mobilephonefactory.MobilePhone;
import com.fanyafeng.abstractfactory.vrfactory.VR;

/**
 * Created by fanyafeng on 16/7/1.
 */
public abstract class AbstractFactory {
    public abstract MobilePhone getMobilPhone(String phone);

    public abstract VR getVR(String vr);
}
