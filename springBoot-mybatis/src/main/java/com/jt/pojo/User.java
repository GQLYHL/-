package com.jt.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 800762102759852864L;
	private Integer id;
	private String name;
	private String sex;
	private Integer age;

}
