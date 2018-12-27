package com.demo;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root_people", namespace = "root_ns")
/**
 * 设置根节点
 * 将一个Java类映射为一段XML的根节点
 * 参数：name定义这个根节点的名称；namespace 定义这个根节点命名空间
 */
@XmlAccessorType(XmlAccessType.FIELD)
/**
 * @XmlAccessorType 定义这个类中的何种类型需要映射到XML。可接收四个参数，分别是：
 *      XmlAccessType.FIELD：映射这个类中的所有字段到XML
 *      XmlAccessType.PROPERTY：映射这个类中的属性（get/set方法）到XML
 *      XmlAccessType.PUBLIC_MEMBER：将这个类中的所有public的field或property同时映射到XML（默认）
 *      XmlAccessType.NONE：不映射
 */
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