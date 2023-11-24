package Easy.MergeTwoSortedLists;

// Basicamente o método irá receber duas listas encadeadas e transformar em uma em ordem crescente
// o método irá fazer a verificação de cada lista e seus nós e colocar em ordem

public class MSMergeTwoSortedLists2 {

    public static void main(String[] args) {
    //https://www.youtube.com/watch?v=g_uxlc8C6HE&list=TLPQMjkxMTIwMjJ9irXeq5EEYg&index=3&ab_channel=AlgorithmsMadeEasy


        ListNode lista = new ListNode(3);
        ListNode lista2 = new ListNode(2);

        System.out.println(mergeTwoSortedList(lista,lista2));



    }


    public static ListNode mergeTwoSortedList(ListNode l1, ListNode l2){

        ListNode inicio = new ListNode(0);
        ListNode atual = inicio;

        while (l1 != null && l2 != null) {

             if (l1.val < l2.val){
                 atual.next = l1;
                 l1 = l1.next;
             } else {
                 atual.next = l2;
                 l2 = l2.next;
             }

             atual = atual.next;
        }
        atual.next = l1 !=null ? l1 : l2;

        return inicio.next;
    }
}
