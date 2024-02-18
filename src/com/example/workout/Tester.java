package com.example.workout;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tester {

    public static void main(String[] args) {
        // Get an instance of DataCenter
        DataCenter dataCenter = DataCenter.getInstance();
              
        HashMap<User,User> usersBefore=dataCenter.getAllUser();
        System.out.println("Users before creation:");
        for (Map.Entry<User, User> entry : usersBefore.entrySet()) {
        	User key = entry.getKey(); // Get the key (User object)
        	User value = entry.getValue(); // Get the value (User object)
            System.out.println("Key="+key.getName());
        }
        
        System.out.println("--------------------------------------");
        // Create some test users
        User user1 = new User("Alice", new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        User user2 = new User("Bob", new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}});
        	
        dataCenter.add(user1); 
        dataCenter.add(user2); 
        
        dataCenter.dump();
    }
}