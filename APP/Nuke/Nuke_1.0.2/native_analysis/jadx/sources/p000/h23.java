package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h23 {

    /* JADX INFO: renamed from: a */
    public final zj1 f3801a;

    /* JADX INFO: renamed from: b */
    public g23 f3802b;

    /* JADX INFO: renamed from: c */
    public long f3803c;

    /* JADX INFO: renamed from: d */
    public long f3804d;

    /* JADX INFO: renamed from: e */
    public long f3805e;

    /* JADX INFO: renamed from: f */
    public long f3806f;

    /* JADX INFO: renamed from: g */
    public float[] f3807g;

    public h23() {
        zj1 zj1Var = y01.f13265a;
        this.f3801a = new zj1();
        this.f3803c = -1L;
        this.f3804d = 0L;
        this.f3805e = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final void m2044a(g23 g23Var, long j, long j2, float[] fArr, long j3) {
        long j4 = g23Var.f3291g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            g23Var.f3291g = j3;
            g23Var.m1789a(g23Var.f3289e, g23Var.f3290f, j, j2, fArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2045b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (z01.m6371a(j2, this.f3804d)) {
            z = false;
        } else {
            this.f3804d = j2;
            z = true;
        }
        if (!z01.m6371a(j, this.f3805e)) {
            this.f3805e = j;
            z = true;
        }
        if (fArr != null) {
            this.f3807g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f3806f) {
            return z;
        }
        this.f3806f = j3;
        return true;
    }
}
