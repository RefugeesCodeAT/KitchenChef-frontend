package at.refugeesCode.kitchencheffrontend.persistence.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Document
public class AppUser {

    @Id
    private String id;
    private String username;
    private String password;
    private Set<String> authorities = new HashSet<>();
    private boolean registration = false;
    private List<Idess> mealRegistration = new ArrayList<>();

    public AppUser(String username, String password, Set<String> authorities, boolean registration, List<Idess> mealRegistration) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
        this.registration = registration;
        this.mealRegistration = mealRegistration;
    }

    public AppUser() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<String> authorities) {
        this.authorities = authorities;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public List<Idess> getMealRegistration() {
        return mealRegistration;
    }

    public void setMealRegistration(List<Idess> mealRegistration) {
        this.mealRegistration = mealRegistration;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authorities=" + authorities +
                ", registration=" + registration +
                ", mealRegistration=" + mealRegistration +
                '}';
    }
}


