package dao;

import entity.Student;

import java.util.List;

public interface IStudentDao {

    public List<Student>selectAllStudent();
    public int addStudent(Student student);
    public int delectStudentById(int id);
    public  Student updateStudent(Student student);
    public Student selectStudentById(Integer id);
}
