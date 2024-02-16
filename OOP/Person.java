public class Person {

    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name,String nationality,String dateOfBirth,int seatNumber){

            this.name = name;
            this.nationality = nationality;
            this.dateOfBirth = dateOfBirth;
            this.seatNumber = seatNumber;
            this.passport = new String[3];
    }

    public Person(Person source){

        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
    
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    public String[] getPassport() {
        return Arrays.copyOf(passport, passport.length);
    }
    public void setPassport() {
        this.passport = new String[] {name, nationality, dateOfBirth};
    }

    
/**
 *  Function name: applyPassport
 *  @return (boolean)
 *
 *  Inside the function:
 *     1. Returns a random boolean of true or false.
 */

public boolean applyPassport(){
    int number = (int) (Math.random() * 2);  //random int that can be 0 or 1.
    return number == 1;
}

/**
 *  Function name: chooseSeat
 *
 *  Inside the function:
 *    1. Sets this.seat to a random number between 1 -- 11.
 */
public void chooseSeat(){
    seatNumber = (int) (Math.random() * 11 + 1); 
}

}
