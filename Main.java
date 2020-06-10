import java.util.ArrayList; 

class LongestPath 
{ 

	int vertices; 
	ArrayList<Integer> edge[]; 

	LongestPath(int vertices) 
	{ 
		this.vertices = vertices; 
		edge = new ArrayList[vertices+1]; 
		for (int i = 0; i <= vertices; i++) 
		{ 
			edge[i] = new ArrayList<>(); 
		} 
	} 
	void addEdge(int a,int b) 
	{ 
		edge[a].add(b); 
	} 

	void dfs(int node, ArrayList<Integer> adj[], int dp[], 
									boolean visited[]) 
	{ 
		visited[node] = true; 

		for (int i = 0; i < adj[node].size(); i++) 
		{ 

			if (!visited[adj[node].get(i)]) 
				dfs(adj[node].get(i), adj, dp, visited); 

			dp[node] = Math.max(dp[node], 1 + dp[adj[node].get(i)]); 
		} 
	} 
	
	int findLongestPath( int n) 
	{ 
		ArrayList<Integer> adj[] = edge; 

		int[] dp = new int[n+1]; 

		boolean[] visited = new boolean[n + 1]; 

		for (int i = 1; i <= n; i++) 
		{ 
			if (!visited[i]) 
				dfs(i, adj, dp, visited); 
		} 

		int ans = 0; 

		for (int i = 1; i <= n; i++) 
		{ 
			ans = Math.max(ans, dp[i]);
		} 
		return ans; 
	} 
} 

public class Main 
{ 
	// Driver code 
	public static void main(String[] args) 
	{ 
		int n = 6; 
		LongestPath lp = new LongestPath(n); 
		lp.addEdge(1, 2); 
		lp.addEdge( 2, 3); 
		lp.addEdge( 2, 4); 
		lp.addEdge( 4, 5); 
		lp.addEdge( 5, 6); 

		//For biggraph.txt
		// int n = 50;
		// LongestPath lp = new LongestPath(n);
		// lp.addEdge(0, 1);
		// lp.addEdge(0, 3);
		// lp.addEdge(1, 2);
		// lp.addEdge(1, 4);
		// lp.addEdge(2, 5);
		// lp.addEdge(3, 6);
		// lp.addEdge(4, 7);
		// lp.addEdge(5, 7);
		// lp.addEdge(6, 7);
		// lp.addEdge(7, 8);
		// lp.addEdge(8, 9);
		// lp.addEdge(9, 10);
		// lp.addEdge(10, 11);
		// lp.addEdge(10, 13);
		// lp.addEdge(11, 12);
		// lp.addEdge(11, 14);
		// lp.addEdge(12, 15);
		// lp.addEdge(13, 16);
		// lp.addEdge(14, 17);
		// lp.addEdge(15, 17);
		// lp.addEdge(16, 17);
		// lp.addEdge(17, 18);
		// lp.addEdge(18, 19);
		// lp.addEdge(19, 20);
		// lp.addEdge(20, 21);
		// lp.addEdge(20, 23);
		// lp.addEdge(21, 22);
		// lp.addEdge(21, 24);
		// lp.addEdge(22, 25);
		// lp.addEdge(23, 26);
		// lp.addEdge(24, 27);
		// lp.addEdge(25, 27);
		// lp.addEdge(26, 27);
		// lp.addEdge(27, 28);
		// lp.addEdge(28, 29);
		// lp.addEdge(29, 30);
		// lp.addEdge(30, 31);
		// lp.addEdge(30, 33);
		// lp.addEdge(31, 32);
		// lp.addEdge(31, 34);
		// lp.addEdge(32, 35);
		// lp.addEdge(33, 36);
		// lp.addEdge(34, 37);
		// lp.addEdge(35, 37);
		// lp.addEdge(36, 37);
		// lp.addEdge(37, 38);
		// lp.addEdge(38, 39);
		// lp.addEdge(39, 40);
		// lp.addEdge(40, 41);
		// lp.addEdge(40, 43);
		// lp.addEdge(41, 42);
		// lp.addEdge(41, 44);
		// lp.addEdge(42, 45);
		// lp.addEdge(43, 46);
		// lp.addEdge(44, 47);
		// lp.addEdge(45, 47);
		// lp.addEdge(46, 47);
		// lp.addEdge(47, 48);
		// lp.addEdge(48, 49);
		System.out.println( "Length of the longest path is:");
		System.out.println( lp.findLongestPath( n)); 

	} 
} 

