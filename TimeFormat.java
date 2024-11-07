// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		String suffix = hours >= 12 ? "PM" : "AM";
		hours = hours % 12;
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String formattedNumber = minutes < 10 ? "0" + minutes : Integer.toString(minutes);
		System.out.print(hours + ":");
		System.out.print(formattedNumber + " ");
		System.out.print(suffix);
	}
}