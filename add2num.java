class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            p.next = new ListNode(sum % 10);
            l1 = l1.next;
            l2 = l2.next;
            p = p.next;
        }
        while (l1 != null) {
            int sum = l1.val + carry;
            carry = sum / 10;
            p.next = new ListNode(sum % 10);
            l1 = l1.next;
            p = p.next;
        }
        while (l2 != null) {
            int sum = l2.val + carry;
            carry = sum / 10;
            p.next = new ListNode(sum % 10);
            l2 = l2.next;
            p = p.next;
        }
        if (carry != 0) {
            p.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
