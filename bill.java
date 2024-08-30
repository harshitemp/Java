public class bill {
    public static void main(String[] args) {
        double taxrate=9.15/100;
        float mealcost=(float) 144.50;
        double taxamount=mealcost*taxrate;
        System.out.println("the taxamount is:"+taxamount);
        float totalaftertax=(float) (mealcost+taxamount);
        System.out.println("the total amount after tax is:"+totalaftertax);
        float tiprate=15/100;
        float tipamount=totalaftertax*tiprate;
        System.out.println("the tipamount is:"+tipamount);
        float totalbill=totalaftertax+tiprate;
        System.out.println("the total bill for a single customer:"+totalbill);

    }
    
}
