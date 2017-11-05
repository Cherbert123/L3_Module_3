package interfaces;

public class MixedCapsString extends SpecialString implements TextFunkifier {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s2) {
		String ReTuRn = "";
		String is = "";

		for(int i = 1;i <= s2.length();i=i+2) {
			is = s2.substring(i-1, i);
			System.out.println(is);
			ReTuRn = ReTuRn + is.toUpperCase();
			ReTuRn = ReTuRn + s2.substring(i-1,i);
			
		}
		System.out.println(ReTuRn);
		return ReTuRn;
	}

}
