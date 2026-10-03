class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode first = head;
        ListNode second = reverse(slow);
        while (second != null) {
            if (first.val != second.val)
                return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }
    public ListNode reverse(ListNode head) {
        ListNode current, nextnode, previous;
        previous = null;
        current = head;
        while (current != null) {
            nextnode = current.next;
            current.next = previous;
            previous = current;
            current = nextnode;
        }
        return previous;
    }
}