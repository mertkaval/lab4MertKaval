package lab4;

public class Parent extends Employee implements Comparable<Parent> {
	
	int numberOfHoursSpentPerWeekWithKids;
	
	
	public Parent(String name,int obNumberOfHoursSpentPerWeekWithKids) {
		
		super(name);
		this.numberOfHoursSpentPerWeekWithKids=obNumberOfHoursSpentPerWeekWithKids;
	}

	@Override
	public double getOverTimePayRate() {
		// TODO Auto-generated method stub
		return -2.0;
	}

	@Override
	public DressCode getDressCode() {
		// TODO Auto-generated method stub
		return DressCode.ANYTHING;
	}

	@Override
	public boolean isPaidSalary() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getWorkVerb() {
		// TODO Auto-generated method stub
		return "care";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfHoursSpentPerWeekWithKids;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Parent other = (Parent) obj;
		if (numberOfHoursSpentPerWeekWithKids != other.numberOfHoursSpentPerWeekWithKids) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Parent otherParent) {
		if(otherParent.numberOfHoursSpentPerWeekWithKids>this.numberOfHoursSpentPerWeekWithKids) {
			return -1;
			
			
		}
		if(otherParent.numberOfHoursSpentPerWeekWithKids<this.numberOfHoursSpentPerWeekWithKids) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Parent [name="+getName()+" getnumberOfHoursSpentPerWeekWithKids()=" + numberOfHoursSpentPerWeekWithKids + "]";
	}
	
}
