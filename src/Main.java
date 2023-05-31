public class Main {
    public static void main(String[] args) {
        Graph<Integer> myGraph = new Graph<>();
        Vertex<Integer> q = new Vertex<>(1);
        Vertex<Integer> w = new Vertex<>(2);
        Vertex<Integer> e = new Vertex<>(3);
        Vertex<Integer> r = new Vertex<>(4);
        Vertex<Integer> t = new Vertex<>(5);
        myGraph.addEdge(q, w, 5d);
        myGraph.addEdge(q, e, 6d);
        myGraph.addEdge(w, r, 7d);
        myGraph.addEdge(w, t, 8d);
        myGraph.BFS(w);
        myGraph.dijkstra(q);
    }
}