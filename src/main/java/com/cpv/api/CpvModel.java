package com.cpv.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cpv_list")
public class CpvModel {
	@Id
	private String cpv_code;
	@Column
	private String description_en;
	
	public CpvModel()
	{
		
	}
	public CpvModel(String cpv_code, String description_en)
	{
		this.cpv_code=cpv_code;
		this.description_en=description_en;
	}

	public String getCpv_code() {
		return cpv_code;
	}

	public void setCcpv_code(String cpv_code) {
		this.cpv_code = cpv_code;
	}

	public String getDescription_en() {
		return description_en;
	}

	public void setDescription_en(String description_en) {
		this.description_en = description_en;
	}

}
