public class TransportationImplement implements TransportationInterface{
    public void transport(int budget) {
        if (budget >= 500) {
            System.out.println("Your budget of " + budget + " fits in driving which costs 500 yuan)");
        }
        if (budget >= 300) {
            System.out.println("Your budget of " + budget + " fits in bus which costs 300 yuan)");
        }
        if (budget >= 400) {
            System.out.println("Your budget of " + budget + " fits in train which costs 400 yuan)");
        }
        if (budget >= 1000) {
            System.out.println("Your budget of " + budget + " fits in plane which costs 100 yuan)");
        }
    }
}