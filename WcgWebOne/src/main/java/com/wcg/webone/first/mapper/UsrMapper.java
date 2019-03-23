package com.wcg.webone.first.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.wcg.webone.first.domain.Usr;
@Mapper
public interface UsrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Usr record);

    int insertSelective(Usr record);

    Usr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Usr record);

    int updateByPrimaryKey(Usr record);

	ArrayList<Usr> selectall();
}