package fun;

import classlib.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class LoginFUN extends User{

    @Override
    public void A(User user)
    {
        Connection conn = null;
        PreparedStatement p1 = null;
        String sql = "insert into tb_user(name,password,phone,A1,A2,A3) values(?,?,?,?,?,?)";
        try {
            p1 = conn.prepareStatement(sql);
            p1.setString(1,user.getName());
            p1.setString(1,user.getPassword());
            p1.setString(1,user.getPhone());
            p1.setString(1,user.getPhone());
            p1.setString(1,user.getA2());
            p1.setInt(1,user.getA3());
            int isok = p1.executeUpdate();
            System.out.println("-----" + isok);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    //注册
    public boolean login(User user)
    {
        Connection conn = null;
        PreparedStatement p2 = null;
        ResultSet rs =null;
        String sql = "Select * from tb_user where user = ? and password = ?";
        boolean islogin = false;
        try {
            p2 = conn.prepareStatement(sql);
            p2.setString(1,user.getName());
            p2.setString(1,user.getPassword());
            p2.setString(1,user.getPhone());
            p2.setString(1,user.getA2());
            p2.setInt(1,user.getA3());
            rs = p2.executeQuery();
            while (rs.next()){
                islogin = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return islogin;
    }
    /**
     * 登录方法，返回是否登录成功
     *
     * @param type 用户类型
     * @param user 用户名（手机号）
     * @param pass 密码
     * @return boolean T成功，F失败
     */
    public boolean loginfun(int type,String user,String pass){

        return true;
    }
}


