package p000;

/* JADX INFO: renamed from: cc */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0086cc {

    /* JADX INFO: renamed from: a */
    public final long f778a;

    /* JADX INFO: renamed from: b */
    public final long f779b;

    /* JADX INFO: renamed from: c */
    public final long f780c;

    /* JADX INFO: renamed from: d */
    public final long f781d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0086cc(long j, long j2, long j3, long j4) {
        this.f778a = j;
        this.f779b = j2;
        this.f780c = j3;
        this.f781d = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0086cc)) {
            return false;
        }
        C0086cc c0086cc = (C0086cc) obj;
        return C0207ff.m1094c(this.f778a, c0086cc.f778a) && C0207ff.m1094c(this.f779b, c0086cc.f779b) && C0207ff.m1094c(this.f780c, c0086cc.f780c) && C0207ff.m1094c(this.f781d, c0086cc.f781d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = C0207ff.f1708h;
        return Long.hashCode(this.f781d) + AbstractC0748t1.m4146d(this.f780c, AbstractC0748t1.m4146d(this.f779b, Long.hashCode(this.f778a) * 31, 31), 31);
    }
}
