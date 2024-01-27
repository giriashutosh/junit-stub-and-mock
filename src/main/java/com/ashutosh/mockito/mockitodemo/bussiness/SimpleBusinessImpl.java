package com.ashutosh.mockito.mockitodemo.bussiness;

public class SimpleBusinessImpl {
    private DataService dataService;

    public SimpleBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }

        return greatest;
    }
}

interface DataService{
    int[] retrieveAllData();
}

