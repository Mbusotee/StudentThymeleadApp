package co.sz.swazibank.studentThymeleafApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> ListAll(){
		return studentRepository.findAll();
	}
	
	public Student findStudentById(int theId) {
		return studentRepository.findById(theId).get();
	}
	
	public void saveStudent(Student theStudent) {
		studentRepository.save(theStudent);
	}
	
	public void deleteStudentById(int theId) {
		studentRepository.deleteById(theId);;
	}
	
	public List<Student> getStudentByGpa(int studGpa) {
		return studentRepository.getStudentByGpa(studGpa);
	
	}
	
	
	
}
