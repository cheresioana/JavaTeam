package ro.academyplus.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by agheboianu on 13.05.2016.
 */
public class UserData {

    @NotNull
    @Size(min = 4, max = 24,message = "Email not valid")
    private String email;
    @NotNull
    private String name;

    public UserData() {
    }

    public UserData(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
