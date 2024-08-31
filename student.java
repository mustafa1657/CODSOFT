import java.util.Scanner; 

public class student {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your maths marks:");
        double maths = sc.nextDouble(); 
        System.out.println("Enter your biology marks:");
        double biology = sc.nextDouble(); 
        System.out.println("Enter your chemistry marks:");
        double chemistry = sc.nextDouble(); 
        System.out.println("Enter your physics marks:");
        double physics = sc.nextDouble(); 
        System.out.println("Enter your English marks:");
        double english = sc.nextDouble(); 
        System.out.println("Enter your Hindi marks:");
        double hindi = sc.nextDouble(); 
        double total=maths + biology + chemistry + physics + english + hindi;
        double percentage = ((maths + biology + chemistry + physics + english + hindi) / 600) * 100;
        System.out.println("Percentage of this year is: " + percentage);
        System.out.println("total marks are:"+total);
        if(percentage>=90){
            System.out.println("your grade is:A+");
        }
        else if(percentage>=80){
            System.out.println("your grade is:A");
        }
        else if(percentage>=70){
            System.out.println("your grade is:B+");
        }
        else if(percentage>=60){
            System.out.println("your grade is:B");
        }
        else if(percentage>=50){
            System.out.println("your grade is:c+");
        }
        else if(percentage<50){
            System.out.println("your grade is:C\nyou are fail");
        }
        else{
            System.out.println("invalid number");
        }
    }
}
