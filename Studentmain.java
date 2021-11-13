//Q1 Constuctor
class Student {
    String name;

    Student() {
        name = "Unknown";
    }

    Student(String s) {
        name = s;
    }

    public void show() {
        System.out.println(name);
    }
}

public class Studentmain {

    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student("Abc");
        obj.show();
        obj1.show();
    }

}