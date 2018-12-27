package com.demo;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.ArrayList;
import java.util.Date;

public class JaxbWriteXml {
 
	public static <T> Marshaller getMarshaller(Class<T> c) throws JAXBException{
		
		JAXBContext context = JAXBContext.newInstance(c);
		Marshaller marshaller = context.createMarshaller(); 
		//编码格式 
		marshaller.setProperty(Marshaller.JAXB_ENCODING,"UTF-8");
		//是否格式化生成的xml串    
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		//是否省略xml头信息（<?xml version="1.0" encoding="gb2312" standalone="yes"?>）
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);
		
		return marshaller;
	}
	
	@Test
	public void test_xml() throws JAXBException{
		Marshaller marshaller = getMarshaller(People.class);
        People people = new People("001","灰太狼",22);  
//        marshaller.marshal(people, System.out);
        marshaller.marshal(people, System.out);
	}
	
	@Test
	public void test_xml2() throws JAXBException{
		Marshaller marshaller = getMarshaller(ObjList.class);
        
		ArrayList<TestObj> list = new ArrayList<TestObj>(); 
        TestObj testObj1 = new TestObj(111, "灰太狼", new Date());
        TestObj testObj2 = new TestObj(222, "灰太狼", new Date());
        list.add(testObj1);
        list.add(testObj2);
        
        ObjList objlist = new ObjList();
        objlist.setObjList(list);
        marshaller.marshal(objlist, System.out);
	}
}