public class oop {
    public static class Dog {
        String name;
        int age;
        String breed;

        void bark() {
            System.out.println(this.name + ": Bark!");
        }
    }

    public static void main(String[] args) {
        Dog lucky = new Dog();

        lucky.name = "Lucky";
        lucky.age = 3;
        lucky.breed = "Husky";

        // We typically do not print an object directly, with the exception called method overriding
        System.out.println(lucky);

        System.out.println("The information of lucky: ");
        System.out.println("Age: " + lucky.age);
        System.out.println("Breed: " + lucky.breed);

        System.out.println("----------------");
        lucky.bark();
    }
}