#include<iostream>
using namespace std;

int date_to_days(int month, int days, int year){
	
	unsigned long int total_days = 0;
	
	if(month <= 12 && month >= 1){
		if(days >= 1 && days <=31){
			if(year >= 1 && year <= 4000000000 && year >= 1 && year <= 4000000000){
				
				if(month == 1 || month == 2){
					month += 12;
					year -= 1;
				}
				
				total_days = 365 * year * ( year / 4 ) - ( year / 100 ) + (year / 400) + days + ( 153 * month + 8) / 5 ;
				
			}
			else{
				cout << year <<" is invalid!";
			}
		}else{
			cout << days <<" is invalid!";
		}
	}else{
		cout << month <<" is invalid!";
	}
	
	return total_days;
}

int main(){
	int day1, month1, day2, month2;
	unsigned long int year1, year2;	
	cout << "You need to provide two dates."<<endl<<"For example dateddifference 1 1 2019 1 1 2020"<<endl;
	cin >> month1 >> day1 >> year1 >> month2 >> day2 >> year2;
	
//	 stoi() function need to be used
	
	int days_1 = date_to_days(month1, day1, year1); 
	int days_2 = date_to_days(month2, day2, year2);
	
	cout << days_1<<endl;
	cout<< days_2;
	
	return 0;
}

