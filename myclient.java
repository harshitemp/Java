import java.io.*;
import java.net.*;
public class myclient{
    public static void main(String args[]){
        try{
            Socket s=new Socket("localhost",3002);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("hello server");
            
            dout.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}