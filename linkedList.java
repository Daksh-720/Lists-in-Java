import java.util.*;


//DOUBLY LINKEDLIST//


public class linkedList {
    public static void main(String[] args){
        LinkedList<Integer> link = new LinkedList<>();
        LinkedList<Integer> link2 = new LinkedList<>();

        link.add(1);
        link.add(2);
        link.add(3);
        link.addFirst(5);
        link.addLast(181);
        System.out.println(link);

        System.out.println("Link-2");
        link2.push(1);
        link2.push(2);
        link2.push(3);
        link2.push(3);
        link2.push(4);
        link2.push(5);
        link2.pop();
        System.out.println(link2);

        //wht happened here is (.add) adds element to the end of the string
        //and (.push) adds elements in the start of the string and pushes element
        //  [.pop()] is used to 



    }
    
}
