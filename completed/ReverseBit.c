#include<stdlib.h>
#include<stdio.h>
uint32_t reverseBits(uint32_t n) {
    uint32_t m = 0;
    for (int i = 0; i < 32; i++, n >>= 1) {
        m <<= 1;
        m |= n & 1;
    }
    return m;
}
int main() {
    uint32_t value;
    reverseBits(25);
    printf("%u",value);
    return 0;
}