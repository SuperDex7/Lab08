import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Names to test
		String[] names = ListOfNames.names;

		Random rand = new Random();			//random
		//VillagerListInterface simpleList = new MyAnimalCrossingVillagerList();	//new MyAnimalCrossingVillagerList
		VillagerListInterface simpleList;
		Scanner keyin = new Scanner(System.in);
		System.out.println("Linked list based implementation = 0 (or any even number)");
		System.out.println("Array based implementation = 1 (or any odd number)");
		System.out.print("Choose: ");
		int choice = keyin.nextInt();
		choice = choice %2;
		if(choice ==0) {
			simpleList = new MyAnimalCrossingVillagerLL();
		}else {
			simpleList = new MyAnimalCrossingVillagerList();
		}
		
		
		//tests
		addNames(names, simpleList);
		
		System.out.println("\nPrinting Island Residents!\n");
		simpleList.printList();
		System.out.println("\nRemoving Boss");
		simpleList.remove("Boss");
		
		System.out.println("Adding Paddy...");
		simpleList.add("Paddy");
		
		System.out.println("\nPrinting Island Residents!\n");
		simpleList.printList();
		
		System.out.println("\nRemoving Paddy from list!\n");
		simpleList.remove("Paddy");
		
		simpleList.printList();
		simpleList = simpleList.shuffleAndFilter();
		System.out.println("\nShuffling and filtering: ");
		simpleList.printList();
		
		System.out.println("\nPrinting Island Residents!\n");
		simpleList.printList();
		
		
		System.out.println("\nShuffling and filtering and reprinting Island Residents:");
		simpleList = simpleList.shuffleAndFilter();
		simpleList.printList();
	}
	
	public static void addNames(String[] n, VillagerListInterface a)
	{
		for(int i = 0; i < n.length; i++)
		{
			a.add(n[i]);
		}
	}

}