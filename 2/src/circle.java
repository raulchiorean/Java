/**
 * Created by nesty on 8/22/2017.
 */
public class circle {
    private double radius;
    private String color;

    public circle(){
        radius = 1.0;
        color = "red";
    }
    public circle(Double r){
        radius = r;
        color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
