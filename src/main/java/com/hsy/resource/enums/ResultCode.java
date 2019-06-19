package com.hsy.resource.enums;

/**
 * @author 张梓枫
 * @date 2019年5月13日上午8:55:18
 * @description 接口返回状态码枚举
 */
public enum ResultCode {

	SUCCESS("10000"), BUSSINESS_SERVER_ERROR("10001"), SERVER_ERROR("500");
	
	private final String code;
	
	private ResultCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return this.code;
	}
}
