package lesson_6;



public class Animal {

    public static void main(String[] args) {
        Animal[] animal = {new Cat(200,0, "cat_1"),
                new Dog(500, 10,  "dog_1")};
        for (Animal an : animal)
            System.out.println("Животное:"+ an.name+"\nЖивотное пробежало (м): " + an.run(160) + "\nЖивотное проплыло (м): " + an.swim(6));

    }

    private int run_limit;
    private int swim_limit;
    private String name;

    Animal(int run_limit, int swim_limit, String name) {
        this.run_limit = run_limit;
        this.swim_limit = swim_limit;
        this.name = name;
    }

    protected int run(int distance) {
        if (distance <= run_limit) {
            return distance;
        }
        return run_limit;
    }

    protected int swim(int distance) {
        if (distance <= swim_limit) {
            return distance;
        }
        return swim_limit;
    }
    protected String name(String name) {
        return name;
    }
}
