import java.io.*;
import java.net.*;
public class client2{
    public static void main(String[] args) {
        try{
            DatagramSocket n =new DatagramSocket();
            String msg="hi";
            byte[] sd=msg.getBytes();
            InetAddress addr=InetAddress.getByName("localhost");
            DatagramPacket sendpacket=new DatagramPacket(sd,sd.length,addr,3002);
            n.send(sendpacket);
            System.out.println("msg sent");
            n.close();
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}