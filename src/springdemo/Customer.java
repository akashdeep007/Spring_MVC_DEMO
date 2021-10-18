package springdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min=1,message = "is required")
	private String lastName;
	
	@Min(value = 1, message = "Greater than or equal to 1")
	@Max(value = 10, message = "Less than or equal to 10")
	private int noOfPasses;
	
	@Pattern(regexp = "^[1-9][0-9]{5}$",message = "Pincode should not start with 0 and should be of 6 digits")
	private String pincode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNoOfPasses() {
		return noOfPasses;
	}
	public void setNoOfPasses(int noOfPasses) {
		this.noOfPasses = noOfPasses;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	

}
