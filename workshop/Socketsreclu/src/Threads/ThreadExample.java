package Threads;

public class ThreadExample implements Runnable{
	
	@Override
	public void run()
	{
		for(int i = 0; i<=5; i++){
			System.out.println(Thread.currentThread().getName()+" is the current thread runnun");
		}
	}
	
	public static void main (String[] args){
		Runnable rr = new ThreadExample();
		Thread t1 = new Thread(rr);
		Thread t2 = new Thread(rr);
		t1.setName("Thread one");
		t2.setName("Thread two");
		t1.start();
		t2.start();
		
		for (int i = 0; i< 10; i++){
			System.out.println("main thread");
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){}
		}
	}

}
