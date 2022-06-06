public class Bird extends Animal{
    public Boolean can_fly;

    public String move(){
        return new String (can_fly==false ? ("I'm moving with " + String.valueOf(leg_number) + " legs!") : ("I'm flying!"));
    }
        
    public Bird(int leg_number, String color, Boolean flies) {
        super (leg_number, color);
        can_fly=flies;

    } 
} 
