package springdemo.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Constraint(validatedBy = TicketCodeConstraintValidator.class)
public @interface TicketCode {
	public String value() default "ABC";

	public String message() default "ABC";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {}; 
}
