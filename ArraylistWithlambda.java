import java.util.ArrayList;
import java.util.List;

class Candidate{
	int cand_id;
	String cand_skill;
	
	public Candidate(int c_id,String c_skill) {
		this.cand_id = c_id;
		this.cand_skill = c_skill;
	}
	
}



public class ArraylistWithlambda {

	public static void main(String[] args) {
		Candidate cd1 = new Candidate(1, "Java");
		Candidate cd2 = new Candidate(2, "python");
		Candidate cd3 = new Candidate(3, "C#");
		Candidate cd4 = new Candidate(4, "C++");
		Candidate cd5 = new Candidate(5, "Javascript");
		
		List<Candidate> l = new ArrayList<Candidate>();
		l.add(cd1);
		l.add(cd5);
		l.add(cd4);
		l.add(cd3);
		l.add(cd2);

		l.forEach((e) -> {
			if(e.cand_skill.equals("Java")) {
				System.out.println("candidate id "+e.cand_id+" is skilled with "+e.cand_skill);
			}
		});

	}

}
