abstract class Bike
{
abstract void run();
}
class Pulsur extends Bike
{
void run(){System.out.println("safely");}
public static void main(String args[])
{
Bike obj=new Pulsur();
obj.run();
}
}