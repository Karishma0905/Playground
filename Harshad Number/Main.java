#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,a;                 
  int sum=0;
  cin>>n;                      //enter the numbe
  m=n;                        // storing value of 
  while(n!=0) 
  { 
    a=n%10;         //spliting in digits
    n=n/10;
    sum=sum+a; //getting sum of digit
  }
  if((m%sum)==0) //checking condition
  {
    cout<<"Harshad Number";
  } 
  else
  { 
    cout<<"Not Harshad Number"; 
  } 
}
