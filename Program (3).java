package lesson4;

public class Program {
    public static void main(String[] args){
        MyLinkedList<Character> linkedList = new MyLinkedList<>();
        linkedList.addFirst('a');
        linkedList.addFirst('b');
        linkedList.addFirst('c');
        System.out.println(linkedList.size());
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
        linkedList.set(1, 'd');
        System.out.println(linkedList.get(1));
        linkedList.addFirst('e');
        linkedList.addLast('g');
        linkedList.add(2, 'f');
        System.out.println(linkedList);
        System.out.println(linkedList.get(4));


        linkedList.removeIndex(4);
        System.out.println(linkedList);
       // linkedList.removeFirst();
        //System.out.println(linkedList.size());
        //System.out.println(linkedList);


//        for (Character c:
//                linkedList) {
//            System.out.print(c + ", ");
//        }
    }
}
