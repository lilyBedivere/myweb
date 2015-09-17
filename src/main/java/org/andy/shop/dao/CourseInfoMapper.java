package org.andy.shop.dao;

import org.andy.shop.model.CourseInfo;
  
public interface CourseInfoMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(CourseInfo record);

    int insertSelective(CourseInfo record);

    CourseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseInfo record);

    int updateByPrimaryKey(CourseInfo record);
    
   
}