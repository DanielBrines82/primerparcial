import java.util.Scanner;
public class invertirvector {

    public int[] arreglo1;
    public int[] arreglo2;
Scanner c=new Scanner(System.in);

   public void leerarreglo1(int x)
   {
       arreglo1= new int[x];

       for (int i=0;i<arreglo1.length;i++)
       {
           System.out.println("Dato : "+(i+1));
           int dato=c.nextInt();
            arreglo1[i]=dato;

       }


    }
    public void moverdatos()
    {
        System.out.println("intercambiando....:");
        arreglo2=new int[arreglo1.length];
        for (int i=0;i<arreglo1.length;i++)
        {

            arreglo2[i]=arreglo1[i];

        }


    }
    public void mostrarArreglo1()
    {
        System.out.println("Datos del arreglo1:");
        for (int i=0;i<arreglo1.length;i++)
        {

            System.out.println("Dato : "+(i+1)+":"+arreglo1[i]);

        }


    }
    public void mostrarArreglo2()
    {
        System.out.println("Datos del arreglo2:");
        for (int i=0;i<arreglo2.length;i++)
        {

            System.out.println("Dato : "+(i+1)+":"+arreglo2[i]);

        }


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        invertirvector objeto=new invertirvector();

        System.out.print("teclee el tamaño del arreglo : ");

        int tamaño=s.nextInt();
        objeto.leerarreglo1(tamaño);
        objeto.mostrarArreglo1();
        objeto.moverdatos();
        objeto.mostrarArreglo1();
        objeto.mostrarArreglo2();
    }
}

