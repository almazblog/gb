package lesson_7;

public class Animal {

        public static void main(String[] args) {
            Cat[] cats = {new Cat("Матроскин", 50), new Cat("Василий", 50),
                    new Cat("Шарик", 25),
                    new Cat("Усач", 5), new Cat("Барсик", 1)};
            Dish dish = new Dish( 80);

            for (Cat cat : cats) {
                cat.eat(dish);
                cat.info();
            }
        }

}
