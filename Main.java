import java.util.Scanner;
class Workout {
    String type;
    int duration;//in minutes

    void showWorkout(){
        System.out.println("Workout: " + type);
        System.out.println("Duration: "  + duration + " minutes");
    }
}
class RunnigWorkout extends Workout {
    double distance;

    void showDetails(){
        showWorkout();
        System.out.println("Distance: " + distance + " km" );
        System.out.println("Calories burned: " + (distance * 60));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RunnigWorkout wk1 = new RunnigWorkout();
        System.out.println("Enter workout type:");
        wk1.type = sc.nextLine();
        System.out.println("Enter duration (minutes): " );
        wk1.duration = sc.nextInt();
        System.out.println("Enter distance (km): ");
        wk1.distance = sc.nextDouble();

        System.out.println("-----Workout Summary-----");
        wk1.showDetails();



    }
}