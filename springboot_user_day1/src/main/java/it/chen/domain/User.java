package it.chen.domain;

import java.io.Serializable;

public class User implements Serializable {


    private Long id;

    // 用户名
    private String userName;


    // 年龄
    private Integer age;

    // 性别，1男性，2女性
    private String sex;

    private String address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User() {

    }

    public User(Long id, String userName, Integer age, String sex, String address) {

        this.id = id;
        this.userName = userName;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }
}