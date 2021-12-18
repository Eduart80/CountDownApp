package CountDownApp1;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class class2 {
    static int internal;
    static Timer timer;

    public static void main(String[] args) {
        countSec();
    } // end of main

    public static void countSec(){
        boolean retry = false;
        do {
            System.out.print("Enter seconds: ");
            Scanner input = new Scanner(System.in);
            try {
                String res = input.nextLine();
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
            } catch (Exception e) {
                e.getLocalizedMessage();
                System.out.println("Wrong entry, use Numbers Only!");
                retry = true;
            }
        }while (retry);

    }

    private static final int setInterval() {
        if (internal == 1)
            timer.cancel();
        return --internal;
    }


}
/**
 * boolean retry = false;
 * do {
 *     try {
 *         runJob();
 *         retry = false;
 *     } catch (SpecificException e) { //timeout, network failure exceptions
 *         logger.error("Exception in running thread: "
 *             + this.getName() + ", restarting job");
 *         retry = true;
 *     }
 * } while(retry);
 */
