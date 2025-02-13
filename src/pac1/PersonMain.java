package pac1;

public class PersonMain {
    public static void main(String[] args) {

        Person Joshua=new Person("Joshua","Karki",'M', 23, "170lbs", "123-456-7890");
        
        System.out.println("Lab 1.6:");
        System.out.println("Person Details");
        System.out.println("__________________");
        System.out.println("First Name: "+Joshua.firstname);
        System.out.println("Last Name: "+Joshua.lastname);
        System.out.println("Gender: "+Joshua.gender);
        System.out.println("Age: "+Joshua.age);
        System.out.println("Weight: "+Joshua.weight);
        System.out.println("Phone number: " + Joshua.phoneNumber);

        // To showing implementation of method that displays person details
        System.out.println("\n*******************************************\nLab 1.7");
        Joshua.showDetails();
    }
}
