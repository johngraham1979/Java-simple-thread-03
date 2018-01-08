package threading.demo.pkg3;

/**
 *
 * @author John Graha,
 * @Date 9 January 2018
 */
public class ThreadingDemo3 {

    /**
 * @param args the command line arguments
     */
    public static void main(String[] args) {
        //First thread anomymously implementing run();
        Thread thread1 = new Thread(() -> {
            /*
            *   Some arbitrary "work" (The sme as in an earlier repo.
             */
            for (int i = 0; i < 10; i++) {
                System.out.println("doing some work");
                // Print the thread id to the console and notice it is different between threads.
                System.out.println("Thread id = " + Thread.currentThread().getId());
            }

            try {
                // A small sleep
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                // Neccesary exception handling when using Thread.sleep(...);
                System.out.println("InterruptedException using Thread.sleep(100);");
                System.out.println(ex.getMessage());
            }
        });

        //Second thread anomymously implementing run();
        Thread thread2 = new Thread(() -> {
            /*
            *   Some arbitrary "work" (The sme as in an earlier repo.
             */
            for (int i = 0; i < 10; i++) {
                System.out.println("doing some work");
                // Print the thread id to the console and notice it is different between threads.
                System.out.println("Thread id = " + Thread.currentThread().getId());
            }

            try {
                // A small sleep
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                // Neccesary exception handling when using Thread.sleep(...);
                System.out.println("InterruptedException using Thread.sleep(100);");
                System.out.println(ex.getMessage());
            }
        });
        // start threads.
        thread1.start();
        thread2.start();
    }

}
