package com.jc.wechat.groupmsg.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "code_info")
public class CodeInfo {
    /**
     * 主键，自增长
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * 编码
     * */
    @Column(length = 2,nullable = false)
    private String code;
    /**
     * 编码类型
     * */
    @Column(length = 40,nullable = false,unique = true)
    private String codeType;
    /**
     * 编码名称
     * */
    @Column(length = 100,nullable = false)
    private String codeName;
    /**
     * 备注信息
     * */
    @Column(length = 500)
    private String remark;
}
