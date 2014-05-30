package com.dp.bigdata.taurus.generated.mapper;

import com.dp.bigdata.taurus.generated.module.UserGroup;
import com.dp.bigdata.taurus.generated.module.UserGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Thu May 15 16:53:11 HKT 2014
     */
    int countByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Thu May 15 16:53:11 HKT 2014
     */
    int deleteByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Thu May 15 16:53:11 HKT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Thu May 15 16:53:11 HKT 2014
     */
    int insert(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Thu May 15 16:53:11 HKT 2014
     */
    int insertSelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Thu May 15 16:53:11 HKT 2014
     */
    List<UserGroup> selectByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Thu May 15 16:53:11 HKT 2014
     */
    UserGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Thu May 15 16:53:11 HKT 2014
     */
    int updateByExampleSelective(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Thu May 15 16:53:11 HKT 2014
     */
    int updateByExample(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Thu May 15 16:53:11 HKT 2014
     */
    int updateByPrimaryKeySelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Thu May 15 16:53:11 HKT 2014
     */
    int updateByPrimaryKey(UserGroup record);
}