public class Example1{

    int price = 10;
    public int updatePrice(Example1 ex2, int price){

        price = price * 2;
        ex2.price = ex2.price + 100;
        return ex2.price;
    }

    public static void main (String [] args){

        int newPrice = 20;

        Example1 ex1 = new Example1();

        int y = ex1.updatePrice(ex1, newPrice);

        System.out.println(ex1.price);
        System.out.println(y);
    }
}