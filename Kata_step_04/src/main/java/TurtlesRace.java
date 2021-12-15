import java.util.Arrays;

public class TurtlesRace {
    public static int[] takeDifRaceTime(int[] moves) {
        if (moves.length != 3) throw new NullPointerException("There are no information for starting race");
        int v1 = moves[0];
        int v2 = moves[1];
        int diference = moves[2];
        if (v2 - v1 <= 0) return null;
        int time = diference * 3600/ (v2 - v1);
        moves[2] = time % 60;
        moves[1] = (time / 60) % 60;
        moves[0] = time / 3600;
        return moves;
    }

    public static void main(String[] args) {
        int[] moves1 = {650, 850, 90};
        System.out.println(Arrays.toString(takeDifRaceTime(moves1)));
        int[] moves2 = {720, 850, 70};
        System.out.println(Arrays.toString(takeDifRaceTime(moves2)));
    }
}
//
//    Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows she runs faster than A, and furthermore has not finished her cabbage.
//
//        When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour. How long will it take B to catch A?
//
//        More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?
//
//        The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.
//
//        If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C, Go, Nim, Pascal, [-1, -1, -1] for Perl,[] for Kotlin or "-1 -1 -1".
