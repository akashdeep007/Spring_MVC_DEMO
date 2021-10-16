package springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NameFormController {

	@RequestMapping("/showForm")
	public String showForm()
	{
		return "show-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "process-form";
	}
	
	@RequestMapping("/processForm2")
	public String processForm2(HttpServletRequest request , Model model)
	{
		String name = request.getParameter("Name");
		name=name.toUpperCase();
		model.addAttribute("Name",name);
		return "process-form2";
	}
}
