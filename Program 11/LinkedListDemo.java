import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Character>ll =new LinkedList<Character>();
        ll.add('B');
        ll.add('E');
        ll.add('F');
        System.out.println("original contents:"+ll);
 ll.addLast('G');
 ll.addFirst('A');
 System.out.println("\n After calls to addFirst() and addLast().");
 System.out.println("contents:"+ll);
 ll.add(2,'D');
 ll.add(2,'C');
 System.out.println("\n After insertion");
 System.out.println("contents:"+ll);
 System.out.println("here are the first and last elements:"+ll.getFirst()+""+ll.getLast());
 List<Character> sub=ll.subList(2, 5);
 System.out.println("\n contents of sublist view:"+sub);
 LinkedList<Character>ll2=new LinkedList<Character>(sub);
 ll.removeAll(ll2);
 System.out.println("\nAfter removing ll2 from ll");
 System.out.println("contents:"+ll);
 ll.removeFirst();
 ll.removeLast();
 System.out.println("\n After deleting first and last element");
 System.out.println("contents:"+ll);
 ll.set(0, Character.toLowerCase(ll.get(0)));
 System.out.println("\nAfter change"+ll);

    }
}
