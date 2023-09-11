package lesson4;

public class Program {
    public static void main(String[] args) {

        Box<Apple> boxApple1 = new Box<>();
        for (int i = 0; i < 7; i++) {
            boxApple1.add(new Apple());
        }
        System.out.printf("В первой коробке %d яблок. Вес коробки - %.1f\n", boxApple1.sizeBox(), boxApple1.getWeight());

        Box<Apple> boxApple2 = new Box<>();
        for (int i = 0; i < 8; i++) {
            boxApple2.add(new Apple());
        }
        System.out.printf("Во второй коробке %d яблок. Вес коробки - %.1f\n", boxApple2.sizeBox(), boxApple2.getWeight());

        Box<Orange> boxOrange1 = new Box<>();
        for (int i = 0; i < 5; i++) {
            boxOrange1.add(new Orange());
        }
        System.out.printf("В третьей коробке %d апельсинов. Вес коробки - %.1f\n", boxOrange1.sizeBox(), boxOrange1.getWeight());

        Box<Orange> boxOrange2 = new Box<>();
        for (int i = 0; i < 5; i++) {
            boxOrange2.add(new Orange());
        }
        System.out.printf("В четвертой коробке %d апельсинов. Вес коробки - %.1f\n", boxOrange2.sizeBox(), boxOrange2.getWeight());
        System.out.printf("Сравниваем вес коробок с яблоками - %s\n", boxApple1.compare(boxApple2)); // Сравниваем коробки с яблоками
        System.out.printf("Сравниваем вес коробок с апельсинами - %s\n", boxOrange1.compare(boxOrange2)); // Сравниваем коробки с апельсинами
        boxApple2.replaceAll(boxApple1); // Пересыпаем яблоки
        System.out.println("Пересыпаем яблоки в одну коробку.");
// Пересыпать апельсины в яблоки нельзя
        System.out.printf("Теперь в первой коробке %d яблок.\n", boxApple1.sizeBox());
        System.out.printf("Теперь во второй коробке %d яблок.\n", boxApple2.sizeBox());

        boxOrange2.replaceAll(boxOrange1); // Пересыпаем апельсины
        System.out.println("Пересыпаем апельсины в одну коробку.");
        System.out.printf("Теперь в третьей коробке %d апельсинов.\n", boxOrange1.sizeBox());
        System.out.printf("Теперь в четвертой коробке %d апельсинов.\n", boxOrange2.sizeBox());
    }

}
