import dao.IStudentDao;
import entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MyBatisUtil;

import java.util.List;

public class MyTest {
    @Test

    public void test1(){
        SqlSession sqlSession= MyBatisUtil.getSqlSession();
         IStudentDao dao=sqlSession.getMapper(IStudentDao.class);
        List<Student> list = dao.selectAllStudent();
        for (Student s:list){
            System.out.println(s);
        }


    }
    @Test
    public  void test2(){
        SqlSession sqlSession= MyBatisUtil.getSqlSession();
        IStudentDao dao=sqlSession.getMapper(IStudentDao.class);
        Student s=new Student(11,"刷个",20,"男","123@qq.com");
        int i = dao.addStudent(s);
        sqlSession.commit();
        System.out.println(i);

    }
    @Test
    public void test3(){
        SqlSession sqlSession= MyBatisUtil.getSqlSession();
        IStudentDao dao=sqlSession.getMapper(IStudentDao.class);
        Student student = dao.selectStudentById(1);
        System.out.println(student);
    }



    }
