package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
     private  static SqlSessionFactory build=null;
    static {
        String config="mybatis.xml";
        try {
            InputStream in = Resources.getResourceAsStream(config);
             build = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public  static  SqlSession getSqlSession(){
        SqlSession sqlSession=null;
        if(build!=null){
           sqlSession= build.openSession();
        }
        return sqlSession;
    }

}
