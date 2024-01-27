package com.ashutosh.mockito.mockitodemo.bussiness;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleBussinessImplStubTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        DataServiceStub dataServiceStub = new DataServiceStub();
        SimpleBusinessImpl businessImpl = new SimpleBusinessImpl(dataServiceStub);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {24, 6, 15};
    }
}
//problem with this approach is if there is any new method added to the interface then we have to implement it in the stub class
//and if we have multiple test cases then we have to create multiple stub classes
//so we can use mockito to create mock objects
//mockito is a mocking framework which helps us to create mock objects
//mockito is a framework which creates mock objects for a given interface or a given class
