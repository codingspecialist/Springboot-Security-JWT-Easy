package com.cos.jwtex01.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
	private String username;
	private String password;
}
