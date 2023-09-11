package lesson4;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Box<T extends Fruit>  {

    // Коллекция фруктов
    LinkedList<T> fruits;

    //#раздел Конструкторы

    public Box() {
        this.fruits = new LinkedList<>();
    }

    public Box(Collection<T> fruits) {
        this.fruits = new LinkedList<>(fruits);
    }

    public Box(T... fruits) {
        this.fruits = new LinkedList<>(Arrays.asList(fruits));
    }

    //#конец раздела

    /**
     * Получаем вес фруктов в коробке
     * @return - вес фруктов
     */
    public double getWeight() {
        if (fruits.isEmpty()) return 0;
        // Кол-во фруктов * вес фрукта
        return fruits.size() * fruits.get(0).getWeight();
    }

    /**
     * Сравниваем вес коробки на входе в виде параметра
     * @param other - другая коробка
     * @return - результат сравнения веса коробок (допустимая погрешность - 0.001)
     */
    public boolean compare(Box<?> other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.001;
    }

    /**
     * Перемещаем все фрукты в текущую коробку из другой
     * @param other - другая коробка
     */
    public void replaceAll(Box<T> other) {
        other.getFruits().addAll(fruits);
        fruits.clear();
    }

    /**
     * Получаем количество фруктов в коробке
     * @return
     */
    public int sizeBox(){
        return fruits.size();
    }

    /**
     * Получаем все фрукты в коробке
     * @return
     */
    public LinkedList<T> getFruits() {
        return fruits;
    }

    /**
     * Добавление фрукта в коробку
     * @param fruit - фрукт
     */
    public void add(T fruit) {
        fruits.add(fruit);
    }

}