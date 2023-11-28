public class Dog {
    // Attributes
    String name;
    int age;
    boolean isVaccinated;
    boolean isMale;


    // Constructor
    public Dog(String name, int age, boolean isVaccinated, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
        this.isMale = isMale;
    }

    public static void main(String[] args) {
        Dog john = new Dog("John !!! : - ) :D III" , 23 , true , true);
        System.out.println(john);
        john.bark();
        john.bark();
        john.bark();
        john.bark();
        john.bark();
        john.getNameLength();
        john.getLastLatter();
        john.getFirstLatter();
    }


    public int getNameLength() {
        System.out.println(name.length());

        return name.length();
    }

    public char getFirstLatter() {
        return name.charAt(0);
    }


    public char getLastLatter() {
        return name.charAt(name.length() - 1);
    }


    // Method
    public void bark() {
        System.out.println("Gav ! Gav ! NO!");
    }

}


