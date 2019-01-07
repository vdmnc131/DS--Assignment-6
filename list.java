import java.io.*;
import java.lang.Integer;
import java.util.*;

class list {

	int[] row;
	int[] column;
	int[][] A;
	int size;
	heap sort;
	public list(int n) {
		column = new int[n];
		row = new int[n];
		A= new int[n][n];
		size=n;
		sort= new heap();

	} 
	public void Add(int i , int j)  {
		row[i]=j;
	}
	public void Add_2(int i , int j) {
		column[i]=j;
		sort.insert(j,i);
	}
	
	public void Make_A() {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				A[i][j]=0;
			}
		}
	}
	public void check() {
		int sum1=0;
		int sum2=0;
		int temp_key=0;
		int temp_value=-1;
		Vector <Integer> purana;
		Vector <Integer> old;
		int s=1;
		for(int i=0;i<size;i++) {
			sum1+=row[i];
			sum2+=column[i];
			if(row[i]>size || column[i]>size) {
					s=0;
					break;
			}
		}
		if(sum1==sum2 && s==1) {
			for(int i=0;i<size;i++) {   
				purana= new Vector<Integer>();
				old= new Vector<Integer>();
				
				// int counter;

				while(row[i]>0) {

					
					 // System.out.println(i);
					
					temp_value= sort.maxValue(); 
				
					temp_key=sort.maxKey();// please change it
					sort.removeMax();
					purana.add(temp_key-1);
					old.add(temp_value);
					 if(temp_key==0) {
						System.out.println("0");
						return;
					 }
					A[i][temp_value]=1;
					row[i]--;
					// counter++;
				}

					for(int j=0;j<old.size();j++) {
						sort.insert(purana.get(j),old.get(j));
					}
				
			}
		}
		else {
			System.out.println("0");
			return;
		}
		// System.out.println("1");
		// for(int i=0;i<size;i++) {
		// 	for(int j=0;j<size;j++) {
		// 		System.out.print(A[i][j]);
		// 		if(j<size-1)
		// 		System.out.print(",");
		// 	}
		// 	System.out.println("");
		// }
	return;
	}
	

}
