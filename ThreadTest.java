public class ThreadTest extends Thread{
	private String threadName;
	//private Thread t;

	ThreadTest(String name){
		threadName=name;
		System.out.println("create"+threadName);
	}

	public void run(){
		try{
			for(int i=0;i<10;i++){
				Thread.sleep(50);
				System.out.println(threadName+": i="+i);
			}
		}catch(InterruptedException e){
			System.out.println(threadName+"is interrupted!");
		}
		System.out.println(threadName+"is exit!");

	}

	//采用派生Thread并覆盖run()方法时，不能覆盖其他方法，如start()，stop()，interrupt()，join()，sleep()等等。
	//覆盖start（）方法后，需要另外创建 thread的对象来调用控制run（）的调用。
	// public void start(){
	// 	if(t==null){
	// 	t=new Thread(this, threadName);
	// 	t.start();//完成对run（）的调用
	// 	}
	// }

	public static void main(String[] args) {
		ThreadTest thread1=new ThreadTest("Thread1");
		thread1.start();
		ThreadTest thread2=new ThreadTest("Thread2");
		thread2.start();
	}
}