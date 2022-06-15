<h1>Aksigorta Java & Angular Bootcamp Teknik Test</h1>
<h2>Hazırlayan</h2> 
<p> Serhat Uluç</p>
<p> email : ulucs15@itu.edu.tr</p>
<p> github : github.com/serhatuluc</p>
<p> linkedn : linkedin.com/in/serhat-uluc/</p>

<h2>Eleme sorusu - 1</h2>

```java
import java.util.Scanner;

public class elemeSorusu {
    public static void main(String[] args) {
        int T = 0;
        int N = 0;
        Scanner input = new Scanner(System.in);
        

       while (true){
            System.out.println("Please enter X");
            int X = input.nextInt();
            if(X == 0){
            break;
            }
            T += X;
            N += 1;
       }
       
       int Y = T / N;
       System.out.print(Y);
    }
}
```
<p>Kullanıcıdan X değerini alan bu program X değerine bağlı olarak farklı işlemler yapmaktadır. X değeri sıfırdan farklı ise bu değeri T değişkeni ile toplamaktadır. Burada T kullanıcıdan alınan X değerlerinin toplamını temsil etmektedir. N ise kullanıcıdan sıfır olması dışında kaç tane X değeri aldığını hesaplar. X değeri sıfır olarak verildiğinde ise döngüden çıkıp verilen X değerlerinin ortalaması Y değişkeni içerisinde kaydedilip kullanıcıya çıktı olarak sunuluyor.
Örnek: 4, 5, 6, 7, 8, 0 girildi. 0 da döngüden çıkıldı.  T = 4 + 5 + 6 + 7  + 8 = 30 . N = 5, ve sonuç olarak Y = 6 çıktısı oluşur.
</p>



<h2>Eleme sorusu - 2</h2>


```java
import java.io.*;
import java.util.Arrays;


public class elemeSorusu2 {
    static int[] reversed_arr(int[] array) {
       int[] new_array = new int[array.length];

       for(int i = array.length - 1, j = 0; i >= 0; i--,j++){
            new_array[j] = array[i];
       }
       return new_array;
    }

public static void main(String[] args){ 
    int[] array = {1,2,3,4,5};
    System.out.println(Arrays.toString(reversed_arr(array)));
    }
}

```
<p>Liste reversed_arr şeklinde adlandırılan metod sayesinde tersine çevrildi. Bu methodu iki değişkeni olan for döngüsü içeriyor. Döngü içerisinde "i" değişkeni eski listeyi ters yönde yinelerken "j" değişkeni yeni listeye eleman eklemek için yineleme işlemi yapar. Java kütüphanelerinde yüklü halde bulunan metod kullanımı tercih edilmemiştir.  </p>

<h2>Eleme projesi - 1</h2>


```java
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
   System.out.print("Please enter weight on earth : ");
   double W = inp.nextDouble();

   for (Map.Entry<String, Double> set : planets.entrySet()) {
    double newWeight = set.getValue() * W;
    System.out.print("The weight on " + set.getKey() + " = " );
    System.out.format("%.1f%n", newWeight); 
        }

    }
}
```
<p>Sözlük yapısı kullanımı tercih edildi. Yeni ağırlık format kullanılarak virgülden sonra 1 sayı olması tercih edildi. </p>



<h2>Eleme projesi - 2</h2>

```javascript
function shift_array(array, r) {
    for (let i=0; i<r; i++){
        value = array.pop()
        array.unshift(value)

    }
return array }
```
<p>Stack ve queue mantığı kullanılarak listenin sonundan eleman çıkartılıp listenin başına eklenerek kaydırma işlemi basitçe gerçekleştirilmiştir. Pop metodu stack yapısından ve unshift metodu ise queue yapısından esinlenildi.</p>