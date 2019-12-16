package bean;

public class User {
    private String sex;
    private String name;
    private String num;
    private String academy;
    private int age;

    public User(){
        super();
    }
    public User(String num,String name,String sex,int age, String academy){
        this.num = num;
        this.name = name;
        this.age=age;
        this.sex = sex;
        this.academy=academy;
    }
    public String getNum(){
        return num;
    }
    public void setNum(String _num){
        this.num = _num;
    }

    public String getUsername() {
        return name;
    }
    public void setUsername(String userName) { this.name = userName; }

    public int getAge() { return age; }
    public void setAge(int _age) { this.age = _age; }

    public String getSex(){return sex; }
    public void setSex(String _sex){this.sex=_sex; }

    public String getAcademy(){return academy; }
    public void setAcademy(String _academy){this.academy=_academy; }

}