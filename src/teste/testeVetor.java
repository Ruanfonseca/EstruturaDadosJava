package teste;

import com.ruan.estruturadados.Vetor;

public class testeVetor {
  public static void main(String[] args) {
	  /*Vetor vetor = new Vetor(5);
	  
	  try {
		  vetor.adiciona("Elemento 1");
		  vetor.adiciona("Elemento 2");	
	} catch (Exception e) {
	
		e.printStackTrace();
	}
	 
  }*/
    Vetor vetor = new Vetor(10);
	  
	  try {
		  vetor.adiciona("Elemento 1");
		  vetor.adiciona("Elemento 2");	
	      System.out.println(vetor.tamanho());
	      System.out.println(vetor.toString());
	  } catch (Exception e) {
	
		e.printStackTrace();
	
	}
	
	  
	  
  }
	  
}
