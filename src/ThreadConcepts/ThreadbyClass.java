package ThreadConcepts;

public class ThreadbyClass extends Thread {
    public void run(){
        for (int i=0; i<=10; i++){
            System.out.println(currentThread().getName() + ":" + i);
        }
    }
    public static void main(String[] args) {

        ThreadbyClass example = new ThreadbyClass();

        Thread thread1 = new Thread(example);
        Thread thread2 = new Thread(example);
        thread1.setName("first thread");
        thread2.setName("second thread");

        thread1.start();
        thread2.start();

    }
}

