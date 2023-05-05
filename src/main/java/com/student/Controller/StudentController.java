package com.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Entity.Student;
import com.student.Repository.StudentRep;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	private StudentRep rep;
	
	@GetMapping("/get")
	public String get(Model m)
	{
		List<Student> s = rep.findAll();
		m.addAttribute("students", s);
		return "student";
	}
	
	@GetMapping("/newform")
	public String getForm(Model m)
	{
	
		m.addAttribute("student",new Student());
		return "newForm";
	}
	
	@PostMapping("/saveform")
	public String SaveForm(@ModelAttribute Student s)
	{
		rep.save(s);
		return "redirect:/student/get";
		
	}
	
	@GetMapping("/delete/{id}")
	public String deletedata(@PathVariable long id)
	{
		rep.deleteById(id);
		return "redirect:/student/get";
	}
	
	@GetMapping("/update/{id}")
	public String Updatedata(@PathVariable long id ,Model m)
	{
		Student s = rep.findById(id).get();
		m.addAttribute("student", s);
		
		return "newForm";
		
	}
	
	
}
