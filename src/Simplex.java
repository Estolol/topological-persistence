import java.util.*;

// provided code of a class to represent a simplex
class Simplex {
	float val;
	int dim;
	FastHashSet<Integer> vert;

	Simplex(Scanner sc){
		val = sc.nextFloat();
		dim = sc.nextInt();
		vert = new FastHashSet<Integer>();
		for (int i=0; i<=dim; i++)
			vert.add(sc.nextInt());
	}

	public String toString(){
		return "{val="+val+"; dim="+dim+"; "+vert+"}\n";
	}

}
