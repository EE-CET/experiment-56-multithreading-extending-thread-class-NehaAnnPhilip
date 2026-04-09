class MyThread extends Thread {
    // TODO: Override the run() method
    @Override
    public void run() {
        // Inside run(), print "Thread is running"
        System.out.println("Thread is running");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        // TODO: Create an object of MyThread
        MyThread t1 = new MyThread();
        
        // TODO: Start the thread using start() method
        t1.start();
    }
}
