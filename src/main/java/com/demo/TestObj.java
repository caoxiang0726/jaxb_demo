package com.demo;

import lombok.Data;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class TestObj {

    private long id;
    private String name;
    private Date birthday;

    public TestObj() {

    }

    public TestObj(long id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

}