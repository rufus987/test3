public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Toozik", 5);
        Dog dog2 = new Dog("Yorik", 7);

        dog1.bark();
        dog2.bark();
    }
    public void bark(){
        System.out.println("woof");
    }
}