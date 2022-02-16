package lesson_7;

import static java.lang.System.*;

class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void info() {
        String isHungry = !hungry ? "сытый" : "голодный";
        out.println(name + ": " + isHungry);
    }

    void eat(Dish plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }
}

