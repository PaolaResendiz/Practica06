/**
 * Clase Parametros
 * @author Brenda Paola Resendiz Mendoza
 */

public class Parametros {
    /**
     * Metodo principal 
     * @param args Argumentos 
     */
    
    public static void main(String[] args){
	int x = 2;
	int[] y = new int [20];
	for(int i = 0; i < y.length; i++){
	    y[i] = i;
	}

	sucesor(x);
	System.out.println("Valor de x: " + x); // Paso de parametros por valor 
	sucesor(y);
	System.out.println("El sucesor del lugar 14 es: " + y[y.length - 5]); //Paso de parametros por refrencia 
        x = sucesor1(x);
	System.out.println("El sucesor de 2 es: " + x); // El valor se modifica 
        }

    /**
     * Metodo que regresa el sucesor de un numero
     * @param x Valor de un numero "x"
     */
        public static void sucesor(int x){
	    x = x + 1;
	}

    
     /**
     * Metodo que regresa los sucesores de un arreglo
     * @param x Valor de un numero "x"
     */
	public static void sucesor(int[] x) {
	    int d = 0;
	    for (int i = 0; i < x.length; i++){
		d = x[i] + 1;
	    }
	}

     /**
     * Metodo que regresa el sucesor
     * @param x Valor de un numero "x"
     * @return x El sucesor de un numero x
     */
	public static int sucesor1 (int x){
	    x = x + 1;
	    return x;
	}
}
