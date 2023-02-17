package src.basic;

public class Variables {
    public static void main(String[] args) {

        //INT
        int age = 30;
        System.out.println("my age is " + age + " years");

        int ageNow = age + 10;
        System.out.println("my age is now " + ageNow);

        age = (2*3) + 6;
        System.out.println("What's my age?, it's " + age );

        /////////////////////////////////////////////
        System.out.print(age);
        System.out.println(" that's my age");

        int divider = 5/2;
        System.out.print("Division must be integer ");
        System.out.println(divider);


        //DOUBLE
        double salary;
        salary = 1200.00;
        System.out.println("my salary is " + salary);

        double bonus = 200.00;
        double total = bonus * salary;
        System.out.println("My new salary " + total);

        ///////////////////
        double divider2 = 6/3;
        System.out.print("Divide must be divided ");
        System.out.println(divider2);

        //Conversion

        double money = 1200.34;
        int realMoney = (int)money;
        System.out.println("price in integer " + realMoney);


    }
}
