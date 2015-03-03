class fiveDemo extends Thread {
   private Thread t;
   private String threadName;
   
   fiveDemo( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
   }
   public void run() {
	int s=5;
      System.out.println("Running " +  threadName );
      try {
         for(int i = 1; i <= 10; i++) {
            System.out.println(s + "*" + i +"=" + s*i);
            // Let the thread sleep for a while.
            Thread.sleep(2000);
         }
     } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
     }
     System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start ()
   {
      System.out.println("Starting " +  threadName );
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}
class sevenDemo extends Thread {
   private Thread t;
   private String threadName;
   
   sevenDemo( String name){
       threadName = name;
       System.out.println("Creating " +  threadName );
   }
   public void run() {
	int s=7;
      System.out.println("Running " +  threadName );
      try {
         for(int i = 1; i <= 10; i++) {
            System.out.println(s + "*" + i +"=" + s*i);
		System.out.println();
            // Let the thread sleep for a while.
            Thread.sleep(2000);
         }
     } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
     }
     System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start ()
   {
      System.out.println("Starting " +  threadName );
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}


class TestThread {
   public static void main(String args[]) {
   	fiveDemo T1 = new fiveDemo( "Table of 5");
      T1.start();
      sevenDemo T2 = new sevenDemo( "Table of 7");
      T2.start();
      
      
   }   
}