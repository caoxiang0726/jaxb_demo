package com.demo;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "people", namespace = "abc")//设置根节点
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class People {

    public String id;
    public String name;
    public int age;

    public People() {
    } //要有无参数默认构造器

    public People(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}