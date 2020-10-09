public class BuyingPizza {
    public static void main(String[] args) {
        Pizza pizza = new HamPizza(); //get a ham pizza
        System.out.println(pizza.getDescription() + " " + pizza.pizzaCost());

        Pizza hamPizza = new HamPizza(); //get a ham pizza
        hamPizza = new CheeseDecorator(hamPizza); //decorate ham pizza with cheese
        System.out.println(hamPizza.getDescription() + " " + hamPizza.pizzaCost());

        Pizza baconPizza = new BaconPizza(); //get a bacon pizza
        baconPizza = new Pineapple(baconPizza); //decorate bacon pizza with pineapple
        baconPizza = new CheeseDecorator(baconPizza); //decorate bacon pizza with cheese
        System.out.println(baconPizza.getDescription() + " " + baconPizza.pizzaCost());
    }

    
}
