#include <iostream>

using namespace std;

int main() {
	for(int i=0; i<3; i++) {
		for(int j=0; j<2; j++) {
			if(j==1)
				break;
			cout << j << endl;
		}
	}
}
