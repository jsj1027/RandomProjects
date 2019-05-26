#include <stdio.h>

int main(){
    int num;
    int *pnum;

    pnum = &num;
    num = 100;
    printf("Using variable num:\n");
    printf("value of num: %d\naddress of num: %u\n", num, &num);

    printf("Using pointer variable:\n");
    printf("value of num: %d\naddress of num: %u\n",*pnum,pnum);

    return 0;
}