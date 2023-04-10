package auto_radnja.gume;

import java.util.Objects;

public class AutoGuma {

	private String markaModel = null;
	private int precnik = -1;
	private int sirina = -1;
	private int visina = -1;
	
	public AutoGuma() {
		// TODO Auto-generated constructor stub
	}

	public String getMarkaModel() {
		return markaModel;
	}

	public void setMarkaModel(String markaModel) {
		if (markaModel==null)
			throw new NullPointerException("Morate uneti marku i model");
		if (markaModel.length()<3)
			throw new IllegalArgumentException("Marka i model moraju sadrzati bar 3 znaka");
		this.markaModel = markaModel;
	}

	public int getPrecnik() {
		return precnik;
	}

	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new IllegalArgumentException("Precnik van opsega");
		this.precnik = precnik;
	}

	public int getSirina() {
		return sirina;
	}

	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new IllegalArgumentException("Sirina van opsega");
		this.sirina = sirina;
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		if (visina < 25 || visina > 95) 
			throw new IllegalArgumentException("Visina van opsega");
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + ", getMarkaModel()=" + getMarkaModel() + ", getPrecnik()=" + getPrecnik() + ", getSirina()="
				+ getSirina() + ", getVisina()=" + getVisina() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(markaModel, precnik, sirina, visina);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		return Objects.equals(markaModel, other.markaModel) && precnik == other.precnik && sirina == other.sirina
				&& visina == other.visina;
	}
	
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
		super();
		setMarkaModel(markaModel);
		setPrecnik(precnik);
		setSirina(sirina);
		setVisina(visina);
	}

	
}
