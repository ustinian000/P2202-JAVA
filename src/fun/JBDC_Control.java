package fun;
import java.sql.*;
public class JBDC_Control {
    /**通用连接数据库函数
     * @param user 数据库用户
     * @param pass 数据库密码
     * @return {@link Connection}
     */
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

    /**
     * 通用数据库关闭函数
     *
     * @param rs         rs
     * @param statement  声明
     * @param connection 连接
     */
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

