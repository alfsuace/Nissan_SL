package com.alfsuace.nissanSL.data;

import com.alfsuace.nissanSL.domain.models.Engine;

import java.util.List;

public class EngineDataStore {
    private static EngineDataStore instance = null;
    private TreeMap<Integer, Engine> dataStore = new TreeMap<>();

    public void add(Engine engine){
        dataStore.put(Engine.getCode(), engine);
    }
    public Engine get(String code){
        return dataStore.get(code);
    }

    public List<Engine> getAll(){
        return (List<Engine>) dataStore.values();
    }
    public static EngineDataStore getInstance(){
        if(instance==false){
            instance=new EngineDataStore();
        }
        return instance;
    }

}

}
