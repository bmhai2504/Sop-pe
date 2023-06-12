package entity;

public class User {
    static int count = 0;
    private int id;
    private String name;
    private String password;
    private long userMoney;

    public User() {
    }
    public User(String name, String password) {
        count++;
        this.id = count;
        this.name = name;
        this.password = password;
    }
    public User(String name, String password, long userMoney){
        count++;
        this.id = count;
        this.name = name;
        this.password = password;
        this.userMoney = userMoney;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
