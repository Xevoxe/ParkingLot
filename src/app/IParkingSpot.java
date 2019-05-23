package app;

public interface IParkingSpot{
   
    public Size GetSize();

    public enum Size {
        SMALL,
        LARGE,
        XLARGE
    }
}