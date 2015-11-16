package promedio_estudiantes;
import java.util.Scanner;
public class calificaciones50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     //calificaciones();
	//promedio();
	tienda_descuento();
	}
	private static int calificaciones() {
	int acum=0;		
	int conta=0;
	System.out.println("PORCENTAJE DE REPROBADOS");
	System.out.println("Ingrese calificaciones ");
	for (int i=0;   i<50 ; i++){
	acum++;
	System.out.print("CLFC"+acum +":  ");
	Scanner nota=new Scanner (System.in);
	int nota1=nota.nextInt();
	if (nota1<70){
		conta++;	
	}
	}
	int conta1=conta*100/50;
		System.out.println("El porcentaje de los reprobados es de  :"+conta1+"%");
		return(0);
	}
	
	private static int promedio () {
	int cont1=0;
	int acum=0;
	System.out.println("PROMEDI DE CALIFICACIONES");
	System.out.println("Igrese cantidad de calificaciones a calcular ");	
	Scanner calculo=new Scanner(System.in);
	int calc=calculo.nextInt();
	for (int x=0; x<calc; x++){
	cont1++;
	System.out.print("CLFC"+cont1 +":  ");
	Scanner nota=new Scanner (System.in);
	int nota11=nota.nextInt();
	acum=acum+nota11;
	}
	double promedio=(acum/cont1);
	System.out.println("Su promedio es :"+promedio);
	return(0);
	}
	private static int tienda_descuento() {
	int acum=0,acum1=0,acum2=0,acum3=0;
	System.out.println("TIENDA DE DESCUENTO");
	System.out.println("Desea ingrsar al sitema si o no");
    Scanner respuesta=new Scanner(System.in);
    String resp=respuesta.next();
	while (resp.equals("si")||resp.equals("SI")){
	
	System.out.println("ingrese su  importe ");
	Scanner importe=new Scanner (System.in);
	int impor=importe.nextInt();
	System.out.println("Escoja un color de bolita");
	System.out.println("1 Blanco");
	System.out.println("2 Rojo");
	System.out.println("3 Amarillo");
	Scanner opci=new Scanner(System.in);
	int op=opci.nextInt();
	if (op==1){
	System.out.println("El importe a pagar sin descuento es de $"+impor);	
	System.out.println("Desea seguir ingrsando importe precionoe si|no ");
	resp=respuesta.next();
	acum1=acum1+impor;
	}
	if (op==2){ 
	int i=impor*40/100;
	System.out.println("El importe a pagar con el 40% de descuento es de $ "+i);
	System.out.println("Desea seguir ingrsando importe precionoe si|no ");
	resp=respuesta.next();
	acum2=acum2+i;
	}
	if (op==3){
    int x=impor*25/100;
	System.out.println("El importe a pagar con el 25% de descuento es de $ "+x);	
	System.out.println("Desea seguir ingrsando importe precionoe si|no ");
	resp=respuesta.next();
	acum3=acum3+x;
	}
	}
	int total=acum1+acum2+acum3;
	System.out.println("valor total en del dia es de $"+total);
	System.out.println("VUELVA PRONTO");
	
	while (resp.equals("no")||resp.equals("NO")){
		System.out.println("MUCHAS GRACIAS");
		System.exit(0);
	}
	return(0);
}
}