import java.io.*;
class asg3c {
    public static void main(String args[])
{ 
    Console c=System.console();
    String m=c.readLine("Orderid");
    int id=Integer.parseInt(m);

    String prdname=c.readLine("Product name");
    
    String s=c.readLine("Quantity");
    int p=Integer.parseInt(s);
 
    System.out.println(id+"\n"+prdname+"\n"+p);
}
}