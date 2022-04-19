package baithuchanh;

import java.util.Scanner;

public class Customer extends Person {
	private String id;

	public Customer(String ten, long tuoi, String id) {
		super(ten, tuoi);
		this.id = id;
	}
    }