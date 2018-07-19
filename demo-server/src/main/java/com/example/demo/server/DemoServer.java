package com.example.demo.server;

import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.foundation.common.utils.Log4jUtils;

public class DemoServer {
    public static void main(String[] args) throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
    }
}
