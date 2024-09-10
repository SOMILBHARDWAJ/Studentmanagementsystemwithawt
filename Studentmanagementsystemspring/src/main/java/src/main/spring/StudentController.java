package src.main.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
    @Autowired
    private Studentservice studentServ;

    @PostMapping("/register")
    public Student registerStudent(@RequestBody Student student) {
        return studentServ.registerStudent(student);
    }

    @GetMapping("/")
    public List<Student> getAllStudents() {
        return studentServ.getAllStudents();
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student) {
        return studentServ.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentServ.deleteStudent(id);
    }
}
