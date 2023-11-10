package org.example;

import java.util.HashMap;
import java.util.Map;

public class Apotheke {

    private Map<String, Medication> medicationList = new HashMap<>();

    public Apotheke(){

    }
    public Apotheke(Map<String,Medication> medicationList){
        this.medicationList=medicationList;
    }


    public int getCount(){
        return this.medicationList.size();
    }

    public void save(Medication medication){
        this.medicationList.put(medication.getName(),medication);
    }

    public Medication find(String medicationName){
        return this.medicationList.getOrDefault(medicationName, null);
    }
    public void delete(String medicationName){
        this.medicationList.remove(medicationName);
    }

    public void displayApotheke(){
        System.out.println(this.medicationList.toString());
    }
}
