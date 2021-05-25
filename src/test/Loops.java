package test;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//----------while loop--------
		
		int index =5;
		while(index>0) {
			System.out.println(index);
			index = index-1;
		}
		
		//---------whileloop(with if condtn)----------------------
		
		int index1 = 5;
		while(index1>0) {
			if(index1!=3) {
				System.out.println(index1);
			}
			index1--;
		}
		
		//------break----
		
		int index2 = 5;
		while(index2>0) {
			System.out.println(index2);
			if(index2==3) {
				break;
			}
			index2--;			
		}
		
		//----Do while loop-------------
		
		int index3=1;
		do {
			System.out.println(index3);
			index3++;
		}while(index3<11);
		
		//-----for loop--------
		
		for(int i=0;i<21;i++) {
			System.out.println(i);
		}
		
		//------loop in array---------------
		
		int myarray [] = {2,3,4,5,6,7,8};
		
		for (int x=0;x<myarray.length;x++) {
			System.out.println(myarray[x]);
		}
		
		String array2[] = {"abc","def","pqr","xyz"};
		
		for(int y=0;y<array2.length;y++) {
			System.out.println(array2[y]);
		}
		
		}
}


