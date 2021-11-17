public class QuickUnionWithPathCompression {

    private int [] arr;

    // set each object to itself
    QuickUnionWithPathCompression(int N){
        arr = new int[N];

        for (int i = 0; i < N; i++){
            arr[i] = i;
        }
    }
    //check if two nodes of the array are connected true/false
    //hint: id[i] is parent of i
    //check p and q have the same root
    // EXAMPLE ARRAY :
    //    idx:  0 1 2 3 4 5 6 7 8 9
    //   id[]:  0 1 9 4 9 6 6 7 8 9
    /** 0  1  9    6  7   8
     *       / \   |
     *      2   4  5
     *          |
     *          3
     */
    public boolean connected(int p, int q){
        return(findRoot(p) == findRoot(q));
    }

    //if nodes are not connected(check) connect them
    public void union(int p, int q){
        int rootOfp = findRoot(p);
        int rootOfq = findRoot(q);
        // set the id of p's root to the id of q's root
        arr[rootOfq] = rootOfp;
    }

    // just one extra line compared to Quick Union
    public int findRoot(int p){
        int root = p;
        while (arr[p] != root){
            // Make every other node in path point to its
            // grandparent, path length is halved.
            arr[root] = arr[arr[root]]; // extra one line
            root = arr[root];
        }
        return root;
    }

    public void print() {
        for (int i = 0; i < getArr().length; i++) {
            System.out.print(getArr()[i] + " ");
        }
        System.out.println();
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
