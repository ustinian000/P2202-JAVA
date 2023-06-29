package fun;
import java.sql.*;
public class JBDC_Control {
    public  Connection getConnection(String user ,String pass){
        String url = "jdbc:mysql://localhost:3306/Libray";

        Connection connection = null;    //得到连接对象
        try {
            connection = DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
    public  void close(ResultSet rs , Statement statement,Connection connection){

        try {
            if (rs!=null) {
                rs.close();
            }
            if (statement!=null){
                statement.close();
            }
            if (connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

