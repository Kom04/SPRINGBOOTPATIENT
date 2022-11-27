package mydemo1.patient.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="patient")
public class Patient {
	
	@Id
	private String name;
	private String frequency;
	private int fad;
	private String startdate;
	private String enddate;
	private String time;
	private String tests;
	private String illness;
	private String others;
	
	Patient()
	{
		
	}

	Patient(String name, String frequency, int fad, String startdate, String enddate, String time, String tests,
			String illness, String others) {
		this.name = name;
		this.frequency = frequency;
		this.fad = fad;
		this.startdate = startdate;
		this.enddate = enddate;
		this.time = time;
		this.tests = tests;
		this.illness = illness;
		this.others = others;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public int getFad() {
		return fad;
	}

	public void setFad(int fad) {
		this.fad = fad;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTests() {
		return tests;
	}

	public void setTests(String tests) {
		this.tests = tests;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", frequency=" + frequency + ", fad=" + fad + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", time=" + time + ", tests=" + tests + ", illness=" + illness + ", others="
				+ others + "]";
	}
	
	
	
	
	

}
