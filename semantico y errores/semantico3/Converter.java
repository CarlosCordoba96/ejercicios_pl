
public class Converter {
	private int num;
	private String unit;
	
	public Converter(int num,String unit) {
		this.num=num;
		this.unit=unit;
		if(unit.equals("oct")) {
			System.out.println(Integer.toString(num,8));
		}else if(unit.equals("bin")) {
			System.out.println(Integer.toString(num,2));
		}else if(unit.equals("hex")) {
			System.out.println(Integer.toString(num,16));
		}
		
	}
}
