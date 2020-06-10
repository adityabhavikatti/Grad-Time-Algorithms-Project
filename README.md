# Project1-CPSC535
## Graduation time

Group members:

Aditya Bhavikatti adityabhavikatti@csu.fullerton.edu

Manikanta Reddy Nayini     manikantareddy@csu.fullerton.edu

Shouri Reddy Tumma           @csu.fullerton.edu

## Psuedocode

### Topological Sorting
    
    input: 
         Directed acyclic graph G
    output: 
         Topological sort of the graph.

         list[i]=new LinkedList();

         for each vertex do
            check if !visited
                checkTopo()

            in tsort()

            for each vertex do
                if visited then false

            if visited is false then call checktopo

            while stack is !empty
                print st.pop()

        

### Longest Path
    input: 
         Directed acyclic graph G
    output: 
         Length of the longest path
    
    create new arraylist and populate the edges

    for every i do
        if !visited
            check dfs of i adj, dp, visited

        for every i do

            ans = max of ans, dp[i]

            return ans





## How to run the code

### For the Topological sorting we have "graphtest1.java"

    Open the file in VS code and run the program, to obtain the topological sort of the specified graph.

    By deafult the output is of graph01.txt
    To display the output of biggraph.txt we can uncomment from line 82 and comment the lines 72-80.


 ### For the Longest Path we have "Main.java"

    Open the file in VS code and run the program, to obtain the Longest path of the specified graph.

    By deafult the output is of graph01.txt
    To display the output of biggraph.txt we can uncomment from line 76-136 and comment the lines 67-73.


## Screenshots

### Topological Sort

    graph01.txt
    
   <img src="/screenshots/topological_sort_graph01.png?raw=true">
   
    biggraph.txt
    
   <img src="/screenshots/topological_sort_biggraph.png?raw=true">


### Longest Path

    graph01.txt
    
   <img src="/screenshots/longest_path_graph01.png?raw=true">
   
    biggraph.txt
    
   <img src="/screenshots/longest_path_biggraph.png?raw=true">
