# Lab Fitness Tracker
This program keeps tracks of the user's workout and calculates the calories. 

# How to Run
1.Open the program in your IDE.
2.Enter the workout name, duration, and distance.
3.View the output.

## Example Output 
Enter workout type:
Morning Run
Enter duration (minutes): 
45
Enter distance (km): 
6.5
-----Workout Summary-----
Workout: Morning Run
Duration: 45 minutes
Distance: 6.5 km
Calories burned: 390.0

### Parent class code Sample 
```java
class Workout {
    String type;
    int duration;//in minutes

    void showWorkout(){
        System.out.println("Workout: " + type);
        System.out.println("Duration: "  + duration + " minutes");
    }
}
```

## Author 
Sherry


## Code Review
- **Reviewed by:** Emaan Taquie
- **Status:** Checked code. Inheritance (`extends`), Scanner input, and calorie calculations are all correct and working!
