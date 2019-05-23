package app;

public class ParkingLot
{
    public static void main(String[] args){
        System.out.println("Hello ParkingLot!");
        IParkingSpot nSpot = new ParkingSpot(1);
      // nSpot.Remove("Handicap");
       //nSpot.Remove("Handicap");

       nSpot = new Handicap(nSpot);
       nSpot = new ResidentSpot(nSpot);
        System.out.println(nSpot.getClass().getName());
      // nSpot = ((SpotDecorator) nSpot).Remove("Handicap");
        
        System.out.println(nSpot.GetSize());
        System.out.println(nSpot.getClass().getName());
       
       // nSpot = ((SpotDecorator) nSpot).Remove("ResidentSpot");
       nSpot = ((SpotDecorator) nSpot).RemoveAll();
        System.out.println(nSpot.getClass().getName());

    }
}