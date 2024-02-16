public class Person {
    protected String firstName;
    protected String lastName;
    protected String DOB;

//Default Constructor
    public Person(){
        this.firstName="Brenda";
        this.lastName="Galdamez";
        this.DOB="03/12/2002";
    }

    /* EXTRA UN-USED INFO /NOTES FROM THE VIDEO & CLASS
//Parametric Constructor
    public Person(String _firstName, String _lastName){
         this.firstName=_firstName;
         this.lastName=_lastName;
    }
//Copy Constructor
    public Person(Person p){
        this.firstName=p.firstName;
        this.lastName=p.lastName;
    }
*/


//Setter 1
    public void setFirstName(String _firstName){
        this.firstName=_firstName;
    }
//Getter 1
    public String getFirstName() {
        return firstName;
    }


//Setter 2
    public void setLastName(String _lastName){
        this.lastName=_lastName;
    }
//Getter 2
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        String content=" ";
        content="FirstName: "+ this.firstName+"\r\n"+ "LastName: "+this.lastName+"\r\n"+ "DOB: "+this.DOB;
        return content;
    }
}
