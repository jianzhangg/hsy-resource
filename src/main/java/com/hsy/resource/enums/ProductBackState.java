package com.hsy.resource.enums;

/**
 * @author 黄必诚
 * @date 2019/6/6 15:57
 * @description
 */
public enum ProductBackState {


    SELL_AGREE(2,"商家审核通过"),
    SELL_DISAGREE(5,"商家审核不通过");

    /* 状态值 */
    private final Integer state;
    /* log纪录内容 */
    private final String content;

    private ProductBackState(Integer state,String content){
        this.state = state;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Integer getState() {
        return state;
    }

    public static String getByState(Integer state){
        String content = "";
        for(ProductBackState productBackState:ProductBackState.values()){
            if(productBackState.getState().equals(state)){
                content = productBackState.getContent();
            }
        }
        return content;
    }


}
