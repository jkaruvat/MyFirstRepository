package com.capgemini;

class Employee {
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		
		return 12;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}


public class Test   {
	
	public static void main(String[] args) {
		
		Employee e = new Employee("Sachin");
		Employee e1 = new Employee("Nilesh");
		Employee e2 = new Employee("Sachin");

		System.out.println(e.hashCode()+" "+e2.hashCode());
		System.out.println(e.equals(e2));
		
	}

}
