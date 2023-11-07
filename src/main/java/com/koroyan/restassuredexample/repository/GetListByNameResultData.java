package com.koroyan.restassuredexample.repository;

import com.koroyan.restassuredexample.pojos.response.GetListByNameResult;
import com.koroyan.restassuredexample.pojos.response.PersonIdentification;

import java.util.ArrayList;
import java.util.List;

public class GetListByNameResultData {
    private static List<PersonIdentification> addIdentificationList;

    public static GetListByNameResult getListOfPersonByName(String name) {
        if (addIdentificationList == null) {
            createResultData();
        }

        List<PersonIdentification> ListContainsPersonName = new ArrayList<>();

        for (int i = 0; i < addIdentificationList.size(); i++) {
            PersonIdentification person = addIdentificationList.get(i);
            if (person.getName().contains(name)) {
                ListContainsPersonName.add(person);
            }
        }

        return new GetListByNameResult(ListContainsPersonName);
    }

    private static void createResultData() {
        addIdentificationList = new ArrayList<>();
        addIdentificationList.add(new PersonIdentification(
                89,
                "Xavier,Bob D.",
                "708-96-6126",
                "1966-08-11"));
        addIdentificationList.add(new PersonIdentification(
                10,
                "Xavier,Joe I.",
                "640-94-6892",
                "2013-12-12"));
        addIdentificationList.add(new PersonIdentification(
                41,
                "Xavier,Jose V.",
                "611-16-6306",
                "1929-01-07"));
        addIdentificationList.add(new PersonIdentification(
                116,
                "Xavier,Orson Q.",
                "261-54-9130",
                "1966-06-08"));
    }
}

