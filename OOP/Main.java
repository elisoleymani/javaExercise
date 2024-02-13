import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("adam", "American","14/8/1999",12);

        

        //person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
        person.setSeatNumber(10);
        
        Person twin = new Person(person); // creates a copy of the first object.
        twin.setName("Jad Slim"); // updates name field of the second object.
        twin.setSeatNumber(3); // updates the seat number of the second object.
    
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " 
        + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + 
        "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        System.out.println("Name: " + twin.getName() + "\n" +
        "Nationality: " + twin.getNationality() + "\n" + 
        "Date of Birth: " + twin.getDateOfBirth() + "\n" + 
        "Seat Number: " + twin.getSeatNumber() + "\n");
   
        
    }
}
