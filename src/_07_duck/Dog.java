package _07_duck;
public class Dog {
    int numberOfFriends;
    String favoriteFood;
    void woof(){
    System.out.println("woof");
    }
    void bark(){
    System.out.println("bark");
    }
    Dog(String favoriteFood, int numberOfFriends) {
        this.favoriteFood = favoriteFood;
        this.numberOfFriends = numberOfFriends;
    }
}
