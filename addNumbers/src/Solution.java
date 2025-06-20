class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode cend= null;
        ListNode start= null;



        do{
            int k=carry+temp1.val+temp2.val;
            if(temp1==l1&&temp2==l2){
                cend=start=new ListNode(k%10);
            }
            else if(carry==1){
                cend.val=k%10;
            }
            else {
                cend=cend.next=new ListNode(k%10);
            }



            if(k>9){
                carry=1;
                cend=cend.next=new ListNode(1);
            }
            else{
                carry=0;
            }

            if(temp1.next!=null){
                temp1=temp1.next;
            }
            else{
                temp1=new ListNode();
            }

            if(temp2.next!=null){
                temp2=temp2.next;
            }
            else{
                temp2=new ListNode();
            }



        }while(temp1.checkNotZero() || temp2.checkNotZero());


        return start;
    }
}
  