public class Human {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String work;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
        this.weight = 60;
    }

    public Human(String name, int age, int weight) {
        this (name, age);
        this.weight = weight;
    }

    public Human(String name, int age, String work) {
        this (name,age);
        this.work = work;
    }

    public Human(int age, int weight, String address, String work) {
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }

    public static void main(String[] args) {
        Human man1 = new Human("Chack", 40);
        Human man2 = new Human("Arthur", "address");
        Human man3 = new Human("Alexandr", 35);
        Human man4 = new Human("Karl", 28, null);
    }
}
