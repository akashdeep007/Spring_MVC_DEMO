package springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TicketCodeConstraintValidator implements ConstraintValidator<TicketCode, String>{
	
	private String ticketPrefix;
	
	public void initialize(TicketCode code)
	{
		ticketPrefix=code.value();
	}

	@Override
	public boolean isValid(String htmlData, ConstraintValidatorContext ctx) {
		// TODO Auto-generated method stub
		boolean result=false;
		if(htmlData!=null)
		{
			result=htmlData.startsWith(ticketPrefix);
		}
		return result;
	}

}
