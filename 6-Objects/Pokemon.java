//imports for librarires and module
public class Pokemon {
    //global varibles for the class
    private String name,ht,wt,attack1Name,attack2Name,id,type,picture;
    private int hp, attack1Damage, attack2Damage;


    //GETTERS and SETTERS aka ACCESSORS and MUTATORS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHt() {
        return ht;
    }
    public void setHt(String ht) {
        this.ht = ht;
    }
    public String getWt() {
        return wt;
    }
    public void setWt(String wt) {
        this.wt = wt;
    }
    public String getAttack1Name() {
        return attack1Name;
    }
    public void setAttack1Name(String attack1Name) {
        this.attack1Name = attack1Name;
    }
    public String getAttack2Name() {
        return attack2Name;
    }
    public void setAttack2Name(String attack2Name) {
        this.attack2Name = attack2Name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getAttack1Damage() {
        return attack1Damage;
    }
    public void setAttack1Damage(int attack1Damage) {
        this.attack1Damage = attack1Damage;
    }
    public int getAttack2Damage() {
        return attack2Damage;
    }
    public void setAttack2Damage(int attack2Damage) {
        this.attack2Damage = attack2Damage;
    }
    
    //Constructers - what is needed to have an oject of this
    // no-arg Constructor
    public Pokemon(){
        this.id="";
        this.type="";
        this.hp=0;
        this.name="";
        this.ht="";
        this.wt="";
        this.attack1Name="";
        this.attack1Damage=0;
        this.attack2Name="";
        this.attack2Damage=0;
        this.picture="";
    }
    public Pokemon(String id, String type, int hp, String name, String ht, String wt, String a1n, int a1d, String a2n, int a2d, String pic ){
        //this.fieldVaribleName = localVaribleNameFromConstructor;
        this.id=id;
        this.type=type;
        this.hp=hp;
        this.name=name;
        this.ht=ht;
        this.wt=wt;
        this.attack1Name=a1n;
        this.attack1Damage=a1d;
        this.attack2Name=a2n; 
        this.attack2Damage=a2d;
        this.picture=pic;
    }

    //methods for the object

    //toString method - anytime you print the object, this is what will render
    
    @Override //decortor - over writing the toString f(x) from the super class
    public String toString(){
        return  "\nIndex: " + id +
        "\nName: " + name +
        "\nType: " + type +
        "\nHP: " + hp +
        "\nHeight: " + ht + " m" +
        "\nWeight: " + wt + " kg" +
        "\nAttack 1: " + attack1Name + " (Power: " + attack1Damage + ")" +
        "\nAttack 2: " + attack2Name + " (Power: " + attack2Damage+ ")";
    }
   
}