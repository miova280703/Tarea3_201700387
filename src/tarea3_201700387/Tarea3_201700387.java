package tarea3_201700387;
import java.io.IOException;
import java.util.Scanner;
//import java.util.Arrays;
//import javax.swing.*;
public class Tarea3_201700387 {

    
    public static void main(String[] args) throws IOException {
         int opc=0;
        do{ //Este ciclo es para que el menu se ejecute todo el tiempo y no termine
        Scanner entr = new Scanner(System.in);
        Scanner entr1 =  new Scanner(System.in);
        
        System.out.println("1. Usuarios\n" 
        + "2. Contador de Digitos\n" 
        + "3. Tres numeros de mayor a menor\n" 
        + "4. Promedio de Notas\n" 
        + "5. Salir");   
       
        opc=entr.nextInt();
        switch(opc){
            case 1:
                do{
                System.out.println("1. Ingresar Usuarios\n" 
                        + "2. Mostrar Usuarios Ascendentes\n" 
                        + "3. Mostrar Usuarios Descendentes\n" 
                        + "4. Menu Principal");
                            String [] usuarito = new String[5];//Vector de Longitud 5 para ingresar los usuarios
                            Scanner a = new Scanner(System.in);
                                  opc=entr.nextInt();
                                switch(opc){
                                     case 1: //Ingresar usuarios
                                      for (int i=0; i<usuarito.length; i++){//.lenght es la longitud del vector
                                        System.out.println("Ingresar usuario "+(i+1)+":");
                                        usuarito[i]=a.next();
                                        for(int j=0; j<i; j++){//Leer usuario
                                            if(usuarito[j].equals(usuarito[i])){//Verifica si hay 2 usuarios iguales
                                                System.out.println("Error");//Si los hay muestra error
                                                usuarito[i]=a.next();
                                            }
                                        }
                                    }
                                    System.out.println("");
                                    break;
                                    
                                     case 2://mostrar los usuarios desde el ultimo que se ingresó hasta el primero
                                         System.out.println("Lstado de Usuarios de forma Ascendentes:");
                                          System.out.println("1.\n"+ usuarito[4]+"2.\n"+usuarito[3]+
                                                             "3.\n"+usuarito[2]+"4.\n"+usuarito[1]+"5.\n"+usuarito[0]);
                                                          System.out.println("");                        
                                         break; 
                                              
                                     case 3://mostrar los usuarios en la forma en que se ingresaron
                                         System.out.println("Listado de Usuarios de forma Descendente");
                                         System.out.println("1.\n"+ usuarito[0]+"2.\n"+usuarito[1]+
                                                             "3.\n"+usuarito[2]+"4.\n"+usuarito[3]+"5.\n"+usuarito[4]);
                                         System.out.println("");
                                   break;
                                    case 4://Salir del menu de usuarios y regresar al menu principal
                                        System.out.println("Ir al Menu principal\n");
                                    break;
                                }
                            }while(opc!=4);
           break;
                            
            case 2:
                int numero=0;
                do{
                System.out.println("1. Ingrese Numero\n" 
                        + "2. Mostrar Numero de Digitos\n" 
                        + "3. Menu Principal"); 
                opc=entr.nextInt();
                        switch (opc){
                            case 1: //Ingresar numero
                                System.out.println("Ingrese numero:");
                                numero=entr1.nextInt();
                                if(numero>100000){
                                    System.out.println("Error solo puede estar en el rango de 0 a 100000\n");
                                }
                                break;
                                
                            case 2:
                                int digi=0;
                                while(numero !=0){
                                    numero=numero/10; digi=digi+1;
                                }
                                System.out.println("La cantidad de digitos que el numero tiene es: \n"+digi);
                            case 3:
                                 System.out.println("Ir al Menu principal");
                                 break;
                        }
                }while(opc !=3);                
                break;
                
            case 3:
                do{
                System.out.println("1. Ingresar Numero\n" 
                        + "2. Mostrar Ordenados" 
                        + "3. Menu Principal");    
                opc=entr.nextInt();
                switch(opc){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3: 
                         System.out.println("Ir al Menu principal");
                        break;
                }
                }while(opc !=3);
                break;
                
            case 4:
                System.out.println("No se que hacer aquiii:(");
                break;
                
            case 5:
                System.out.println("Ejecucion Finalizada");
                break;
            default:
                System.out.println("Seleccione un numero del menu");
        }
    
    }while(opc !=5);
  }
}


