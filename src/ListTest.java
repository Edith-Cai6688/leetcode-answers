public class ListTest {
    static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item =i;
            next =n;
        }

        /***return the size using a recursion***/
        public int size(){
            if(next==null){
                return 1;
            }
            return 1+this.next.size();
        }

        /***return the size not using a recursion but a iterative method***/
        public int iterativeSize(){
            int Sizenumber=0;
            IntNode p=this;
            while(p!=null){
                Sizenumber++;
                p=p.next;
            }
            return Sizenumber;
        }

        public int get(int i){
            if(i==0){
                return item;
            }
            return next.get(i-1);
        }

        public IntNode addFirst(int i){
            IntNode p=this;
            IntNode newNode = new IntNode(i,p);
            return newNode;

        }

    }

    static class SLList{
        IntNode head;

        public SLList(int x){
            head =new IntNode(x,null);
        }

        public int getHead(){
            return head.item;
        }

        public void addHead(int i){
            head=new IntNode(i,head);
        }

    }

    public static void main(String[] args){
        IntNode l=new IntNode(5,null);
        l=new IntNode(10,l);
        l=new IntNode(15,l);
        l=l.addFirst(2);
//        System.out.println(l.size());
//        System.out.println(l.iterativeSize());
//
//        System.out.println(l.get(2));

//        SLList sl=new SLList(5);
//        sl.addHead(2);



    }
}
