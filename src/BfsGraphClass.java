import java.util.LinkedList;

public class BfsGraphClass {

    class Graph{
        private int vertices;
        private LinkedList<Integer> adjacencyList[];
        Graph(int vertices){
            this.vertices = vertices;
            this.adjacencyList = new LinkedList[vertices];
            for(int i=0; i<vertices;i++){
                this.adjacencyList[i] = new LinkedList<Integer>();
            }
        }
        void addEdges(int source, int destination){
            this.adjacencyList[source].add(destination);
            this.adjacencyList[destination].add(source);
        }

        void BFS(int startVertices){
            Boolean[] visited = new Boolean[this.vertices];
            LinkedList<Integer> queue = new LinkedList<>();
            visited[startVertices] = true;
            queue.add(startVertices);
            while(queue.size()!=0) {
                int currentIndex = queue.poll();
                System.out.println(currentIndex + " ");
                for (int neighbour : this.adjacencyList[currentIndex]) {
                    if (!visited[neighbour]) {
                        visited[neighbour] = true;
                        queue.add(neighbour);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {

    }
}
