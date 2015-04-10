package com.rmb;
import javax.ejb.Remote;
import javax.ejb.Stateless;
@Stateless
@Remote({RMBConvert.class})
public class RMBConvertBean implements RMBConvert {
	private final float r2dollar = 0.1612f;
	private final float r2eruo = 0.1501f;
	private final float dollar2r = 6.2023f;
	private final float eruo2r = 6.6753f;
	@Override
	public double RMBToDollar(double money) {
		// TODO Auto-generated method stub
		return money*r2dollar;
	}
	@Override
	public double RMBToEruo(double money) {
		// TODO Auto-generated method stub
		return money*r2eruo;
	}
	@Override
	public double DollarToRMB(double money) {
		// TODO Auto-generated method stub
		return money*dollar2r;
	}
	@Override
	public double EruoToRMB(double money) {
		// TODO Auto-generated method stub
		return money*eruo2r;
	}
	
}
