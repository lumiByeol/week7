import java.util.LinkedList;

public class LinkedListTask {

    public static void evenDeletion(LinkedList<Integer> list) {
        System.out.println("given list: " + list);
        System.out.println("----------");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
            }
        }
        System.out.println("obtained list: " + list);
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer i = 0; i <= 10; i++) {
            linkedList.add(i);
        }

        evenDeletion(linkedList);
    }
}