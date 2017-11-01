import java.util.Scanner;
public class Massiv {

	static Scanner scn = new Scanner(System.in);
	static int n,w;

	public static void main(String[] args) {
		System.out.print("Vvedyte kolychestvo elementov massiva: ");
		n=scn.nextInt();
		int [] a = new int[n];
		for (int i=0; i<n; i++)
		{
			System.out.print("Vvedyte ["+i+"] element massiva:");
			a[i]=scn.nextInt();

		}
		System.out.println("Vash massiv: ");
		for (int i=0; i<n; i++)
		{
			System.out.print("["+a[i]+"]");
		}
		
		My_method mm = new My_method();
		
		Vstavka v = new Vstavka();
		System.out.print("Esli vu hotite vypolnit' sortirovky moim metodom - najmite 1, esli hotite vypolnit' sortirovky vstavkoy - najmite 2: ");
		w=scn.nextInt();
		if(w==1)
		{
			a = mm.tatan(a);
		}
		if(w==2)
		{
			a=v.lesya(a);
		}
		if(w!=1 && w!=2)
		{
			System.out.println("Oshibka");
			main(null);
		}
		
		System.out.println("Otsortirovanuy massiv: ");
		for (int i=0; i<n; i++)
		{
			System.out.print("["+a[i]+"]");
		}
		
	}
	
}
