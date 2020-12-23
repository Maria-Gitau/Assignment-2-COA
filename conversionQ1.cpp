#include<iostream>
#include<cmath>
#include<bits/stdc++.h>
#include<iomanip>

using namespace std;

string decConBin(int num) {
    string bin = "";
    int Integral = num;

    while (Integral) {
        int rem = Integral %2;
        bin.push_back(rem + '0');
        if (bin.size() == 4)
        {
            bin = bin + " ";
        }else if (bin.size() == 9)
        {
            bin = bin + " ";
        } 
        else {
            bin = bin + "";
        }
        Integral /= 2;
    }
    reverse(bin.begin(), bin.end());
    return bin;
}

string decConHex(int n) {
    int r;
    string hexdec_num = "";
    char hexNum[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    while (n>0) {
        r = n % 16;
        hexdec_num = hexNum[r] + hexdec_num;
        n = n/16;
    }
    return hexdec_num;
}

int main() {
    int dNum;
    cout << "Enter a decimal Number" << endl;
    cin >> dNum;
    
    cout << left 
         << setw(20) << "|Decimal Number" 
         << setw(20) << "|Binary Number" 
         << setw(20) << "|Hexadecimal Number" 
         << endl;

    cout << left << setw(20) <<dNum << setw(20) << decConBin(dNum) << setw(20) << decConHex(dNum) << "\n";
    
    
    return 0; 
}