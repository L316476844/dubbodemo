package org.jon.lv.ao;

import org.jon.lv.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

/**
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2016/12/27 16:40
 * version V1.0.0
 */
@Service
public class DemoAO {
    @Autowired
    private DemoService demoService;

    public void hello(String name) throws FileNotFoundException {
        System.out.println(demoService.sayHello(name));
    }

}
