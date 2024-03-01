package Lab;

public class Lab_3
{

    interface Run {
        public void getName();
        public void getTopSpeed();
        public void getWeight();
        public void getPassengerCapacity();
        public void getWheelNumber();
    }

    abstract class Machine implements Run {
        public static final int topSpeed = 320;
        public static final int minSpeed = 0;
        public static final int minPassengerCapacity = 0;
        public static final int maxPassengerCapacity = 8;
        String vehicleName;
        int currentSpeed;

        void returnName() {
            System.out.println(vehicleName);
        }
    }

    static class Limo {
        protected String type = "Limo";
        protected int wheelNumber = 4;
    }

    static class Pullman extends Limo {
        String name = "S600 Pullman";
        int topSpeed = 240;
        int weight = 5100;
        int passengerCapacity = 8;
        int currentSpeed = 120;
        public void getInfo() {
            System.out.println("Pullman info:");
            System.out.println("Type: " + type);
            System.out.println("Wheel amount: " +wheelNumber);
            System.out.println("Name: " + name);
            System.out.println("Top speed: " + topSpeed);
            System.out.println("Weight: " + weight);
            System.out.println("Passenger amount: " + passengerCapacity);
            System.out.println("Current speed: " + currentSpeed);
        }
    }

    static class Packard extends Limo {
        String name = "Packard Super 8";
        int topSpeed = 100;
        int weight = 4000;
        int passengerCapacity = 9;
        int currentSpeed = 40;
        public void getInfo() {
            System.out.println("Packard info:");
            System.out.println("Type: " + type);
            System.out.println("Wheel amount: " +wheelNumber);
            System.out.println("Name: " + name);
            System.out.println("Top speed: " + topSpeed);
            System.out.println("Weight: " + weight);
            System.out.println("Passenger amount: " + passengerCapacity);
            System.out.println("Current speed: " + currentSpeed);
        }
    }

    static class Demo extends Limo{
        Pullman myPullman = new Pullman();
        void getPullmanInfo() {
            myPullman.getInfo();
        }
        Packard myPackard = new Packard();
        void getPackardInfo() {
            myPackard.getInfo();
        }
    }

    public static void main(String[] args) {
        Demo wowThisIsADemo = new Demo();
        wowThisIsADemo.getPullmanInfo();
        wowThisIsADemo.getPackardInfo();
    }
}
