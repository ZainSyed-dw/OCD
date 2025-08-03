class Car {
    public String make;
    public int year;

    public Car() {
        make = "Tesla";
        year = 2026;
    }
}

class Dog {
    public String name;
    public int age;

    public Dog() {
        name = "Rex";
        age = 5;
    }
}

class Student {
    public String firstName;
    public String lastName;
    public int studentId;

    public Student() {
        firstName = "John";
        lastName = "Doe";
        studentId = 4123;
    }
}

public class AssignmentTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        Dog myDog = new Dog();
        Student myStudent = new Student();

        System.out.println("Car Make: " + myCar.make);
        System.out.println("Car Year: " + myCar.year);
        System.out.println();

        System.out.println("Dog Name: " + myDog.name);
        System.out.println("Dog Age: " + myDog.age);
        System.out.println();

        System.out.println("Student First Name: " + myStudent.firstName);
        System.out.println("Student Last Name: " + myStudent.lastName);
        System.out.println("Student ID: " + myStudent.studentId);
    }
}