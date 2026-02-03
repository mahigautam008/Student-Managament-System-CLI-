import java.util.ArrayList;

class StudentService{
     ArrayList<Student> list = new ArrayList<> ();
     
            public void viewStudent() {
            if( list.isEmpty()){
              System.out.println("No students found");
            }
            else{
             System.out.println(list);
            }
            }
            public void addStudent( Student s) {
               list.add(s);
               System.out.println(list);
            }
            public void searchStudent(int searchrn) {
              boolean found = false ;
                  for (Student s : list) {
        if (s.getrollno() == searchrn) {

            System.out.println("Student Found ");
            System.out.println("Roll No : " + s.getrollno());
            System.out.println("Name    : " + s.getname());
            System.out.println("Course  : " + s.getcourse());

            found = true;
            break;
           }
           }
           if (!found){
             System.out.println("student not found ");
            }
            }
            public void deleteStudent(int dltrn) {
             boolean found = false ;
                  for (Student s : list) {
        if (s.getrollno() == dltrn){
         list.remove(s);
        }
        else {
            System.out.println("student must be present in data");
        }
            }
            
}
           
}
   
