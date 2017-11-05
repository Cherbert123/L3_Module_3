package interfaces;

public class BackwardsString extends SpecialString implements TextFunkifier {

	public BackwardsString(String s) {
		super(s);
		funkifyText(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s2) {
		String nruter = "";
		for(int i = s2.length() -1;i >= 1;i--) {
			nruter = nruter + s2.charAt(i);
		}
		System.out.println(nruter);
		nruter = nruter + "T";
		return nruter;
	

	}

}
