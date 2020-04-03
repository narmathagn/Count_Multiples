#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,a[100],b[100],c=0;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++)
    {
        scanf("%d",&b[i]);
    }
    for(int i=0;i<n;i++)
    {
        if(a[i]==b[n-i-1])
        {
            c++;
        }
    }
    if(c==n)printf("1");
    else printf("0");
}