// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import java.time.Duration;

public final class CLS31 {
    public static Duration MTH548(long v) {
        return Duration.ofMillis(v);
    }

    public static Duration MTH549(Duration duration0, long v) {
        return duration0.minusHours(v);
    }

    public static long MTH550(Duration duration0) {
        return duration0.toDays();
    }

    public static long MTH551(Duration duration0) {
        return duration0.toHours();
    }

    public static Duration MTH552(Duration duration0, long v) {
        return duration0.minusDays(v);
    }

    public static long MTH553(Duration duration0) {
        return duration0.toMinutes();
    }
}

