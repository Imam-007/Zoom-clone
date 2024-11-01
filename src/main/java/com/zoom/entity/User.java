package com.zoom.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Map;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private String password;

    @ManyToMany()
    @JoinTable(
            name = "invites",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "meeting_id")
    )
    private List<Meeting> invitedMeetings;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public List<Meeting> getInvitedMeetings() {
        return invitedMeetings;
    }

    public void setInvitedMeetings(List<Meeting> invitedMeetings) {
        this.invitedMeetings = invitedMeetings;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

