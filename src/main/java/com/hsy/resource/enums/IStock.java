package com.hsy.resource.enums;

/**
 * @author 程雨
 * @date 2019年6月6日上午10:33:20
 * @description 库存枚举
 */
public interface IStock {

	/**
	 * @author 程雨
	 * @date 2019年6月6日上午10:33:20
	 * @description 出入库 类型
	 */
	public enum StockType {
		/**
		 * 入库
		 */
		IN(1),

		/**
		 * 出库
		 */
		OUT(2);



		private final Integer type;

		private StockType(Integer type) {
			this.type = type;
		}

		public Integer getType() {
			return this.type;
		}
	}

	/**
	 * @author 程雨
	 * @date 2019年6月6日上午10:33:20
	 * @description 入库明细 来源类型
	 */
	public enum StockInSourceType {
		/**
		 *采购
		 */
		ORDER(1),

		/**
		 * 退货
		 */
		BACK(2),

		/**
		 * 库存调整
		 */
		ADJUST(3);

		private final Integer sourceType;

		private StockInSourceType(Integer sourceType) {
			this.sourceType = sourceType;
		}

		public Integer getSourceType() {
			return this.sourceType;
		}
	}

	/**
	 * @author 程雨
	 * @date 2019年6月6日上午10:33:20
	 * @description 入库明细 来源类型
	 */
	public enum StockOutSourceType {
		/**
		 *销售
		 */
		ORDER(1),

		/**
		 * 库存调整
		 */
		ADJUST(2);


		private final Integer sourceType;

		private StockOutSourceType(Integer sourceType) {
			this.sourceType = sourceType;
		}

		public Integer getSourceType() {
			return this.sourceType;
		}
	}
}
