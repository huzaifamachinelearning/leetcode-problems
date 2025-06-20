//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        LinkedList c=new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers to add to the linked list (type -1 to stop):");
        while (true) {
            int value = scanner.nextInt();
            if (value == -1) {
                break; // Stop taking input when the user enters -1
            }
            a.addNode(value);
        }
        System.out.println("Enter integers to add to the  second linked list (type -1 to stop):");
        while (true) {
            int value = scanner.nextInt();
            if (value == -1) {
                break; // Stop taking input when the user enters -1
            }
            b.addNode(value);
        }
        System.out.println("Printing the linked list:");
        a.printList();
        System.out.println("Printing the linked list:");
        b.printList();

        Solution sol=new Solution();
        ListNode t=sol.addTwoNumbers(a.getHead(),b.getHead());
        c.setHead(t);
        System.out.println("printing the sum of two list");
        c.printList();





        scanner.close();
    }
}