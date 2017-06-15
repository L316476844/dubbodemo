package org.jon.lv.ao;

import org.jon.lv.JunitBaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileNotFoundException;

/**
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2016/12/27 16:48
 * version V1.0.0
 */
public class DemoAOTest extends JunitBaseTest {
    @Autowired
    private DemoAO demoAO;

    @Test
    public void testHello() throws FileNotFoundException {
       demoAO.hello("抠逼阵儿");
   }

}
