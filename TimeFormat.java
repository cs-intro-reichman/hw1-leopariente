// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		String prefix = hours > 12 ? "PM" : "AM";
		hours = hours > 12 ? hours - 12 : hours;
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		System.out.print(hours + ":" + minutes);
		System.out.print(prefix);
        // Replace this comment with the rest of your code
	}
}