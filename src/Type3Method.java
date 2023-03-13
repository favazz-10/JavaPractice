public class Type3Method {
    public static void main(String[]args){
        Addition x=new Addition();
        int res=x.add();
        System.out.println(res);
    }
}

class Addition{
    int add(){
        int a,b;
        a=10;
        b=20;
        return a+b;
    }
}