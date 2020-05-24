#include<iostream>
int main()
{
  // Type your code here
	int num, i, fact=1;
	//cout<<"Enter a number : ";
	std::cin>>num;
	for(i=num; i>0; i--)
	{
		fact=fact*i;
	}
	std::cout<<fact;
}