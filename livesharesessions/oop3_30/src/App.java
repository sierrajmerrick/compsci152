
public class App {

    public static void main(String[] args) {
        Klingon BeLanna = new Klingon();
        Martian Marvin = new Martian();

        BeLanna.talk(Marvin);
    }
}

class Alien{
    protected String name;
    public void talk(Alien a){
        System.out.println("Hello " + a.name + " my name is " + this.name + ".");
    }
}

class Klingon extends Alien{
    int mood;
    int fightiness;
}

class ET extends Alien{
    int homesickness;
}

class Martian extends Alien{
    public Martian(){
        this.name = "Marvin";
    }
}
