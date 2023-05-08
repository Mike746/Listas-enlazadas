import java.util.Scanner;


class Nodo{
    
    String info;
    Nodo next;
    
    public Nodo(){
        next = null;
    }
    
    
    public Nodo(String info){
        this.info = info;
    }
    
    public Nodo(String info, Nodo next){
        this.info = info;
        this.next = next;
    }
    
}

class Lista {
    Nodo primero;
    int indice;
    
    public Lista(){
        primero = null;
        indice = -1;
    }
    
    public void Insertar(String dato){
        Nodo temp = new Nodo (dato);
        temp.next = primero;
        primero = temp;
        indice++;
    }
    
    public void Buscar(){
        Nodo temp = new Nodo();
        Nodo n = primero;
        for(int i=0;i<indice && n!=null;i++){
            n=n.next;
            temp = n;
        }
        System.out.println(temp.info);
    }
    
    public void Visualizar(){
        Nodo n;
        n = primero;
        while(n!=null){
            System.out.println(n.info);
            n = n.next;
        }
    }
    
}


public class Main
{
	public static void main(String[] args) {
		Lista list = new Lista();
		String dato="";
		Scanner sc = new Scanner(System.in);
		while(!dato.equalsIgnoreCase("fin")){
		    dato = sc.nextLine();
		    if(!dato.equalsIgnoreCase("fin")){
		        list.Insertar(dato);
		    }
		}
		list.Visualizar();
	}
}