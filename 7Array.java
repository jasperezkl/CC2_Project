package AQUINO_and_BISWELAN;
import java.util.Scanner;
public class Age {
    public static void main (String[]args) {
      Scanner input= new Scanner(System.in);
     
     int age;
     System.out.println("Please Enter your Age");
     age=input.nextInt();
     
     if(age >=0 && age<=2){
        System.out.println("baby");
     }
     else if(age >=3 && age<=5){
        System.out.println("toddler");
     }
     else if(age >=6 && age<=12){
        System.out.println("kid");
     }
      else if(age >=13 && age<=19){
        System.out.println("teenager");
     }
      else if(age >=20 && age<=34){
        System.out.println("young adult");
     }
      else if(age >=35 && age<=45){
        System.out.println("middle ager");
     }
      else if(age >=46){
        System.out.println("old");
      }
      else 
          System.out.println("very Old");
}
}