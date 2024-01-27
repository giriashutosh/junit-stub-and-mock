package com.ashutosh.mockito.mockitodemo.bussiness;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SimpleBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SimpleBusinessImpl businessImpl;
    @Test
    public void testFindTheGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15, 3});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
    @Test
    public void testFindTheOneValueData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24});
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}
