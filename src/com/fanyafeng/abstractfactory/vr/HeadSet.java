package com.fanyafeng.abstractfactory.vr;

import com.fanyafeng.abstractfactory.vrfactory.VR;

/**
 * Created by fanyafeng on 16/7/1.
 */
public class HeadSet implements VR {
    @Override
    public void research() {
        System.out.println("HTC研究的VR产品");
    }
}
