public class Staff extends Person{
    //StaffID=FACULTY ID
    private String StaffID;
    private String Position;
    private String hiringDate;

//Default Constructor
    Staff(){
        this.firstName="Ever";
        this.lastName="Zavala";
        this.DOB="03/12/2000";
        this.StaffID="RS-0003";
        this.hiringDate="01/01/2022";
        this.Position="Faculty";
    }

    /* EXTRA UN-USED INFO /NOTES FROM THE VIDEO/CLASS
//Parametric Constructor
    Staff(String _StaffID, String _Position, String _hiringDate, String _firstName, String _lastName ){
        this.StaffID=_StaffID;
        this.Position=_Position;
        this.hiringDate=_hiringDate;
        this.firstName=_firstName;
        this.lastName=_lastName;
    }
//Copy Constructor
    Staff(Staff S){
        this.StaffID=S.StaffID;
        this.Position=S.Position;
        this.hiringDate=S.hiringDate;
        this.firstName=S.firstName;
        this.lastName=S.lastName;
    }


    @Override
    public String toString() {
        System.out.println("The Staff FirstName:"+ this.firstName);
        System.out.println("The Staff LastName:"+ this.lastName);
        System.out.println("The Staff DOB:"+ this.DOB);
        System.out.println("The Staff StaffID:"+ this.StaffID);
        System.out.println("The Staff Position:"+ this.Position);
        System.out.println("The Staff HiringDate:"+ this.hiringDate);
        return" ";
    }
     */


//THIS CODE ADDS MORE INFO OF STAFF TO THE PERSON toString/printing statement
    @Override
    public String toString() {
        String content=" ";
        content+="\r\nThe Staff StaffID:"+ this.StaffID+ "\r\nThe Staff Position: "+ this.Position+ "\r\nThe Staff HiringDate: "+ this.hiringDate;
        return super.toString()+content;
    }
}
