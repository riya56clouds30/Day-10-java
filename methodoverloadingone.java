class methodoverloadingone{
    static void a(){
        System.out.println("hello");
    }
    static void a(int b){
        System.out.println("hello"+b);
    }
    static void a(int b,int c,String d){
        System.out.println("hello"+b+" "+c+" "+d);
    }
    public static void main(String args[]){
        a();
        a(6);
        a(4,5,"raju");
    }
}
    
