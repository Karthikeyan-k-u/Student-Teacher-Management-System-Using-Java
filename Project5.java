import java.util.*;
interface Teachable {
    void study();
    String getInfo();
}
abstract class Person implements Teachable {
    String name;
    int id;   
    Person(int id, String name) { 
        this.id = id; 
        this.name = name; 
    }
    abstract void role();
    public void study() { 
        System.out.println(name + " is learning"); 
    }
    public String getInfo() { 
        return id + ": " + name; 
    }
}
class Student extends Person {
    String course;    
    Student(int id, String name, String course) {
        super(id, name);
        this.course = course;
    }
    void role() { 
        System.out.println(name + " is a Student"); 
    }
    public void study() { 
        System.out.println(name + " studying " + course); 
    }
}
class Teacher extends Person {
    String subject;   
    Teacher(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }
    void role() { 
        System.out.println(name + " is a Teacher"); 
    }
    public void study() { 
        System.out.println(name + " teaching " + subject); 
    }
}
public class Project5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[10]; // fixed-size array
        int count = 0;
        while (true) {
            System.out.println("1.Add Student");
            System.out.println("2.Add Teacher"); 
            System.out.println("3.Show All");
            System.out.println("4.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 4) break;
            if (ch == 1 || ch == 2) {
                if (count >= people.length) {
                    System.out.println("Cannot add more people.");
                    continue;
                }
                System.out.print("ID: "); 
                int id = sc.nextInt(); sc.nextLine();
                System.out.print("Name: "); 
                String name = sc.nextLine();
                System.out.print("Course/Subject: "); 
                String sub = sc.nextLine();
                if (ch == 1) people[count++] = new Student(id, name, sub);
                else people[count++] = new Teacher(id, name, sub);
            } 
            else if (ch == 3) {
                for (int i = 0; i < count; i++) {
                    people[i].role();
                    people[i].study();
                    System.out.println(people[i].getInfo() + "\n");
                }
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}