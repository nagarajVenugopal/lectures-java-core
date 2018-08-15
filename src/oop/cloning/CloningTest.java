package oop.cloning;

import java.util.HashMap;
import java.util.Map;

//import org.apache.commons.lang.SerializationUtils;

public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee emp = new Employee();

		emp.setId(1);
		emp.setName("Dima");
		Map<String, String> props = new HashMap<>();
		props.put("salary", "10000");
		props.put("city", "Obuhov");
		emp.setProps(props);

		Employee clonedEmp = (Employee) emp.clone();

		// Check whether the emp and clonedEmp attributes are same or different
		System.out.println("emp and clonedEmp == test: " + (emp == clonedEmp));
		
		System.out.println("emp and clonedEmp HashMap == test: " + (emp.getProps() == clonedEmp.getProps()));
		
		
		emp.setId(2);
		System.out.println(emp.getId());
		System.out.println(clonedEmp.getId());
		// Lets see the effect of using default cloning
		
		// change emp props
		emp.getProps().put("title", "CEO");
		emp.getProps().put("city", "New York");
		
		
		System.out.println("clonedEmp props:" + clonedEmp.getProps());

		// change emp name
		emp.setName("new");
		System.out.println("clonedEmp name:" + clonedEmp.getName());
		
//		SerializationUtils.clone(emp);
		
	}

}
