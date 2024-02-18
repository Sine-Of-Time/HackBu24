package com.example.workout;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;



//import profiles.User;

public class DataCenter {
    private static DataCenter instance = null;
    private static HashMap<User,User> map = new HashMap<>();
    private File dir;

    private DataCenter() {
    	readHashMapFromFile("u.ser");
    }

    public static DataCenter getInstance() {
        if (instance == null) {
            instance = new DataCenter();
        }
        return instance;
    }

    public HashMap<User,User> getAllUser() {
        return map;
    }

    public boolean add(User u) {
        map.put(u,u);
        return true;
    }

    public boolean remove(User b) {
        if (b == null) {
            return false;
        }
        map.remove(b);
        return true;
    }

    public static void writeHashMapToFile(HashMap<User,User> hashMap, String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(hashMap);
            System.out.println("HashMap has been written to the file: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dump() {
    	writeHashMapToFile(map,"u.ser");
    }

    public static HashMap<User,User> readHashMapFromFile(String fileName) {
        HashMap<User,User> hashMap = new HashMap<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            Object obj = inputStream.readObject();
            if (obj instanceof HashMap) {
                hashMap=(HashMap<User,User>) obj;
            } else {
                System.out.println("File does not contain a HashMap.");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        map=hashMap;
        return hashMap;
    }
}