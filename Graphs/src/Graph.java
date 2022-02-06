import java.util.ArrayList;

public class Graph {
	
	ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();
	
	Graph(int noofvertex){
		for(int i = 0; i < noofvertex; i++) {
			adjlist.add(new ArrayList<Integer>());
		}
	}
	
	
	/*
	 * public void addVertex() { adjlist.add(new ArrayList<Integer>()); }
	 */
	
	public void addEdges(int node1, int node2) {
		adjlist.get(node1).add(node2);
		adjlist.get(node2).add(node1);
	}
	
	public void ShowConnections() {
		for(int i = 0; i < adjlist.size(); i++) {
			System.out.println("Adjust List Of Vertex " + i);
			for(int j = 0; j < adjlist.get(i).size(); j++) {
				System.out.println(adjlist.get(i).get(j));
			}
		}
	}
}
