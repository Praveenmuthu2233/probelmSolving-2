import java.util.*;

class main {
    public static void findItinerary(int[] fromCities, int[] toCities) {
        Map<Integer, Integer> ticketMap = new HashMap<>();
        for (int i = 0; i < fromCities.length; i++) {
            ticketMap.put(fromCities[i], toCities[i]);
        }
        Map<Integer, Boolean> destinations = new HashMap<>();
        for (int to : toCities) {
            destinations.put(to, true);
        }
        int startCity = 0;
        for (int from : fromCities) {
            if (!destinations.containsKey(from)) {
                startCity = from;
                break;
            }
        }
        int currentCity = startCity;
        while (ticketMap.containsKey(currentCity)) {
            int nextCity = ticketMap.get(currentCity);
            System.out.println(currentCity + " -> " + nextCity);
            currentCity = nextCity;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] from = sc.nextLine().split(",");
        int fromLen = from.length;
        int[] fromCities = new int[fromLen];
        for (int i = 0; i < fromLen; i++) {
            fromCities[i] = Integer.parseInt(from[i].trim());
        }

        String[] to = sc.nextLine().split(",");
        int toLen = to.length;
        int[] toCities = new int[toLen];
        for (int i = 0; i < toLen; i++) {
            toCities[i] = Integer.parseInt(to[i].trim());
        }
        findItinerary(fromCities, toCities);
    }
}
