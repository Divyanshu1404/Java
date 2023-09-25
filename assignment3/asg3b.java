import java.io.*;
class asg3b {
    public static void main(String args[])
{   Console c=System.console();

    String prdname=c.readLine("Product name");

    String manuname=c.readLine("Manufacture name");
    
    String s=c.readLine("Price");
    int id=Integer.parseInt(s);
 
    System.out.println(prdname+"\n"+manuname+"\n"+id);
}
}
