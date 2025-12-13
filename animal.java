public class animal {
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}

public class main {
    public static void main(String[] args) {
       

        Dog d1 = new Dog("Buddy", 4);

        d1.sleep();   
        d1.bark();    

        Animal a1 = new Animal();
        a1.sleep();

    }
}
