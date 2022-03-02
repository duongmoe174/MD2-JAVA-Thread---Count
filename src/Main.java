public class Main {
    public static void main(String[] args) {
        Count counts = new Count();
        try {
            while (counts.getMyThread().isAlive()) {
                System.out.println("DuongDepTrai still alive OH SHIETTT");
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e ) {
            System.out.println("SHUTDOWN DuongDepTrai");
        }
    }
}
