package geek_java_oop_lesson2;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety; // Поле сытость

    // Конструктор котов
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false; // По умолчанию кот всегда голоден :)
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() { // Проверка сытости
        return satiety;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) { // Если еды в тарелке достаточно - кот сыт
            satiety = true;
        }
    }
}