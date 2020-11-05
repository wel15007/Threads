import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteSimpleThread {

    public static void main(String[] args) {
        ExecutorService myService = Executors.newFixedThreadPool(1);

        SimpleThread st1 = new SimpleThread("Henry", "Weight Lifting", 180);
        SimpleThread st2 = new SimpleThread("Nathan", "Aerobics", 150);
        SimpleThread st3 = new SimpleThread("Steven", "Cardio", 120);
        SimpleThread st4 = new SimpleThread("Staci", "Leg Exercises", 90);
        SimpleThread st5 = new SimpleThread("Larry", "Chest Exercises", 60);

        myService.execute(st1);
        myService.execute(st2);
        myService.execute(st3);
        myService.execute(st4);
        myService.execute(st5);

        myService.shutdown();

    }
}
