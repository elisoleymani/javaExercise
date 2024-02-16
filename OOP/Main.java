import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("adam", "American","14/8/1999",12);

            if (person.applyPassport() == true) {
            person.setPassport();
        }
 
    
        System.out.println("Name: " + person.getName() + "\n" + 
        "Nationality: " + person.getNationality() + "\n" + 
        "Date of Birth: " + person.getDateOfBirth() + "\n" + 
        "Seat Number: " + person.getSeatNumber() + "\n" + 
        "Passport: " + Arrays.toString(person.getPassport()) + "\n");                 
        
    }
}
