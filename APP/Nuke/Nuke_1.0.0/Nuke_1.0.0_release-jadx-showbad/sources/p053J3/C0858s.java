package p053J3;

/* JADX INFO: renamed from: J3.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0858s {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: ok */
    private final boolean f2698ok;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0858s(boolean z5) {
        this.f2698ok = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C0858s m1814c(C0858s c0858s, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = c0858s.f2698ok;
        }
        return c0858s.m1816b(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m1815a() {
        return this.f2698ok;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0858s m1816b(boolean z5) {
        return new C0858s(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m1817d() {
        return this.f2698ok;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0858s) && this.f2698ok == ((C0858s) obj).f2698ok;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Boolean.hashCode(this.f2698ok);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "Health(ok=" + this.f2698ok + ")";
    }
}
