import java.util.*;
public class Main{
    public static int isLowerCount(String[] s){
        int count=0;
        for(int i=0;i<s.length;i++){
            int flag = 0;
            for(int j=0;j<s[i].length();j++){
                if(!Character.isLowerCase(s[i].charAt(j))){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        System.out.println(isLowerCount(s));
    }
}

// To print the count of lower case words in a given sentence.
// input: Learning is a good method according to studies
// output: 7
