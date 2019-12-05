package com.gm.springboot1.springboot1.dao;

import com.gm.springboot1.springboot1.entity.Euser;
import com.gm.springboot1.springboot1.entity.EuserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface EuserMapper {
    int countByExample(EuserExample example);

    int deleteByExample(EuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Euser record);

    int insertSelective(Euser record);

    List<Euser> selectByExample(EuserExample example);

    Euser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Euser record, @Param("example") EuserExample example);

    int updateByExample(@Param("record") Euser record, @Param("example") EuserExample example);

    int updateByPrimaryKeySelective(Euser record);

    int updateByPrimaryKey(Euser record);
}