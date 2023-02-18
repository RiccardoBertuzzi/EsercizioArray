package esercizio1502;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public  class GestioneNumeri {
	ArrayList<Integer> vettore = new ArrayList<>();
	int lunghezza=10;
    int[] Lista= new int[10];
	public int Lista2[] = {12,2,1,15,3,1,5,1,16,7};
//@Override public int toString() { return Lista[i];  }

int somma;
int i=0;
int minimo=Lista[0];
int massimo=Lista[0];
double media=0;
 public void	sommaNumeri()	
 { somma=0; for (int i=0;i<lunghezza;i++) { somma=somma+Lista[i]; }System.out.println("la somma è: "+somma);  }
 
 public void	massimo() { for (int i=0;i<lunghezza;i++) { if(massimo<Lista[i])
 { massimo=Lista[i];}	 } System.out.println("il numero maggiore è: "+massimo);    }
 public void	minimo() { for (int i=0;i<lunghezza;i++) {  if(massimo>Lista[i])
 { minimo=Lista[i];}	 } System.out.println("il numero minore è: "+minimo);  }     
 
public void	mediaNumeri() { somma=0; for (int i=0;i<lunghezza;i++) { somma=somma+Lista[i];
  int contatore=i+1; media= (double) somma/lunghezza;}     System.out.println("la media è: "+media); }
 
 public void	InserisciNumeri() {for (int i=0;i<lunghezza;i++) { 
	 int k=i+1;
	 System.out.print("inserisci il numero "+k);
	 Scanner scan = new Scanner(System.in); 
	 try {Lista[i]=scan.nextInt();} catch(InputMismatchException e) { System.out.print("Errore"); }
	 
 }System.out.println();System.out.print("il vettore è: ");
 for (int i=0;i<Lista.length;i++) { System.out.print(Lista[i]+ " ");      } }
 
 public void RimuoviNumeri() { 
	System.out.print("Decidi quale elemento della lista rimuovere. Scegli un numero tra 1 e 10");
	 Scanner scan2 = new Scanner(System.in);   int input = scan2.nextInt();   
	 if(input<lunghezza) {for(i=input-1;i<lunghezza-1;i++) { Lista[i]=Lista[i+1];}  }while(i<Lista.length) {Lista[i]=0; i=i+1;}  
	 for (i=0;i<Lista.length;i++) { System.out.print(Lista[i]);System.out.print(" "); } 
	lunghezza=lunghezza-1; }
}
//cois parlò bella