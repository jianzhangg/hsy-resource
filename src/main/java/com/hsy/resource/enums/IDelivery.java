package com.hsy.resource.enums;

/**
 * @author 张梓枫
 * @date 2019年5月30日上午10:33:20
 * @description
 */
public interface IDelivery {

	/**
	 * @author 张梓枫
	 * @date 2019年5月30日上午10:33:42
	 * @description 配送状态枚举
	 */
	public enum DeliveryState {
		/**
		 * 待配送
		 */
		DELIVERY_NO(1),

		/**
		 * 配送中
		 */
		DELIVERY_STAY(2),

		/**
		 * 配送完成
		 */
		DELIVERY_FINISH(3);

		private final Integer state;

		private DeliveryState(Integer state) {
			this.state = state;
		}

		public Integer getState() {
			return this.state;
		}
	}

	/**
	 * @author 张梓枫
	 * @date 2019年5月30日上午10:34:21
	 * @description 配送类型
	 */
	public enum DeliveryType {
		/**
		 * 自有物流
		 */
		HAVE(1),

		/**
		 * 第三方物流
		 */
		THIRD(2);

		private final Integer type;

		private DeliveryType(Integer type) {
			this.type = type;
		}

		public Integer getType() {
			return this.type;
		}
	}
}
