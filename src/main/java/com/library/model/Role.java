package com.library.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true, nullable = false)
    private RoleType name;

    // 🔹 Default constructor (needed by JPA)
    public Role() {
    }

    // 🔹 Constructor with role name
    public Role(RoleType name) {
        this.name = name;
    }

    // 🔹 Getters & Setters
    public Long getId() {
        return id;
    }

	public RoleType getName() {
		return name;
	}

	public void setName(RoleType name) {
		this.name = name;
	}

 
}