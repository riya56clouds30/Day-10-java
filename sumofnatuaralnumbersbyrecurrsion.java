
class sumofnatuaralnumbersbyrecurrsion{
    int sum(int n)
    {
        if (n==0)return 0;
        return n+sum(n-1);
    }
    public static void main(String args[]){
        sumofnatuaralnumbersbyrecurrsion ob=new sumofnatuaralnumbersbyrecurrsion();
        int res=ob.sum(5);
        System.out.println(res);
    }
}
