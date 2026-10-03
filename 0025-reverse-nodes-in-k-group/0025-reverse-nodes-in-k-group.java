class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode prevGroupEnd = temp;
        while (true) {
            ListNode kth = prevGroupEnd;

            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }

            if (kth == null)
                break;

            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = kth.next;
            ListNode prev = nextGroupStart;
            ListNode current = groupStart;

            while (current != nextGroupStart) {
                ListNode nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            prevGroupEnd.next = kth;
            prevGroupEnd = groupStart;
        }

        return temp.next;
    }
}