package lesson3;

import java.util.NoSuchElementException;

public class MyArrayQueue<Item> {
    private Object[] queue = new Object[1];
    private int size = 0;
    private int start = 0;
    private int end = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return  size ==0;
    }

    private void resize(int capaciti){
        Object[] tmp = new Object[capaciti];
        for (int i = 0; i <size ; i++) {
            tmp[i] = queue[(start + i)% queue.length];
        }
        queue = tmp;
        start = 0;
        end = size;
    }

    public void enqueue(Item item){
        if(size == queue.length){
            resize(queue.length * 2);
        }
        queue[end++] = item;
        end %= queue.length;
        size++;
    }

    public Item dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("Empty");
        }
        Item item = (Item) queue[start];
        queue[start] = null;
        size--;
        start++;
        start %= queue.length;
        if(size == queue.length){
            resize(queue.length / 2);
        }
        return item;
    }

    public Item peekFront(){
        if(isEmpty()){
            throw new NoSuchElementException("Empty");
        }
        return (Item) queue[start];
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size ; i++) {
            s.append(queue[(start + i) % queue.length] + ", ");
        }
        return toString();
    }
}
