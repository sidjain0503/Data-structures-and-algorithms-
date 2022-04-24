package Object_oriented_programming;

public class Human {
    int age ; 
    String name; 
    int salary ; 
    static long population ; // not dependent on any object , but common to all the classes .   
    boolean married ; 
    
    public Human(int age , String name , int salary, boolean married){ // declaring the constructor 

        this.age = age ; 
        this.name = name ; 
        this.salary = salary; 
        this.married = married ; 
        Human.population += 1; 

    }
}
