package linkedLists;

import java.util.HashSet;

public class DeleteDuplicates {
	
	public class ListNode {
	     int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

	}
	
	public ListNode deleteDuplicates() {
       
			ListNode head = new ListNode(1);
			head.next = new ListNode(1);
			head.next.next = new ListNode(2);
			head.next.next = new ListNode(3);
			head.next.next = new ListNode(3);
			
			///////////////
		
/*			HashSet<Integer> aux = new HashSet<>();
	        ListNode temp = head;
	        ListNode output = null;

	        
	        while (temp != null && temp.next != null) {
	        	
	            if (!aux.contains(temp.val)) {
	                aux.add(temp.val);
	                //output = temp;
	                if(output == null) {
	                	output = new ListNode(temp.val);
	                } else {
	                	output.next = new ListNode(temp.val);
	                }
	                
	            }

	            if (temp.val == temp.next.val) {
	            	temp = temp.next.next;

	            } else {
	            	temp = temp.next;
	            }
	            
	        }

	        return output;*/
			
			   ListNode curr = head;
		        while(curr!=null && curr.next!=null){
		            if(curr.val == curr.next.val){
		                curr.next = curr.next.next; //replace with next node
		            }
		            else{
		                curr = curr.next; // move tonext node
		            }
		        }
		        return head;

	    }



}
