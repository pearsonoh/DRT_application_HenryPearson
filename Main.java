public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal(5, "red");
    Cat cat = new Cat(4, "orange");
    Bug bug = new Bug(8, "green");
    Bird bird = new Bird(2, "purple", true);
    Bird penguin = new Bird(2, "black and white", false);
    System.out.println("I am " + cat.color + " and " + cat.move());
    System.out.println("I am " + bird.color + " and " + bird.move());
    System.out.println("I am " + penguin.color + " and " + penguin.move());
    penguin.can_fly = true;
    System.out.println("I am " + penguin.color + " and " + penguin.move());
  }
}