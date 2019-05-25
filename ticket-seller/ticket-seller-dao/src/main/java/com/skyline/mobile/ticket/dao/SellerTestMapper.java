package com.skyline.mobile.ticket.dao;

import com.skyline.mobile.ticket.model.SellerTest;

public interface SellerTestMapper {
    int deleteByPrimaryKey(String name);

    int insert(SellerTest record);

    int insertSelective(SellerTest record);

    SellerTest selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(SellerTest record);

    int updateByPrimaryKey(SellerTest record);
}