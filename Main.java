import java.util.LinkedList;
public class Main{
    public static void main(String[] args){
        LinkedList<String> cars= new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        LinkedList<String> brands= new LinkedList<String>();
        brands.add("Microsoft");
        brands.add("Google");
        brands.add("Apple");
        brands.addAll(cars);
        System.out.println(brands);
    }
}