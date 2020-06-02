package com.easyshop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TaxTestBean)实体类
 *
 * @author makejava
 * @since 2020-06-02 10:07:05
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestBean implements Serializable {

    private Integer id;

    private String name;

    private String password;


}