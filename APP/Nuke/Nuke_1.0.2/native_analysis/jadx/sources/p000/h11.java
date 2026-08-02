package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h11 {

    /* JADX INFO: renamed from: a */
    public final long f3775a;

    /* JADX INFO: renamed from: a */
    public static final boolean m2041a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static String m2042b(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h11) {
            return this.f3775a == ((h11) obj).f3775a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3775a);
    }

    public final String toString() {
        return m2042b(this.f3775a);
    }
}
