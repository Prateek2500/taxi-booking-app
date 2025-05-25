package com.example.model;

import java.security.KeyStore.PrivateKeyEntry;
import java.time.LocalDate;
import java.time.LocalTime;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BookingForm {
	private int id;
	
	@NotEmpty(message = "name can't be empty")
	@NotBlank(message = "name can't be blank")
	@Size(min = 2,max = 30,message = "invalid name length")
	private String name;
	
	@NotEmpty(message = "source can't be empty")
	@NotBlank(message = "source can't be blank")
	@Size(min = 2,max = 100,message = "invalid source length")
	private String from;
	
	@NotEmpty(message = "email can't be empty")
	@NotBlank(message = "email can't be blank")
	@Size(min = 8,max = 50,message = "invalid email length")
	private String email;
	
	@NotEmpty(message = "destination can't be empty")
	@NotBlank(message = "destination can't be blank")
	@Size(min = 2,max = 100,message = "invalid destination length")
	private String to;
	
	@NotNull(message = "time can't be empty")
	private LocalTime time;
	
	@NotNull(message = "date can't be empty")
	private LocalDate date;
	
	@NotEmpty(message = "comfort can't be empty")
	@NotBlank(message = "comfort can't be blank")
	@Size(min = 2,max = 20,message = "invalid comfort length")
	private String comfort;
	
	@Min(value = 1,message = "adult can be at least 1")
	@Max(value = 4,message = "adult can be at most 4")
	private int adult;
	
	@Max(value = 3,message = "children can be at most 3")
	private int children;
	
	@NotEmpty(message = "message can't be empty")
	@NotBlank(message = "message can't be blank")
	@Size(min = 2,max = 2000,message = "invalid message length")
	private String message;
	
	

}
