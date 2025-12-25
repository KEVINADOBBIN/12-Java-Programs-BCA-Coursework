class MyThread implements Runnable {

    public void run() {
        System.out.println("run() started");

        for (int i = 1; i <= 10; i++) {
            System.out.println("The value is " + i);
        }

        System.out.println("run() completed");
    }
}

public class ThreadRunnable {

    public static void main(String[] args) {

        System.out.println("Main Thread Started");

        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj, "Thread One");

        t1.start();

        System.out.println("Main Thread Completed");
    }
}
