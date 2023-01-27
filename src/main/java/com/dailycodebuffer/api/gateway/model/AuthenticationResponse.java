package com.dailycodebuffer.api.gateway.model;

import java.util.Collection;

import org.springframework.security.oauth2.core.OAuth2AccessToken;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthenticationResponse {

	private String userId;
	private String accesToken;
	private String refreshToken;
	private long expiresAt;
	private Collection<String> authorityList;
}
