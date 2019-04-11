package lesson3;

import java.util.NoSuchElementException;

public class MyArrayStack<Item> {
    private Object[] stack = new Object[1];
    private int size = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void resize(int capacity){
        Object[] tmp = new Object[capacity];
        for (int i = 0; i <size; i++){
            tmp[i] = stack[i];
        }
        stack = tmp;
    }

    public void push(Item item){
        if(size == stack.length){
            resize(stack.length * 2);
        }
        stack[size++] = item;
    }

    public Item pop(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        Item item = (Item) stack[size-1];
        stack[size-1] = null;
        size--;
        if(size == stack.length / 4 && size >0){
            resize(stack.length/2);
        }
        return item;
    }

    public Item peek(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return (Item) stack[size-1];
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size ; i++) {
            s.append(stack[i] + ", ");
        }
        return s.toString();
    }
}
