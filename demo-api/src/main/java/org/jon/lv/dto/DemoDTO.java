package org.jon.lv.dto;

import java.io.Serializable;

/**
 * Author lv bin
 * @date 2016/12/27 14:18
 * version V1.0.0
 */
public class DemoDTO implements Serializable {
    private String name;
    private Integer age;
    private String talk;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTalk() {
        return talk;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }
}
