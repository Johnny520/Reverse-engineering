package p000;

/* JADX INFO: renamed from: t9 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0756t9 extends oe0 implements InterfaceC0775tq, mk0, vz0 {

    /* JADX INFO: renamed from: r */
    public long f5955r;

    /* JADX INFO: renamed from: s */
    public x01 f5956s;

    /* JADX INFO: renamed from: t */
    public long f5957t;

    /* JADX INFO: renamed from: u */
    public k50 f5958u;

    /* JADX INFO: renamed from: v */
    public v50 f5959v;

    /* JADX INFO: renamed from: w */
    public x01 f5960w;

    /* JADX INFO: renamed from: x */
    public v50 f5961x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0775tq
    /* JADX INFO: renamed from: B */
    public final void mo1679B(d60 d60Var) {
        v50 v50Var;
        d60 d60Var2;
        C0118d6 c0118d6;
        d60 d60Var3 = d60Var;
        C0125dd c0125dd = d60Var3.f976d;
        if (this.f5956s != pf1.f4843i) {
            C0664qt c0664qt = C0664qt.f5220Q;
            if (q11.m3185a(c0125dd.mo649c(), this.f5957t) && d60Var3.getLayoutDirection() == this.f5958u && p30.m3002l(this.f5960w, this.f5956s)) {
                v50Var = this.f5959v;
                v50Var.getClass();
            } else {
                r60.m3420v(this, new C0081c7(1, this, d60Var3));
                v50Var = this.f5961x;
                this.f5961x = null;
            }
            this.f5959v = v50Var;
            this.f5957t = c0125dd.mo649c();
            this.f5958u = d60Var3.getLayoutDirection();
            this.f5960w = this.f5956s;
            v50Var.getClass();
            if (!C0207ff.m1094c(this.f5955r, C0207ff.f1707g)) {
                long j = this.f5955r;
                if (v50Var instanceof xm0) {
                    st0 st0Var = ((xm0) v50Var).f7375a;
                    float f = st0Var.f5832a;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(st0Var.f5833b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                    float f2 = st0Var.f5834c - st0Var.f5832a;
                    d60Var2 = d60Var;
                    d60Var2.mo639C(j, jFloatToRawIntBits, (4294967295L & ((long) Float.floatToRawIntBits(st0Var.f5835d - st0Var.f5833b))) | (Float.floatToRawIntBits(f2) << 32), c0664qt, 3);
                } else {
                    d60Var2 = d60Var3;
                    if (v50Var instanceof ym0) {
                        ym0 ym0Var = (ym0) v50Var;
                        c0118d6 = ym0Var.f7658b;
                        if (c0118d6 == null) {
                            bw0 bw0Var = ym0Var.f7657a;
                            float f3 = bw0Var.f597b;
                            float f4 = bw0Var.f596a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (bw0Var.f603h >> 32));
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                            float f5 = bw0Var.f598c - f4;
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(bw0Var.f599d - f3)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
                            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                            int i = (int) (jFloatToRawIntBits2 >> 32);
                            int i2 = (int) (jFloatToRawIntBits2 & 4294967295L);
                            c0125dd.f1052d.f789c.mo242h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits4 & 4294967295L)), C0125dd.m681a(c0125dd, j, c0664qt, 3));
                        }
                    } else {
                        if (!(v50Var instanceof wm0)) {
                            C0921xc.m5129j();
                            return;
                        }
                        c0118d6 = ((wm0) v50Var).f7150a;
                    }
                    d60Var2.m651e(c0118d6, j, c0664qt);
                }
            }
            d60Var2.m648a();
        }
        if (!C0207ff.m1094c(this.f5955r, C0207ff.f1707g)) {
            InterfaceC0812uq.m4339v(d60Var, this.f5955r, 0L, 126);
            d60Var3 = d60Var;
        }
        d60Var2 = d60Var3;
        d60Var2.m648a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: S */
    public final void mo757S(f01 f01Var) {
        d01.m621b(f01Var, this.f5956s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: e */
    public final boolean mo2008e() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mk0
    /* JADX INFO: renamed from: z */
    public final void mo734z() {
        this.f5957t = 9205357640488583168L;
        this.f5958u = null;
        this.f5959v = null;
        this.f5960w = null;
        AbstractC0398kl.m1932r(this);
    }
}
