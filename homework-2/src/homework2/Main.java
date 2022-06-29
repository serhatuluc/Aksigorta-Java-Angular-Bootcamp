package homework2;

import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args) {
		Takim fenerbahce = new Takim("fenerbahce");
		fenerbahce.setfutbolcuListesi();
		System.out.println(fenerbahce.getfutbolcuListesi());
		
		Ulke turkiye = new Ulke("Turkiye");
		List<Futbolcu> futbolcular = new ArrayList<Futbolcu>();
		futbolcular.add(new Futbolcu("Altay"));
		futbolcular.add(new Futbolcu("Arda"));
		futbolcular.add(new Futbolcu("Ozan"));
		turkiye.setFutbolcu(futbolcular);
		
		System.out.print(turkiye.getFutbolcu());		
		
 	}
}
