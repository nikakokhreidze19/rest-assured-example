package com.koroyan.restassuredexample.services;

import com.koroyan.restassuredexample.pojos.request.Body;
import com.koroyan.restassuredexample.pojos.request.Envelope;
import com.koroyan.restassuredexample.pojos.request.GetListByName;

public class RequestService {

    public static Envelope getFindListPersonRequestModel(String name) {
        return new Envelope(
                new Envelope.Header(),
                new Body(new GetListByName(name)));
    }


}
