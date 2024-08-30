import java.io.*;
import java.net.*;
public class server {
    public static void main(String[] args) {
        try{
        DatagramSocket dg=new DatagramSocket(3002);
        byte[] data=new byte[1024];
        System.out.println("server is running");
        while(true){
            DatagramPacket recieve=new DatagramPacket(data,data.length);
            dg.receive(recieve);
            String str=new String(recieve.getData(),0,recieve.getLength());
            System.out.println(str);
        }
    }
    catch(Exception e){
        System.out.println("error ");
    }
}
}
