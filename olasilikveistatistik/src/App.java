public class App {
  

    public static void main(String[] args) throws Exception {
        //145,235,150,210,155,210,170,205,175,200
       islemler yeni=new islemler();
       int dizi[]={145,235,150,210,155,210,170,205,175,200}; // 3 1 4  81 1 256
       
      
       yeni.basitSeriSirala(dizi);
       for(int i=0;i<dizi.length;i++){
       System.out.println(dizi[i]);
       }
       
      
      System.out.println("-----------------------");
    yeni.frekansSeriSirala(dizi);
     yeni.frekansTablosu(dizi);
    
     yeni.merkeziEgilimOlculeri(dizi);

     yeni.dagilimOlculeri(dizi);
  
    yeni.basitRastgeleOrnekleme(4,10,15);
    
     yeni.permutasyon(140, 5);
    System.out.println(yeni.faktoriyel(10));
    yeni.kombinasyon(140, 5);
    yeni.sistematikRastgeleOrnekleme(21, 3);
   
      
    }
}
