package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q13 {

    /* JADX INFO: renamed from: a */
    public final long f8703a;

    /* JADX INFO: renamed from: a */
    public static final boolean m4041a(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q13) {
            return this.f8703a == ((q13) obj).f8703a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8703a);
    }

    public final String toString() {
        long j = this.f8703a;
        return m4041a(j, 0L) ? "Unspecified" : m4041a(j, 4294967296L) ? "Sp" : m4041a(j, 8589934592L) ? "Em" : "Invalid";
    }
}
