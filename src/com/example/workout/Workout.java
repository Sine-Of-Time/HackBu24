package com.example.workout; // Adjust the package name as needed
import java.io.Serializable;

// e.g.:
// Workout object has a name 'Chest day'
// Workout object named 'Chest day' has array made up of 3 different exercizes
// Exercize is an object made up of: Name, Reps, Count

// e.g.:
// Workout : Chest Day[]
//      Exercize : Bench   
//          Exercize : Name, Rep, Lbs, 

public class Workout implements Serializable{   

    // Declaring name of the workout (Push Day, Pull Day, Leg Day)
    private final String name;
    // Declaring list made up of the exersizes (e.g. bench, fly, inclined bnech)
    private final Exercise[] workout;

    // Constructor, create an instance of a workout (e.g create a Push Day)
    Workout(String name)
    {
        // Name of the workout (Push Day, Pull Day, Leg Day)
        this.name = name;
        // List made up of the exercizes (e.g. bench, fly, inclined bnech)
        workout = new Exercise[3];
    }

    // Gets the exercise (e.g. bench, fly, inclined bench) from Exersize.java
    public Exercise[] getExcersize()
    {
        // place holder, grab the exercize from Exersize.java
        return workout;
    }

    // Adds this excercize to the current workout array  (e.g. add 'bench' to 'Push Day')
    // Paramaters: 
    //             exercize: The exercize to add to the array
    //             index   : The index of the workout array to add the exercize to
    public void addExcersize(Exercise exercize, int index)
    {
        // add the exercise to the workout array
        workout[index] = exercize;
    }

    // Gets the name of the workout (e.g. Leg Day, Push Day, Pull Day)
    public String getName()
    {
        return name;
    }

    // Gets the workout (e.g. retrieve the Pull Day)
    public Exercise[] getWorkout()
    {
        return workout;
    }
}