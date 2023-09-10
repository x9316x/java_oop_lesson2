package geek_java_oop_lesson2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("Единиц еды в тарелке = " + food);
    }

    public boolean decreaseFood(int amount) { // Уменьшение единиц еды в тарелке
        if (amount <= food) {
            food -= amount;
            return true; // еда уменьшилась
        }
        return false; // не хватает еды
    }

    public void addFood(int amount) { // Метод для добавления еды в тарелку
        food += amount;
    }
}