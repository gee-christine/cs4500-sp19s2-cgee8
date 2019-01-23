package com.example.cs4500sp19s2cgee8.model;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    // default constructor
    public User(Integer id, String username, String password,
                String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // User ID get and set
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    // User username get and set
    public String getUsername() {
        return username; }
    public void setUsername(String username) {
        this.username = username;
    }

    // User password get and set
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // User first name get and set
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // User last name get and set
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}