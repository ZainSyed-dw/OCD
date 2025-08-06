public class main2{
    public class Planet {
        public String name;
        public int numberOfMoons;
    }

    public class Star {
        public String name;
        public double ageInBillionsOfYears;
    }

    public class Spaceship {
        public String model;
        public long maxSpeed;
        public boolean isManned;
    }

    public class SpaceAssignment {
        public static void main(String[] args) {
            Planet myPlanet = new Planet();
            Star myStar = new Star();
            Spaceship mySpaceship = new Spaceship();

            System.out.println("Planet Name: " + myPlanet.name);
            System.out.println("Planet Number of Moons: " + myPlanet.numberOfMoons);
            System.out.println();
            System.out.println("Star Name: " + myStar.name);
            System.out.println("Star Age in Billions of Years: " + myStar.ageInBillionsOfYears);
            System.out.println();
            System.out.println("Spaceship Model: " + mySpaceship.model);
            System.out.println("Spaceship Max Speed: " + mySpaceship.maxSpeed);
            System.out.println("Spaceship Is Manned: " + mySpaceship.isManned);
        }
    }
}