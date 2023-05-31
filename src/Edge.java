public class Edge<V> {
    private Vertex<V> source;
    private Vertex<V> dest;
    private Double weight;
    public Edge(Vertex source, Vertex dest, Double weight) {
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }
    public void setSource(Vertex source) {
        this.source = source;
    }
    public Vertex getSource() {
        return source;
    }
    public void setDest(Vertex dest) {
        this.dest = dest;
    }
    public Vertex getDest() {
        return dest;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Double getWeight() {
        return weight;
    }
}
