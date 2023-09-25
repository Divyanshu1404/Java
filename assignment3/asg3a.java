import java.io.*;
class asg3a {
    public static void main(String args[])
{ 
    Console c=System.console();
    String bname=c.readLine("Book name");
    String pname=c.readLine("Publisher name");
    String authour=c.readLine("Authour name");
    System.out.println(bname+"\n"+pname+"\n"+authour);
}
}