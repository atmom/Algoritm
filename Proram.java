package lesson3;

public class Proram {
    public static void main(String[] args) {
        String s = "Hello world";
        MyArrayStack<Character> stack = new MyArrayStack<>();

        for (int i = 0; i < s.length() ; i++) {
            stack.push(s.charAt(i));
        }
        System.out.println(stack);

        for (int i = 0; i < s.length() ; i++) {
            System.out.print(stack.pop());
        }







    }


}
