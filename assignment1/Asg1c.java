import java.io.Console;
class Asg1c {
    public static void main(String args[])
{
    Console c=System.console();
    String name=c.readLine("Enter name");
    String dob=c.readLine("Enter dob");
    String add=c.readLine("Enter add");
    String cource=c.readLine("Enter cource");
    String collage=c.readLine("Enter collage");
    System.out.println(name+"\n"+dob+"\n"+add+"\n"+cource+"\n"+collage);
}   
}
