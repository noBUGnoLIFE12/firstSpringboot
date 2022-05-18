package com.example.demo.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserForm {
	@NotEmpty(message="{login.error.accountId.notEmpty}")
    @Email(message="{login.error.accountId.isEmail}")
    private String accountId;
    @NotEmpty(message="{login.error.password.notEmpty}")
    @Size(min=6,max=6, message="{login.error.password.length}")
    private String password;
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
