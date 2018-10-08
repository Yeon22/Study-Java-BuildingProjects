package bankaccountapp;

public interface IBaseRate {
	// Write a method that returns the base rate(요금)
	default double getBaseRate() {
		return 2.5;
	}
}
