//you need this line is to import a package just like #include in c and c++
import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {
/*
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
        // Example 4
        System.out.println("This is the example 4");
        System.out.println("what age did u want to change: ");
        age=input.nextInt();
        System.out.println("Your age have been updated. You are "+age);
        if(age<18){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are a teacher");
        }
        // Example 5
        boolean repeatit=true;
        while(repeatit){
            System.out.println("Playing current song");
            System.out.println("You want to change other song: ");
            String songinput= input.nextLine();
            if(songinput.equals("yes")){
                repeatit=false;
            }

        }
        */
        System.out.println("Playing the next song");
        // Challenge multiple choice
        String question="Which number did u want to choose(write in letter)?";
        String choiceOne="One";
        String choiceTwo="Two";
        String choiceThree="Three";
        String userinput="";
        
        String correctAnswer= choiceTwo;
        Scanner input=new Scanner(System.in);
        System.out.println(question);
        userinput=input.nextLine();
        if(userinput.equals(correctAnswer)){
            System.out.println("You choose correct");
        }
        else{
            System.out.println("You choose wrong");
        }
        
    }
}