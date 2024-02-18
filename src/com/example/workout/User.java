package com.example.workout;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String password;
    private int[][] workouts = new int[3][3];//First Dimeantion is workout template, second is the previous workout of this template 
    
    // Constructors
    public User() {
    }

    public User(String name, int[][] workouts) {
        this.name = name;
        this.workouts = workouts;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int[][] getWorkouts() {
        return workouts;
    }

    public void setWorkouts(int[][] workouts) {
        this.workouts = workouts;
    }
    
    public int getWorkoutElement(int row, int column) {
        if (row >= 0 && row < workouts.length && column >= 0 && column < workouts[row].length) {
            return workouts[row][column];
        } else {
            throw new IllegalArgumentException("Invalid index for workouts array");
        }
    }
    
    public void setWorkoutElement(int row, int column, int value) {
        if (row >= 0 && row < workouts.length && column >= 0 && column < workouts[row].length) {
            workouts[row][column] = value;
        } else {
            throw new IllegalArgumentException("Invalid index for workouts array");
        }
    }
}
