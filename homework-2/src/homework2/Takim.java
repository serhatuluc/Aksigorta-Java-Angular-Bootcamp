package homework2;
import java.util.*;

public class Takim {
	private String name;
	ArrayList<Futbolcu> futbolcuListesi;
	
	public Takim(String name){
		this.name = name;
	}
	
	public void setfutbolcuListesi() {
		Futbolcu futbolcu1 = new Futbolcu("Berisha");
		Futbolcu futbolcu2 = new Futbolcu("Valencia");
		Futbolcu futbolcu3 = new Futbolcu("Kim");
		
		ArrayList<Futbolcu> futbolcular = new ArrayList<Futbolcu>();
		futbolcular.add(futbolcu1);
		futbolcular.add(futbolcu2);
		futbolcular.add(futbolcu3);
		
		this.futbolcuListesi = futbolcular;
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<String> getfutbolcuListesi() //To get students list
	{
	 List<Futbolcu> futbolcular = this.futbolcuListesi;
	 List<String> names = new ArrayList<String>();
	 for(Futbolcu futbolcu : futbolcular)
	 {
	     names.add(futbolcu.getName());
	 }
	 return names;
	}
	
}
