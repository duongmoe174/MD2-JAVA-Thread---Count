public class Count implements Runnable {
    private Thread myThread;

    public Thread getMyThread() {
        return myThread;
    }

    public void setMyThread(Thread myThread) {
        this.myThread = myThread;
    }

    public Count() {
        myThread = new Thread(this, "DuongDepTrai");
        System.out.println("My thread is " + myThread);
        myThread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("count: " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("My thread interrupted");
        }
        System.out.println("Killed Duong T.T");
    }
}
