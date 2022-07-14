package org.egiti.hibernate.model.data.base;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@MappedSuperclass
public abstract class BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Date islemZaman;
	
	@Id
	@Column(name="ID",insertable = false,updatable = false,nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ISLEM_ZAMAN",nullable = false)
	public Date getIslemZaman() {
		return islemZaman;
	}
	public void setIslemZaman(Date islemZaman) {
		this.islemZaman = islemZaman;
	}
	
	@Transient
	public abstract String getViewString();
}
