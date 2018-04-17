package lab4;

public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant>{
	
	double numberOfDollarsStolenPerDay;
	
	
	public GasStationAttendant(String name,double obNumberOfDollarStolenPerDay) {
		
		super(name);
		this.numberOfDollarsStolenPerDay=obNumberOfDollarStolenPerDay;
	}

	@Override
	public double getOverTimePayRate() {
		// TODO Auto-generated method stub
		return 1.5;
	}

	/**
	 * @return the numberOfDollarsStolenPerDay
	 */
	public double getNumberOfDollarsStolenPerDay() {
		return numberOfDollarsStolenPerDay;
	}

	/**
	 * @param numberOfDollarsStolenPerDay the numberOfDollarsStolenPerDay to set
	 */
	public void setNumberOfDollarsStolenPerDay(double numberOfDollarsStolenPerDay) {
		this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
	}

	@Override
	public DressCode getDressCode() {
		return DressCode.UNIFORM;
	}

	@Override
	public boolean isPaidSalary() {
		return true;}

	@Override
	public boolean postSecondaryEducationRequired() {
		return false;
	}

	@Override
	public String getWorkVerb() {
		
		return "pump";

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(numberOfDollarsStolenPerDay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		GasStationAttendant other = (GasStationAttendant) obj;
		if (Double.doubleToLongBits(numberOfDollarsStolenPerDay) != Double
				.doubleToLongBits(other.numberOfDollarsStolenPerDay)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(GasStationAttendant otherGasStationAttendant) {
		if(otherGasStationAttendant.numberOfDollarsStolenPerDay>this.numberOfDollarsStolenPerDay) {
			return -1;
			
			
		}
		if(otherGasStationAttendant.numberOfDollarsStolenPerDay<this.numberOfDollarsStolenPerDay) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "GasStationAttendant [name="+getName()+" getnumberOfDollarsStolenPerDay()=" + numberOfDollarsStolenPerDay + "]";
	}
	
}
