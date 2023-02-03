package spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm( ) {
		return "contact";
	}
	
	@RequestMapping(path="/processform",method= RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String email,
			@RequestParam("userName") String name,
			@RequestParam("userPaaswords") String paasword,Model model) 
	{

		System.out.println("User Email"+email);
		System.out.println("User Name"+name);
		System.out.println("User Paasword"+paasword);
		
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("paasword", paasword);
		
		return "success";
		
	}

}
