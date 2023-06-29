package classlib;

import java.util.Objects;

public  abstract class User {
    String name;//用户姓名
    String password;//用户密码
    String phone;//用户电话
    String A1;//回答1
    String A2;//回答2
    int A3;//回答3年龄
    int borrow;//借书次数
    String heading;

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }
    public String getPhone(){
        return phone;
    }
    public void setA1(String A1)
    {
        this.A1=A1;
    }
    public String getA1(){
        return A1;
    }
    public void setA2(String A2){
        this.A2=A2;
    }
    public String getA2()
    {
        return A2;
    }
    public void setA3(int A3)
    {
        this.A3=A3;
    }
    public int getA3()
    {
        return A3;
    }

    public int getBorrow() {
        return borrow;
    }

    public void setBorrow(int borrow) {
        this.borrow = borrow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return A3 == user.A3 && Objects.equals(name, user.name) && Objects.equals(password, user.password) && Objects.equals(phone, user.phone) && Objects.equals(A1, user.A1) && Objects.equals(A2, user.A2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, phone, A1, A2, A3);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", A1='" + A1 + '\'' +
                ", A2='" + A2 + '\'' +
                ", A3=" + A3 +
                '}';
    }

    public abstract void A(User user);
}
