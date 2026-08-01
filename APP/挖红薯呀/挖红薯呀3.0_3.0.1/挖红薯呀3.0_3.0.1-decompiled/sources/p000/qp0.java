package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class qp0 extends wp0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qp0) && Float.compare(17.52f, 17.52f) == 0 && Float.compare(2.0f, 2.0f) == 0 && Float.compare(12.0f, 12.0f) == 0 && Float.compare(2.0f, 2.0f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(2.0f) + AbstractC0748t1.m4143a(12.0f, AbstractC0748t1.m4143a(2.0f, Float.hashCode(17.52f) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ReflectiveCurveTo(x1=17.52, y1=2.0, x2=12.0, y2=2.0)";
    }
}
