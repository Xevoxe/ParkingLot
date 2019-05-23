
package app;
public class ParkingSpot implements IParkingSpot {
     
    private int id; //ID of the spot
    Size size = Size.LARGE;

    ParkingSpot(int id) {
        this.id = id;
    }

    public int GetId(){
        return this.id;
    }
    
    public void SetId(int id){
        this.id = id;
    }

    public IParkingSpot.Size GetSize(){
        return size;
    }

}