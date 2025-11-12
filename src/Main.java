import java.util.*;

public class Main {
    public static void main(String[] args) {
        int V = 5;
        int[][] graph = {
                {0, 2, 3, 0, 0},
                {2, 0, 1, 4, 0},
                {3, 1, 0, 0, 5},
                {0, 4, 0, 0, 6},
                {0, 0, 5, 6, 0}
        };

        System.out.println("==== Prim's Algorithm ====");
        Prim.primMST(graph, V);

        List<Edge> edges = Arrays.asList(
                new Edge(0, 1, 2),
                new Edge(0, 2, 3),
                new Edge(1, 2, 1),
                new Edge(1, 3, 4),
                new Edge(2, 4, 5),
                new Edge(3, 4, 6)
        );

        System.out.println("\n==== Kruskal's Algorithm ====");
        Kruskal.kruskalMST(edges, V);
    }
}
