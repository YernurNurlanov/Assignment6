# Assignment6
## addEdge
Description: Adds a weighted edge between two vertices in the graph.
```
public void addEdge(Vertex source, Vertex destination, double weight){
        Edge edge = new Edge(source, destination, weight);
        source.addAdjVertex(destination, weight);
        if (!graph.containsKey(source)) 
            graph.put(source, new ArrayList<>());
        graph.get(source).add(edge);
    }
```
## BFS
Description: Performs BreadthFirst Search starting from a given vertex.
```
public void BFS(Vertex start){
        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);
        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            Set<Vertex<V>> neighbors = currentVertex.getAdjVertices().keySet();
            for (Vertex<V> neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
```
## dijkstra
Description: Performs Dijkstra's algorithm to find the shortest paths from a given starting vertex to all other vertices in the graph.
```
public Map<Vertex, Double> dijkstra(Vertex start) {
        Map<Vertex, Double> distances = new HashMap<>();
        for (Vertex node : graph.keySet()) {
            distances.put(node, Double.MAX_VALUE);
        }
        distances.put(start, 0d);
        PriorityQueue<Vertex> queue = new PriorityQueue<>(Comparator.comparingDouble(distances::get));
        queue.add(start);
        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            for (Edge neighbor : graph.get(currentVertex)) {
                double distance = distances.get(currentVertex) + neighbor.getWeight();
                if (distance < distances.get(currentVertex)) {
                    distances.put(currentVertex, distance);
                    queue.add((Vertex) neighbor.getDest());
                }
            }
        }
        return distances;
    }
```
