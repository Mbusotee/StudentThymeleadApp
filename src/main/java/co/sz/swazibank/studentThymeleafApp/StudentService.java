package co.sz.swazibank.studentThymeleafApp;

import java.util.List;

public interface StudentService {
	
	public List<Student> ListAll();
	
	public Student findStudentById(int theId);
	
	public void saveStudent(Student theStudent) ;
	
	public void deleteStudentById(int theId) ;

	public List<Student> getStudentByGpa(int studGpa);
}
