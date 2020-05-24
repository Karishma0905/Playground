#include<iostream>
using namespace std;
int main()
{
  int n,i,s=5,sum=6;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    cout<<sum<<" ";
    sum=s*i+sum;
    //cout<<sum<<" ";
  }
  return 0;
}