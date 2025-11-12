import java.util.*;

public class Kruskal {
    public static int kruskalMST(List<Edge> edges, int V) {
        Collections.sort(edges);
        DSU dsu = new DSU(V);
        int total = 0;

        System.out.println("Edges in the Kruskal MST:");
        for (Edge e : edges) {
            if (dsu.union(e.from, e.to)) {
                System.out.println(e.from + " - " + e.to + " : " + e.weight);
                total += e.weight;
            }
        }
        System.out.println("Total weight: " + total);
        return total;
    }
}
