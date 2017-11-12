package interfaces;

public class MixedCapsString extends SpecialString implements TextFunkifier {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s2) {
		String ReTuRn = "";
		for(int i = 1; i < s2.length() - 1;i=i+2) {
			char c = s2.charAt(i);
			c = Character.toUpperCase(c);
			ReTuRn = ReTuRn + s2.charAt(i - 1) + c;
			System.out.println(ReTuRn);
		}
		return ReTuRn + "t";
	}

}
