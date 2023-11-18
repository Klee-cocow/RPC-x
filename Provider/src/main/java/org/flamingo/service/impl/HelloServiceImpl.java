package org.flamingo.service.impl;

import org.flamingo.service.HelloService;

/**
 * @author 咏鹅
 * @version 1.0
 * @description TODO
 * @date 2023/11/18 21:52
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + " WelCome to JRPC";
    }
}
