public class inheritance{
    class animal {
    public void sound(){
        System.out.println("The animal makes sound");
    }
    
}

class Dog extends animal {
    public void sound(){
        super.sound();
        System.out.println("The dog barks woof woof!");
    }
   
}
class cat extends animal {
    public void sound(){
        super.sound();
        System.out.println("The cat meows!");
    }
}

public static void main(String[] args){
    inheritance inheritance = new inheritance();

    animal myDog =inheritance.new Dog();
    myDog.sound();

    animal myCat= inheritance.new cat();
    myCat.sound();
}
}