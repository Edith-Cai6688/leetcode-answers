import java.util.NoSuchElementException;

public class MyLinkedListTest<E> {

    //双链表节点
    private static class Node<E>
    {
        E val;
        Node<E> next;
        Node<E> prev;

        Node(E val)
        {
            this.val = val;
        }

    }
    //虚拟头尾节点
    final private Node<E> head,tail;
    private int size;

    //构造函数初始化虚拟头尾节点
    public MyLinkedListTest()
    {
        this.head=new Node<>(null);
        this.tail=new Node<>(null);
        head.next=tail;
        tail.prev=head;
        this.size=0;
    }

    /***** 增 *****/

    public void addLast(E e)
    {
        Node<E> x=new Node<>(e);
        Node<E> temp=tail.prev;

        temp.next=x;
        x.prev=temp;

        x.next=tail;
        tail.prev=x;

        size++;
    }

    public static void main(String[] args) {
        MyLinkedListTest<Integer> test=new MyLinkedListTest<>();
        test.addLast(4);
    }
}
