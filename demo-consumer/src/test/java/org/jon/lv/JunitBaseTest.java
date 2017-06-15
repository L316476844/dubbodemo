package org.jon.lv;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(
        locations = {"classpath:config/application-common.xml",
                "classpath:config/application-consumer.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Ignore
public class JunitBaseTest {

    @Test
    public void helloWorld(){
        System.out.println("hello world");
    }
}
