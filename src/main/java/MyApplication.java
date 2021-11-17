public class MyApplication {

    public static void main(String [] args){

        int [] myArr = new int[10];
        myArr = new int[]{0, 1, 1, 8, 8, 0, 0, 1, 8, 8};

        QuickFind quickFind = new QuickFind(myArr);
        quickFind.print();

        if(!quickFind.connected(0,2)){
            quickFind.union(0,2);
        }

        quickFind.print();
    }
}
