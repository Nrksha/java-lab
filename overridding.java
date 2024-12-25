class base{
    public void display(){
        System.out.println("we are in java lab");
        System.out.println("this statement is in superclass");
    }
}
class subclass extends base{
    @Override
    public void display() {
        super.display();
        System.out.println("this example is for java exam");
        System.out.println("this statement is in child class");
    }
}
public class overridding{
    public static void main(String[] args){
        subclass sb=new subclass();
        sb.display();
    }
}
