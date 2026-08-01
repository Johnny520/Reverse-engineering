package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class xn0 implements o70 {

    /* JADX INFO: renamed from: a */
    public final C0399km f7382a;

    /* JADX INFO: renamed from: b */
    public final u50 f7383b;

    /* JADX INFO: renamed from: c */
    public final C0791u5 f7384c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xn0(C0399km c0399km, wn0 wn0Var, C0791u5 c0791u5) {
        this.f7382a = c0399km;
        this.f7383b = wn0Var;
        this.f7384c = c0791u5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.o70
    /* JADX INFO: renamed from: a */
    public final int mo2791a() {
        return this.f7383b.mo3023l().f6134a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.o70
    /* JADX INFO: renamed from: b */
    public final void mo2792b(int i, Object obj, InterfaceC0356ji interfaceC0356ji, int i2) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(-1201380429);
        int i3 = (c0616pi.m3100d(i) ? 4 : 2) | i2 | (c0616pi.m3108h(obj) ? 32 : 16) | (c0616pi.m3104f(this) ? 256 : 128);
        if (c0616pi.m3082O(i3 & 1, (i3 & 147) != 146)) {
            z60.m5431a(obj, i, this.f7382a.f3533B, AbstractC0398kl.m1937w(1142237095, new q80(i, 3, this), c0616pi), c0616pi, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0355jh(this, i, obj, i2, 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.o70
    /* JADX INFO: renamed from: c */
    public final Object mo2793c(int i) {
        C0791u5 c0791u5 = this.f7384c;
        Object[] objArr = (Object[]) c0791u5.f6136c;
        int i2 = i - c0791u5.f6134a;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.f7383b.m4284m(i) : obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.o70
    /* JADX INFO: renamed from: e */
    public final int mo2795e(Object obj) {
        return this.f7384c.m4252c(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn0)) {
            return false;
        }
        return p30.m3002l(this.f7383b, ((xn0) obj).f7383b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7383b.hashCode();
    }
}
