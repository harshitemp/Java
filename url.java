import java.net.*;
    public class url{
        public static void main(String args[]) throws MalformedURLException{
           @SuppressWarnings("deprecation")
        URL obj = new URL("http://localhost:4200/home");
       
        String protocol=obj.getProtocol();
        String host=obj.getHost();
        String file=obj.getFile();
        int port= obj.getPort();
        System.out.println(protocol);
        System.out.println(host);
        System.out.println(file);
        System.out.println(port);
    

    }
}