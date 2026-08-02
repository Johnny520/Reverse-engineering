package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vy0 {
    public final am2 a;
    public qy0 b;
    public ty0 c;
    public sy0 d;
    public ry0 e;
    public p40 f;
    public hh1 g;
    public long h = 9205357640488583168L;
    public ms0 i;
    public final dk j;
    public final dk k;
    public long l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vy0(am2 am2Var) {
        this.a = am2Var;
        dk dkVar = new dk((byte) 0, 5);
        dkVar.j = new lk1();
        this.j = dkVar;
        dk dkVar2 = new dk((byte) 0, 8);
        dkVar2.j = new ck1();
        this.k = dkVar2;
        this.l = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(vy0 vy0Var, oy0 oy0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        am2 am2Var = vy0Var.a;
        sy0 sy0Var = vy0Var.d;
        if (sy0Var == null) {
            sy0Var = new sy0();
            sy0Var.n = null;
            sy0Var.o = Long.MAX_VALUE;
            sy0Var.p = false;
            vy0Var.d = sy0Var;
        }
        sy0Var.n = oy0Var;
        sy0Var.o = j;
        ms0 ms0Var = vy0Var.i;
        qv1 qv1Var = am2Var.x;
        if (ms0Var == null) {
            vy0Var.i = new ms0(qv1Var);
        } else {
            ms0Var.b = qv1Var;
            ms0Var.a = j2;
        }
        sy0Var.p = false;
        vy0Var.f = sy0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        qy0 qy0Var = this.b;
        py0 py0Var = py0.j;
        if (qy0Var == null) {
            qy0Var = new qy0();
            qy0Var.n = py0Var;
            qy0Var.o = false;
            this.b = qy0Var;
        }
        qy0Var.n = py0Var;
        qy0Var.o = false;
        this.f = qy0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(oy0 oy0Var, long j, ms0 ms0Var) {
        ry0 ry0Var = this.e;
        if (ry0Var == null) {
            ry0Var = new ry0();
            ry0Var.n = null;
            ry0Var.o = Long.MAX_VALUE;
            this.e = ry0Var;
        }
        ry0Var.n = oy0Var;
        ry0Var.o = j;
        ms0Var.a = 0L;
        this.f = ry0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final hh1 d() {
        hh1 hh1Var = this.g;
        if (hh1Var != null) {
            return hh1Var;
        }
        s.j("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(oy0 oy0Var, ny0 ny0Var, long j) {
        am2 am2Var = this.a;
        long jC = sp0.b0(am2Var).c(0L);
        if (!rs1.b(this.h, 9205357640488583168L) && !rs1.b(jC, this.h)) {
            this.l = rs1.e(this.l, rs1.d(jC, this.h));
        }
        this.h = jC;
        qv1 qv1Var = am2Var.x;
        qv1Var.getClass();
        if (Math.abs(Float.intBitsToFloat((int) (qv1Var == qv1.h ? j & 4294967295L : j >> 32))) > 2.0f) {
            ci0.s(d(), oy0Var, am2Var.x, ny0Var, this.j, this.l);
            dk dkVar = this.k;
            ck1 ck1Var = (ck1) dkVar.j;
            int i = ck1Var.b;
            if (i == 3) {
                int i2 = dkVar.i;
                dkVar.i = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    s.d("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = ck1Var.a;
                    long j2 = jArr[i2];
                    jArr[i2] = j;
                }
            } else {
                ck1Var.a(j);
            }
            if (dkVar.i == 3) {
                dkVar.i = 0;
            }
            long[] jArr2 = ck1Var.a;
            int i3 = ck1Var.b;
            float fIntBitsToFloat = 0.0f;
            float fIntBitsToFloat2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                fIntBitsToFloat2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = ck1Var.b;
            float f = fIntBitsToFloat2 / i5;
            long[] jArr3 = ck1Var.a;
            for (int i6 = 0; i6 < i5; i6++) {
                fIntBitsToFloat += Float.intBitsToFloat((int) (jArr3[i6] & 4294967295L));
            }
            am2Var.W0(new nb0((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / ck1Var.b)) & 4294967295L), true));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(oy0 oy0Var, oy0 oy0Var2, ny0 ny0Var, long j) {
        if (this.g == null) {
            this.g = new hh1(28);
        }
        this.l = 0L;
        hh1 hh1VarD = d();
        am2 am2Var = this.a;
        ci0.s(hh1VarD, oy0Var, am2Var.x, ny0Var, this.j, this.l);
        long jD = rs1.d(ci0.T(oy0Var2, am2Var.x, ny0Var), j);
        am2Var.y.getClass();
        this.h = sp0.b0(am2Var).c(0L);
        am2Var.W0(new ob0(jD));
        dk dkVar = this.k;
        dkVar.i = 0;
        ((ck1) dkVar.j).b = 0;
    }
}
