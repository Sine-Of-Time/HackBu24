package com.example.workout;
import java.util.*;
import java.io.Serializable;

public class Exercise implements Serializable { // Make Exercise serializable by implementing the Serializable interface
    // Member variables
    private int id;
    private String name;
    HashMap <Integer, float[]> setMap = new HashMap <Integer, float[]>();
    public Exercise () { //Default Constructor

    }

    public Exercise (String name){ //Constructor for use
      String exName=name;
      HashMap <Integer, float[]> setMap = new HashMap <Integer, float[]>();//Hashmap to store lbs and reps in a set
      //setMap.put(); //In hashmap, index of hashmap + 1, is the set number, put length [2] array into the content of the map, first element of array is lbs, second is reps

    }

    public float[] getSet (int setNum){ //Accesor method for set, parameter determines which set is accesed
        return setMap.get(setNum);
    }

    public void setSet (int setNum, float lbs, float reps){ //Mutator method to edit setMap, setNum determines which set in the map is changed, lbs and reps are the values added to the map
        float [] setArr = {lbs,reps}; //Array to put into setMap
        setMap.put(setNum,setArr); //put setArr at setNum index in the setMap Hashmap
    }

    public String getExName(){ //Accesor method for exercise name
        return name;
    }
}