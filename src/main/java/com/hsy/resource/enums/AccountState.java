package com.hsy.resource.enums;

/**
 * @author 张梓枫
 * @date 2019年5月24日上午11:47:10
 * @description
 */
public enum AccountState {
	NORMAL(1), FROZEN(2), DELETED(3);

	private final Integer state;

	private AccountState(Integer state) {
		this.state = state;
	}

	public Integer getState() {
		return this.state;
	}
}
