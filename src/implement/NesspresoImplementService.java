/*
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 */

package implement;

import entity.Nesspreso;
import java.util.Scanner;
import service.NesspresoService;


public class NesspresoImplementService implements NesspresoService{
    
    Scanner input = new Scanner(System.in);
    
    @Override
    public void Menu(){
        Nesspreso n = new Nesspreso(10, 0);
        int op;
        do{
            System.out.println("Opciones: \n0(finalizar)\n1(servir taza)\n2(vaciar cafetera)\n3(ingresar cafe)\n4(mostrar datos)");
            op = input.nextInt();
            switch(op){
                case 0:
                    break;
                case 1:
                    System.out.println("Tamaño de la taza:");
                    n.setActualcap(ServCup(n.getActualcap(),input.nextInt()));
                    break;
                case 2:
                    n.setActualcap(EmptyPot(n.getActualcap()));
                    break;
                case 3:
                    System.out.println("Cantidad de cafe a ingresar:");
                    n.setActualcap(EnterCoffee(n.getMaxcap(),n.getActualcap(),input.nextInt()));
                    break;
                case 4:
                    System.out.println(n.toString());
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }while(op != 0);
    }
      
    
    @Override
    public int ActualCap(int act_cap, int max_cap){
        System.out.println("La cafetera se ha llenado.");
        return act_cap = max_cap;
    }
    //1
    @Override
    public int ServCup(int act_cap, int cup){
        if (cup >= act_cap){
            System.out.println("La taza no se lleno completamente, restante: "+ (cup - act_cap));
            return 0;
        }
        return act_cap - cup;
    }
    //2
    @Override
    public int EmptyPot(int act_cap){
        System.out.println("La cafetera se ha vaciado");
        return 0;
    }
    //3
    @Override
    public int EnterCoffee(int max_cap, int act_cap, int cafe_ingresado){
        act_cap = cafe_ingresado + act_cap;
        if (act_cap > max_cap){
            System.out.println("Cafetera llena, sobras: " +(act_cap-max_cap));
            act_cap = max_cap;
            return act_cap;
        }
        return act_cap;
    }
}
