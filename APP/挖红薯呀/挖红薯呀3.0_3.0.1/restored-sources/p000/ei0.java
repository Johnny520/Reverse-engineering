package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ei0 {

    /* JADX INFO: renamed from: a */
    public final long f1463a;

    /* JADX INFO: renamed from: b */
    public final long f1464b;

    /* JADX INFO: renamed from: c */
    public final long f1465c;

    /* JADX INFO: renamed from: d */
    public final long f1466d;

    /* JADX INFO: renamed from: e */
    public final long f1467e;

    /* JADX INFO: renamed from: f */
    public final long f1468f;

    /* JADX INFO: renamed from: g */
    public final long f1469g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ei0(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f1463a = j;
        this.f1464b = j2;
        this.f1465c = j3;
        this.f1466d = j4;
        this.f1467e = j5;
        this.f1468f = j6;
        this.f1469g = j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ei0)) {
            return false;
        }
        ei0 ei0Var = (ei0) obj;
        return C0207ff.m1094c(this.f1463a, ei0Var.f1463a) && C0207ff.m1094c(this.f1466d, ei0Var.f1466d) && C0207ff.m1094c(this.f1464b, ei0Var.f1464b) && C0207ff.m1094c(this.f1467e, ei0Var.f1467e) && C0207ff.m1094c(this.f1465c, ei0Var.f1465c) && C0207ff.m1094c(this.f1468f, ei0Var.f1468f) && C0207ff.m1094c(this.f1469g, ei0Var.f1469g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = C0207ff.f1708h;
        return Long.hashCode(this.f1469g) + AbstractC0748t1.m4146d(this.f1468f, AbstractC0748t1.m4146d(this.f1465c, AbstractC0748t1.m4146d(this.f1467e, AbstractC0748t1.m4146d(this.f1464b, AbstractC0748t1.m4146d(this.f1466d, Long.hashCode(this.f1463a) * 31, 31), 31), 31), 31), 31);
    }
}
