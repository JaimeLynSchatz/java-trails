class BicycleDemo {

    class Bicycle {
        private int cadence = 0;
        private int speed = 0;
        private int gear = 1;

        public void changeCadence(int newValue) {
            this.cadence = newValue;
        }

        public void changeGear(int newValue) {
            this.gear = newValue;
        }

        public void speedUp(int increment) {
            this.speed = speed + increment;
        }

        public void applyBrakes(int decrement) {
            this.speed = speed - decrement;
        }

        public void printStates() {
            System.out.println("cadence: " +
                    this.cadence + " speed: " +
                    this.speed + " gear: " + this.gear);
        }
    }

    class MountainBike extends Bicycle {
        // some awesome stuff here
    }

    public static void main(String[] args) {
        //Create two different
        //Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        //Invoke methods on
        //those objects
        bike1.changeCandence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedup(10);
        bike2.changeGear(3);
        bike2.printState();
    }
}
