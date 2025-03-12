package linkedLists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import linkedLists.DeleteDuplicates.ListNode;

public class Main {

		
	
    public boolean containsDuplicate(int[] nums) {
        
    	ArrayList<Integer> aux = new ArrayList<Integer>();
        boolean foundDuplicate = false;
        
        for (int i = 0 ; i < nums.length; i++) {
            
            if(aux.contains(nums[i]) ) {
                foundDuplicate = true;
                break;
            } else {
                aux.add(nums[i]);
            }
        }
        
        return foundDuplicate;
        
    }
    
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    DeleteDuplicates dd = new DeleteDuplicates();
       

        dd.deleteDuplicates();

	}

}
