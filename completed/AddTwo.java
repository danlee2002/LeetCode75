public class AddTwo {

      public static ListNode addTwo(ListNode l1, ListNode l2) {
            int carry = 0;
            ListNode dummy = new ListNode(0);
            //0 
            ListNode curr = dummy;

            while (l1 != null || l2 != null || carry == 1) {
                  int sum = 0;
                  if (l1 != null) {
                        sum += l1.val;
                        l1 = l1.next;
                        //a -> b -> c  
                        //before: curr = a
                        //after: curr = b
                  }
                  if (l2 != null) {
                        sum += l2.val;
                        l2 = l2.next;
                        //a -> b -> c  
                        //before: curr = a
                        //after: curr = b
                  }
                  sum += carry;
                  carry = sum / 10;
                  ListNode node = new ListNode(sum % 10);
                  curr.next = node;
                  curr = curr.next;
                 
            }

            return dummy.next;

      }

}
