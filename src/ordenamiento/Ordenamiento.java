package ordenamiento;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jordi
 */
public class Ordenamiento {
    public static void main(String[] args) {
        Random Aleatorio=new Random();
        Scanner entrada=new Scanner(System.in);
        int[] n=new int[1000];
        int numero;
        int x; 
        do{
        System.out.println("Metodos de ordenamiento");
        System.out.println("Metodo Burbuja.............1");
        System.out.println("Metodo Insercion...........2");
        System.out.println("Metodo Seleccion...........3");
        System.out.println("Metodo Quicksort...........4");
        System.out.println("Metodo Shellsort...........5");
        System.out.println("Salir......................6");
        System.out.println("Seleccione el metodo que quiera utilizar: ");
        do{
        x=entrada.nextInt();
         }while((x<1)||(x>6));
        switch(x)
        {
            case 1: 
                burbuja();
            break;
            case 2: 
                insercion();
            break;
            case 3: 
                seleccion();
            break;
            case 4:     
   long inicio,fin,tiempo;
   inicio=System.nanoTime();
   for(int i=0;i<1000;i++)
   {
   numero=100+Aleatorio.nextInt(1000);
   n[i]=numero;
   }
   quicksort(n, 0, n.length-1);
    for(int i=0;i<1000;i++)
   {
       System.out.println(n[i]);  
   }
        fin=System.nanoTime();
        tiempo=fin-inicio;
        System.out.println("Tiempo de ejecucion: "+tiempo/1e6+" ms"); 
            break;
            case 5: 
                shellsort();
            break;
            case 6:
                System.out.close();
                break;
        }
        }while(x!=6);
    }
    
    public static void burbuja()
    {
long inicio,fin,tiempo;         
Random Aleatorio=new Random();
inicio=System.nanoTime();
   int[] n=new int[1000];
   int numero,aux;
   
   for(int i=0;i<1000;i++)
   {
   numero=100+Aleatorio.nextInt(1000);
   n[i]=numero;
   }
   for(int i=0;i<1000;i++)
   {
    for(int j=0;j<1000-1;j++)
    {
     if(n[j]>n[j+1])
     {
         aux=n[j];
         n[j]=n[j+1];
         n[j+1]=aux;
     }
    }
   }
   for(int i=0;i<1000;i++)
   {
       System.out.println(n[i]);  
   }
fin=System.nanoTime();
tiempo=fin-inicio;
       System.out.println("Tiempo de ejecucion: "+tiempo/1e6+" ms");   
    }
    
    public static void insercion()
    {
long inicio,fin,tiempo;         
Random Aleatorio=new Random();
inicio=System.nanoTime();
   int[] n=new int[1000];
   int numero,aux,posicion;
   for(int i=0;i<1000;i++)
   {
   numero=100+Aleatorio.nextInt(1000);
   n[i]=numero;
   }
for(int i=0;i<1000;i++)
{
posicion=i;    
aux=n[i];
while((posicion>0)&&(n[posicion-1]>aux))
{
n[posicion]=n[posicion-1];  
posicion--;
}
n[posicion]=aux;
}
 for(int i=0;i<1000;i++)
   {
       System.out.println(n[i]);  
   }
fin=System.nanoTime();
tiempo=fin-inicio;
System.out.println("Tiempo de ejecucion: "+tiempo/1e6+" ms");     
    }
    
    public static void seleccion()
    {
 long inicio,fin,tiempo;         
Random Aleatorio=new Random();
inicio=System.nanoTime();
   int[] n=new int[1000];
   int numero,aux,min;
   for(int i=0;i<1000;i++)
   {
   numero=100+Aleatorio.nextInt(1000);
   n[i]=numero;
   }
for(int i=0;i<1000;i++)
{
    min=i;
    for(int j=i+1;j<1000;j++)
    {
        if(n[j]<n[min])
        {
         min=j;   
        }
    }
    aux = n[i];
    n[i]=n[min];
    n[min]=aux;
}
 for(int i=0;i<1000;i++)
   {
       System.out.println(n[i]);  
   }
fin=System.nanoTime();
tiempo=fin-inicio;
System.out.println("Tiempo de ejecucion: "+tiempo/1e6+" ms");       
    }
    
    public static void quicksort(int[] arreglo,int primero, int ultimo)
    {
 int i,j,pivote,aux;
 i=primero;
 j=ultimo;
 pivote=arreglo[(primero+ultimo)/2];
 do{
     while(arreglo[i]<pivote){
         i++;
     }
     while(arreglo[j]>pivote){
         j--;
     }
     //intercambio
     if(i<=j){
        aux=arreglo[i];
        arreglo[i]=arreglo[j];
        arreglo[j]=aux;
        i++;
        j--;
     }
 }while(i<=j);
    if(primero<j){
        quicksort(arreglo,primero,j);
    }
    if(i<ultimo){
        quicksort(arreglo,i,ultimo);
    }
    
    }
    
    public static void shellsort()
    {
    long inicio,fin,tiempo;         
Random Aleatorio=new Random();
inicio=System.nanoTime();
   int[] arreglo=new int[1000];
    int salto,j,k,aux,numero;
    for(int i=0;i<1000;i++)
   {
   numero=100+Aleatorio.nextInt(1000);
   arreglo[i]=numero;
   }
    salto=arreglo.length/2;
        while(salto>0)
        {
           for(int i=salto;i<arreglo.length;i++)
           {
               j=i-salto;
              while(j>=0)
              {
                  k=j+salto;
                  if(arreglo[j]<=arreglo[k])
                  {
                   j=-1;   
                  }else
                  {
                   aux=arreglo[j];   
                   arreglo[j]=arreglo[k];
                   arreglo[k]=aux;
                   j-=salto;
                  }
              }
           }
           salto=salto/2;
        }
    for(int i=0;i<1000;i++)
   {
       System.out.println(arreglo[i]);  
   }
fin=System.nanoTime();
tiempo=fin-inicio;
System.out.println("Tiempo de ejecucion: "+tiempo/1e6+" ms"); 
    }
    
 }
    

