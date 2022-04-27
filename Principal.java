import java.util.Scanner;

public class Principal{
    public static void main(String [] args){
        Principal.mostrarMenu();
    }
    public static void mostrarMenu(){
        Scanner scan = new Scanner(System.in);
        int option;
        while(true){
           System.out.println("Hola, seleccione que desea realizar");
           System.out.println("0 // Si desea terminar la ejecución del programa");
           System.out.println("1 // Si desea crear y guardar un nuevo zombie en el programa");
           System.out.println("2 // Si desea ver la información de todos los zombies del programa");
           System.out.println("3 // Si desea saber la cantidad de zombies creados hasta el momento");
           System.out.println("4 // Si desea la información de los zombies con sangre O+ o AB+");
           System.out.println("5 // Si quiere saber la información de los zombies nacidos despues del año 2000");
           System.out.println("6 // Si desea bombardear la ciudad");
           System.out.println("7 // Si desea crear y guardar en el programa la información de una ubicación de la ciudad de Alexandria");
           System.out.println("8 // Si desea visualizar la información de todas las ubicaciones guardadas en el sistema");
           System.out.println("9 // Si quiere saber cual es la ubicación de a ciudad mas segura");
           System.out.println("10 // Si quiere saber el orden de las ubicaciones de la ciudad de la mas a la menos segura");
           System.out.println("11 // Si desea ver un mensaje aleatorio (haga de cuenta que son transmiciones de radio)");
           System.out.println("12 // Si desea bombardear y eliminar definitivamente la ubicacion mas peligrosa de la ciudad");
           option = scan.nextInt(); 
           if(option==0){
               System.out.println("Se ha terminado la ejecucion del programa");
               break;
           }
           switch(option){
               case 1:
                   System.out.println("Ingrese los datos del zombie:");
                   System.out.println("Nombre:");
                   String name = scan.next();
                   System.out.println("Salud:");
                   int health = scan.nextInt();
                   System.out.println("Año de nacimiento:");
                   int year = scan.nextInt();
                   System.out.println("Tipo de sangre:");
                   String blood = scan.next();
                   Zombies.addZombie(name,health,year,blood);
                   System.out.println("Zombie agregado con exito");
                   break;
               case 2:
                   System.out.println("Información de los zombies:");
                   System.out.println(Zombies.printZombies());
                   break;
               case 3:
                   System.out.println("Se han creado: "+Zombies.numberOfZombies()+" zombies");
                   break;
               case 4:
                   System.out.println("Zombies que poseen el tipo de sangre O+ o AB+:");
                   System.out.println(Zombies.lookForBlood());
                   break;
               case 5:
                   System.out.println("Zombies que nacieron despues del año 2000:");
                   System.out.println(Zombies.LookForYear());
                   break;
               case 6:
                   System.out.println("Se ha lanzado una bomba en la ciudad");
                   Zombies.divideLife();
                   System.out.println("Se ha reducido la vida de todos los zombies a la mitad");
                   break;
               case 7:
                   System.out.println("Ingrese los datos de la ubicacion:");
                   System.out.println("Nombre:");
                   String nameLocation = scan.next();
                   System.out.println("Distancia a Alexandria:");
                   float distance = scan.nextFloat();
                   System.out.println("Cantidad de zombies que hay:");
                   int amount = scan.nextInt();
                   Locations.addLocation(nameLocation,distance,amount);
                   System.out.println("Ubicacion agregada con exito");
                   break;
               case 8:
                   System.out.println("Información de las ubicaciónes:");
                   System.out.println(Locations.printLocations());
                   break;
               case 9:
                   System.out.println("La ubicacion mas segura de la ciudad es:");
                   System.out.println(Locations.safestLocation());
                   break;
               case 10:
                   System.out.println("Las ubicaciones organizadas por su cercania a Alexandria:");
                   System.out.println(Locations.sortByDistance());
                   break;
               case 11:
                   System.out.println(Locations.randomMessage());
                   break;
               case 12:
                   System.out.println("Se ha bombardeado la zona mas peligrosa, esta ya no existe");
                   Locations.deleteMostInsecureLocation();
                   break;
           }
        }
    }
}
