import java.util.Scanner;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
public class LT004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); 
        ListNode current = dummyHead;
        int carry = 0; 
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; 
            if (l1 != null) { 
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) { 
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10; 
            current.next = new ListNode(sum % 10); 
            current = current.next; 
        }
        return dummyHead.next; 
    }
    private ListNode buildListFromInput(Scanner scanner) {
        System.out.println("Enter the digits of the number in reverse order (e.g., 3 4 2 for 243). Type -1 to end:");
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        while (true) {
            int val = scanner.nextInt();
            if (val == -1) break; 
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummyHead.next; 
    }
    private void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LT004 solution = new LT004();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number:");
        ListNode l1 = solution.buildListFromInput(scanner);
        System.out.println("Input the second number:");
        ListNode l2 = solution.buildListFromInput(scanner);
        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println("Resultant linked list:");
        solution.printList(result);

        scanner.close();
    }
}
