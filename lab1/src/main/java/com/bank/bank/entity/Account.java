package com.bank.bank.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yuwen
 * @since 2021-03-28
 */
@Data
@TableName("account")
@ApiModel(value = "账户")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private Long idNumber;

    /**
     * 余额
     */
    @ApiModelProperty(value = "账户余额")
    private Double balance;

    /**
     * 信用等级
     */
    @ApiModelProperty(value = "信用等级")
    private Integer creditRate;

    /**
     * 贷款金额
     */
    @ApiModelProperty(value = "贷款金额")
    private Double loanAmount;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "年龄")
    private int age;


    @Override
    public String toString() {
        return "Account{" +
            "id=" + id +
            ", idNumber=" + idNumber +
            ", balance=" + balance +
            ", creditRate=" + creditRate +
            ", loanAmount=" + loanAmount +
        "}";
    }
}
