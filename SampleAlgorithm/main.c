#include <stdio.h>
#include <math.h>
#include <time.h>
#include <stdlib.h>

int randRange(int limit){
    int divisor = RAND_MAX/(limit+1);
    int retval;
    do{
        retval = rand()/divisor;
    }while (retval > limit);

    return retval;
}


int main(){
    srand(time(0));
    int a = randRange(20);
    int b = randRange(20);
    int c = randRange(20);
    int d = randRange(20);
    int sum;
    int sum2;
    printf("This is a: %d\n This is b: %d\n This is c: %d\n This is d: %d\n", a,b,c,d);
    a = pow(a,4);
    d = pow(d,4);
    b = 25 * pow(b,2);
    c = 2 * c;
    sum = (a+b+c) - 13;
    sum2 = (d+b+c) - 13;
    printf("This is a: %d\n This is b: %d\n This is c: %d\n This is d: %d\n This is the sum: %d\n This is the sum2: %d\n", a,b,c,d,sum, sum2);
    return 0;
}