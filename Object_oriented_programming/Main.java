package Object_oriented_programming;

//if the class resides in the same package or folder you can use it without import 

public class Main {
    
    public static void main (String[] args){
        Human sidjain = new Human(18 , "Siddharth jain ", 10000, false); 
        Human kush = new Human(18 , "Kushal Lunia ", 10000, false); 
        Human isha = new Human(18 , "Isha parakh ", 10000, false); 

        System.out.println(sidjain.name);
        System.out.println(kush.population);
        System.out.println(sidjain.population);
        System.out.println(isha.population);

    }

}
