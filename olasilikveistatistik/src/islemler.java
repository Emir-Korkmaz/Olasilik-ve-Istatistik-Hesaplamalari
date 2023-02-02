import java.lang.Math;
import java.util.Random;
import java.util.HashMap;

public class islemler {
    
    public void basitSeriSirala(int dizi[]){
        int temp;
       
      
      for(int i=0;i<dizi.length;i++){
          for(int j=i+1;j<dizi.length;j++){
              if(dizi[i]>dizi[j]){
                  temp=dizi[i];
                  dizi[i]=dizi[j];
                  dizi[j]=temp;
              }
          }
      }
}

   public void frekansSeriSirala(int dizi[]){
        basitSeriSirala(dizi);
        int sayac=1;
        for(int b=0;b<dizi.length;b++){
            for(int j=b+1;j<dizi.length;j++){
             if(dizi[b]==dizi[j]){
                b++; 
                sayac++;
             }
             
            }
            System.out.println(dizi[b]+" = "+sayac);
            sayac=1;
        }
   }

    //15 20 25 60 70 70
   public void frekansTablosu(int dizi[]){
       
        basitSeriSirala(dizi);
        int bas=dizi[0],son=0,R;
        double sayac=0,H,sayi,K;
        boolean tekM=true;
        
        for(int i=1;i<dizi.length;i++){
              son++;
        }
       
        
        son=dizi[son];
        R=son-bas;
        System.out.println("R: "+R);
        
        for(int i=0;i<dizi.length;i++){
           sayac++;
        }
        K=Math.sqrt(sayac);
      
        if((K*2)%2==0){
            System.out.println("K: "+K);
        }

        double a=K;
        
        if(K>10){
            K=K%10;
            tekM=false;
        }
        
        if(K<1 && K>0){
            if(tekM==true){
            K=1;}
            else{
                K=a+(1-K);
                System.out.println("K: "+K);
                tekM=true;
            }
        }

        if(K<2 && K>1){
            if(tekM==true){
            sayi=K-1;
            K=K+(1-sayi);
            System.out.println("K: "+K);
             }
            else{
                sayi=K-1;
                K=a+(1-sayi);
                System.out.println("K: "+K);
                tekM=true;
            }
        }

        if(K<3 && K>2){
            if(tekM==true){
                sayi=K-2;
                K=K+(1-sayi);
                System.out.println("K: "+K);
                 }
                else{
                    sayi=K-2;
                    K=a+(1-sayi);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }

        if(K<4 && K>3){
            if(tekM==true){
                sayi=K-3;
                K=K+(1-sayi);
                System.out.println("K: "+K);
                 }
                else{
                    sayi=K-3;
                    K=a+(1-sayi);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }
        if(K<5 && K>4){
            if(tekM==true){
                sayi=K-4;
                K=K+(1-sayi);
                System.out.println("K: "+K);
                 }
                else{
                    sayi=K-4;
                    K=a+(1-sayi);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }   
        if(K<6 && K>5){
            if(tekM==true){
                sayi=K-5;
                K=K+(1-sayi);
                System.out.println("K: "+K);
                 }
                else{
                    sayi=K-5;
                    K=a+(1-sayi);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }
        if(K<7 && K>6){
            if(tekM==true){
                sayi=K-6;
                K=K+(1-sayi);
                System.out.println("K: "+K);
                 }
                else{
                    sayi=K-6;
                    K=a+(1-sayi);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }
        if(K<8 && K>7){
            if(tekM==true){
                sayi=K-7;
                K=K+(1-sayi);
                System.out.println("K: "+K);
                 }
                else{
                    sayi=K-7;
                    K=a+(1-sayi);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        } 
        if(K<9 && K>8){
            if(tekM==true){
                sayi=K-8;
                K=K+(1-sayi);
                System.out.println("K: "+K);
                 }
                else{
                    sayi=K-8;
                    K=a+(1-sayi);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }

        if(K<10 && K>9){
            if(tekM==true){
                sayi=K-9;
                K=K+(1-sayi);
                System.out.println("K: "+K);
                 }
                else{
                    sayi=K-9;
                    K=a+(1-sayi);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }
        
        H=R/K;
        
        boolean Hhesapla=false;

        if((H*2)%2==0){
        System.out.println("H: "+H);
        Hhesapla=false;
    }
    else{
        Hhesapla=true;
    }
        double h=H;
        if(Hhesapla==true){
        if(H>10){
            H=H%10;
            tekM=false;
        }
        }
        if(H<1 && H>0){
            if(tekM==true){
            H=1;}
            else{
                H=h+(1-H);
                System.out.println("H: "+H);
                tekM=true;
            }
        }

        if(H<2 && H>1){
            if(tekM==true){
            sayi=H-1;
            H=H+(1-sayi);
            System.out.println("H: "+H);
             }
            else{
                sayi=H-1;
                H=h+(1-sayi);
                System.out.println("H: "+H);
                tekM=true;
            }
        }

        if(H<3 && H>2){
            if(tekM==true){
                sayi=H-2;
                H=H+(1-sayi);
                System.out.println("H: "+H);
                 }
                else{
                    sayi=H-2;
                    H=h+(1-sayi);
                    System.out.println("H: "+H);
                    tekM=true;
                }
        }

        if(H<4 && H>3){
            if(tekM==true){
                sayi=H-3;
                H=H+(1-sayi);
                System.out.println("H: "+H);
                 }
                else{
                    sayi=H-3;
                    H=h+(1-sayi);
                    System.out.println("H: "+H);
                    tekM=true;
                }
        }
        if(H<5 && H>4){
            if(tekM==true){
                sayi=H-4;
                H=H+(1-sayi);
                System.out.println("H: "+H);
                 }
                else{
                    sayi=H-4;
                    H=h+(1-sayi);
                    System.out.println("H: "+H);
                    tekM=true;
                }
        }   
        if(H<6 && H>5){
            if(tekM==true){
                sayi=H-5;
                H=H+(1-sayi);
                System.out.println("H: "+H);
                 }
                else{
                    sayi=H-5;
                    H=h+(1-sayi);
                    System.out.println("H: "+H);
                    tekM=true;
                }
        }
        if(H<7 && H>6){
            if(tekM==true){
                sayi=H-6;
                H=H+(1-sayi);
                System.out.println("H: "+H);
                 }
                else{
                    sayi=H-6;
                    H=h+(1-sayi);
                    System.out.println("H: "+H);
                    tekM=true;
                }
        }
        if(H<8 && H>7){
            if(tekM==true){
                sayi=H-7;
                H=H+(1-sayi);
                System.out.println("H: "+H);
                 }
                else{
                    sayi=H-7;
                    H=h+(1-sayi);
                    System.out.println("H: "+H);
                    tekM=true;
                }
        } 
        if(H<9 && H>8){
            if(tekM==true){
                sayi=H-8;
                H=H+(1-sayi);
                System.out.println("H: "+H);
                 }
                else{
                    sayi=H-8;
                    H=h+(1-sayi);
                    System.out.println("H: "+H);
                    tekM=true;
                }
}
                if(H<10 && H>9){
                    if(tekM==true){
                        sayi=H-9;
                        H=H+(1-sayi);
                        System.out.println("H: "+H);
                         }
                        else{
                            sayi=H-9;
                            H=h+(1-sayi);
                            System.out.println("H: "+H);
                            tekM=true;
                        }
                    }

                 System.out.println("K: "+(int)K);
         int sinif_limit_alt[] = new int[(int)K];
         int i=0;
         sinif_limit_alt[0]=bas;
         while(i!=(int)K){
           i++;
           if(i!=K){
           sinif_limit_alt[i]=sinif_limit_alt[i-1]+(int)H;
           }
         }

         int sinif_limit_üst[] = new int[(int)K];
         int j=0;
         sinif_limit_üst[0]=sinif_limit_alt[1]-1;
         while(j!=(int)K){
             j++;
             if(j!=K){
                 sinif_limit_üst[j]=sinif_limit_üst[j-1]+(int)H;
             }
         }

        
        
         
         double sinif_sinir_üst[] = new double[(int)K];
         int t=0;
         sinif_sinir_üst[0]=sinif_limit_alt[1]+sinif_limit_üst[0];
         sinif_sinir_üst[0]=(float)sinif_sinir_üst[0]/2;
         while(t!=(int)K){
            t++;
            if(t!=K){
                sinif_sinir_üst[t]=sinif_sinir_üst[t-1]+(int)H;
            }
        }

         double sinif_sinir_alt[] = new double[(int)K];
        int y=1;
        sinif_sinir_alt[1]=sinif_sinir_üst[0];
        sinif_sinir_alt[0]=sinif_sinir_alt[1]-(int)H;
        while(y!=(int)K){
            y++;
            if(y!=K){
                sinif_sinir_alt[y]=sinif_sinir_alt[y-1]+(int)H;
            }
        }

        double sinif_orta_nokta[]=new double[(int)K];
        int o=0;
        while(o!=(int)K){
          sinif_orta_nokta[o]=sinif_limit_alt[o]+sinif_limit_üst[o];
          sinif_orta_nokta[o]=(double)sinif_orta_nokta[o]/2;
          o++;
        }
        
        int sinif_frekans[]=new int[(int)K+1];
        int temp=0,fsayac=0,f=0;
        // 15 20 30 60 70 70
        while(temp<dizi.length  &&  f<=(int)K-1){
            if(dizi[temp]<sinif_sinir_üst[f] && dizi[temp]>sinif_sinir_alt[f]){
               fsayac++;
               temp++;
            }
           else{
            
                f++;
               fsayac=0;
            
           }
           sinif_frekans[f]=fsayac;
          
            }
            
        int eklemeli_sinif_frekans[]=new int[(int)K];
        eklemeli_sinif_frekans[0]=sinif_frekans[0];
        for(int e=1;e<(int)K;e++){
            eklemeli_sinif_frekans[e]=eklemeli_sinif_frekans[e-1]+sinif_frekans[e];
        }
        
        int oransal_sinif_frekans[]=new int[(int)K];
        for(int m=0;m<(int)K;m++){
        oransal_sinif_frekans[m]=sinif_frekans[m];
        }
            
        int eklemeli_oransal_sinif_frekans[]=new int[(int)K];
        for(int b=0;b<(int)K;b++){
        eklemeli_oransal_sinif_frekans[b]=eklemeli_sinif_frekans[b];
        }
        
    
        for(int z=0;z<K;z++){
      System.out.println("sinif alt limit: "+sinif_limit_alt[z]+"     "+"sinif ust limit: "+sinif_limit_üst[z]);
      
    }
    System.out.println("---------------------------------------------------------------------------");
    for(int z=0;z<K;z++){
    System.out.println("sinif alt sinir: "+sinif_sinir_alt[z]+"     "+"sinif ust sinir: "+sinif_sinir_üst[z]);
}

System.out.println("---------------------------------------------------------------------------");
    for(int z=0;z<K;z++){
    System.out.println("sinif orta noktalari: "+sinif_orta_nokta[z]);
}

System.out.println("---------------------------------------------------------------------------");
    for(int z=0;z<K;z++){
    System.out.println("sinif frekanslari: "+sinif_frekans[z]);
}
System.out.println("---------------------------------------------------------------------------");
    for(int z=0;z<K;z++){
    System.out.println("eklemeli sinif frekanslari: "+eklemeli_sinif_frekans[z]);
}

System.out.println("---------------------------------------------------------------------------");
    for(int z=0;z<K;z++){
    System.out.println("oransal sinif frekanslari: "+oransal_sinif_frekans[z]+"/"+eklemeli_sinif_frekans[(int)K-1]);
}
System.out.println("---------------------------------------------------------------------------");
    for(int z=0;z<K;z++){
    System.out.println("eklenik oransal sinif frekanslari: "+eklemeli_oransal_sinif_frekans[z]+"/"+eklemeli_sinif_frekans[(int)K-1]);
}

System.out.println();
 int n1=0;
int n=dizi.length;


double g=(double)n/4;
double L1;
int q;


int u=0;
double j1;
if(g > eklemeli_sinif_frekans[u]){
    u++;
}

q=u-1;


while(u>0){
     n1 = n1 + sinif_frekans[u-1];
    u--;
}
System.out.println("n1: "+ n1);

j1= (double)(g-n1);
System.out.println("j1: "+j1);
  

System.out.println();
L1=sinif_sinir_alt[q+1];
System.out.println("L1: "+L1);
int fQ1=sinif_frekans[q+1];
System.out.println("fQ1: "+fQ1);
double Q1;
Q1=L1+(double)((j1*H)/fQ1);
System.out.println("Q1: "+Q1);

System.out.println();

double j3n=((3*n));
j3n=(double)j3n/4;
System.out.println("j3n: "+j3n);
int n3=0;
int j3q,fQ3;
int j3u=0;
double j3,L3,Q3;
if(j3n >= eklemeli_sinif_frekans[j3u]){
    j3u++;
}
j3u+=1;
j3q=j3u-1;



while(j3u>0){
    n3 = n3 + sinif_frekans[j3u-1];
   j3u--;
}
System.out.println("n3: "+ n3);

j3=(j3n-n3);
System.out.println("j3: "+j3);
L3=sinif_sinir_alt[j3q+1];
System.out.println("L3: "+L3);
System.out.println();
 fQ3=sinif_frekans[j3q+1];
System.out.println("fQ3: "+fQ3);

Q3=L3+((j3*H)/fQ3);
System.out.println("Q3: "+Q3);

System.out.println();

}


  public void  merkeziEgilimOlculeri(int dizi[]){
      basitSeriSirala(dizi);
      float aritmetikOrtalama=0;
    for(int i=0;i<dizi.length;i++){
        aritmetikOrtalama+=dizi[i];
    }
    aritmetikOrtalama=aritmetikOrtalama/dizi.length;
    System.out.println("aritmetik ortalama: "+aritmetikOrtalama);
    int medyani,medyans;
    float medyan;
    if(dizi.length%2!=0){
        medyan=(dizi.length-1)/2;
        System.out.println("medyan: "+dizi[(int)medyan]);
    }
    else{
        medyans=(dizi.length)/2;
        medyani=(dizi.length-2)/2;
        medyan=(dizi[medyans]+dizi[medyani]);
        medyan=(float)medyan/2;
        System.out.println("medyan: "+medyan);
    }
    float harmo=0;
for(int l=0;l<dizi.length;l++){
 harmo=harmo+((float)1/dizi[l]);
}
harmo=(dizi.length)/harmo;
System.out.println("harmonikOrtalama: "+harmo);

      double geometrikOrt=dizi[0];
      for(int g=1;g<dizi.length;g++){
          geometrikOrt=geometrikOrt*dizi[g];
      }
      geometrikOrt=Math.pow(geometrikOrt,1.0/dizi.length);
      System.out.println("geometrik ortalama: "+geometrikOrt);

HashMap<Integer, Integer> sayiHarita = new HashMap<>();

int sonuc = -1; 
int mod = -1; 

int deger;

for (int i = 0; i < dizi.length; i++) { 

    deger = -1;
    
    if (sayiHarita.containsKey(dizi[i])) {
        deger = sayiHarita.get(dizi[i]); 
    }
    if (deger != -1) {
        
        deger += 1;
        if (deger > mod) {
            
            mod = deger;
            sonuc = dizi[i];
        }

        sayiHarita.put(dizi[i], deger); 
    } else {
        sayiHarita.put(dizi[i], 1);
    }

}

if (mod == 1)
    System.out.println("mod yok");

    System.out.println("mod: "+ sonuc);


  
}

public void dagilimOlculeri(int dizi[]){
    basitSeriSirala(dizi);
      float aritmetikOrtalama=0;
    for(int i=0;i<dizi.length;i++){
        aritmetikOrtalama+=dizi[i];
    }
    aritmetikOrtalama=aritmetikOrtalama/dizi.length;
     int i=0;
     double varyans=0,sonuc=0,standartSapma=0;
    while(i<dizi.length){
        sonuc=(dizi[i]-aritmetikOrtalama);
        sonuc=Math.pow((double)sonuc, (double)2.0);
        varyans=varyans+sonuc;
        i++;
    }
   
    varyans=(varyans/(dizi.length-1));
    System.out.println("varyans: "+varyans);
    standartSapma=Math.sqrt(varyans);
    System.out.println("standartSapma: "+standartSapma);

   double ortalamaMutlakSapma=0;
   
   int y=0;
   while(y<dizi.length){
    sonuc=(dizi[y]-aritmetikOrtalama);
    if(sonuc<0){
        sonuc=Math.sqrt((sonuc*sonuc)); 
    }
    ortalamaMutlakSapma=ortalamaMutlakSapma+sonuc;
    y++;
}
ortalamaMutlakSapma=ortalamaMutlakSapma/dizi.length;
System.out.println("ortalama mutlak sapma: "+ortalamaMutlakSapma);

  double carpiklikOlcütü=0;
  int s=0;
  while(s<dizi.length){
    sonuc=(dizi[s]-aritmetikOrtalama);
    sonuc=Math.pow((double)sonuc, (double)3.0);
    carpiklikOlcütü=carpiklikOlcütü+sonuc;
    s++;
}

carpiklikOlcütü=(carpiklikOlcütü/(dizi.length-1));
System.out.println("carpiklik: "+carpiklikOlcütü);

double sivrilikOlcutu=0;
  int p=0;
  while(p<dizi.length){
    sonuc=(dizi[p]-aritmetikOrtalama);
    sonuc=Math.pow((double)sonuc, (double)4.0);
    sivrilikOlcutu=sivrilikOlcutu+sonuc;
    p++;
}

sivrilikOlcutu=(sivrilikOlcutu/(dizi.length-1));
System.out.println("sivrilik: "+sivrilikOlcutu);

double degisim=0;
degisim=standartSapma/aritmetikOrtalama;
System.out.println("degisim(varyasyon katsayisi): "+degisim);




}


public void basitRastgeleOrnekleme(int deger,int adeger,int udeger){
    
    int sayi,basitRastgeleOrnekleme[]=new int[deger];
   if(deger<=((udeger-adeger)+1)){
    for (int i = 0; i < deger; i++)    
    {
        Random rastgele=new Random();
        sayi = adeger + rastgele.nextInt((udeger-adeger)+1);
        
    for (int j = 0; j < i; j++)
    {
    if (basitRastgeleOrnekleme[j] == sayi) {
        sayi = adeger + rastgele.nextInt((udeger-adeger)+1);
        j=0;
    }
}
    
    basitRastgeleOrnekleme[i] = sayi;    
} 
    for (int j = 0; j < deger; j++)
    {
    System.out.println(basitRastgeleOrnekleme[j]+" ");
    }
}
else{
    for (int i = 0; i < deger; i++)    
    {
        Random rastgele=new Random();
        sayi = adeger + rastgele.nextInt((udeger-adeger)+1);
        basitRastgeleOrnekleme[i] = sayi;
    }
    for (int j = 0; j < deger; j++)
    {
    System.out.println(basitRastgeleOrnekleme[j]+" ");
    }
}

}

public long faktoriyel(int a){
    
    //4    4 3 2 1
    long sonuc=1;
    
    while(a>1){
        sonuc = sonuc * (a*(a-1));
        a=a-2;
    }
    return sonuc;
  
    
}

public void permutasyon(int n,int r){
    long sonuc=1;
    for(int i=0;i<r;i++){
        sonuc=sonuc*n;
        n=n-1;
    }
    System.out.println(sonuc);
}

public void kombinasyon(int n,int r){
    long sonuc=1;
    for(int i=0;i<r;i++){
        sonuc=sonuc*n;
        n=n-1;
    }
    sonuc=sonuc/faktoriyel(r);
    System.out.println(sonuc);
}


public void sistematikRastgeleOrnekleme(int N,int n){
    boolean tekM=true;
    double K;
    K=N/n;
    double tut=K;
    int sayac=1;

    double a=K;
    double sayi;    
        if(K>10){
            K=K%10;
            tekM=false;
        }
        
        if(K<1 && K>0){
            if(tekM==true){
            K=0;
            System.out.println("K: "+K);}
            else{
                K=a-(K);
                System.out.println("K: "+K);
                tekM=true;
            }
        }

        if(K<2 && K>1){
            if(tekM==true){
            sayi=K-1;
            K=K-(sayi);
            System.out.println("K: "+K);
             }
            else{
                K=K-1;
                K=a-(K);
                System.out.println("K: "+K);
                tekM=true;
            }
        }

        if(K<3 && K>2){
            if(tekM==true){
                sayi=K-2;
                K=K-(sayi);
                System.out.println("K: "+K);
                 }
                else{
                    K=K-2;
                    K=a-(K);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }

        if(K<4 && K>3){
            if(tekM==true){
                sayi=K-3;
                K=K-(sayi);
                System.out.println("K: "+K);
                 }
                else{
                    K=K-3;
                    K=a-(K);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }
        if(K<5 && K>4){
            if(tekM==true){
                sayi=K-4;
                K=K-(sayi);
                System.out.println("K: "+K);
                 }
                else{
                    K=K-4;
                    K=a-(K);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }   
        if(K<6 && K>5){
            if(tekM==true){
                sayi=K-5;
                K=K-(sayi);
                System.out.println("K: "+K);
                 }
                else{
                    K=K-5;
                    K=a-(K);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }
        if(K<7 && K>6){
            if(tekM==true){
                sayi=K-6;
                K=K-(sayi);
                System.out.println("K: "+K);
                 }
                else{
                    K=K-6;
                    K=a-(K);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }
        if(K<8 && K>7){
            if(tekM==true){
                sayi=K-7;
                K=K-(sayi);
                System.out.println("K: "+K);
                 }
                else{
                    K=K-7;
                    K=a-(K);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        } 
        if(K<9 && K>8){
            if(tekM==true){
                sayi=K-8;
                K=K-(sayi);
                System.out.println("K: "+K);
                 }
                else{
                    K=K-8;
                    K=a-(K);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }

        if(K<10 && K>9){
            if(tekM==true){
                sayi=K-9;
                K=K-(sayi);
                System.out.println("K: "+K);
                 }
                else{
                    K=K-9;
                    K=a-(K);
                    System.out.println("K: "+K);
                    tekM=true;
                }
        }
        int randomSayi;
    randomSayi=(int)(Math.random()*tut);
    
    System.out.println("rastgeleSayi: "+(int)randomSayi);
    int sonuc=randomSayi;
    while(sayac!=n){
       
        sonuc = sonuc+((int)tut);
        System.out.println(sonuc);
        sayac++;
    }

}


}
