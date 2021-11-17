// IMPLEMENTED WITH QUICKFIND ALGORITHM,
public class QuickFind {
    private int [] arr;

    QuickFind(int [] arr){
        this.setArr(arr);
    }

    QuickFind(){
        this.setArr(new int[10]); // default initialization
    }

    //check if two nodes of the array are connected true/false
    public boolean connected(int p, int q){
        return(getArr()[p] == getArr()[q]);
    }

    //if nodes are not connected(check) connect them
    public void union(int p, int q){
        if(!connected(p, q)){
            int pid = getArr()[p];
            int qid = getArr()[q];
            //change all components like q equal to p
            for (int i = 0; i < getArr().length; i++){
                if(getArr()[i] == qid){
                    getArr()[i] = pid;
                }
            }
        }
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
