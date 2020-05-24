#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int petrol,dist,possibleDist;
  float milage;
  cin>>milage>>petrol>>dist;
  possibleDist=milage*petrol;
  if(possibleDist >= dist)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}

