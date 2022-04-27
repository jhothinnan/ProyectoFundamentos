import java.util.ArrayList;

public class Locations{
    private String name;
    private float distance;
    private int amount;
    static int i = 0;
    static ArrayList<Locations> arrayLocations = new ArrayList<Locations>();
    static String [] messages = {"El gobierno esta haciendo todo lo posible, mantenga la calma","Busque refugio en un lugar seguro","Mantengase alejado de lugares con muchos zombies","Haz lo que haga falta para sobrevivir","Que la suerte este de tu lado"};
    public Locations(){
        
    }
    public Locations(String n,float d,int c){
        this.name = n;
        this.distance = d;
        this.amount = c;
        i++;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setDistance(float n){
        this.distance = n;
    }
    public void setAmount(int n){
        this.amount = n;
    }
    public String getName(){
        return this.name;
    }
    public float getDistance(){
        return this.distance;
    }
    public int getAmount(){
        return this.amount;
    }
    public String toString(){
        String infoLocation= "Nombre: "+this.getName()+", Distancia a Alexandria: "+this.getDistance()+" y cantidad de zombies: "+this.getAmount()+"\n";
        return infoLocation;
    }
    public static void addLocation(String n, float d, int a){
        Locations l = new Locations(n,d,a);
        Locations.arrayLocations.add(l);
    }
    public static String printLocations(){
        String info = "";
        for(int i = 0;i<arrayLocations.size();i++){
            info = arrayLocations.get(i).toString()+info;
        }
        return info;
    }
    public static String safestLocation(){
        String info = "";
        int accumulator = arrayLocations.get(0).getAmount();
        for(int i = 0; i < arrayLocations.size();i++){
            if(accumulator > arrayLocations.get(i).getAmount()){
                accumulator = arrayLocations.get(i).getAmount();
            }
        }
        for(int i = 0; i < arrayLocations.size();i++){
            if(accumulator == arrayLocations.get(i).getAmount()){
                info = info + arrayLocations.get(i).toString();
            }
        }
        return info;
    }
    public static String sortByDistance(){
        int position = arrayLocations.size();
        String locationsOrganized = "" ;
        for(int i = 1; i < position; i++){
            for(int j = 0; j < position - i; j++){
                if(arrayLocations.get(j).getDistance()> arrayLocations.get(j+1).getDistance()){
                    Locations temp = new Locations(arrayLocations.get(j).getName(), arrayLocations.get(j).getDistance(),arrayLocations.get(j).getAmount());
                    arrayLocations.set(j, arrayLocations.get(j+1));
                    arrayLocations.set(j+1, temp);
                }
            }
        }
        for(int k = 0; k < position; k++){
            locationsOrganized = locationsOrganized + "\n" + arrayLocations.get(k).toString();
        }
        return locationsOrganized;
    }
    public static void deleteMostInsecureLocation(){
        int accumulator = arrayLocations.get(0).getAmount();
        for(int i = 0; i < arrayLocations.size();i++){
            if(accumulator < arrayLocations.get(i).getAmount()){
                accumulator = arrayLocations.get(i).getAmount();
            }
        }
        for(int i = 0; i < arrayLocations.size();i++){
            if(accumulator == arrayLocations.get(i).getAmount()){
                arrayLocations.remove(i);
            }
        }
    }
    public static String randomMessage(){
        int menssage;
        int aleatoryPhrase = (int)(Math.random()*(4-0));;
        return messages[aleatoryPhrase];
    }
}
