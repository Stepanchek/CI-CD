package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

public class User {
    private int money;
    private String name;
    private String username;

    public User(int money, String name, String username){
        this.money = money;
        this.name = name;
        this.username = username;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
            this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
