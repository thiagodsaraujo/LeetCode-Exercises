package Easy.MergeTwoSortedLists;

import java.util.LinkedList;
import java.util.List;

// Basicamente o método irá receber duas listas encadeadas e transformar em uma em ordem crescente
// o método irá fazer a verificação de cada lista e seus nós e colocar em ordem

public class MSMergeTwoSortedLists {

    public static void main(String[] args) {
    //https://www.youtube.com/watch?v=KVf1Uuqfv8E&list=TLPQMjkxMTIwMjJ9irXeq5EEYg&index=1

        ListNode lista = new ListNode(3);
        ListNode lista2 = new ListNode(2);

        System.out.println(mergeTwoSortedList(lista,lista2));



    }


    public static ListNode mergeTwoSortedList(ListNode l1, ListNode l2){

        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node;

        while (l1 != null && l2 != null) {

             if (l1.val < l2.val){
                 current_node.next = l1;
                 l1 = l1.next;
             } else {
                 current_node.next = l2;
                 l2 = l2.next;
             }
             current_node = current_node.next;
        }
        if (l1 != null){
            current_node.next = l1;
            l1 = l1.next;
        }

        if (l2 != null){
            current_node.next = l2;
            l2 = l2.next;
        }

        return temp_node.next;
    }
}
