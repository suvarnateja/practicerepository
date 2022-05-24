import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getEmployeename().compareTo(o1.getEmployeename());
	}
	
}


public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<Employee> lstemp=new ArrayList<Employee>();
		lstemp.add(new Employee(101, "Teja", "intern", 21));
		lstemp.add(new Employee(102, "Suv", "intern", 21));
		lstemp.add(new Employee(103, "Sappu", "intern", 22));
		lstemp.add(new Employee(104, "SuSwa", "intern", 21));
		lstemp.add(new Employee(105, "Swap", "intern", 20));
		
		lstemp.stream().forEach((emp)-> System.out.println(emp));	
		Collections.sort(lstemp, new SortByName());
		System.out.println("Sort By Name");
		lstemp.stream().forEach(t-> System.out.println(t));
		
	}

}
