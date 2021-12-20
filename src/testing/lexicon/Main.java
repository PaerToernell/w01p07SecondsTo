package testing.lexicon;

public class Main {

    public static void main(String[] args) {
	int aSeconds = 86399;
    int    hours = aSeconds / 3600;
    int    minutes = (aSeconds % 3600) / 60;
    int    seconds = aSeconds % 60;

     String  aTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
     System.out.println(aTime);
    }
}
