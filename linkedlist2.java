class Node
{
    int data;
    Node next;
    Node(int n){
        this.data=n;
        this.next=null;
    }
}
class Linkedlist
{
    Node head=null;
    void add(int n)
{
        Node newNode=new Node(n);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node curr=head;
            while(curr.next!=null)
            {curr=curr.next;}
            curr.next=newNode;
        }
    }
    void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	  Linkedlist l=new Linkedlist();
	  l.add(1);
	  l.add(2);
	  l.add(3);
	  l.display();
	}
}