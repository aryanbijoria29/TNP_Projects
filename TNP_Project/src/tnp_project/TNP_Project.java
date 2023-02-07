
package tnp_project;
import java.util.*;

public class TNP_Project {
    
    public static void quiz(String Name, String Enrollment){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> questions = new ArrayList<>();
        ArrayList<Character> selected = new ArrayList<>();
        int marks = 0;
        questions.add("Q1. Who invented Java Programming? \n a.Guido van Rossum\n b.James Gosling"
                + "\n c.Dennis Ritchie\n d.Bjarne Stroustrup");
        questions.add("Q2. Which component is used to compile, debug and execute the java programs?"
                + " \n a.JRE\n b.JIT\n c.JDK\n d.JVM");
        questions.add("Q3. Which one of the following is not a Java feature?"
                + " \n a.Object-oriented\n b.Use of pointers\n c.Portable\n d.Dynamic and Extensible");
        questions.add("Q4. What is the extension of java code files?"
                + " \n a..js\n b..txt\n c..class\n d.java");
        questions.add("Q5. Which of the following is not an OOPS concept in Java?"
                + " \n a.Polymorphism\n b.Inheritance\n c.Compilation\n d.Encapsulation");
        for(String str : questions){
            System.out.println(str);
            System.out.print("Enter correct option: ");
            char opt = sc.next().charAt(0);
            selected.add(opt);
        }
        ArrayList<Character> answers = new ArrayList<>(List.of('b','c','b','d','c'));
        for(int i=0;i<answers.size();i++){
            if(answers.get(i)==selected.get(i)) marks++;
        }
        System.out.println("Your Answers: "+selected);
        System.out.println("Correct Answers: "+answers);
        result(Name,Enrollment,marks);
    }
    
    
     public static void result(String Name, String Enrollment, int marks){
        System.out.println("Your Result");
        System.out.printf("---------------------------------------------------------------------------------%n");
        System.out.printf("| %-20s | %-20s | %-8s | %-20s |%n","Name","Enrollment","Marks","Percentage");
        System.out.printf("---------------------------------------------------------------------------------%n");
        System.out.printf("| %-20s | %-20s | %-8s | %-20s |%n",Name,Enrollment,marks,(marks*100)/5 + "%");
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name, Enrollment;
        System.out.println("\nQUIZ APP");
        System.out.println("\n1.Start");
        System.out.println("2.Exit");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.print("Enter Name: ");
                sc.nextLine();
                Name = sc.nextLine();
                System.out.print("Enter Enrollment: ");
                Enrollment = sc.nextLine();
                System.out.print("Are you ready for quiz? (y/n): ");
                char ready = sc.next().charAt(0);
                switch(ready){
                    case 'y':
                        quiz(Name, Enrollment);
                        break;
                    case 'n':
                        System.out.println("Please comeback when ready !");
                        break;
                    default:
                        System.out.println("Please enter a valid choice");
                }

                break;
            case 2:
                System.out.println("Thank you");
                break;
            default :
                System.out.println("Please enter a valid choice");
        
    }
    
}
}
