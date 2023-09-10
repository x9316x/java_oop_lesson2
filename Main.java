package geek_java_oop_lesson2;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Стёпа", 7),
                new Cat("Барсик", 5),
                new Cat("Муся", 3)
        };

        Plate plate = new Plate(10); // Единицы еды на тарелке
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.isSatiety() ? cat.getAppetite() + " единиц еды съедено, кот сыт." : "Коту не хватило еды.");
        }

        plate.info();

        plate.addFood(5); // добавление еды

    }
}