package p071f1;

/* JADX INFO: renamed from: f1.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1032u0 {

    /* JADX INFO: renamed from: b */
    public static final long f3254b = AbstractC0996c0.m2511g(0.5f, 0.5f);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f3255c = 0;

    /* JADX INFO: renamed from: a */
    public final long f3256a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m2631a(long j3, long j4) {
        return j3 == j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m2632b(long j3) {
        return "TransformOrigin(packedValue=" + j3 + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1032u0) {
            return this.f3256a == ((C1032u0) obj).f3256a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f3256a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m2632b(this.f3256a);
    }
}
