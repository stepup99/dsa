import java.util.LinkedList;

public class DfsGraphClass {
    int vertices;
    LinkedList<Integer> adjacencyList[];
    DfsGraphClass(int vertices){
        this.vertices = vertices;
        this.adjacencyList = new LinkedList[vertices];
        for(int i=0; i<this.vertices; i++){
            this.adjacencyList[i] = new LinkedList<Integer>();
        }
    }

    void addEdges(int source, int destination){
        this.adjacencyList[source].add(destination);
    }

    void DFS(int startVertices){
       Boolean[] visited = new Boolean[this.vertices];
       DFSUtil(startVertices, visited);
    }

    void DFSUtil(int startVertices, Boolean[] visited){
        for(int i:this.adjacencyList[startVertices]){
            if(!visited[i]){
                visited[startVertices] = true;
                System.out.println(i + " ");
                DFSUtil(i, visited);

            }
        }

    }


}
