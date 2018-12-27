package com.demo;

import lombok.Data;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "peoples")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ObjList {

    @XmlAttribute(name = "size")
    private int size;

    @XmlElement(name = "people")
    private ArrayList<TestObj> objList;

}