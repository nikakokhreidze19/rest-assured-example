package com.koroyan.restassuredexample.data.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public static Object[][] nameProvider() {
        return new Object[][]{
                {"Xavier"}
        };
    }
}

