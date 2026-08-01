package p000;

/* JADX INFO: renamed from: s9 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
final class C0718s9 extends te0 {

    /* JADX INFO: renamed from: a */
    public final long f5690a;

    /* JADX INFO: renamed from: b */
    public final float f5691b = 1.0f;

    /* JADX INFO: renamed from: c */
    public final x01 f5692c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0718s9(long j, x01 x01Var) {
        this.f5690a = j;
        this.f5692c = x01Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: e */
    public final oe0 mo228e() {
        C0756t9 c0756t9 = new C0756t9();
        c0756t9.f5955r = this.f5690a;
        c0756t9.f5956s = this.f5692c;
        c0756t9.f5957t = 9205357640488583168L;
        return c0756t9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        C0718s9 c0718s9 = obj instanceof C0718s9 ? (C0718s9) obj : null;
        return c0718s9 != null && C0207ff.m1094c(this.f5690a, c0718s9.f5690a) && this.f5691b == c0718s9.f5691b && p30.m3002l(this.f5692c, c0718s9.f5692c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.te0
    /* JADX INFO: renamed from: f */
    public final void mo229f(oe0 oe0Var) {
        C0756t9 c0756t9 = (C0756t9) oe0Var;
        c0756t9.f5955r = this.f5690a;
        x01 x01Var = c0756t9.f5956s;
        x01 x01Var2 = this.f5692c;
        if (!p30.m3002l(x01Var, x01Var2)) {
            c0756t9.f5956s = x01Var2;
            z60.m5417D(c0756t9);
        }
        AbstractC0398kl.m1932r(c0756t9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = C0207ff.f1708h;
        return this.f5692c.hashCode() + AbstractC0748t1.m4143a(this.f5691b, Long.hashCode(this.f5690a) * 961, 31);
    }
}
