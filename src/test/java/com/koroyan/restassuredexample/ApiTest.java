package com.koroyan.restassuredexample;

import com.koroyan.restassuredexample.data.dataproviders.DataProviders;
import com.koroyan.restassuredexample.pojos.response.GetListByNameResult;
import com.koroyan.restassuredexample.repository.GetListByNameRepository;
import com.koroyan.restassuredexample.repository.GetListByNameRepositoryImpl;
import com.koroyan.restassuredexample.steps.Step;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.annotations.Test;


public class ApiTest {

    Step step = new Step();
    GetListByNameRepository getListByNameRepository = new GetListByNameRepositoryImpl();

    @Test(dataProvider = "nameProvider", dataProviderClass = DataProviders.class)
    public void TestGetListByName(String name) throws JSONException {
        GetListByNameResult apiPerson = step.GetListByName(name);
        GetListByNameResult databaseList = getListByNameRepository.getPersonName(name);
        JSONAssert.assertEquals(apiPerson.toString(), databaseList.toString(), false);

        //თვალსაჩინოებისთვის თუ სტრინგი არ დაჭირდა რადგან @Data ანოტაცია თავისით აგენერირებს
        System.out.println("first" + apiPerson);
        System.out.println("second" + databaseList);
    }
}
