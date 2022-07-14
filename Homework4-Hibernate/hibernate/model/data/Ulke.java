package org.egiti.hibernate.model.data;

import java.util.List;

import org.egiti.hibernate.model.data.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="ULKE")
public class Ulke extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	private String ad;
	private String resmiAd;
	private String telefonKod;
	private String plakaKod;
	private String bayrak;
	private List<Sehir> sehirler;
	
	//Eager metoduyla objeler çağrılmasına gerek kalmadan hazır hale getirilecek.
	//Lazy metodunda ise çağrılması gerekecek
	//OnetoMany testi de oluşturuldu.
	@OneToMany(mappedBy = "ulke", fetch = FetchType.EAGER)
	public List<Sehir> getSehirler() {
		return sehirler;
	}
	public void setSehirler(List<Sehir> sehirler) {
		this.sehirler = sehirler;
	}
	
	@Column(name= "AD",length = 50,nullable = false)
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	@Column(name= "resmi_ad	",length = 100,nullable = false)
	public String getResmiAd() {
		return resmiAd;
	}
	public void setResmiAd(String resmiAd) {
		this.resmiAd = resmiAd;
	}
	@Column(name= "telefon_kod",length = 5,nullable = false)
	public String getTelefonKod() {
		return telefonKod;
	}
	public void setTelefonKod(String telefonKod) {
		this.telefonKod = telefonKod;
	}
	@Column(name= "plaka_kod",length = 5,nullable = false)
	public String getPlakaKod() {
		return plakaKod;
	}
	public void setPlakaKod(String plakaKod) {
		this.plakaKod = plakaKod;
	}
	@Column(name= "bayrak",length = 250,nullable = false)
	public String getBayrak() {
		return bayrak;
	}
	public void setBayrak(String bayrak) {
		this.bayrak = bayrak;
	}
	@Override
	@Transient
	public String getViewString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getAd()).append(" : ");
		for(Sehir sehir:getSehirler()) {
			sb.append(sehir.getAd()).append("-");
		}
;		return sb.deleteCharAt(sb.length()-1).toString();
	}
	
}
