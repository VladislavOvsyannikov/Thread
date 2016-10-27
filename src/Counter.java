public class Counter {
    int t;

    public Counter(int t) {
        this.t=t;
    }

    public void start() throws InterruptedException {
        Thread t1 = new Thread(new MyCode(t));
        Thread t2 = new Thread(new MyCode(t));
        Thread t3 = new Thread(new MyCode(t));
        Thread t4 = new Thread(new MyCode(t));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }

    public static class MyCode implements Runnable{
        static int t;

        public MyCode(int t){
            this.t = t;
        }

        public void run() {
            for (int i=1;i<=10000;i++){
                System.out.println(getFree());
            }
        }

        public synchronized int getFree(){
            return t++;
        }
    }












}
