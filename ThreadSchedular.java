/**
 * 
 */
 public class ThreadSchedular implements Runnable {
	Thread t;
	public void run()
	{
		for (int i = 0 ; i < 10 ; i++){
			System.out.println(
				Tread.currentThread().getName() + " "+ i);
			try {
				//using this method to print 1  to 10 numbers with 1000ms
				Thread.sleep(1000);
			}
			catch (Exception e){
				System.out.println(e);
				
			}
		}
	}
	
	public static void main(String[] args)throws Exception 
	{
		Thread t = new  Thread (new ThreadSchedular());
		
		//call run() function 
		t.start();
		
		Thread t2 = new Thread (new ThreadSchedular());
		
		//call run() function 
		t.start();
		}
	}	
		
		