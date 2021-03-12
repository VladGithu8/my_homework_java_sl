package searchpackage;

import graph.AdjacencyList;
import graph.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    // Big O(N^2)
    int size;
    AdjacencyList[] array;

    public BreadthFirstSearch(int size) {
        this.size = size;
        array = new AdjacencyList[this.size];
        for (int i = 0; i < size; i++) {
            array[i] = new AdjacencyList();
            array[i].head =null;

        }
    }

    public void add(int src, int destination){
        Node node = new Node(destination, null);
        node.next = array[src].head;
        array[src].head = node;

    }


    public List<Integer> BFSExplore(int StartPoint){
        List<Integer> test = new ArrayList<>();

        Boolean[] visited = new Boolean[size];
        for (int i = 0; i < size; i++)
            visited[i] = false;
        Queue<Integer> queueInteger = new LinkedList<Integer>();
        queueInteger.add(StartPoint);

        while (!queueInteger.isEmpty()){
            int n = queueInteger.poll();
            test.add(n);
            System.out.println("Visited node by BFS: " + n);
            visited[n] = true;
            Node head = array[n].head;

            while (head != null){
                if(!visited[head.value]){
                    queueInteger.add(head.value);
                    visited[head.value] = true;
                } else {
                    head = head.next;
                }
            }
        }
        return test;
    }
}
