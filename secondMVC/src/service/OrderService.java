package service;

public class OrderService {
	public String checkEmpty(String text) {//Check Empty
		if (text == null || text.trim().equals("")) {
			text = "<i>No Value</i>";
			return text;
		} else
			return text;
	}

	public boolean isCardEqual(String cardNum, String cardNumCheck) {//Check Same
		if (cardNum == null || (!cardNum.equals(cardNumCheck)) || (cardNum.trim().equals("")))
			return false;
		else
			return true;
	}
}
