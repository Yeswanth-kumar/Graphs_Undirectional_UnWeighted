
public class Main {

	public static void main(String[] args) {
			
		Graph mygraph = new Graph(5);
		
		/*
		 * mygraph.addVertex(); mygraph.addVertex(); mygraph.addVertex();
		 * mygraph.addVertex(); mygraph.addVertex();
		 */
		
		mygraph.addEdges(0, 1);
		mygraph.addEdges(1, 2);
		mygraph.addEdges(2, 3);
		mygraph.addEdges(3, 4);
		mygraph.addEdges(4, 0);
		mygraph.addEdges(4, 1);
		
		mygraph.ShowConnections();
	}

}
