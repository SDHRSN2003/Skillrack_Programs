public class practice{
    static boolean PrimeNumber(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2;
        while(a<n) {
            if (PrimeNumber(a) && PrimeNumber(n - a)) {
                System.out.print(a + " " + (n - a));
                System.exit(0);
            }
            a++;
        }
        System.out.print("-1");
    }
}

//To find the sum of a number using which is sum of two prime numbers...(using java)
