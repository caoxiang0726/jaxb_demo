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

    /**
     * @XmlAttribute 指定一个字段或get/set方法映射到XML的属性。
     * 参数：name            指定属性名称
     *         namespace   指定属性命名空间
     *         required        是否必须（默认为false）
     *
     *   下面那个注释不会报错。
     */
//    @XmlAttribute(name = "size")
    private int size;

    /**
     * @XmlElement 指定一个字段或get/set方法映射到XML的节点。
     * 如，当一个类的XmlAccessorType被标注为PROPERTY时，在某一个没有get/set方法的字段上标注此注解，即可将该字段映射到XML。
     *
     * 下面那个@XmlElement注释掉会报错。（虽然该类上都标记全部field了，二层的根节点）
     *
     * 参数：defaultValue 指定节点默认值
     *         name            指定节点名称
     *         namespace   指定节点命名空间
     *         required        是否必须（默认为false）
     *         nillable          该字段是否包含nillable="true"属性（默认为false）
     *         type              定义该字段或属性的关联类型
     */
    @XmlElement(name = "people")
    private ArrayList<TestObj> objList;

}