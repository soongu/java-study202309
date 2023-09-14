package day05.static_;

import util.Utility;
import static java.lang.Math.random;
import static java.lang.System.out;
import static util.Utility.*;

public class Main {
    public static void main(String[] args) {


//        Count.m1();

        Count c1 = new Count();
        Count c2 = new Count();

        c1.x = 10;
        c1.y = 50;

        c2.x = 20;
        c2.y = 100;


        c1.x *= 3;
        c1.y++;

        out.println("c1.x = " + Count.x); // 10
        out.println("c1.y = " + c1.y); // 50

//        Utility u = new Utility();
        makeLine();
        input("이름: ");

        random();

        System.out.println("c2.x = " + c2.x); // 20
        System.out.println("c2.y = " + c2.y); // 100


        Count.m1(c1);
        Count.m1(c2);

        c1.m2();
        c2.m2();

    }
}
