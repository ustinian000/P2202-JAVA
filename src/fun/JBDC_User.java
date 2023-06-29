package fun;

public class JBDC_User {
    /**
     * 增加用户
     *
     * @param user  用户名
     * @param phone 电话号码
     * @return boolean T增加成功，F增加失败
     */
    public boolean adduser(String user,String phone,String pass){
        new JBDC_Control().getConnection("root","123456");

        return true;
    }

    public static void main(String[] args) {
        JBDC_User jbdcUser= new JBDC_User();
        jbdcUser.adduser("张三","19858681320","Aa123456");
    }
}
