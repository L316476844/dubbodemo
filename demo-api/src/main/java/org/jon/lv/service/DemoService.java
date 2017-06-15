package org.jon.lv.service;


import org.jon.lv.dto.DemoDTO;

/**
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2016/12/27 14:18
 * version V1.0.0
 */
public interface DemoService {
    String sayHello(String name);

    String sayHello(DemoDTO dto);
}
