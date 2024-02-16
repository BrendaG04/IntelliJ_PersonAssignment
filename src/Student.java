public class Student extends Person {
   private String StudentID;
   private int GraduationYear;
   private String GraduationSemester;
   private double GPA;

//DEFAULT CONSTRUCTOR
   Student(){
       this.firstName="Brenda";
       this.lastName="Galdamez";
       this.DOB="08/19/2004";
       this.StudentID="RST-0008";
       this.GPA=5.25;
       this.GraduationYear=2023;
       this.GraduationSemester="FALL";

   }

//THIS CODE ADDS MORE INFO OF STUDENT TO THE PERSON toString/printing statement
    @Override
    public String toString() {
       String content=" ";
        content += "\r\n"+"StudentID: "+this.StudentID+"\r\n"+"GPA: "+ this.GPA+"\r\n"+"GraduationYear: "+this.GraduationYear+"\r\n"+"GraduationSemester: "+this.GraduationSemester;
        return super.toString()+content;
    }
}
