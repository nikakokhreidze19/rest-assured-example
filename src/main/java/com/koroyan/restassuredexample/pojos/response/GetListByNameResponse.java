package com.koroyan.restassuredexample.pojos.response;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GetListByNameResponse")
@XmlType(namespace = "http://tempuri.org")
@Data
public class GetListByNameResponse {
    @XmlElement(name = "GetListByNameResult")
    private GetListByNameResult getListByNameResult;

    public GetListByNameResponse(GetListByNameResult getListByNameResult) {
        this.getListByNameResult = getListByNameResult;
    }

}
