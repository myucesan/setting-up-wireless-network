
import java.util.*;

class Solution {

    public long cost, number;

    public Solution(long cost, long number) {
        this.cost = cost;
        this.number = number;
    }

    public static
    /**
     * @param n The number of stations
     * @param m The number of edges
     * @param b the budget
     * @param edges the edges in the network, you should ignore edges[0] and only use edges[1] to
     *     edges[m].
     */
    Solution setUpTheNetwork(int n, int m, int b, Edge[] edges) {
        // TODO
    }
}

class Edge {

    // from, to and length
    int x, y, l;

    public Edge(int from, int to, int length) {
        x = from;
        y = to;
        l = length;
    }
}
