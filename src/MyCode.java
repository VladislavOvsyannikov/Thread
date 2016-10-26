public class MyCode implements Runnable{

     static int t=1;

    public void run() {
        for (int i=1;i<=10000;i++){
            System.out.println(getFree());
        }
    }

    public synchronized int getFree(){
            return t++;
    }
}
