package lab4;

public class Professor extends Employee implements Comparable<Professor> {
	
	String teachingMajor;
	
	public Professor(String name,String obTeachingMajor) {
		
		super(name);
		
		this.teachingMajor=obTeachingMajor;
	}

	@Override
	public double getOverTimePayRate() {
		// TODO Auto-generated method stub
		return 2.0;
	}

	/**
	 * @return the teachingMajor
	 */
	public String getTeachingMajor() {
		return teachingMajor;
	}

	/**
	 * @param teachingMajor the teachingMajor to set
	 */
	public void setTeachingMajor(String teachingMajor) {
		this.teachingMajor = teachingMajor;
	}

	@Override
	public DressCode getDressCode() {
		// TODO Auto-generated method stub
		return DressCode.FANCY;
	}

	@Override
	public boolean isPaidSalary() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getWorkVerb() {
		// TODO Auto-generated method stub
		return "teach";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teachingMajor == null) ? 0 : teachingMajor.hashCode());
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
		Professor other = (Professor) obj;
		if (teachingMajor == null) {
			if (other.teachingMajor != null) {
				return false;
			}
		} else if (!teachingMajor.equals(other.teachingMajor)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Professor otherProfessor) {
		String obComputerScience = "Computer Science";
		if(otherProfessor.teachingMajor.equals(obComputerScience)&&!this.teachingMajor.equals(obComputerScience)) {
			return -1;
			
			
		}
		if(!otherProfessor.teachingMajor.equals(obComputerScience)&&this.teachingMajor.equals(obComputerScience)) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		
		return "Professor [name= "+getName()+" getteachingMajor()=" + teachingMajor + "]";
		
	}

}
