package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g00 extends th1 implements InterfaceC0257gy, qf1 {

    /* JADX INFO: renamed from: A */
    public boolean f3210A;

    /* JADX INFO: renamed from: C */
    public boolean f3212C;

    /* JADX INFO: renamed from: v */
    public qv1 f3213v;

    /* JADX INFO: renamed from: w */
    public final im2 f3214w;

    /* JADX INFO: renamed from: x */
    public boolean f3215x;

    /* JADX INFO: renamed from: y */
    public final wl2 f3216y;

    /* JADX INFO: renamed from: z */
    public final C0429lm f3217z = new C0429lm(0);

    /* JADX INFO: renamed from: B */
    public long f3211B = -1;

    public g00(qv1 qv1Var, im2 im2Var, boolean z, wl2 wl2Var) {
        this.f3213v = qv1Var;
        this.f3214w = im2Var;
        this.f3215x = z;
        this.f3216y = wl2Var;
    }

    /* JADX INFO: renamed from: M0 */
    public static final float m1770M0(g00 g00Var, InterfaceC0815vm interfaceC0815vm, long j) {
        float f;
        o62 o62Var;
        int iCompare;
        long j2 = g00Var.f3211B;
        zk1 zk1Var = g00Var.f3217z.f6190a;
        int i = zk1Var.f13936j - 1;
        Object[] objArr = zk1Var.f13934h;
        if (i < objArr.length) {
            o62Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                o62 o62Var2 = (o62) ((d00) objArr[i]).f1798a.mo6a();
                if (o62Var2 != null) {
                    long jM3515c = o62Var2.m3515c();
                    long jM4715q0 = s11.m4715q0(g00Var.m1772N0());
                    f = 0.0f;
                    int iOrdinal = g00Var.f3213v.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM3515c & 4294967295L)), Float.intBitsToFloat((int) (jM4715q0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            c80.m675s();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM3515c >> 32)), Float.intBitsToFloat((int) (jM4715q0 >> 32)));
                    }
                    if (iCompare <= 0) {
                        o62Var = o62Var2;
                    } else if (o62Var == null) {
                        o62Var = o62Var2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            o62Var = null;
        }
        if (o62Var == null) {
            o62 o62Var3 = g00Var.f3210A ? (o62) g00Var.f3216y.mo6a() : null;
            if (o62Var3 == null) {
                return f;
            }
            o62Var = o62Var3;
        }
        long jM4715q02 = s11.m4715q0(j2);
        int iOrdinal2 = g00Var.f3213v.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = o62Var.f7537b;
            return interfaceC0815vm.mo5716a(f2 - ((int) (j & 4294967295L)), o62Var.f7539d - f2, Float.intBitsToFloat((int) (jM4715q02 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = o62Var.f7536a;
            return interfaceC0815vm.mo5716a(f3 - ((int) (j >> 32)), o62Var.f7538c - f3, Float.intBitsToFloat((int) (jM4715q02 >> 32)));
        }
        c80.m675s();
        return f;
    }

    /* JADX INFO: renamed from: O0 */
    public static boolean m1771O0(g00 g00Var, o62 o62Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = g00Var.m1772N0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jM1774Q0 = g00Var.m1774Q0(o62Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jM1774Q0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM1774Q0 & 4294967295L))) <= 0.5f;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    /* JADX INFO: renamed from: N0 */
    public final long m1772N0() {
        long j = this.f3211B;
        if (h11.m2041a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m1773P0(long j) {
        C0478my c0478my = AbstractC0891xm.f13076a;
        InterfaceC0815vm interfaceC0815vm = (InterfaceC0815vm) p40.m3733p(this, c0478my);
        if (this.f3212C) {
            nz0.m3458c("launchAnimation called when previous animation was running");
        }
        ((InterfaceC0815vm) p40.m3733p(this, c0478my)).getClass();
        InterfaceC0815vm.f12014a.getClass();
        AbstractC0570p7.m3745A(m5255A0(), null, new f00(this, new p83(C0778um.f11359b), interfaceC0815vm, j, null), 1);
    }

    /* JADX INFO: renamed from: Q0 */
    public final long m1774Q0(o62 o62Var, long j, long j2) {
        long jM4715q0 = s11.m4715q0(j);
        int iOrdinal = this.f3213v.ordinal();
        if (iOrdinal == 0) {
            InterfaceC0815vm interfaceC0815vm = (InterfaceC0815vm) p40.m3733p(this, AbstractC0891xm.f13076a);
            float f = o62Var.f7537b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(interfaceC0815vm.mo5716a(f - ((int) (j2 & 4294967295L)), o62Var.f7539d - f, Float.intBitsToFloat((int) (jM4715q0 & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            c80.m675s();
            return 0L;
        }
        InterfaceC0815vm interfaceC0815vm2 = (InterfaceC0815vm) p40.m3733p(this, AbstractC0891xm.f13076a);
        float f2 = o62Var.f7536a;
        return (((long) Float.floatToRawIntBits(interfaceC0815vm2.mo5716a(f2 - ((int) (j2 >> 32)), o62Var.f7538c - f2, Float.intBitsToFloat((int) (jM4715q0 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    @Override // p000.qf1
    /* JADX INFO: renamed from: c */
    public final void mo99c(long j) {
        int iM5089o;
        long jM1772N0 = m1772N0();
        this.f3211B = j;
        int iOrdinal = this.f3213v.ordinal();
        if (iOrdinal == 0) {
            iM5089o = t11.m5089o((int) (j & 4294967295L), (int) (jM1772N0 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                c80.m675s();
                return;
            }
            iM5089o = t11.m5089o((int) (j >> 32), (int) (jM1772N0 >> 32));
        }
        if (iM5089o >= 0) {
            return;
        }
        long j2 = !this.f3215x ? this.f3213v == qv1.f9205h ? ((long) (((int) (jM1772N0 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jM1772N0 >> 32)) - ((int) (j >> 32)))) << 32 : 0L;
        o62 o62Var = (o62) this.f3216y.mo6a();
        if (o62Var == null || this.f3212C || this.f3210A || !m1771O0(this, o62Var, jM1772N0, 0L, 2) || m1771O0(this, o62Var, 0L, j2, 1)) {
            return;
        }
        this.f3210A = true;
        m1773P0(j2);
    }
}
