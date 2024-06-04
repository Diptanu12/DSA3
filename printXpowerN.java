public class printXpowerN {
    public static void main(String[] args) {
        System.out.println(calPower(2,3));
    }

    //stack height n
    public static int calPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
//        int xPow=calPower(x, n-1);
//        return x*xPow;

        //if n is even
        if(n%2==0){
          return   calPower(x, n/2) * calPower(x, n/2);
        }else{
            return calPower(x, n/2)*calPower(x, n/2)*x;
        }
    }
}
