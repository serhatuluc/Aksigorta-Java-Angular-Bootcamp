package homework2;
import java.util.*;

public class Ulke {
	private String name;
	List<Futbolcu> futbolcular;
	
	public Ulke(String name){
		this.name = name;
	}
	
	public void setFutbolcu(List<Futbolcu> futbolcular) {
		this.futbolcular = futbolcular;
	}
	
	public List<String> getFutbolcu(){
		List<Futbolcu> futbolcuListesi = this.futbolcular;
		List<String> names = new ArrayList<String>();
		for(Futbolcu futbolcu : futbolcuListesi) {
			names.add(futbolcu.getName());
		}
		return names;
	}
	
	public String getName() {
		return this.name;
	}
}
