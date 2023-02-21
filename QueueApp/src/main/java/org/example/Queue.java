package org.example;

public class Queue<T> {
    // Указатель на голову очереди (по умолчанию null)
    private Node<T> head = null;
    // Указатель на хвост очереди (по умолчанию null)
    private Node<T> tail = null;
    // Переменная для размера очереди (по умолчанию 0)
    private int size = 0;

    // Метод для вставки элемента в очередь
    public void enqueue(T element) {
        // Cоздаем узел с новым элементом
        Node<T> tempEl = new Node<T>(element);
        tempEl.setValue(element);
        if (size == 0) { // Если очередь пустая
            head = tail = tempEl; // голова и хвост должны указывать на новый элемент
        } else {
            tail.setNext(tempEl); // иначе next последнего эл. (на к-ый указывает хвост) должен указывать на новый эл.
            tail = tempEl; // и хвост должен переместиться в конец и указывать на новый элемент
        }
        // Обновляем размер очереди
        size++;
    }

    // Метод для выборки (удаления) элемента из очереди
    public T dequeue() {
        // Если в очереди нет элементов, отображаем сообщение и возвращаем null
        if (size == 0) {
            System.out.println("Очередь пуста");
            return null;
        }
        // Запоминаем элемент, на который указывает голова
        T element = head.getValue();
        // Перебрасываем голову на следующий элемент
        head = head.getNext();
        // Если элементов больше нет (head стал указывать на null), хвост тоже устанавливаем на null
        if (head == null) {
            tail = null;
        }
        // Обновляем размер очереди
        size--;
        // Возвращаем запомненный элемент
        return element;
    }

    public int size() {
        return size;
    }
}
