package CountDownApp1;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class mainClass {

    static int internal;
    static Timer timer;

    public static void main(String[] args) {

        System.out.print("Enter seconds: ");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        internal = Integer.parseInt(res);
        System.out.println(res);
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println(setInterval());
            }
        }, delay, period);
    }
    private static final int setInterval() {
        if (internal == 1)
            timer.cancel();
        return --internal;
    }
}