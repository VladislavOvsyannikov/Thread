public class MyCode implements Runnable{

    int t;

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
