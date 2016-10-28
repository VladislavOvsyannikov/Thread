public class Counter {
    int t;

    public Counter(int t) {
        this.t=t;
    }

    public void start() throws InterruptedException {
        MyCode code = new MyCode(t);
        Thread t1 = new Thread(code);
        Thread t2 = new Thread(code);
        Thread t3 = new Thread(code);
        Thread t4 = new Thread(code);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }

    public class MyCode implements Runnable{
        int t;

        public MyCode(int t){
            this.t = t;
        }

        public void run() {
            for (int i=1;i<=10000;i++) {
                synchronized (this) {
                    System.out.println(getFree());
                }
            }
        }

        public int getFree(){
            synchronized(this) {
                return t++;
            }
        }
    }
}
