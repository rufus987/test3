public class Programmer {
    String name, company, position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    public static void main(String[] args) {
        Programmer pr1 = new Programmer("kk", "jjj");
        System.out.println(pr1.getPosition());
        pr1.work();
        System.out.println(pr1.getPosition());
        pr1.work();
        System.out.println(pr1.getPosition());
    }
    String getPosition() {
        return position;
    }

    void work() {
        switch (position) {
            case "intern":
                position = "junior";
                break;
            case "junior":
                position = "middle";
                break;
            case "middle":
                position = "senior";
                break;
            case "senior":
                position = "lead";
                break;
        }
    }
}
