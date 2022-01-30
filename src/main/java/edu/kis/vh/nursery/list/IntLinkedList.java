package edu.kis.vh.nursery.list;

/**
 * Klasa IntLinkedList przetrzymująca listę dwukierunkową liczb całkowitych.
 */
public class IntLinkedList {

    private Node last;
    int i;

    /**
     * metoda dodaje nowy element do listy
     * @param i: wartość elementu listy
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * metoda sprawdza czy lista jest pusta
     * @return zwraca true jeśli lista jest pusta
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * metoda do sprawdzenia czy lista jest pełna
     * @return zwraca zawsze false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * metoda do poznania wartości ostatniego elementu
     * @return zwraca wartość ostatniego elementu
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    /**
     * metoda usuwa ostatni element i ustawia jako ostatni element ten który był przedostatni
     * @return zwracca wartość ostatniego elementu
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Klasa Node jest to pojedynczy element w liście przechoiwujący wartość, jak i wskaźnik na
     * poprzedni i następny element w liście
     */
    private class Node {

        private int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            setValue(i);
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
