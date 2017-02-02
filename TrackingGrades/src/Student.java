import java.util.Scanner;

public class Student {
    //fields
    public String name;
    public int test1;
    public int test2;
    
    //constructor
    public Student(String n) {
        name = n;
    }
    
    //methods
    
    public void getName(){
        System.out.println(name.toString());
        // or this.name ????
    }
    
    public void inputGrades(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + this.name + "'s score for test1");
        test1 = scan.nextInt();
        System.out.println("Enter " + this.name + "'s score for test2");
        test2 = scan.nextInt();
        System.out.println(this.name + " scored " + test1 + " on test 1, and " + test2 + " on test 2");
        
       
    }
    
    public int getAverage(){
    return ((this.test1 + this.test2) / 2);
    }
    

}
