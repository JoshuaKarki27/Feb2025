package pac1;

public class Lab1_4 {
    public static void main(String[] args) {
        System.out.println("Person Details: ");
        System.out.println("_________________");
        System.out.println("First Name: Joshua");
        System.out.println("Last Name: Karki");
        System.out.println("Gender: M");
        System.out.println("Weight: 170lbs\n\n");

        int a=100;
        int b=200;
        int c=300;
        int d=400;

        System.out.println("100 + 200: " + (a+b));
        System.out.println("200 - 100: " + (b-a));
        System.out.println("100 * 200: " + (a*b));
        System.out.println("200 / 100: " + (b/a));
        System.out.println("100 % 200: " + (a%(b+1)));
        System.out.println("100 + 1: " + (++a));

        System.out.println("Bitwise: " + (50<<1));

        // Box object
        Box mybox = new Box(10.0, 5.0, 5.0);
        Box yourbox = new Box(2.0, 5.0, 5.0);

        System.out.println(mybox.calcVolume());
        System.out.println(mybox.getID());

        System.out.println(yourbox.calcVolume());
        System.out.println(yourbox.getID());

    }
}
