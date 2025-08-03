class Car {
    public int year;
    public String make;

    Car(int year, String make) {
        this.year = year;
        this.make = make;
    }
}

class Dog {
    public String name;
    public int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student {
    public String firstName;
    public String lastName;
    public int id;

    Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
}

 class AssignmentTestPart2 {
    public static void main(String[] args) {
        // Car instances
        Car car1 = new Car(2022, "Honda");
        Car car2 = new Car(2000, "Lincoln");
        Car car3 = new Car(2014, "Lamborghini");

        System.out.println("Car1 Make: " + car1.make);
        System.out.println("Car1 Year: " + car1.year);
        System.out.println("Car2 Make: " + car2.make);
        System.out.println("Car2 Year: " + car2.year);
        System.out.println("Car3 Make: " + car3.make);
        System.out.println("Car3 Year: " + car3.year);

        // Dog instances
        Dog dog1 = new Dog("Sparky", 5);
        Dog dog2 = new Dog("Bella", 8);
        Dog dog3 = new Dog("Sparky", 5);

        System.out.println("\nDog1 Name: " + dog1.name);
        System.out.println("Dog1 Age: " + dog1.age);
        System.out.println("Dog2 Name: " + dog2.name);
        System.out.println("Dog2 Age: " + dog2.age);
        System.out.println("Dog3 Name: " + dog3.name);
        System.out.println("Dog3 Age: " + dog3.age);

        // Student instances
        Student student1 = new Student("Jane", "Doe", 12345);
        Student student2 = new Student("John", "Matthew", 45678);

        System.out.println("\nStudent1 First Name: " + student1.firstName);
        System.out.println("Student1 Last Name: " + student1.lastName);
        System.out.println("Student1 ID: " + student1.id);
        System.out.println("Student2 First Name: " + student2.firstName);
        System.out.println("Student2 Last Name: " + student2.lastName);
        System.out.println("Student2 ID: " + student2.id);
    }
}