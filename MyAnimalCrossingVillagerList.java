//Code and comment this class.
public class MyAnimalCrossingVillagerList implements VillagerListInterface
{
    //internal list of size 100
	private static final int ARRAY_SIZE = 500;
    private String[] list = new String[ARRAY_SIZE];
    
    //current count of items in the list
	private int count = 0;
	
	public MyAnimalCrossingVillagerList()
	{
        //TODO:
		
		for ( int x=0; x<list.length; x++) {
			list[x] = "";
		}
		System.out.println("The list has been created!");
        // Print a statement that tells the user that the list has been created
        // Assign every element of list[] to ""
        // Hint: for loop that starts at 0 and goes up to, but not including the length of the list array.
	}

    public void add(String name) 
    {
        //TODO:
    	
    	
        /*
         * Check to makes sure the island is not full. This can be accomplished with an if statement checking to see
         * if the count is equal to the size of the array called "list".   Is the list full? If it is, tell the user "The island is full!".
         */
    	if (count == list.length) {
    		System.out.println("The Island is full!");    		
    	}
		
    	/*
    	 * If the list is not full (another if statement), make sure the "name" is not an empty string, if it is, 
    	 * tell the user "That is not a valid name!"
    	 */
    	if(count != list.length) {
    		if (name == "") {
    			System.out.println("That is not a valid name!");    			
    		}
    	}
    	
    	/*
    	 * At this point, if it makes it to this point and passes those previous checks, go ahead and add 'name' to the list. 
    	 * Remember that the "count" attribute remembers the next available place in the array.
    	 */
    	
    		list[count]=name;
    		count++;

    	/*
    	 * Don't forget to update the "count" attribute.
    	 */
      

    }
	
	public int getSize() {
        //TODO:
        // Return the number of names currently in the list. Which attribute keeps count of how many names are in the list?
		//basically replace that there zero on the next line with that attribute
		return count;
	}

    public void remove(String name) 
    {
        //TODO:
    	for ( int x=0; x<count; x++) {
    		if(name.compareToIgnoreCase(list[count]) ==0) {
    			list[count] = list[list.length-1];
    			count--;
    		}else if(name.compareToIgnoreCase(list[count]) ==1) {
    			System.out.println(name + " already does not live on the island!");
    		}
    	}
        /*
         * using a for loop, starting at zero and going up until "count" (attribute), use compareToIgnoreCase to find 
         * a match for name.  Once it finds it, take the last item in the list and copy it to this position, then decrease
         * the count.
         *   
         * if there no match print out (name + " already does not live on the island!");
         */
	}

    public boolean isEmpty() 
    {
        //TODO:
        /* 
         * Return true if the list is empty, false if it is not empty... which attribute, when it is zero, indicates
         * the list is empty? Perhaps a COUNT of some sort? 
         */
    	

		return count == 0;//This is a placeholder so Java doesn't complain, you can delete this and replace it with your code.
	}

    public boolean isFull() 
    {
        //TODO:
        /* 
         * Return true if the list is full, false if it is not full... which attribute, when it is the same number as the length of 
         * the array "list", indicates the list is full? Perhaps a COUNT of some sort? 
         */
		return count == list.length;//This is a placeholder so Java doesn't complain, you can delete this and replace it with your code.
	}

    public String getItem(int i) 
    {
        //TODO:
    	if ( i> list.length || i < 0) {
    		System.out.println("That character does not live here!");
    		return "";
    	}     	    		    	   	
        // Return the element at index i.
        // If i is greater than the number of items in the list, or negative, tell the user "That character does not live here" and return "".
        return list[i]; //"This line is a placeholder so Java doesn't complain, you can delete this and replace it with your code.";
	}

	public VillagerListInterface shuffleAndFilter() {
        //TODO:
        // For every element in the list, starting at the end, add every other name to temp.
        VillagerListInterface temp = new MyAnimalCrossingVillagerList();
        for (count-=1; 0<=count; count--) {
        	temp.add(list[count]);
        }
        /*
         * Use a for loop, starting at the count-1 attribute going down to and including zero, add 
         * that element to temp
         * 
         * something like this inside the for loop, controlled by x:
         * temp.add(list[x]);
         */
        
        return temp;
	}

    public void printList() 
    {
        //TODO:
    	for(int x=0; x<count; x++) {
    		System.out.println(list[x]);
    	}
        /*
         * Using a for loop, print out every name in the list.
         */
    }
    
}