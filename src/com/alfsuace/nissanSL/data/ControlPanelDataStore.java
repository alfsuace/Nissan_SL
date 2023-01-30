package com.alfsuace.nissanSL.data;

import com.alfsuace.nissanSL.domain.models.Chassis;
import com.alfsuace.nissanSL.domain.models.ControlPanel;

import java.util.List;

public class ControlPanelDataStore {
    private static ChasisDataStore instance = null;
    private TreeMap<Integer, ControlPanel> dataStore = new TreeMap<>();

    public void add(ControlPanel controlPanel){
        dataStore.put(controlPanel.getCode(), controlPanel);
    }
    public ControlPanel get(String code){
        return dataStore.get(code);
    }

    public List<ControlPanel> getAll(){
        return (List<ControlPanel>) dataStore.values();
    }
    public static ChasisDataStore getInstance(){
        if(instance==false){
            instance=new ControlPanelDataStore();
        }
        return instance;
    }

}

}
