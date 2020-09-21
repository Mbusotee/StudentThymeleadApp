package co.sz.swazibank.studentThymeleafApp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Integer> {

 	@Query(value="SELECT *  FROM student WHERE student_gpa <= ?", nativeQuery=true)
   public List<Student> getStudentByGpa(int studentGpa);
}
