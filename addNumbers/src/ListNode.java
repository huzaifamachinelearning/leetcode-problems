public class ListNode {
    int val;
    ListNode next;
    ListNode() {this.val=0; this.next=null;}
    ListNode(int val) { this.val = val;  this.next=null;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    boolean checkNotZero(){
        if(this.val==0&&this.next==null){
            return false;
        }
        else {
            return true;
        }
    }
}
