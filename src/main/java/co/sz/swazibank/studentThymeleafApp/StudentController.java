package co.sz.swazibank.studentThymeleafApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	private Student theStudent;
	
	
	@GetMapping("/student")
	public String getStudent(Model theModel) {
		List<Student> studentList = studentService.ListAll();
		theModel.addAttribute("studentList",studentList);
		return "students";
	}
	/*
	//Search by GPA
	@GetMapping("/searchByGpa/{gpa}")
	public String searchByGpa(@PathVariable(value="gpa") int gpa, Model theModel) {
		List<Student> studentList = studentService.getStudentByGpa(gpa);
		theModel.addAttribute("student",studentList);
		return "redirect:/student";
	}
	*/
	
	
	//add new student
	@GetMapping("/newStudentForm")
	public String newStudentForm(Model theModel) {
		theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "new_student";
	}
	
	@PostMapping("/saveStudent")
	public String saveNewStudent(@ModelAttribute("student") Student theStudent) {
		studentService.saveStudent(theStudent);
		return "redirect:/student";
	}
	
	//edit student
	@GetMapping("/updateStudentForm/{id}")
	public String updateStudentForm(@PathVariable(value="id") int id, Model theModel) {
		Student theStudent = studentService.findStudentById(id);
		theModel.addAttribute("student",theStudent);
		return "update_student";
	}
	
	
	//delete student
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable(value="id") int id) {
		studentService.deleteStudentById(id);
		return "redirect:/student";
	}
}
