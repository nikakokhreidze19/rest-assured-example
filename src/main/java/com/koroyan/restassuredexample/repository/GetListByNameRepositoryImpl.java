package com.koroyan.restassuredexample.repository;

import com.koroyan.restassuredexample.pojos.response.GetListByNameResult;

public class GetListByNameRepositoryImpl implements GetListByNameRepository {
    @Override
    public GetListByNameResult getPersonName(String name) {
        return GetListByNameResultData.getListOfPersonByName(name);
    }
}
