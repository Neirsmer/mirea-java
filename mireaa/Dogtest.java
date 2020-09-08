package mireaa;
import java.lang.*;
public class Dogtest {


    public static void main (String[] args) {
        Dog d1 = new Dog ("Ricky", 1);
        Dog d2 = new Dog ("John", 10);
        Dog d3 = new Dog ("Alex", 7);
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}