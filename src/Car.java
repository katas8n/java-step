public class Car {
    // Fields
    String model;
    String color;
    int year ;
    int wheels ;

    public Car(String model, String color, int year ,int wheels) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.wheels = wheels;
    }


    // Methods
    public void startEngine() {
        System.out.println("Engine started");
    }
}
