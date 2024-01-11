import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Example 1
        int age=19;
        double grade=3.0;
        char gender='M';
        boolean programmer=true;

        System.out.println(age);
        System.out.println(gender);
        System.out.println(grade);
        System.out.println(programmer);

        // Example 2
        String myName="Thuan";
        char firstname=myName.charAt(0);
        System.out.println(myName +" first character of this is "+ firstname);
        // Example 3
        Scanner input= new Scanner(System.in);
        //the line 23 above u need it because it a way to make sure that your computer can access into the data
        System.out.println("what age did u want to change: ");
        age=input.nextInt();
        System.out.println("Your age have been updated. You are "+age);

    }
}