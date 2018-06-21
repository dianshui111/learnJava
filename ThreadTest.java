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

	//��������Thread������run()����ʱ�����ܸ���������������start()��stop()��interrupt()��join()��sleep()�ȵȡ�
	//����start������������Ҫ���ⴴ�� thread�Ķ��������ÿ���run�����ĵ��á�
	// public void start(){
	// 	if(t==null){
	// 	t=new Thread(this, threadName);
	// 	t.start();//��ɶ�run�����ĵ���
	// 	}
	// }

	public static void main(String[] args) {
		ThreadTest thread1=new ThreadTest("Thread1");
		thread1.start();
		ThreadTest thread2=new ThreadTest("Thread2");
		thread2.start();
	}
}