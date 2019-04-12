package com.jc.wechat.groupmsg.mapper;

import com.jc.wechat.groupmsg.GroupmsgApplicationTests;
import com.jc.wechat.groupmsg.entity.CodeInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CodeInfoMapperTest extends GroupmsgApplicationTests {
    @Autowired
    private CodeInfoMapper codeInfoMapper;

    @Test
    public void selectCodeInfoByCodeTypeTest(){
        List<CodeInfo> list = codeInfoMapper.selectCodeInfoByCodeType("testType");
        for(CodeInfo CodeInfo:list){
            System.out.println(CodeInfo.getCodeName());
        }
    }

    @Test
    public void insertCodeInfoTest(){
        CodeInfo CodeInfo = new CodeInfo();
        CodeInfo.setCode("1");
        CodeInfo.setCodeName("测试编码");
        CodeInfo.setCodeType("testType");
        CodeInfo.setRemark("没什么备注");
        int num = codeInfoMapper.insertCodeInfo(CodeInfo);
        if(num>0){
            System.out.println("新增成功");
        }else{
            System.out.println("新增失败");
        }
    }
}
