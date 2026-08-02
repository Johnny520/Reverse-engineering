package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g00 extends th1 implements gy, qf1 {
    public boolean A;
    public boolean C;
    public qv1 v;
    public final im2 w;
    public boolean x;
    public final wl2 y;
    public final lm z = new lm(0);
    public long B = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g00(qv1 qv1Var, im2 im2Var, boolean z, wl2 wl2Var) {
        this.v = qv1Var;
        this.w = im2Var;
        this.x = z;
        this.y = wl2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float M0(g00 g00Var, vm vmVar, long j) {
        float f;
        o62 o62Var;
        int iCompare;
        long j2 = g00Var.B;
        zk1 zk1Var = g00Var.z.a;
        int i = zk1Var.j - 1;
        Object[] objArr = zk1Var.h;
        if (i < objArr.length) {
            o62Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                o62 o62Var2 = (o62) ((d00) objArr[i]).a.a();
                if (o62Var2 != null) {
                    long jC = o62Var2.c();
                    long jQ0 = s11.q0(g00Var.N0());
                    f = 0.0f;
                    int iOrdinal = g00Var.v.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jQ0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            c80.s();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jQ0 >> 32)));
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
            o62 o62Var3 = g00Var.A ? (o62) g00Var.y.a() : null;
            if (o62Var3 == null) {
                return f;
            }
            o62Var = o62Var3;
        }
        long jQ02 = s11.q0(j2);
        int iOrdinal2 = g00Var.v.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = o62Var.b;
            return vmVar.a(f2 - ((int) (j & 4294967295L)), o62Var.d - f2, Float.intBitsToFloat((int) (jQ02 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = o62Var.a;
            return vmVar.a(f3 - ((int) (j >> 32)), o62Var.c - f3, Float.intBitsToFloat((int) (jQ02 >> 32)));
        }
        c80.s();
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean O0(g00 g00Var, o62 o62Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = g00Var.N0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jQ0 = g00Var.Q0(o62Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jQ0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jQ0 & 4294967295L))) <= 0.5f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long N0() {
        long j = this.B;
        if (h11.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P0(long j) {
        my myVar = xm.a;
        vm vmVar = (vm) p40.p(this, myVar);
        if (this.C) {
            nz0.c("launchAnimation called when previous animation was running");
        }
        ((vm) p40.p(this, myVar)).getClass();
        vm.a.getClass();
        p7.A(A0(), null, new f00(this, new p83(um.b), vmVar, j, null), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long Q0(o62 o62Var, long j, long j2) {
        long jQ0 = s11.q0(j);
        int iOrdinal = this.v.ordinal();
        if (iOrdinal == 0) {
            vm vmVar = (vm) p40.p(this, xm.a);
            float f = o62Var.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(vmVar.a(f - ((int) (j2 & 4294967295L)), o62Var.d - f, Float.intBitsToFloat((int) (jQ0 & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            c80.s();
            return 0L;
        }
        vm vmVar2 = (vm) p40.p(this, xm.a);
        float f2 = o62Var.a;
        return (((long) Float.floatToRawIntBits(vmVar2.a(f2 - ((int) (j2 >> 32)), o62Var.c - f2, Float.intBitsToFloat((int) (jQ0 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qf1
    public final void c(long j) {
        int iO;
        long jN0 = N0();
        this.B = j;
        int iOrdinal = this.v.ordinal();
        if (iOrdinal == 0) {
            iO = t11.o((int) (j & 4294967295L), (int) (jN0 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                c80.s();
                return;
            }
            iO = t11.o((int) (j >> 32), (int) (jN0 >> 32));
        }
        if (iO >= 0) {
            return;
        }
        long j2 = !this.x ? this.v == qv1.h ? ((long) (((int) (jN0 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jN0 >> 32)) - ((int) (j >> 32)))) << 32 : 0L;
        o62 o62Var = (o62) this.y.a();
        if (o62Var == null || this.C || this.A || !O0(this, o62Var, jN0, 0L, 2) || O0(this, o62Var, 0L, j2, 1)) {
            return;
        }
        this.A = true;
        P0(j2);
    }
}
