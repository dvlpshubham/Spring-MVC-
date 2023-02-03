package spring.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class HomeController {
	

	@RequestMapping("/home")
	public String home(Model model) {
		
		System.out.println("This is home url");
		model.addAttribute("name","Shubham Raj");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		
		System.out.println("This is about url");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("This is help controller");
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.addObject("name","Shubham Raj");
		modelAndView.addObject("rollnumber",123456);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(655);
		list.add(874);
		list.add(5654);
		list.add(1555);
		
		modelAndView.addObject("marks",list);
		
		
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
