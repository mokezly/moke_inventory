package com.ruoyi.generator.domain;

import com.ruoyi.common.core.domain.BaseEntity;

/**
 *  金额收入
 * @author : ZhengLiuyang
 * @date : 2021-06-21 22:32
 **/
public class Amount extends BaseEntity {

    private static final long serialVersionUID = 1L;
    /** 交易号id */
    private String id;
    /** 产品id */
    private String productID;
    /** 产品名称 */
    private String productName;
    /** 进货金额 */
    private Float inMoney;
    /** 卖出金额 */
    private Float outMoney;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getInMoney() {
        return inMoney;
    }

    public void setInMoney(Float inMoney) {
        this.inMoney = inMoney;
    }

    public Float getOutMoney() {
        return outMoney;
    }

    public void setOutMoney(Float outMoney) {
        this.outMoney = outMoney;
    }
}
