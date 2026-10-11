package com.wd.pocket_tracker.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
	 	@NotBlank(message = "Name is required")
	    private String name;
	 	@NotBlank(message = "Email is required")
	    private String email;
	 	@NotBlank(message = "Role is required")
	    private String role;
	 	@NotBlank
	    private String password;	
	    private LocalDateTime createdAt;

}
