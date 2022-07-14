package org.egiti.hibernate.model.data;

import org.egiti.hibernate.model.data.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="KISI")
public class Kisi extends BaseEntity{
	private static final long serialVersionUID = 1L;
	
	private String tcKimlikNo;
	private String ad;
	private String soyad;
	
	@Column(name="tc_kimlik_no",length = 11,nullable = false,unique = true)
	public String getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	
	@Column(name="AD",length = 25,nullable = false)
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	@Column(name="SOYAD",length = 25,nullable = false)
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	@Override
	@Transient
	public String getViewString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getAd()).append(" ").append(getSoyad()).append(" ");
		sb.append("(").append(getTcKimlikNo()).append(")")
;		return sb.toString();
	}
	
	
}
