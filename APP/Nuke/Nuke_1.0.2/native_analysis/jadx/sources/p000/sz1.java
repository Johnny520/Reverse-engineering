package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sz1 {

    /* JADX INFO: renamed from: h */
    public int f10438h;

    /* JADX INFO: renamed from: i */
    public int f10439i;

    /* JADX INFO: renamed from: j */
    public long f10440j = 0;

    /* JADX INFO: renamed from: k */
    public long f10441k = tz1.f11010a;

    /* JADX INFO: renamed from: l */
    public long f10442l = 0;

    /* JADX INFO: renamed from: Z */
    public int mo3069Z() {
        return (int) (this.f10440j & 4294967295L);
    }

    /* JADX INFO: renamed from: b0 */
    public int mo3071b0() {
        return (int) (this.f10440j >> 32);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m5045e0() {
        this.f10438h = ci0.m779D((int) (this.f10440j >> 32), C0221fz.m1765j(this.f10441k), C0221fz.m1763h(this.f10441k));
        int iM779D = ci0.m779D((int) (this.f10440j & 4294967295L), C0221fz.m1764i(this.f10441k), C0221fz.m1762g(this.f10441k));
        this.f10439i = iM779D;
        int i = this.f10438h;
        long j = this.f10440j;
        this.f10442l = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM779D - ((int) (j & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: f0 */
    public abstract void mo2506f0(long j, float f, in0 in0Var);

    /* JADX INFO: renamed from: g0 */
    public final void m5046g0(long j) {
        if (h11.m2041a(this.f10440j, j)) {
            return;
        }
        this.f10440j = j;
        m5045e0();
    }

    /* JADX INFO: renamed from: i */
    public Object mo2342i() {
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m5047k0(long j) {
        if (C0221fz.m1757b(this.f10441k, j)) {
            return;
        }
        this.f10441k = j;
        m5045e0();
    }
}
