import java.util.Scanner;
import java.util.ArrayList;

public class Main{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
      
      System.out.println(" Want a menu bar :");
      
     StudentService service = new StudentService();
       
      String answer = input.next();
      if(answer.equals("yes")){
        while (true) {
        choice();
            System.out.println();
            System.out.println();
            System.out.println();
        System.out.println("Enter your choice of number :");
        int choiceofnum = input.nextInt();
        switch(choiceofnum){
          case 1:
          service.viewStudent();
              System.out.println();
              System.out.println();
          break;
          case 2:
             System.out.println("want to  add :");
             String ans = input.next();
            if(ans.equals("yes")){

            while( true ){
            System.out.println("Enter rollno :");
            int rollno = input.nextInt();
            System.out.println("Enter name :");
            String name = input.next();
            System.out.println("Enter course :");
            String course = input.next();

          
            Student s = new Student(rollno, name, course);
            service.addStudent(s);
                System.out.println();
                System.out.println();
            System.out.println("Student Added Successfully");
            
            System.out.println("want to  add one more :");
            String more = input.next();
            if (!more.equals("yes")) {
                    break; 
           }
          }
        }
          else{
            System.out.println("thank you !");
          }
           break;
            case 3: 
            System.out.println("enter rollno of student :");
            int searchrn = input.nextInt();
            service.searchStudent(searchrn);
                System.out.println();
                System.out.println();
            break;

            case 4:
              System.out.println("enter rollno of student :");
            int dltrn = input.nextInt();
            service.deleteStudent(dltrn);
                System.out.println();
                System.out.println();
            break;

            case 5:
              System.out.println("You are Exit");
              return;
              
  }
        
      }
    }
  
      else {
        System.out.println("Thank you!!");
        return;
      }
    }
  


static void choice(){
  System.out.println("1. View the Students: ");
  System.out.println("2. Add student :");
  System.out.println("3. Search student :");
  System.out.println("4. Delete student : ");
  System.out.println("5.Exit");
}
}
