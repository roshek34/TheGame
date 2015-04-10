package main;

/** Created by Roshek on 10.04.2015.
 */
public class Main {

    public static void l(double d){
        System.out.println(d);
    }

    public static void l(Object o){
        if(o instanceof Throwable){
            ((Throwable) o).printStackTrace();
        }else{
            System.out.println(o.toString());
        }
    }

    public static void main(String[] args){
        l("TheGame");
        l(1);
    }

}
