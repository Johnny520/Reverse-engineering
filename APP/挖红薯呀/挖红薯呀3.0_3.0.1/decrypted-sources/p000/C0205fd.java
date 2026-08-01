package p000;

/* JADX INFO: renamed from: fd */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0205fd {

    /* JADX INFO: renamed from: a */
    public final long f1678a;

    /* JADX INFO: renamed from: b */
    public final long f1679b;

    /* JADX INFO: renamed from: c */
    public final long f1680c;

    /* JADX INFO: renamed from: d */
    public final long f1681d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0205fd(long j, long j2, long j3, long j4) {
        this.f1678a = j;
        this.f1679b = j2;
        this.f1680c = j3;
        this.f1681d = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0205fd)) {
            return false;
        }
        C0205fd c0205fd = (C0205fd) obj;
        return C0207ff.m1094c(this.f1678a, c0205fd.f1678a) && C0207ff.m1094c(this.f1679b, c0205fd.f1679b) && C0207ff.m1094c(this.f1680c, c0205fd.f1680c) && C0207ff.m1094c(this.f1681d, c0205fd.f1681d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = C0207ff.f1708h;
        return Long.hashCode(this.f1681d) + AbstractC0748t1.m4146d(this.f1680c, AbstractC0748t1.m4146d(this.f1679b, Long.hashCode(this.f1678a) * 31, 31), 31);
    }
}
