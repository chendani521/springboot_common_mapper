package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Test_user")      /*声明数据库的表名*/
public class TestUser implements Serializable {
    @Id      /*声明当前属性为主键*/
    private String username;

    @Column(name = "password")      /*作用在属性上 用来指定数据库中的字段名称*/
    private String password;
}
