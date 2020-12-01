package PilasConArreglos;
import java.util.Scanner;
public class Pila {
    
    Scanner leer = new Scanner(System.in);
    String pilaNum[] = new String [5];    
    int top = -1;
    
    public void Insertar(){
        if(top >= pilaNum.length-1){
            System.out.println("La pila está llena..");
        }
        else{
            top +=1;
            System.out.println("Ingrese una palabra: ");            
            pilaNum[top] = leer.nextLine();
        }
    }
    
    public void Eliminar(){
        if(top == -1){
            System.out.println("La pila está vacía..");
        }
        else{
            System.out.println("Se elimino un elemento de la pila..");
            pilaNum[top] = "";
            top--;
        }        
    }
    
    public void Mostrar(){
        for(int top = 4; top >= 0; top--){
            System.out.println("Datos de la pila: " +pilaNum[top]);            
        }
    }
}
