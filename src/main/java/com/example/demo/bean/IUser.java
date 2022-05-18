package com.example.demo.bean;

public class IUser {
	private static final long serialVersionUID =1L;
    private String accountId;
    private String password;
    public IUser() {
    }
    public IUser(String accountId,String password) {
        this.accountId = accountId;
        this.password = password;
    }
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId= accountId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
   
}
