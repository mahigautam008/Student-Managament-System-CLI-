//import java.util.Scanner;

class Student{
   private int rollno;
   private String name;
   private String course;
   

   Student(int rollno, String name, String course){
    this.rollno = rollno ;
    this.name = name ;
    this.course = course;
   }


  public int getrollno() {
    return rollno;
    
}
  public String getname(){
            return name;

        }
  public String getcourse(){
            return course ;
        }

        public String toString(){

                  System.out.println("Roll No : " + rollno);
                  System.out.println("Name    : " + name);
                  System.out.println("Course  : " + course);
                  System.out.println();
                  return rollno + " " + name + " " + course ;
                  
        }
 
  


//   public void details(){
//     System.out.println(this.name);
//     System.out.println(this.rollno);
//     System.out.println(this.course);
//  }

}



