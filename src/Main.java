public class Main {

    public static void main(String[] args) {

        Thread MyThreadClass = new Thread(new Runnable(){
            public void run(){
                System.out.println("My thread class one running");
            }
        });
        Thread MyThreadClass1 = new Thread(new Runnable(){
            public void run(){
                System.out.println("My thread class two running");
            }
        });
        Thread MyThreadClass2 = new Thread(new Runnable(){
            public void run(){
                System.out.println("My thread class three running");
            }
        });
        Thread MyThreadClass3 = new Thread(new Runnable(){
            public void run(){
                System.out.println("Existing the thread");
            }
        });
        MyThreadClass.start();
        MyThreadClass1.start();
        MyThreadClass2.start();
        MyThreadClass3.start();

    }
}
