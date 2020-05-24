#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int rows,columns,tree;
  cin>>rows>>columns>>tree;
  if((rows+columns==tree)||(rows+columns)*2==tree)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}