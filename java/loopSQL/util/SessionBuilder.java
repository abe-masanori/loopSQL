package loopSQL.util;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionBuilder {

    static String resource = "mybatis-config.xml";

    static SessionBuilder builder;

    SqlSessionFactory sqlSessionFactory;

    static {
        try {
            builder = new SessionBuilder();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionBuilder getInstance() {
        return builder;
    }

    private SessionBuilder() throws SQLException, IOException {
        var inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public SqlSession getSession() throws SQLException {
        return sqlSessionFactory.openSession();
    }
}
