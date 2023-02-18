package _07_duck;

public class Duck {
    int numberOfFriends;
    String favoriteFood;

    void quack() {
    	System.out.println("quack");
    }

    void waddle() {
    	System.out.println("I have 4 people in my basement :)");
    }

    Duck(String favoriteFood, int numberOfFriends) {
        this.favoriteFood = favoriteFood;
        this.numberOfFriends = numberOfFriends;
    }
}
