package com.jc.wechat.groupmsg.mapper;

import com.jc.wechat.groupmsg.entity.CodeInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CodeInfoMapper {

    @Select("select * from code_info where code_type = #{codeType}")
    @Results({
            @Result(property = "codeType",column = "code_type"),
            @Result(property = "codeName",column = "code_name")
    })
    List<CodeInfo> selectCodeInfoByCodeType(@Param("codeType") String codeType);

    @Insert("insert into code_info(code,code_type,code_name,remark) values(#{code},#{codeType},#{codeName},#{remark})")
    int insertCodeInfo(CodeInfo codeInfoEntity);
}
