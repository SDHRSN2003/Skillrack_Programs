/*Distinct Integers*/
/* PROGRAMMING WITH C*/

#include <stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d ",&arr[i]);
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                arr[j]='a';
            }
        }
    }
    for(int i=0;i<n;i++){
        if(arr[i]!='a'){
            printf("%d ",arr[i]);
        }
    }
}
