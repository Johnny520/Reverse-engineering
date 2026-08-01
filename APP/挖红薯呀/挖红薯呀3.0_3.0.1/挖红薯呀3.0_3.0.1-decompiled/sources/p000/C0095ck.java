package p000;

/* JADX INFO: renamed from: ck */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0095ck extends oe0 implements InterfaceC1005zi, g50 {

    /* JADX INFO: renamed from: r */
    public um0 f831r;

    /* JADX INFO: renamed from: s */
    public final lz0 f832s;

    /* JADX INFO: renamed from: t */
    public boolean f833t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0386kb f834u;

    /* JADX INFO: renamed from: v */
    public final zy0 f835v;

    /* JADX INFO: renamed from: x */
    public boolean f837x;

    /* JADX INFO: renamed from: z */
    public boolean f839z;

    /* JADX INFO: renamed from: w */
    public final C0166eb f836w = new C0166eb(0);

    /* JADX INFO: renamed from: y */
    public long f838y = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0095ck(um0 um0Var, lz0 lz0Var, boolean z, InterfaceC0386kb interfaceC0386kb, zy0 zy0Var) {
        this.f831r = um0Var;
        this.f832s = lz0Var;
        this.f833t = z;
        this.f834u = interfaceC0386kb;
        this.f835v = zy0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static final float m545w0(C0095ck c0095ck, InterfaceC0386kb interfaceC0386kb, long j) {
        float f;
        st0 st0Var;
        int iCompare;
        if (d30.m628a(c0095ck.f838y, 0L)) {
            return 0.0f;
        }
        sh0 sh0Var = c0095ck.f836w.f1367a;
        int i = sh0Var.f5770f - 1;
        Object[] objArr = sh0Var.f5768d;
        if (i < objArr.length) {
            st0Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                st0 st0Var2 = (st0) ((C0965yj) objArr[i]).f7650a.invoke();
                if (st0Var2 != null) {
                    long jM4102b = st0Var2.m4102b();
                    long jM2759C = o30.m2759C(c0095ck.f838y);
                    f = 0.0f;
                    int iOrdinal = c0095ck.f831r.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM4102b & 4294967295L)), Float.intBitsToFloat((int) (jM2759C & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            C0921xc.m5129j();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM4102b >> 32)), Float.intBitsToFloat((int) (jM2759C >> 32)));
                    }
                    if (iCompare <= 0) {
                        st0Var = st0Var2;
                    } else if (st0Var == null) {
                        st0Var = st0Var2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            st0Var = null;
        }
        if (st0Var == null) {
            st0 st0Var3 = c0095ck.f837x ? (st0) c0095ck.f835v.invoke() : null;
            if (st0Var3 == null) {
                return f;
            }
            st0Var = st0Var3;
        }
        long jM2759C2 = o30.m2759C(c0095ck.f838y);
        int iOrdinal2 = c0095ck.f831r.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = st0Var.f5833b;
            return interfaceC0386kb.mo1782a(f2 - ((int) (j & 4294967295L)), st0Var.f5835d - f2, Float.intBitsToFloat((int) (jM2759C2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = st0Var.f5832a;
            return interfaceC0386kb.mo1782a(f3 - ((int) (j >> 32)), st0Var.f5834c - f3, Float.intBitsToFloat((int) (jM2759C2 >> 32)));
        }
        C0921xc.m5129j();
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public static boolean m546x0(C0095ck c0095ck, st0 st0Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = c0095ck.f838y;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jM550z0 = c0095ck.m550z0(st0Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jM550z0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM550z0 & 4294967295L))) <= 0.5f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.g50
    /* JADX INFO: renamed from: l */
    public final void mo547l(long j) {
        int iM3008r;
        long j2 = this.f838y;
        this.f838y = j;
        int iOrdinal = this.f831r.ordinal();
        if (iOrdinal == 0) {
            iM3008r = p30.m3008r((int) (j & 4294967295L), (int) (j2 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                C0921xc.m5129j();
                return;
            }
            iM3008r = p30.m3008r((int) (j >> 32), (int) (j2 >> 32));
        }
        if (iM3008r >= 0) {
            return;
        }
        long j3 = !this.f833t ? this.f831r == um0.f6264d ? ((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32 : 0L;
        st0 st0Var = (st0) this.f835v.invoke();
        if (st0Var == null || this.f839z || this.f837x || !m546x0(this, st0Var, j2, 0L, 2) || m546x0(this, st0Var, 0L, j3, 1)) {
            return;
        }
        this.f837x = true;
        m549y0(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public final void m549y0(long j) {
        InterfaceC0386kb interfaceC0386kb = this.f834u;
        if (interfaceC0386kb == null) {
            interfaceC0386kb = (InterfaceC0386kb) pf1.m3058r(this, AbstractC0468mb.f3908a);
        }
        InterfaceC0386kb interfaceC0386kb2 = interfaceC0386kb;
        if (this.f839z) {
            z10.m5363c("launchAnimation called when previous animation was running");
        }
        InterfaceC0386kb interfaceC0386kb3 = this.f834u;
        if (interfaceC0386kb3 == null) {
            interfaceC0386kb3 = (InterfaceC0386kb) pf1.m3058r(this, AbstractC0468mb.f3908a);
        }
        interfaceC0386kb3.getClass();
        InterfaceC0386kb.f3057a.getClass();
        AbstractC0307i4.m1547w(m2879k0(), null, new C0058bk(this, new va1(C0349jb.f2783b), interfaceC0386kb2, j, null), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public final long m550z0(st0 st0Var, long j, long j2) {
        long jM2759C = o30.m2759C(j);
        int iOrdinal = this.f831r.ordinal();
        if (iOrdinal == 0) {
            InterfaceC0386kb interfaceC0386kb = this.f834u;
            if (interfaceC0386kb == null) {
                interfaceC0386kb = (InterfaceC0386kb) pf1.m3058r(this, AbstractC0468mb.f3908a);
            }
            float f = st0Var.f5833b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(interfaceC0386kb.mo1782a(f - ((int) (j2 & 4294967295L)), st0Var.f5835d - f, Float.intBitsToFloat((int) (jM2759C & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            C0921xc.m5129j();
            return 0L;
        }
        InterfaceC0386kb interfaceC0386kb2 = this.f834u;
        if (interfaceC0386kb2 == null) {
            interfaceC0386kb2 = (InterfaceC0386kb) pf1.m3058r(this, AbstractC0468mb.f3908a);
        }
        float f2 = st0Var.f5832a;
        return (((long) Float.floatToRawIntBits(interfaceC0386kb2.mo1782a(f2 - ((int) (j2 >> 32)), st0Var.f5834c - f2, Float.intBitsToFloat((int) (jM2759C >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
