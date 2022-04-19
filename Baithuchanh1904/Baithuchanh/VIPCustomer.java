package baithuchanh;

import java.util.Scanner;


public class VIPCustomer extends Person {
	private String id;
	private String soThich;
	public VIPCustomer(String ten, long tuoi, String id, String soThich) {
		super(ten, tuoi);
		this.id = id;
		this.soThich = soThich;
	}
    }