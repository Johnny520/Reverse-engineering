package p082Q0;

import p186k.AbstractC2429k;
import p186k.C2439u;

/* JADX INFO: renamed from: Q0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1171e {

    /* JADX INFO: renamed from: a */
    public final C2439u f3845a;

    /* JADX INFO: renamed from: b */
    public C1170d f3846b;

    /* JADX INFO: renamed from: c */
    public long f3847c;

    /* JADX INFO: renamed from: d */
    public long f3848d;

    /* JADX INFO: renamed from: e */
    public long f3849e;

    /* JADX INFO: renamed from: f */
    public long f3850f;

    /* JADX INFO: renamed from: g */
    public float[] f3851g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1171e() {
        C2439u c2439u = AbstractC2429k.f7850a;
        this.f3845a = new C2439u();
        this.f3847c = -1L;
        this.f3848d = 0L;
        this.f3849e = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2216a(C1170d c1170d, long j5, long j6, float[] fArr, long j7) {
        long j8 = c1170d.f3843g;
        if (j7 - j8 > 0 || j8 == Long.MIN_VALUE) {
            c1170d.f3843g = j7;
            c1170d.m2214a(c1170d.f3841e, c1170d.f3842f, j5, j6, fArr);
        }
    }
}
