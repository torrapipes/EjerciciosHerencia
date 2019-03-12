package ejercicios;

public class EarlyBindingSub extends EarlyBindingSuper {


    public String str = "EarlyBindingSub";


    public int count = 200;


    public EarlyBindingSub(){}


    public void print(){

        System.out.println("Inside EarlyBindingSub.print()");

    }


}
