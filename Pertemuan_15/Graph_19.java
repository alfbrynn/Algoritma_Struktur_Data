package Pertemuan_15;

import java.security.PublicKey;

/**
 * Graph_19
 */
public class Graph_19 {

    int vertex;
    DoubleLinkedList_19 list[];

    public Graph_19(int v){
        vertex = v;
        list = new DoubleLinkedList_19[v];
        for(int i=0; i<v; i++){
            list[i] = new DoubleLinkedList_19();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak){
        list[asal]. addFirst(tujuan, jarak);
        // list[tujuan]. addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut = 0;
        for(int i =0 ; i<vertex; i++){
            // inDegree
            for(int j=0; j<list[i].size(); j++){
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
        }

        // outDegree
        for(k=0; k<list[asal].size();k++){
            list[asal].get(k);
        }
        totalOut = k;

        System.out.println("InDegree dari Gedung " + (char) ('A'+asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A'+asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A'+asal) + ": " + (totalIn+totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception{
        // System.out.println("ngasal");
        System.out.println(vertex);
        list[asal].remove(tujuan);
        for(int i = 0; i < vertex; i++){
            // System.out.println("benar");
            if (i == tujuan) {
            }
        }
    }

    public void removeAllEdges(){
        for(int i = 0; i<vertex; i++){
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan.");
    }

    public void printGraph() throws Exception{
        // System.out.println("emosi");
        for(int i=0; i<vertex; i++){
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++){
                    System.out.print((char) ('A' +list[i].get(j)) + " (" +list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}