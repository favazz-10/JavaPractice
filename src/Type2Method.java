class Type2Method {
    public static void main(String[]args) {
        addition a1 = new addition();
        a1.add(3,6);
    }
}
class addition{
    void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }

}