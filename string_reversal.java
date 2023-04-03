import java.util.*;

public class Main{
    public static void MyChallenge(int n , String[] s){
        for(int i=n-1;i>=0;i--){
            System.out.print(s[i]+" ");
        }
        for(int i=n;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().trim().split(" ");
        MyChallenge(n,s);
    }
}

// TO REVERSE THE STRING FROM THE GIVEN INDEX AS INPUT
// input: 3
//        the pen is a best weapon than the sword

// output: best a is pen the weapon than the sword
