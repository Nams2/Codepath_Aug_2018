SUBTRACT
Given a singly linked list, modify the value of first half nodes such that :

1st node’s new value = the last node’s value - first node’s current value
2nd node’s new value = the second last node’s value - 2nd node’s current value,
and so on …

 NOTE :
If the length L of linked list is odd, then the first half implies at first floor(L/2) nodes. So, if L = 5, the first half refers to first 2 nodes.
If the length L of linked list is even, then the first half implies at first L/2 nodes. So, if L = 4, the first half refers to first 2 nodes.
Example :

Given linked list 1 -> 2 -> 3 -> 4 -> 5,

You should return 4 -> 2 -> 3 -> 4 -> 5
as

for first node, 5 - 1 = 4
for second node, 4 - 2 = 2
Try to solve the problem using constant extra space.


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode subtract(ListNode A) {
        ListNode node = A;
        
        // Step 1: find the mid point in LinkList
        ListNode slow = A;
        ListNode fast = slow.next;
        
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            System.out.println("11111");
        }
        
        // Step 2: Reverse the 2nd part of the LinkList
        ListNode reverse2ndList = reverseLL(slow);
        ListNode secondHalf = reverse2ndList;
        
        // Step 3: Calcualte the initial difference
        while(node!=null && secondHalf!=null) {
            node.val = secondHalf.val - node.val;
            node = node.next;
            secondHalf = secondHalf.next;
            
            System.out.println("33333");
        }
        
        reverseLL(reverse2ndList);
        
        return A;
        
        
    }
    
    public ListNode reverseLL(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        ListNode temp;
        
        while(curr!=null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        node = prev;
        
        System.out.println("22222");
        
        return node;
    }
}
