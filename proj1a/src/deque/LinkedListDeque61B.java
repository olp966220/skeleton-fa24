package deque;

import java.util.ArrayList;
import java.util.List;

public class LinkedListDeque61B<T> implements Deque61B<T> {

    public class Node {
        public Node prev;
        public T item;
        public Node next;
        public Node(Node p, T i, Node n) {
            prev = p;
            item = i;
            next = n;
        }
    }

    private Node sentinel;
    private int size;

    @Override
    public void addFirst(T x) {
        Node newNode = new Node(sentinel, x, sentinel.next);
        sentinel.next.prev = newNode;
        sentinel.next = newNode;
        size++;
    }

    @Override
    public void addLast(T x) {
        Node newNode = new Node(sentinel.prev, x, sentinel);
        sentinel.prev.next = newNode;
        sentinel.prev = newNode;
        size++;
    }

    @Override
    public List<T> toList() {
        List<T> list = new ArrayList<>();
        Node current = sentinel.next;
        for (int i = 0; i < size; i++) {
           list.add(current.item);
           current = current.next;
        }
        return list;
    }

    @Override
    public boolean isEmpty() {
        return sentinel.next == sentinel;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T get(int index) {
        Node current = sentinel;
        if (index < 0) {
            return null;
        }
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }
        return current.item;
    }

    @Override
    public T getRecursive(int index) {
        Node current = sentinel.next;
        return getRecursiveHelper(current, index);
    }
    private T getRecursiveHelper (Node node, int index) {
        if (index < 0) {
            return null;
        } else if (index == 0) {
            return node.item;
        }
        return getRecursiveHelper(node.next, index - 1);
    }

    public LinkedListDeque61B() {
        sentinel = new Node(null, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;   // The empty list is represented by a single sentinel node that points at itself.
        size = 0;
    }
}
