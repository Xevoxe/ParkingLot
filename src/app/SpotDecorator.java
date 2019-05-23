package app;
public abstract class SpotDecorator implements IParkingSpot{

    private IParkingSpot spot;

    SpotDecorator(IParkingSpot spot){
        this.spot = spot;
    }
    
    public Size GetSize(){
        return this.spot.GetSize();
    }

    //Remove a Specific decoration from the object
    public IParkingSpot Remove(String decoration){
        if(decoration == this.getClass().getName()){
            return this.spot;
        }else {
            if(this.spot instanceof SpotDecorator){
                this.spot = ((SpotDecorator)this.spot).Remove(decoration);
            }else
                 return this.spot;
            
            return this;
        }
    }
    //Remove all decoration from the object
    public IParkingSpot RemoveAll(){
        while(this.spot instanceof SpotDecorator){
            this.spot = ((SpotDecorator)this.spot).Remove(this.getClass().getName());
        }
        return this.spot;
    }


}