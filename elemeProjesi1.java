import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class elemeProjesi1 {
    
public static void main(String[] args){ 

    HashMap<String,Double> planets = new HashMap<String,Double>();
    planets.put("Mercury", 0.37);
    planets.put("Venus", 0.9);
    planets.put("Mars", 0.37);
    planets.put("Jupiter", 2.52);
    planets.put("Saturn", 1.06);
    planets.put("Uranus", 0.88);
    planets.put("Neptune", 1.12);
    planets.put("Pluto", 0.06);


   Scanner inp = new Scanner(System.in);
   double W = inp.nextDouble();

   for (Map.Entry<String, Double> set : planets.entrySet()) {
    double newWeight = set.getValue() * W;
    System.out.print("The weight on " + set.getKey() + " = " );
    System.out.format("%.1f%n", newWeight); 
}

}
}