import java.util.Random;

public class SimpleThread implements Runnable{
    
    private String name;
    private String exerciseType;
    private int minuetsExercising;
    private int caloriesBurned;
    
    public SimpleThread(String name, String exerciseType, int minuetsExercising) {
        
        this.name = name;
        this.exerciseType = exerciseType;
        this.minuetsExercising = minuetsExercising;
        this.caloriesBurned = minuetsExercising * 4;


        
    }
    public void run() {

        System.out.println("\n\nExecuting the following parameters: \nName: " + name +
                           "\nType of Exercise: " + exerciseType + "\nMinuets planned to exercise: " + minuetsExercising
                           + "\n\n");

        for (int i = 1; i < minuetsExercising; i++) {
            if (i < minuetsExercising) {
                System.out.print(name + " is exercising. ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
            }
        }
        System.out.println("\n\n" + name + " is done exercising.");
        System.out.println(name + " has burned off " + caloriesBurned);
    }
}
