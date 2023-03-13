public class Type4Method {
    public static void main(String[]args){
        Add a1=new Add();
        int r=a1.addition(12,13);
        System.out.println(r);

    }
}

class Add{
    int addition(int a,int b){
        return a+b;
    }

}