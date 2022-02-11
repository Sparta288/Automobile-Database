
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class automobile {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
    private ArrayList<automobile> vehicleList;

    public automobile() {
        vehicleList = new ArrayList<automobile>();
    }

    public automobile(String make, String model, String color, int year,int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }


    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }

    public int getMileage(){
        return mileage;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public void addVehicle(automobile vehicle){
        vehicleList.add(vehicle);
    }

    public void removeVehicle(String makeOld, String modelOld, String colorOld, int yearOld, int mileageOld){
        for (int i = 0; i < vehicleList.size(); i++){
            automobile vehicle = vehicleList.get(i);

            if (vehicle.getMake().equalsIgnoreCase(makeOld) && (vehicle.getModel().equalsIgnoreCase(modelOld) &&
                    (vehicle.getColor().equalsIgnoreCase(colorOld) && (vehicle.getYear()==yearOld) && (vehicle.getMileage()==mileageOld)))){
                vehicleList.remove(vehicle);
            }
        }
    }

    public void updateVehicle(String makeOld, String modelOld, String colorOld, int yearOld, int mileageOld,
                              String makeNew, String modelNew, String colorNew, int yearNew, int mileageNew) {
        for (int i=0;i < vehicleList.size();i++) {
            automobile vehicle = vehicleList.get(i);
            if (vehicle.getMake().equalsIgnoreCase(makeOld) && vehicle.getModel().equalsIgnoreCase(modelOld)
                    && vehicle.getColor().equalsIgnoreCase(colorOld) && vehicle.getYear()==yearOld
                    && vehicle.getMileage()==mileageOld) {
                vehicle.setMake(makeNew);
                vehicle.setModel(modelNew);
                vehicle.setColor(colorNew);
                vehicle.setYear(yearNew);
                vehicle.setMileage(mileageNew);
            }
        }
    }


    public void Display() {

        BufferedWriter bw = null;
        try {
// creating File Writer to write text file
            FileWriter fw = new FileWriter("automobile_output.txt");
// creating Buffered Writer to write text file
            bw = new BufferedWriter(fw);
            System.out.println("\nVehicles Information:\n");


            for (int i = 0; i < vehicleList.size(); i++) {
                automobile vehicle = vehicleList.get(i);
                System.out.println("Vehicle "+(i+1)+":");
                bw.write("Vehicle "+(i+1)+":");
                bw.newLine();
                System.out.println("Make: " + vehicle.getMake());
                bw.write("Make: " + vehicle.getMake());
                bw.newLine();
                System.out.println("Model: " + vehicle.getModel());
                bw.write("Model: " + vehicle.getModel());
                bw.newLine();
                System.out.println("Color: " + vehicle.getColor());
                bw.write("Color: " + vehicle.getColor());
                bw.newLine();
                System.out.println("Year: " + vehicle.getYear());
                bw.write("Year: " + vehicle.getYear());
                bw.newLine();
                System.out.println("Mileage: " + vehicle.getMileage());
                bw.write("Mileage: " + vehicle.getMileage());
                bw.newLine();
                bw.newLine();
                System.out.println("");
            }
            bw.flush();// Flushing File Writer
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    }
