package lesson3;

public class Program {
    public static void main(String[] args) {
        MyArrayDeque<Character> deque = new MyArrayDeque<>();
        deque.insertRight('a');
        System.out.println(deque.peekRight());
        deque.insertRight('c');
        System.out.println(deque.peekRight());
        deque.insertLeft('b');

      //  System.out.println(deque);
        System.out.println(deque.size());
        System.out.println(deque.peekLeft());

        System.out.println(deque.peekRight());


    }
}
