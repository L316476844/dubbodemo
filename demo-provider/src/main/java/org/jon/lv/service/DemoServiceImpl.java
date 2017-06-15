package org.jon.lv.service;

import org.jon.lv.dto.DemoDTO;
import org.springframework.stereotype.Service;

/**
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2016/12/27 14:28
 * version V1.0.0
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public String sayHello(DemoDTO dto) {
        return "name:" + dto.getName() + " \n age:" + dto.getAge() + " \n talk:" + dto.getTalk();
    }
}
