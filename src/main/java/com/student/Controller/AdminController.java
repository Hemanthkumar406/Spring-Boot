package com.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Entity.Admin;
import com.student.Repository.AdminRep;
import com.student.Repository.StudentRep;

@Controller
@RequestMapping("/admin")
public class AdminController {

	
	@Autowired
	private AdminRep rep;
	
	@PostMapping("/save")
	public Admin save(@RequestBody Admin admin){
		
		return rep.save(admin);
		
	}
	
	@GetMapping("/go")
	public String get(Model m)
	{
		m.addAttribute("a",new Admin());
		return "admin";
	}
	
	@PostMapping("/login")
	public String go(@ModelAttribute Admin a) {
	    Admin admin = rep.findByName(a.getName());
	    if (admin != null && admin.getPassword().equals(a.getPassword())) {
	        return "redirect:/student/get";
	    }
	    return "error";
	}
	
}

