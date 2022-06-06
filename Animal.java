public class Animal {
    public int leg_number;
    public String color;

    public String move(){
        return new String("I'm moving with " + String.valueOf(leg_number) + " legs!");
    }
        
    public Animal(int number, String string) {
         leg_number = number;
         color = string;
     }

} 
