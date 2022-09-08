class Q{
    int n;
    boolean valueSet=false;
    synchronized int get()
    {
        while(!valueSet)
        try{
            wait();
        }
        catch(InterruptedException e)
        {
            System.out.println("InterptedException caught");
        }
        System.out.println("Got:"+n);
        valueSet=false;
        notify();
        return n;
    }
    synchronized void put(int n)
{
    while(valueSet)
    try{
        wait();
    }
    catch(InterruptedException e)
{
    System.out.println("interupted exception caught");
 
}
this.n=n;
valueSet=true;
System.out.println("Put:"+n);
notify();
}
}
class Producer implements Runnable
{
    Q q;
    Producer(Q q){
        this.q=q;
        new Thread(this,"producer").start();
    }
    public void run(){
        int i;
        for(i=0;i<10;i++)
            q.put(i);
        }
    
}
class Consumer implements Runnable
{
    Q q;
    Consumer(Q q){
        this.q=q;
        new Thread(this,"Consumer").start();
    }
    public void run(){
        int i;
        for(i=0;i<10;i++)
            q.get();
        }
    }


public class synchronize {
   public static void main(String[] args) {
    Q q=new Q();
    new Producer(q);
    
    new Consumer(q);
    System.out.println("PRESS CONTROL-C TO STOP");
   } 
}
