package com.alfsuace.nissanSL.data;

import com.alfsuace.nissanSL.domain.models.Wheel;

import java.util.List;

public class WheelDataStore {
    private static WheelDataStore instance = null;
    private TreeMap<Integer, Wheel> dataStore = new TreeMap<>();

    public void add(Wheel wheel){
        dataStore.put(wheel.getCode(), Wheel);
    }
    public Wheel get(String code){
        return dataStore.get(code);
    }

    public List<Wheel> getAll(){
        return (List<Wheel>) dataStore.values();
    }
    public static WheelDataStore getInstance(){
        if(instance==false){
            instance=new WheelDataStore();
        }
        return instance;
    }

}

}
