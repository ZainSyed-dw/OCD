public class Encapsulation {
    public static void main(String[] args) {
        class Planet {
            public String name;
            public int numberOfMoons;

            public Planet(String name, int numberOfMoons) {
                this.name = name;
                this.numberOfMoons = numberOfMoons;
            }
        }

        class Star {
            public String name;
            public double ageInBillions;

            public Star(String name, double ageInBillions) {
                this.name = name;
                this.ageInBillions = ageInBillions;
            }
        }

        class Spaceship {
            public String model;
            public int maxSpeed;
            public boolean isManned;

            public Spaceship(String model, int maxSpeed, boolean isManned) {
                this.model = model;
                this.maxSpeed = maxSpeed;
                this.isManned = isManned;
            }
        }

        Planet planet1 = new Planet("Earth", 1);
        Planet planet2 = new Planet("Mars", 2);
        Planet planet3 = new Planet("Jupiter", 95);

        System.out.println("Planet1 Name: " + planet1.name);
        System.out.println("Planet1 Number of Moons: " + planet1.numberOfMoons);
        System.out.println("Planet2 Name: " + planet2.name);
        System.out.println("Planet2 Number of Moons: " + planet2.numberOfMoons);
        System.out.println("Planet3 Name: " + planet3.name);
        System.out.println("Planet3 Number of Moons: " + planet3.numberOfMoons);
        System.out.println();

        Star star1 = new Star("The Sun", 4.6);
        Star star2 = new Star("Proxima Centauri", 4.85);
        Star star3 = new Star("Sirius", 0.24);

        System.out.println("Star1 Name: " + star1.name);
        System.out.println("Star1 Age in Billions of Years: " + star1.ageInBillions);
        System.out.println("Star2 Name: " + star2.name);
        System.out.println("Star2 Age in Billions of Years: " + star2.ageInBillions);
        System.out.println("Star3 Name: " + star3.name);
        System.out.println("Star3 Age in Billions of Years: " + star3.ageInBillions);
        System.out.println();

        Spaceship spaceship1 = new Spaceship("Voyager 1", 38026, false);
        Spaceship spaceship2 = new Spaceship("Falcon 9", 26000, true);
        Spaceship spaceship3 = new Spaceship("Starship", 27000, true);

        System.out.println("Spaceship1 Model: " + spaceship1.model);
        System.out.println("Spaceship1 Max Speed: " + spaceship1.maxSpeed);
        System.out.println("Spaceship1 Is Manned: " + spaceship1.isManned);
        System.out.println("Spaceship2 Model: " + spaceship2.model);
        System.out.println("Spaceship2 Max Speed: " + spaceship2.maxSpeed);
        System.out.println("Spaceship2 Is Manned: " + spaceship2.isManned);
        System.out.println("Spaceship3 Model: " + spaceship3.model);
        System.out.println("Spaceship3 Max Speed: " + spaceship3.maxSpeed);
        System.out.println("Spaceship3 Is Manned: " + spaceship3.isManned);
    }
}