public class Driver {
    private Car car = new Car();

    public Driver() {
        System.out.println("Driver is created.");
    }
    
    public void driving() {
        System.out.println("Driver is driving.");
        Car coupe = new Car();
        System.out.println("Using a car that has " + coupe.getNumWheel() + " wheels.");
    }
}
