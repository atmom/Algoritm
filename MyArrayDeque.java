package lesson3;

import java.util.NoSuchElementException;

public class MyArrayDeque<Item> {
    private Object[] dequeue = new Object[1];
    private int size = 0;
    private int right = 0;
    private int left = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void resize(int capaciti){
        Object[] tmp = new Object[capaciti];
        for (int i = 0; i <size ; i++) {
            tmp[i] = dequeue[(left + i)% dequeue.length];
        }
        dequeue = tmp;
        left = 0;
        right = size;
    }

    public void insertRight(Item item){
        if(size == dequeue.length){
            resize(dequeue.length * 2);
        }
        dequeue[right++] = item;
        right %= dequeue.length;
        size++;
    }

    public void insertLeft(Item item){
        if(size == dequeue.length){
            resize(dequeue.length * 2);
        }
        Object[] tmp = new Object[size];
        for (int i = 1; i <size ; i++) {
            tmp[i] = dequeue[(left + i)% dequeue.length];
        }
        dequeue[left] = item;
        left %= dequeue.length;

        size++;
    }

    public Item removeLeft(){
        if (isEmpty()){
            throw new NoSuchElementException("Empty");
        }
        Item item = (Item) dequeue[left];
        dequeue[left] = null;
        size--;
        left++;
        left %= dequeue.length;
        if(size == dequeue.length){
            resize(dequeue.length / 2);
        }
        return item;
    }

    public Item removeRight(){
        if (isEmpty()){
            throw new NoSuchElementException("Empty");
        }
        Item item = (Item) dequeue[right];
        dequeue[right] = null;
        size--;
        right--;
        right %= dequeue.length;
        if(size == dequeue.length){
            resize(dequeue.length / 2);
        }
        return item;
    }

    public Item peekLeft(){
        if(isEmpty()){
            throw new NoSuchElementException("Empty");
        }
        return (Item) dequeue[left];
    }

    public Item peekRight(){
        if(isEmpty()){
            throw new NoSuchElementException("Empty");
        }
        return (Item) dequeue[right];
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size ; i++) {
            str.append(dequeue[(left + i) % dequeue.length] + ", ");
        }
        return toString();

    }
}
