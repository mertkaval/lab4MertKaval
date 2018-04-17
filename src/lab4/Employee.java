package lab4;




public abstract class Employee implements Employable {

	String name;
	
	
	public Employee(String name) {
		
		this.name=name;
		
		
		
	}
	public abstract double getOverTimePayRate();
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
