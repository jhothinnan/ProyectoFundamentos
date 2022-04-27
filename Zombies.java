import java.util.ArrayList;
public class Zombies{
    private String name;
    private int health;
    private int birth;
    private String rh;
    static int i = 0;
    static ArrayList<Zombies> arrayZombies = new ArrayList<Zombies>();
    public Zombies(){    
    }
    public Zombies(String name, int health, int birth, String rh){
        this.name = name;
        this.health = health;
        this.birth = birth;
        this.rh = rh;
        i++;
    }
    public String getName(){
        return this.name;
    }
    public int getHealth(){
        return this.health;
    }
    public int getBirth(){
        return this.birth;
    }
    public String getRh(){
        return this.rh;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setHealth(int n){
        this.health = n;
    }
    public void setBirth(int n){
        this.birth = n;
    }
    public void setRh(String n){
        this.rh = n;
    }
    public String toString(){
        String infoZombie= "Nombre: "+this.getName()+", Salud: "+this.getHealth()+",Rh: "+this.getRh()+" y año de nacimiento: "+this.getBirth()+"\n";
        return infoZombie;
    }
    public static void addZombie(String n, int h, int b, String r){
        Zombies z = new Zombies(n,h,b,r);
        Zombies.arrayZombies.add(z);
    }
    public static String printZombies(){
        String info = "";
        for(int i = 0;i<arrayZombies.size();i++){
            info = arrayZombies.get(i).toString()+info;
        }
        return info;
    }
    public static int numberOfZombies(){
        return i;
    }
    public static String lookForBlood(){
        String info = "";
        for(int i = 0;i<arrayZombies.size();i++){
            if(arrayZombies.get(i).getRh().equals("O+")||(arrayZombies.get(i).getRh().equals("AB+"))){
                info = arrayZombies.get(i).toString()+info;
            }
        }
        return info;
    }
    public static String LookForYear(){
        String info = "";
        for(int i = 0; i<arrayZombies.size();i++){
            if(arrayZombies.get(i).getBirth()>2000){
                info = arrayZombies.get(i).toString()+info;
            }
        }
        return info;
    }
    public static void divideLife(){
        for(int i = 0; i<arrayZombies.size();i++){
            arrayZombies.get(i).setHealth(arrayZombies.get(i).getHealth()/2);
        }
    }
    
}
