package project3qes1;

import java.util.Collections;
import java.util.LinkedList;

public class FloorBuliding {
	LinkedList<Integer>tempList = new LinkedList<>();
	
	public void FloorBuliding(LinkedList<Integer>Is_original) {
		for(int i = 0; i < Is_original.size();i++) {
			tempList.add(Is_original.get(i));
		}
		//Arranging elements decreasing order.
		Collections.sort(tempList,Collections.reverseOrder());
		int j = 0;
		//Comparing floor size of each day.
		for(int i = 0; i < Is_original.size(); i++) {
			if(Is_original.get(i) != tempList.get(j))
				System.out.println("Day:" + (i+1) + "--->" + tempList.get(j) + ",");
			       j++;
			       for(int k = 0; k < i; k++) {
			    	   if(Is_original.get(k) == tempList.get(j)) {
			    		   System.out.println(tempList.get(j) + ",");
			    		      j++;
			    		      k = -1;
			    	   }
			       }
			       System.out.println();
		}
		System.out.println();
	}

}
