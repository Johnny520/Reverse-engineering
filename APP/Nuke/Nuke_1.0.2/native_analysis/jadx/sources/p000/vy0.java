package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vy0 {

    /* JADX INFO: renamed from: a */
    public final am2 f12212a;

    /* JADX INFO: renamed from: b */
    public qy0 f12213b;

    /* JADX INFO: renamed from: c */
    public ty0 f12214c;

    /* JADX INFO: renamed from: d */
    public sy0 f12215d;

    /* JADX INFO: renamed from: e */
    public ry0 f12216e;

    /* JADX INFO: renamed from: f */
    public p40 f12217f;

    /* JADX INFO: renamed from: g */
    public hh1 f12218g;

    /* JADX INFO: renamed from: h */
    public long f12219h = 9205357640488583168L;

    /* JADX INFO: renamed from: i */
    public ms0 f12220i;

    /* JADX INFO: renamed from: j */
    public final C0133dk f12221j;

    /* JADX INFO: renamed from: k */
    public final C0133dk f12222k;

    /* JADX INFO: renamed from: l */
    public long f12223l;

    public vy0(am2 am2Var) {
        this.f12212a = am2Var;
        C0133dk c0133dk = new C0133dk((byte) 0, 5);
        c0133dk.f2082j = new lk1();
        this.f12221j = c0133dk;
        C0133dk c0133dk2 = new C0133dk((byte) 0, 8);
        c0133dk2.f2082j = new ck1();
        this.f12222k = c0133dk2;
        this.f12223l = 0L;
    }

    /* JADX INFO: renamed from: c */
    public static void m5805c(vy0 vy0Var, oy0 oy0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        am2 am2Var = vy0Var.f12212a;
        sy0 sy0Var = vy0Var.f12215d;
        if (sy0Var == null) {
            sy0Var = new sy0();
            sy0Var.f10418n = null;
            sy0Var.f10419o = Long.MAX_VALUE;
            sy0Var.f10420p = false;
            vy0Var.f12215d = sy0Var;
        }
        sy0Var.f10418n = oy0Var;
        sy0Var.f10419o = j;
        ms0 ms0Var = vy0Var.f12220i;
        qv1 qv1Var = am2Var.f284x;
        if (ms0Var == null) {
            vy0Var.f12220i = new ms0(qv1Var);
        } else {
            ms0Var.f6809b = qv1Var;
            ms0Var.f6808a = j2;
        }
        sy0Var.f10420p = false;
        vy0Var.f12217f = sy0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m5806a() {
        qy0 qy0Var = this.f12213b;
        py0 py0Var = py0.f8645j;
        if (qy0Var == null) {
            qy0Var = new qy0();
            qy0Var.f9285n = py0Var;
            qy0Var.f9286o = false;
            this.f12213b = qy0Var;
        }
        qy0Var.f9285n = py0Var;
        qy0Var.f9286o = false;
        this.f12217f = qy0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m5807b(oy0 oy0Var, long j, ms0 ms0Var) {
        ry0 ry0Var = this.f12216e;
        if (ry0Var == null) {
            ry0Var = new ry0();
            ry0Var.f9820n = null;
            ry0Var.f9821o = Long.MAX_VALUE;
            this.f12216e = ry0Var;
        }
        ry0Var.f9820n = oy0Var;
        ry0Var.f9821o = j;
        ms0Var.f6808a = 0L;
        this.f12217f = ry0Var;
    }

    /* JADX INFO: renamed from: d */
    public final hh1 m5808d() {
        hh1 hh1Var = this.f12218g;
        if (hh1Var != null) {
            return hh1Var;
        }
        C0676s.m4651j("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m5809e(oy0 oy0Var, ny0 ny0Var, long j) {
        am2 am2Var = this.f12212a;
        long jMo647c = sp0.m4931b0(am2Var).mo647c(0L);
        if (!rs1.m4609b(this.f12219h, 9205357640488583168L) && !rs1.m4609b(jMo647c, this.f12219h)) {
            this.f12223l = rs1.m4612e(this.f12223l, rs1.m4611d(jMo647c, this.f12219h));
        }
        this.f12219h = jMo647c;
        qv1 qv1Var = am2Var.f284x;
        qv1Var.getClass();
        if (Math.abs(Float.intBitsToFloat((int) (qv1Var == qv1.f9205h ? j & 4294967295L : j >> 32))) > 2.0f) {
            ci0.m818s(m5808d(), oy0Var, am2Var.f284x, ny0Var, this.f12221j, this.f12223l);
            C0133dk c0133dk = this.f12222k;
            ck1 ck1Var = (ck1) c0133dk.f2082j;
            int i = ck1Var.f1599b;
            if (i == 3) {
                int i2 = c0133dk.f2081i;
                c0133dk.f2081i = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    C0676s.m4646d("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = ck1Var.f1598a;
                    long j2 = jArr[i2];
                    jArr[i2] = j;
                }
            } else {
                ck1Var.m848a(j);
            }
            if (c0133dk.f2081i == 3) {
                c0133dk.f2081i = 0;
            }
            long[] jArr2 = ck1Var.f1598a;
            int i3 = ck1Var.f1599b;
            float fIntBitsToFloat = 0.0f;
            float fIntBitsToFloat2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                fIntBitsToFloat2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = ck1Var.f1599b;
            float f = fIntBitsToFloat2 / i5;
            long[] jArr3 = ck1Var.f1598a;
            for (int i6 = 0; i6 < i5; i6++) {
                fIntBitsToFloat += Float.intBitsToFloat((int) (jArr3[i6] & 4294967295L));
            }
            am2Var.m220W0(new nb0((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / ck1Var.f1599b)) & 4294967295L), true));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5810f(oy0 oy0Var, oy0 oy0Var2, ny0 ny0Var, long j) {
        if (this.f12218g == null) {
            this.f12218g = new hh1(28);
        }
        this.f12223l = 0L;
        hh1 hh1VarM5808d = m5808d();
        am2 am2Var = this.f12212a;
        ci0.m818s(hh1VarM5808d, oy0Var, am2Var.f284x, ny0Var, this.f12221j, this.f12223l);
        long jM4611d = rs1.m4611d(ci0.m795T(oy0Var2, am2Var.f284x, ny0Var), j);
        am2Var.f285y.getClass();
        this.f12219h = sp0.m4931b0(am2Var).mo647c(0L);
        am2Var.m220W0(new ob0(jM4611d));
        C0133dk c0133dk = this.f12222k;
        c0133dk.f2081i = 0;
        ((ck1) c0133dk.f2082j).f1599b = 0;
    }
}
