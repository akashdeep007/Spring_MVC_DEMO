package springdemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/request")
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
	public String processForm2(@RequestParam("Name") String name, Model model)
	{
		name=name.toUpperCase();
		model.addAttribute("Name",name);
		return "process-form2";
	}
}
