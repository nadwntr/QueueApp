package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем очередь из Integer
        Queue<Integer> queue = new Queue<Integer>();

        // Заполняем очередь элементами от 0 до 5
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
            System.out.println("Добавлен элемент: " + i);
        }
        System.out.println("Размер очереди: " + queue.size());

        System.out.println();

        // Убираем поочередно добавленные элементы
        int element; // переменная для отображаения убранного элемента
        while (queue.size() != 0) {
            element = queue.dequeue();
            System.out.println("Убран элемент: " + element);
        }
        System.out.println("Размер очереди: " + queue.size());
    }
}