import java.util.Scanner;
public class job {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of minutes");
        int h=sc.nextInt();
        int jobs=38;
        int rtime=jobs-h;
        if( jobs<=h){
            System.out.println("he reach office");
        }
        
        else{
            System.out.println("he is not reached office");
        }
    }
}
