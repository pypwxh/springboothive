package com.dooioo.model;

/**
 * Simple to Introduction
 *
 * @Author: hp
 * @Date: 2016/11/10 14:59
 * @Description: 数据库表model
 * @Version: v1.0
 */
public class BaseItem {

    private String userId;
    private String propertyId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    @Override
    public String toString() {
        return "Focus{" +
                "userId='" + userId + '\'' +
                ", propertyId='" + propertyId + '\'' +
                '}';
    }
}
