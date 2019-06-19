package com.hsy.resource.enums;

/**
 * @author 张梓枫
 * @date 2019年5月18日下午4:47:00
 * @description 数据逻辑删除标识
 */
public enum DataState {

	NO_DELETED(0), DELETED(1);

	private final Integer state;

	private DataState(Integer state) {
		this.state = state;
	}

	public Integer getState() {
		return this.state;
	}
}
