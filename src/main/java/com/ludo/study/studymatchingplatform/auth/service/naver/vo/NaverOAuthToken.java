package com.ludo.study.studymatchingplatform.auth.service.naver.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class NaverOAuthToken {

	@JsonProperty("token_type")
	private String tokenType;

	@JsonProperty("access_token")
	private String accessToken;

	@JsonProperty("refresh_token")
	private String refreshToken;

	@JsonProperty("expires_in")
	private Integer expiresIn;

}