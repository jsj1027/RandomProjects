#include <stdio.h>

int main(){

    const int a = 1000;
    int *p;
    p = &a;
    
    printf("Before changing - value of a: %d\n",a);

    *p = 20;


    printf("\nAfter  changing - value of a: %d\n",a);
    return 0;
}