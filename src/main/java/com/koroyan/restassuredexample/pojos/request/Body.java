package com.koroyan.restassuredexample.pojos.request;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({GetListByName.class})
@XmlType(namespace = "http://tempuri.org")
public class Body {

    @XmlAnyElement(lax = true)
    private Object object;

    public Body() {
    }

    public Body(Object object) {
        this.object = object;
    }

}
