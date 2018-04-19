public class Word {
    public static void main(String[] args) {
        System.out.println("==Eden==");
        System.out.println("Adam was born");
        Human adam = new Human();
        System.out.println("Eva was born");
        Human eva = new Human();

        God.say("You can not eat Apple, you will die if you eat apple");

        Snake snake = new Snake();
        snake.say("Eat Apple, it delicious, you will not die");

        Apple apple = new Apple(5);
        while (!apple.isEmpty()){
            System.out.print("Adam eat Apple,");
            adam.eat(apple);
            System.out.print(" Eva eat Apple, ");
            eva.eat(apple);
        }
        System.out.print("Until the Apple is gone");
        System.out.println("\nAdam and Eve sleep");
        adam.sleep();
        eva.sleep();
        God.say("Eva! You will have to obey your husband and have pain when giving birth");
        God.say("You will have to plant a tree to eat");
        System.out.println("The End");
    }
}
