package Object_oriented_programming;

public class Into {
    

       public static void main(String[] args) {

        // Student student1 = new Student();// this  refrence variable is in the stack mem 

        // student1.rno = 11; 
        // student1.name = "Siddharth Chopda";


      
        Student student2 = new Student(12,"Sidjain" , 123.34f);
        
        System.out.println(student2.rno);
        System.out.println(student2.name);
        System.out.println(student2.marks);

      }
}

    // create a class 
class Student {
    int rno ;
    String name ;
    float marks;

    Student(int rno , String name , float marks ){
        this.rno = rno ; 
        this.name =  name  ; 
        this.marks = marks ; 

    }
}    

