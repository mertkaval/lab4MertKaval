package lab4;

public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer>  {

	int numberOfGoals;
	
	public HockeyPlayer(String name,int obNumberOfGoals) {
		super(name);
		
		this.numberOfGoals=obNumberOfGoals;
	}
	@Override
	public double getOverTimePayRate() {
		// TODO Auto-generated method stub
		return 0.0;
	}
	/**
	 * @return the numberOfGoals
	 */
	public int getNumberOfGoals() {
		return numberOfGoals;
	}
	/**
	 * @param numberOfGoals the numberOfGoals to set
	 */
	public void setNumberOfGoals(int numberOfGoals) {
		this.numberOfGoals = numberOfGoals;
	}
	@Override
	public DressCode getDressCode() {
		// TODO Auto-generated method stub
		return DressCode.JERSEY;
	}
	@Override
	public boolean isPaidSalary() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean postSecondaryEducationRequired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String getWorkVerb() {
		// TODO Auto-generated method stub
		return "play";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfGoals;
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
		HockeyPlayer other = (HockeyPlayer) obj;
		if (numberOfGoals != other.numberOfGoals) {
			return false;
		}
		return true;
	}
	@Override
	public int compareTo(HockeyPlayer otherHockeyPlayer) {
		if(otherHockeyPlayer.numberOfGoals>this.numberOfGoals) {
			return -1;
			
			
		}
		if(otherHockeyPlayer.numberOfGoals<this.numberOfGoals) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "HockeyPlayer [name="+getName()+" getnumberOfGoals()=" + numberOfGoals + "]";
	}
	
	

}
