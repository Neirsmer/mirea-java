package mireaBook;
import java.lang.*;
public class boooktest {

    public static void main(String[] args) {
        Book b1 = new Book("Easy learn Japan", 20);
        Book b2 = new Book("Chinese", 22);
        Book b3 = new Book("English", 8);
        b3.setAge(1);
        System.out.println(b1);
        b1.intoBookAge();
        b2.intoBookAge();
        b3.intoBookAge();
    }
}
