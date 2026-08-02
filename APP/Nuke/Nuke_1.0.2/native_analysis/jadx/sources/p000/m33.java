package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m33 {

    /* JADX INFO: renamed from: b */
    public static final long f6464b = rb3.m4426a(0.5f, 0.5f);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f6465c = 0;

    /* JADX INFO: renamed from: a */
    public final long f6466a;

    /* JADX INFO: renamed from: a */
    public static final boolean m3029a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static String m3030b(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m33) {
            return this.f6466a == ((m33) obj).f6466a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6466a);
    }

    public final String toString() {
        return m3030b(this.f6466a);
    }
}
