public class Main {
    public static void main(String[] args) {
        Student vivek = new Student(1, "Vivek", 80.31f);
        vivek.display();

        Student jay = new Student(2, "Jay", 85.5f);
        jay.display();

        Student random = new Student(vivek);
        random.display();
    }
}

class Student {
    int rollNo;
    String name;
    float marks;

    Student() {
        this.rollNo = 0;
        this.name = "Unknown";
        this.marks = 0.0f;
    }

    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    void display() {
        System.out.println(rollNo + " is " + name + " having marks = " + marks + " %");
    }
}