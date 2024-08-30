import java.io.*;
import java.net.*;
public class myserver{
    public static void main(String args[]){
        try{
            ServerSocket ss=new ServerSocket(3002);
            Socket s=ss.accept();
            Socket h=ss.accept();
            DataInputStream din=new DataInputStream(s.getInputStream());
            String str=din.readUTF();
            DataInputStream di=new DataInputStream(h.getInputStream());
            String st=di.readUTF();
            System.out.println("message from client1"+str);
            System.out.println("message from client2"+st);
            din.close();
            di.close();
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
