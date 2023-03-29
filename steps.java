public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='+'){
                count+=1;
            }
            else{
                count-=1;
            }
        }
        System.out.print(Math.abs(count));

    }
}

//To check the count of steps moved by a person
// input : a string of '+' and '-'. If input == '+' then increment by 1. If input=='-' then decrement by 1.
// output : the number of steps moved.

// INPUT : -+++-
// OUTPUT : 1
