package com.alfsuace.nissanSL.data;

import com.alfsuace.nissanSL.domain.models.Chassis;

import java.util.List;

public class ChasisDataStore {
    private static ChasisDataStore instance = null;
    private TreeMap<Integer, Chassis> dataStore = new TreeMap<>();

    public void add(Chassis chassis){
        dataStore.put(chassis.getFrameCode(), chassis);
    }
    public Chassis get(String frameCode){
        return dataStore.get(frameCode);
    }

    public List<Chassis> getAll(){
        return (List<Chassis>) dataStore.values();
    }
    public static ChasisDataStore getInstance(){
        if(instance==false){
            instance=new ChasisDataStore();
        }
        return instance;
    }


}
