package org.btm.dependencyApp;

public class Engine {
	private int engine_no;
	private int horse_power;
	private String engine_type;
	public int getEngine_no() {
		return engine_no;
	}
	public void setEngine_no(int engine_no) {
		this.engine_no = engine_no;
	}
	public int getHorse_power() {
		return horse_power;
	}
	public void setHorse_power(int horse_power) {
		this.horse_power = horse_power;
	}
	public String getEngine_type() {
		return engine_type;
	}
	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}
	 @Override
	public String toString() {
		
		return "Details are[Engine_no="+engine_no+" Horse_power="+horse_power+" Engine_type"+engine_type+"]";
		
	}
	

}
