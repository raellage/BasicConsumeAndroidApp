package com.israeljl.basicconsumerapp.model;

/**
 * Created by israeljl on 14/04/17.
 */

/*Classe Usuario*/

public class User {
    private String id;
    private String name;
    private String pwd;

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /*Retorna os usuarios formatados*/

    @Override
    public String toString() {
        return ("\n ---------------- " +  "\n ID: " + this.id + " \n Name: " + this.name + " \n Pwd: " + this.pwd);
    }
}
