package com.assignment.main.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Student_Controller {
	@Autowired
	Reps r;

	@RequestMapping("/")
	public String indexpage(Model m) {
		List<Student_Details> l = r.findAll();
		m.addAttribute("student", l);
		return "index";
	}

	@RequestMapping("/new")
	public String newStudent(Model m) {
		Student_Details s = new Student_Details();
		m.addAttribute("addstudent", s);
		return "new_student";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(Student_Details s) {
		r.save(s);
		return "redirect:/";
	}

	@RequestMapping("/edit/{usn}")
	public ModelAndView editStudent(@PathVariable("usn") String usn) {
		ModelAndView mv = new ModelAndView("edit_student");
		Student_Details s = r.findById(usn).orElse(null);
		mv.addObject("edit", s);
		return mv;
	}
	
	@RequestMapping("/delete/{usn}")
	public String deleteStudent(@PathVariable("usn")String usn)
	{
		r.deleteById(usn);
		return "redirect:/";
	}
}
