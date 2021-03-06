import java.util.Date;

public class RegistroMetereologico implements Comparable<RegistroMetereologico> {

	private Date tempo;
	private double temperatura;
	private double umidade;
	private double pressao;
	
	public Date getTempo() {
		return tempo;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public double getUmidade() {
		return umidade;
	}
	public double getPressao() {
		return pressao;
	}
	public RegistroMetereologico(Date tempo, double temperatura, double umidade, double pressao){
		this.tempo = tempo;
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao = pressao;
	}
	public int compareTo(RegistroMetereologico r) {
		if(this.temperatura > r.getTemperatura())
			return 1;
		else if(this.temperatura < r.getTemperatura())
			return -1;
		else
			return 0;
	}
}
