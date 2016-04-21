public class ComparaRegistrosMetereologico 
	implements java.util.Comparator<RegistroMetereologico>{
	
	@Override
	public int compare(RegistroMetereologico o1, RegistroMetereologico o2) {
		return o1.compareTo(o2);
	}
}
