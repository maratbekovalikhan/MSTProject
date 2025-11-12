import java.util.HashMap;

public class DSU {
    private final HashMap<Integer, Integer> parent = new HashMap<>();
    private final HashMap<Integer, Integer> rank = new HashMap<>();

    public DSU(int n) {
        for (int i = 0; i < n; i++) {
            parent.put(i, i);
            rank.put(i, 0);
        }
    }

    public int find(int x) {
        if (parent.get(x) != x) {
            parent.put(x, find(parent.get(x)));
        }
        return parent.get(x);
    }

    public boolean union(int x, int y) {
        int rx = find(x);
        int ry = find(y);
        if (rx == ry) return false;
        if (rank.get(rx) < rank.get(ry)) {
            parent.put(rx, ry);
        } else if (rank.get(rx) > rank.get(ry)) {
            parent.put(ry, rx);
        } else {
            parent.put(ry, rx);
            rank.put(rx, rank.get(rx) + 1);
        }
        return true;
    }
}
