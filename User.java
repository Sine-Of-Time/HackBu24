package application;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String password;
    //[0][x] is the first day. with x amount of previous days.
    //[1][x] is the first day. with x amount of previous days.
    //[2][x] is the first day. with x amount of previous days.
    private Workout[][] workouts = new Workout[3][3];//First Dimeantion is workout template, second is the previous workout of this template 
    
    // Constructors
    public User() {
    }

    public User(String name,String password, Workout[][] workouts) {
        this.name = name;
        this.password=password;
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

    public Workout[][] getWorkouts() {
        return workouts;
    }

    public void setWorkouts(Workout[][] workouts) {
        this.workouts = workouts;
    }
    
    public Workout getWorkoutElement(int row, int column) {
        if (row >= 0 && row < workouts.length && column >= 0 && column < workouts[row].length) {
            return (Workout) workouts[row][column];
        } else {
            throw new IllegalArgumentException("Invalid index for workouts array");
        }
    }
    
    public void setWorkoutElement(int row, int column,Workout value) {
        if (row >= 0 && row < workouts.length && column >= 0 && column < workouts[row].length) {
            workouts[row][column] = value;
        } else {
            throw new IllegalArgumentException("Invalid index for workouts array");
        }
    }
}
