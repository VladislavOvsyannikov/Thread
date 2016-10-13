public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new MyCode());
        Thread t2 = new Thread(new MyCode());
        Thread t3 = new Thread(new MyCode());
        Thread t4 = new Thread(new MyCode());

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
    }
}
