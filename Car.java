
public class Car implements CarInterface
{
    private double TankSize, FuelTankSize, Mileage, FuelEconomy, AverageSpeed, DrivingDistace, TripOdometer;
    private String Make, Model, Color, VIN;
    private int Year;
    public Car()
    {
        VIN = null;
        Mileage = (int)(Math.random()*600) / 100;
        FuelEconomy = (int)(Math.random()*5100 + 1500) / 100;
        FuelTankSize = (int)(Math.random()*275 + 80) / 10;
    }
    public Car(String color, String make, String model, int year)
    {
        Color = color;
        Make = make;
        Model = model;
        Year = year;
        VIN = null;
        Mileage = (int)(Math.random()*600) / 100;
        FuelEconomy = (int)(Math.random()*5100 + 1500) / 100;
        FuelTankSize = (int)(Math.random()*275 + 80) / 10;
    }
    public Car(String make, String model, String color, int year, double tanksize, double fueltanksize )
    {
        TankSize = tanksize;
        FuelTankSize = fueltanksize;
        Make = make;
        Model = model;
        Color = color;
        Year = year;
        VIN = null;
        Mileage = (int)(Math.random()*600) / 100;
        FuelEconomy = (int)(Math.random()*5100 + 1500) / 100;
    }
    public Car(Car car)
    {
        TankSize = car.GetTankSize();
        FuelTankSize = car.GetFuelTankSize();
        Make = car.GetMake();
        Model = car.GetModel();
        Color = car.GetColor();
        Year = car.GetYear();
        Mileage = car.GetMileage();
        FuelEconomy = car.GetFuelEconomy();
        VIN = car.GetVIN();
    }
    public String GetVIN()
    {
        return VIN;
    }
    public double GetTankSize()
    {
        return TankSize;
    }
    public double GetFuelTankSize()
    {
        return FuelTankSize;
    }
    public String GetMake()
    {
        return Make;
    }
    public String GetModel()
    {
        return Model;
    }
    public String GetColor()
    {
        return Color;
    }
    public int GetYear()
    {
        return Year;
    }
    public double GetMileage()
    {
        return Mileage;
    }
    public double GetFuelEconomy()
    {
        return FuelEconomy;
    }
    public double GetAverageSpeed()
    {
        return AverageSpeed;
    }
    public double GetDrivingDistace()
    {
        return DrivingDistace;
    }
    public String toString()
    {
        return (Year + " " + Make + " " + Model + " " + Color + " " + VIN);
    }
    public void paint(String pColor)
    {
        Color = pColor;
    }
    public double fillTank()
    {
        return (TankSize - FuelTankSize);
    }
    public double fillTank(double pfuel)
    {
        return ((FuelTankSize + pfuel) - TankSize);
    }
    public Boolean equals(Car car)
    {
        if (Year == car.GetYear() && Make == car.GetMake() && Model == car.GetModel() && Color == car.Color)
        return true;
        return false;
    }
    public Boolean driveCar()
    {
        double pDistance = getTripOdometer();
        if ( pDistance <= DrivingDistace) 
        {
            return true;
        }
        return false;
    }
    public double getTripOdometer()
    {
        double pFuelEconomy;
        if (AverageSpeed < 40 || (AverageSpeed > 60 && AverageSpeed <=80))
            pFuelEconomy = FuelEconomy * 1.1;
        else if (AverageSpeed > 80 && AverageSpeed <= 100) 
            pFuelEconomy = FuelEconomy * 1.25;
        else if (AverageSpeed > 100)
            pFuelEconomy = FuelEconomy * 1.35;
        else pFuelEconomy = FuelEconomy;
        TripOdometer = Double.valueOf(String.format("%1f", pFuelEconomy * FuelTankSize));
        return TripOdometer;
    }
    public void clearTripOdometer()
    {
        TripOdometer = 0.0;
    }
    public double getOdometer()
    {
        return Double.valueOf(String.format("%1f", FuelEconomy * FuelTankSize));
    }
    public double getFuelLevel()
    {
        return (TankSize - FuelTankSize);
    }
    public void setUpTrip(double pAverageSpees, double pDrivingDistance)
    {
        AverageSpeed = pAverageSpees;
        DrivingDistace = pDrivingDistance;
    }
}