package tarea3_201700387;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
//import javax.swing.*;
public class Tarea3_201700387 {

    
    public static void main(String[] args) throws IOException {
         int opc=0;
        do{ //Este ciclo es para que el menu se ejecute todo el tiempo y no termine
        Scanner entr =  new Scanner(System.in);//Lee y guarda los datos ingresados por el usuario
        Scanner entr1 = new Scanner(System.in);
        Scanner entr2 = new Scanner(System.in);
        Scanner entr3 = new Scanner(System.in);
        System.out.println("1. Usuarios\n" //Menu principal
        + "2. Contador de Digitos\n" 
        + "3. Tres numeros de mayor a menor\n" 
        + "4. Promedio de Notas\n" 
        + "5. Salir");   
       
        opc=entr.nextInt();
        switch(opc){//Inicio del menu principal
            case 1:
                do{//inicio del ciclo para volver al menu principal
                System.out.println("1. Ingresar Usuarios\n" //menu de usuarios
                        + "2. Mostrar Usuarios Ascendentes\n" 
                        + "3. Mostrar Usuarios Descendentes\n" 
                        + "4. Menu Principal");
                            String [] usuarito = new String[5];//Vector de Longitud 5 para ingresar los usuarios
                            Scanner a = new Scanner(System.in);
                                  opc=entr.nextInt();
                                switch(opc){//Inico de este ciclo para iniciar el menu de usuarios
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
                            }while(opc!=4);//se finaliza la ejecucion y regresa al menu principal
           break;
                            
            case 2:
                int numero=0;
                do{//inicio del ciclo para que pueda regresar al menu principal
                System.out.println("1. Ingrese Numero\n" //menu del contador de numeros
                        + "2. Mostrar Numero de Digitos\n" 
                        + "3. Menu Principal"); 
                opc=entr.nextInt();
                        switch (opc){//Inicio del ciclo para ejecutar este menu
                            case 1: //Ingresar numero
                                System.out.println("Ingrese numero:");
                                numero=entr1.nextInt();//guarda la el numero que ingreso el usuario
                                if(numero>100000){//Rango en el que puede estar el numero
                                    System.out.println("Error solo puede estar en el rango de 0 a 100000\n");
                                }
                                break;
                                
                            case 2://contar cuantos digitos tiene el numero ingresado
                                int digi=0;//contador de digitos
                                while(numero !=0){
                                    numero=numero/10; digi=digi+1;
                                }//Divide el numero ingresado n veces hasta que el resultado sea 0
                                System.out.println("La cantidad de digitos que el numero tiene es: \n"+digi);
                            case 3://Regresar al menu principal
                                 System.out.println("Ir al Menu principal");
                                 break;
                        }
                }while(opc !=3);//finaliza el ciclo, regresa al menu principal         
                break;
                
            case 3:
                int nume1=0;//variables para ingresar los numeros a ordenar
                int nume2=0;
                int nume3=0;
                do{
                System.out.println("1. Ingresar Numero\n" //menu Tres numeros de mayor a menor
                        + "2. Mostrar Ordenados\n" 
                        + "3. Menu Principal");    
                opc=entr.nextInt();
                switch(opc){//Inicio de ciclo para ejecutar menu Tres numeros de mayor a menor
                    case 1://Ingresar los numeros a ordenar
                        System.out.println("Ingrese primer numero:");//Ingresa el primer numero
                        nume1=entr2.nextInt();//Alamacena el primer numero
                        System.out.println("Ingrese segundo numero:");//Ingresa el segundo numero
                        nume2=entr2.nextInt();//Almacena el segundo numero
                        System.out.println("Ingrese tercer numero:");//Ingrese el tercer numero
                        nume3=entr2.nextInt();//Almacena el tercer numero
                        break;
                    case 2://ordenar de mayor a menor
                        if(nume1>nume2 && nume2>nume3){
                            System.out.println("El orden es: \n"+nume1+", "+nume2+", "+nume3);
                        } else if(nume2>nume3 && nume3>nume1){
                            System.out.println("El orden es: \n"+nume2+", "+nume3+", "+nume1);
                        }else{
                            System.out.println("EL orden es: \n"+nume3+", "+nume2+", "+nume1);
                        }
                        break;
                    case 3: //regresar al menu principal
                         System.out.println("Ir al Menu principal");
                        break;
                }
                }while(opc !=3);//condicion que al ser verdadera regresa al menu principal
                break;
                
            case 4://Promedio de notas
                do{
                System.out.println("1.Calcular Promedio\n"+"2.Salir");//Menu 
                opc=entr.nextInt();
                switch(opc){
                    case 1:
                    int matrix[][] = new int[6][6];
                    //Primer alumno
                    System.out.println("Datos del primer alumno: ");
                    System.out.println("Numero de carnet del Alumno 1:");
                    int carnet = entr3.nextInt();
                    System.out.println("Ingrese la primera nota:");
                    int noti = entr3.nextInt();
                    System.out.println("Ingrese la segunda nota:");
                    int noti1 = entr3.nextInt();
                    System.out.println("Ingrese la tercera nota:");
                    int noti2 = entr3.nextInt();
                    System.out.println("Ingrese la cuarta nota:");
                    int noti3 = entr3.nextInt();
                    int prom =((noti+noti1+noti2+noti3)/4);
                    int alum1[]={carnet,noti,noti1,noti2,noti3,prom};
                    
                    //Segundo alumno
                    System.out.println("Datos del segundo alumno");
                    System.out.println("Numero de cartnet Alumno 2");
                    int carnet1 = entr3.nextInt();
                    System.out.println("Ingrese la primera nota");
                    int not =  entr3.nextInt();
                    System.out.println("Ingrese la segunda nota");
                    int not1 = entr3.nextInt();
                    System.out.println("Ingrese la tercera nota");
                    int not2 = entr3.nextInt();
                    System.out.println("Ingrese la cuarta nota");
                    int not3 = entr3.nextInt();
                    int prome = ((not+not1+not2+not3)/4);
                    int alum2[]={carnet1,not,not1,not2,not3,prome};
                    
                    //Tercer alumno
                    System.out.println("Datos del tercer alumno");
                    System.out.println("Numero de cartnet Alumno 3");
                    int carnet2 = entr3.nextInt();
                    System.out.println("Ingrese la primera nota");
                    int note =  entr3.nextInt();
                    System.out.println("Ingrese la segunda nota");
                    int note1 = entr3.nextInt();
                    System.out.println("Ingrese la tercera nota");
                    int note2 = entr3.nextInt();
                    System.out.println("Ingrese la cuarta nota");
                    int note3 = entr3.nextInt();
                    int promedi = ((note+note1+note2+note3)/4);
                    int alum3[]={carnet2,note,note1,note2,note3,promedi};
                    
                    //Cuarto alumno
                    System.out.println("Datos del cuarto alumno");
                    System.out.println("Numero de cartnet Alumno 4");
                    int carnet3 = entr3.nextInt();
                    System.out.println("Ingrese la primera nota");
                    int noto =  entr3.nextInt();
                    System.out.println("Ingrese la segunda nota");
                    int noto1 = entr3.nextInt();
                    System.out.println("Ingrese la tercera nota");
                    int noto2 = entr3.nextInt();
                    System.out.println("Ingrese la cuarta nota");
                    int noto3 = entr3.nextInt();
                    int promedio = ((noto+noto1+noto2+noto3)/4);
                    int alum4[]={carnet3,noto,noto1,noto2,noto3,promedio};
                    
                    //Quinto alumno
                    System.out.println("Datos del quinto alumno");
                    System.out.println("Numero de cartnet Alumno 5");
                    int carnet4 = entr3.nextInt();
                    System.out.println("Ingrese la primera nota");
                    int notu =  entr3.nextInt();
                    System.out.println("Ingrese la segunda nota");
                    int notu1 = entr3.nextInt();
                    System.out.println("Ingrese la tercera nota");
                    int notu2 = entr3.nextInt();
                    System.out.println("Ingrese la cuarta nota");
                    int notu3 = entr3.nextInt();
                    int promed = ((notu+notu1+notu2+notu3)/4);
                    int alum5[]={carnet4,notu,notu1,notu2,notu3,promed};
                    
                    //Sexto alumno
                    System.out.println("Datos del sexto alumno");
                    System.out.println("Numero de cartnet Alumno 6");
                    int carnet5 = entr3.nextInt();
                    System.out.println("Ingrese la primera nota");
                    int nota =  entr3.nextInt();
                    System.out.println("Ingrese la segunda nota");
                    int nota1 = entr3.nextInt();
                    System.out.println("Ingrese la tercera nota");
                    int nota2 = entr3.nextInt();
                    System.out.println("Ingrese la cuarta nota");
                    int nota3 = entr3.nextInt();
                    int promede = ((nota+nota1+nota2+nota3)/4);
                    int alum6[]={carnet5,nota,nota1,nota2,nota3,promede};
                    
                    int filita;//Definiendo fila
                    int columnita;//Definiendo columna
                    for(filita=0; filita<matrix.length; filita++){//Ciclo para las filas de la matriz
                        for(columnita=0; columnita<matrix.length; columnita++){//Ciclo para las columnas de la matriz
                            if(filita==0){
                                matrix[filita][columnita]=alum1[columnita];//Cuando la fila sea 0, la matriz se convertira en alumno 1
                            }else if(filita==1){
                                matrix[filita][columnita]=alum2[columnita];//Cuando la fila sea 1 la matriz [filita][columnita] será alumno2
                            }else if(filita==2){
                                matrix[filita][columnita]=alum3[columnita];//Fila = 2, la matriz sera alumno 3
                            }else if(filita==3){
                                matrix[filita][columnita]=alum4[columnita];//Fila = 3 la matriz [filita][columnita]= alumno4
                            }else if(filita==4){
                                matrix[filita][columnita]=alum5[columnita];//Fila = 4 la matriz [filita][columnita]= alumno 5
                            }else if(filita==5){
                                matrix[filita][columnita]=alum6[columnita];//Fila = 5 la matriz [filita][columnita]= alumno 6
                            }
                        }
                    }
                    for(filita=0; filita<matrix.length; filita++){
                        for(columnita=0; columnita<matrix.length; columnita++){
                            System.out.println("\t |"+matrix[filita][columnita]+"|");
                        }
                    }
                    case 2:
                         System.out.println("Ir al Menu principal");
                         break;
                }
                }while(opc!=2);
                break;
                
            case 5://finaliza la ejecucion
                System.out.println("Ejecucion Finalizada");
                break;
            default://le pide al usuario que seleccione un numero que conforma al menu
                System.out.println("Seleccione un numero del menu");
        }
    
    }while(opc !=5);//termina el ciclo y por tanto se finaliza la ejecucion
  }
}


