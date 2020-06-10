//package uce;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


public class graphtest1 {
        
	    int vertex;
	    LinkedList<Integer>list[];
	        public graphtest1(int vertex) {
	        	this.vertex=vertex;
	        	list=new LinkedList[vertex];
	        	for(int i=0;i<vertex;i++) {
	        		list[i]=new LinkedList();
	        		
	        	}
	        }
	        public void addegdes(int src,int dest) {
	        	list[src].addLast(dest);
	        }
	        void CheckTopo(int v, boolean visited[], Stack st){ 
 
                          visited[v] = true; 
                            int i; 

                    Iterator<Integer> iter = list[v].iterator(); 
                    while (iter.hasNext()){ 
                          i = iter.next(); 
                        if (!visited[i]) 
                         CheckTopo(i, visited, st); 
                         } 

                  st.push(new Integer(v)); 
} 
	   
	   public void printgraph() {
		     for(int i=0;i<vertex;i++) {
		    	 if(list[i].size()>0) {
		    		 System.out.print("Vertex "+ i+" is connected to    ");
		    		 for(int j=0;j<list[i].size();j++) {
		    			 System.out.print(list[i].get(j)+" ");
		    		 }
		    		 System.out.println();
		    	 }
		     }
	   }
	
	     void tsort() 
	        { 
	            Stack st = new Stack(); 
	      
	            
	            boolean visited[] = new boolean[vertex]; 
	            for (int i = 0; i < vertex; i++) 
	                visited[i] = false; 
	      
	            
	            for (int i = 0; i < vertex; i++) 
	                if (visited[i] == false) 
	                    CheckTopo(i, visited, st); 
	      
	            
	            while (st.empty()==false) 
	                System.out.print(st.pop() + " "); 
	        } 	        
	
	public static void main(String[] args) {
		
		//For graph01.txt
		int n = 6;
		graphtest1 a=new graphtest1(n);

		a.addegdes(5, 2);
		a.addegdes(5, 0);
		a.addegdes(4, 0);
		a.addegdes(4, 1);
		a.addegdes(2, 3);
		a.addegdes(3, 1);
		
		//For biggraph.txt
		// int n = 50;
		// graphtest1 a=new graphtest1(n);
		// a.addegdes(0, 1);
		// a.addegdes(0, 3);
		// a.addegdes(1, 2);
		// a.addegdes(1, 4);
		// a.addegdes(2, 5);
		// a.addegdes(3, 6);
		// a.addegdes(4, 7);
		// a.addegdes(5, 7);
		// a.addegdes(6, 7);
		// a.addegdes(7, 8);
		// a.addegdes(8, 9);
		// a.addegdes(9, 10);
		// a.addegdes(10, 11);
		// a.addegdes(10, 13);
		// a.addegdes(11, 12);
		// a.addegdes(11, 14);
		// a.addegdes(12, 15);
		// a.addegdes(13, 16);
		// a.addegdes(14, 17);
		// a.addegdes(15, 17);
		// a.addegdes(16, 17);
		// a.addegdes(17, 18);
		// a.addegdes(18, 19);
		// a.addegdes(19, 20);
		// a.addegdes(20, 21);
		// a.addegdes(20, 23);
		// a.addegdes(21, 22);
		// a.addegdes(21, 24);
		// a.addegdes(22, 25);
		// a.addegdes(23, 26);
		// a.addegdes(24, 27);
		// a.addegdes(25, 27);
		// a.addegdes(26, 27);
		// a.addegdes(27, 28);
		// a.addegdes(28, 29);
		// a.addegdes(29, 30);
		// a.addegdes(30, 31);
		// a.addegdes(30, 33);
		// a.addegdes(31, 32);
		// a.addegdes(31, 34);
		// a.addegdes(32, 35);
		// a.addegdes(33, 36);
		// a.addegdes(34, 37);
		// a.addegdes(35, 37);
		// a.addegdes(36, 37);
		// a.addegdes(37, 38);
		// a.addegdes(38, 39);
		// a.addegdes(39, 40);
		// a.addegdes(40, 41);
		// a.addegdes(40, 43);
		// a.addegdes(41, 42);
		// a.addegdes(41, 44);
		// a.addegdes(42, 45);
		// a.addegdes(43, 46);
		// a.addegdes(44, 47);
		// a.addegdes(45, 47);
		// a.addegdes(46, 47);
		// a.addegdes(47, 48);
		// a.addegdes(48, 49);

		a.printgraph();
		System.out.println("Topological Sorting");
		a.tsort();
		
	}

}
