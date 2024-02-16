public class Admin extends Person {
    private String AdminID;
    private String hiringDate;

//DEFAULT CONSTRUCTOR
    Admin(){
        this.firstName="Gloria";
        this.lastName="Rivera";
        this.DOB="04/09/1971";
        this.AdminID="RA-0004";
        this.hiringDate="08/19/2023";
    }

//THIS CODE ADDS MORE INFO OF AN ADMIN TO THE PERSON toString/printing statement
    @Override
    public String toString() {
        String content=" ";
        content+="\r\nAdminID: "+ this.AdminID+"\r\n"+ "HiringDate: "+this.hiringDate;
        return super.toString()+content;
    }
}
