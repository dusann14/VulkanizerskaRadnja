package auto_radnja.gume;

import java.util.Objects;


/**
 * 
 * AutoGuma - ovo je klasa koja opisuje karakteristike auto gume
 * 
 * @author Dusan i Boris
 *
 */
public class AutoGuma {
	
	/**
	 * markaModel kao String
	 */
	private String markaModel = null;
	/**
	 * precnik kao int
	 */
	private int precnik = -1;
	/**
	 * sirina kao int
	 */
	private int sirina = -1;
	/**
	 * visina kao int
	 */
	private int visina = -1;
	
	/**
	 * prazan konstruktor
	 */
	public AutoGuma() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * getMarkaModel - metoda koja vraca vrednost atributa
	 * @return markaModel, verdnost atributa
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	
	/**
	 * setMarkaModel - metoda koja postavlja vrednost atributa na osnovu ulaznog argumenta
	 * 
	 * @param markaModel vrednost koja se dodeljuje atributu markaModel
	 * @throws NullPointerException ako se unese vrednost null
	 * @throws IllegalArgumentException ako se unese String koji je kraci od 3 karaktera
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null)
			throw new NullPointerException("Morate uneti marku i model");
		if (markaModel.length()<3)
			throw new IllegalArgumentException("Marka i model moraju sadrzati bar 3 znaka");
		this.markaModel = markaModel;
	}
	
	/**
	 * getPrecnik - metoda koja vraca vrednost atributa precnik
	 * @return precnik, vrednost atributa
	 */
	public int getPrecnik() {
		return precnik;
	}
	
	/**
	 * setPrecnik - metoda koja postavlja vrednost atributa na osnovu ulaznog argumenta
	 * 
	 * @param precnik vrednost koja se dodeljuje atributu precnik
	 * @throws IllegalArgumentException ako se unese precnik koji je kraci od 13 a veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new IllegalArgumentException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * getSirina - metoda koja vraca vrednost atributa sirina
	 * @return sirina, vrednost atributa
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * setSirina - metoda koja postavlja vrednost atributa na osnovu ulaznog argumenta
	 * 
	 * @param sirina vrednost koja se dodeljuje atributu sirina
	 * @throws IllegalArgumentException ako se unese precnik koji je kraci od 135 a veci od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new IllegalArgumentException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * getVisina - metoda koja vraca vrednost atributa visina
	 * @return visina, vrednost atributa
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * setVisina - metoda koja postavlja vrednost atributa na osnovu ulaznog argumenta
	 * 
	 * @param visina vrednost koja se dodeljuje atributu visina
	 * @throws IllegalArgumentException ako se unese visina koja je manja od 25 a veci od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95) 
			throw new IllegalArgumentException("Visina van opsega");
		this.visina = visina;
	}
	
	/**
	 * @return vraca objekat kao string
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + ", getMarkaModel()=" + getMarkaModel() + ", getPrecnik()=" + getPrecnik() + ", getSirina()="
				+ getSirina() + ", getVisina()=" + getVisina() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	/**
	 * @return metoda vraca hash vrednost objekta
	 */
	@Override
	public int hashCode() {
		return Objects.hash(markaModel, precnik, sirina, visina);
	}
	/**
	 * metoda koja poredi dva objekata na osnovu svih atributa
	 * @return vraca true ako su objekti isti a false ako nisu 
	 */
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
	
	/**
	 * parametrizovani konstruktor
	 *  
	 * @param markaModel - ulazni argument
	 * @param precnik - ulazni argument
	 * @param sirina - ulazni argument
	 * @param visina - ulazni argument
	 */
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
		super();
		setMarkaModel(markaModel);
		setPrecnik(precnik);
		setSirina(sirina);
		setVisina(visina);
	}

	
}
