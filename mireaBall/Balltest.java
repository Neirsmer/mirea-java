package mireaBall;
import java.lang.*;
public class Balltest {

        public static void main (String[] args) {
            Ball b1 = new Ball ("Puma", 5);
            Ball b2 = new Ball ("Nike", 3);
            Ball b3 = new Ball ("Decatlon", 7);
            b3.setAge(1);
            System.out.println(b1);
            b1.intoBallAge();
            b2.intoBallAge();
            b3.intoBallAge();
        }
    }

