import java.util.Scanner;
import java.util.Vector;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		String[][] map = new String[100][100];
		Integer[][] count = new Integer[100][100];
		
		Vector<String> input = new Vector<>();
		String temp = "";
		Integer a,b;
		
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				map[i][j] = ".";
			}
		}
		
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				count[i][j] = 0;
			}
		}
		
		n = scan.nextInt(); 
		//scan.nextLine();
		
		for(int i=0; i<n; i++){
			
			input.add(scan.nextLine());
			temp = "";
			temp = input.get(i);
			a = Integer.parseInt(temp.substring(0,1));
			b = Integer.parseInt(temp.substring(2));
			
			
			map[a-1][b-1] = "X";
			
			if(a==1 && b==1){

				
				// kiri kanan
			
				if(!map[a-1][b-1-1].equals("X"))
					count[a-1][b-1+1] += 1;
		
				// paling bawah
	
				if(!map[a-1+1][b-1].equals("X"))
					count[a-1+1][b-1] += 1;
	
				
				
			
			}
			
			else if(a==10 && b==1){
				
				// paling atas
		
				
				if(!map[a-1-1][b-1].equals("X"))
					count[a-1-1][b-1] += 1;
				
		
				
				// kiri kanan
			
				if(!map[a-1][b-1-1].equals("X"))
					count[a-1][b-1+1] += 1;
		

				
				
		
			}
			
			else if(a==1 && b==10){
				
				
				// kiri kanan
				if(!map[a-1][b-1-1].equals("X"))
					count[a-1][b-1-1] += 1;
			
				// paling bawah
		
				if(!map[a-1+1][b-1].equals("X"))
					count[a-1+1][b-1] += 1;
			
				
	
			}

			else if(a==10 && b==10){
				// paling atas

				
				if(!map[a-1-1][b-1].equals("X"))
					count[a-1-1][b-1] += 1;
				

				
				// kiri kanan
				if(!map[a-1][b-1-1].equals("X"))
					count[a-1][b-1-1] += 1;
		

			
			
			}
			
			else if(b == 1 && a != 1 && a !=10){ // paling kiri
				
				// paling atas
			
				
				if(!map[a-1-1][b-1].equals("X"))
					count[a-1-1][b-1] += 1;
				
		
				
				// kiri kanan
			
				if(!map[a-1][b-1-1].equals("X"))
					count[a-1][b-1+1] += 1;
		
				// paling bawah
				
				if(!map[a-1+1][b-1].equals("X"))
					count[a-1+1][b-1] += 1;
			
			}
			
			else if(b == 10 && a != 1 && a !=10){ // paling kanan
				// paling atas
			
				
				if(!map[a-1-1][b-1].equals("X"))
					count[a-1-1][b-1] += 1;
			
				
				// kiri kanan
				if(!map[a-1][b-1-1].equals("X"))
					count[a-1][b-1-1] += 1;
			
		
				// paling bawah
		
				if(!map[a-1+1][b-1].equals("X"))
					count[a-1+1][b-1] += 1;
				
			
			}
			 
			else if(a == 1 && b != 1 && b !=10){ // paling atas.
				
				// kiri kanan
				if(!map[a-1][b-1-1].equals("X"))
					count[a-1][b-1-1] += 1;
				if(!map[a-1][b-1-1].equals("X"))
					count[a-1][b-1+1] += 1;
		
				// paling bawah
				if(!map[a-1+1][b-1].equals("X"))
					count[a-1+1][b-1-1] += 1;
				if(!map[a-1+1][b-1].equals("X"))
					count[a-1+1][b-1] += 1;
				if(!map[a-1+1][b-1+1].equals("X"))
					count[a-1+1][b-1+1] += 1;
						
			}
			
			else if(a == 10 && b != 1 && b !=10){ //paling bawah
				// paling atas
				if(!map[a-1-1][b-1-1].equals("X"))
					count[a-1-1][b-1-1] += 1;
				
				if(!map[a-1-1][b-1].equals("X"))
					count[a-1-1][b-1] += 1;
				
				if(!map[a-1-1][b-1+1].equals("X"))
					count[a-1-1][b-1+1] += 1;
				
				
				// kiri kanan
				if(!map[a-1][b-1-1].equals("X"))
					count[a-1][b-1-1] += 1;
				if(!map[a-1][b-1-1].equals("X"))
					count[a-1][b-1+1] += 1;
			}
			
			else{
				// paling atas
				if(!map[a-1-1][b-1-1].equals("X"))
					count[a-1-1][b-1-1] += 1;
				
				if(!map[a-1-1][b-1].equals("X"))
					count[a-1-1][b-1] += 1;
				
				if(!map[a-1-1][b-1+1].equals("X"))
					count[a-1-1][b-1+1] += 1;
				
				// kiri kanan
				if(!map[a-1][b-1-1].equals("X"))
					count[a-1][b-1-1] += 1;
				if(!map[a-1][b-1-1].equals("X"))
					count[a-1][b-1+1] += 1;
		
				// paling bawah
				if(!map[a-1+1][b-1].equals("X"))
					count[a-1+1][b-1-1] += 1;
				if(!map[a-1+1][b-1].equals("X"))
					count[a-1+1][b-1] += 1;
				if(!map[a-1+1][b-1+1].equals("X"))
					count[a-1+1][b-1+1] += 1;
						
			}
			
		}
			
		
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(map[i][j].equals("X"))
					System.out.print("X");
				else if(count[i][j] == 0)
					System.out.print(".");
				else
					System.out.print(count[i][j]);
				
			}
			System.out.println();
		}

	}

}
