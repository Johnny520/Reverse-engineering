package p000;

/* JADX INFO: renamed from: nj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0500nj extends th1 implements mc0, os1, on2 {

    /* JADX INFO: renamed from: A */
    public eq2 f7172A;

    /* JADX INFO: renamed from: B */
    public AbstractC0731te f7173B;

    /* JADX INFO: renamed from: v */
    public long f7174v;

    /* JADX INFO: renamed from: w */
    public eq2 f7175w;

    /* JADX INFO: renamed from: x */
    public long f7176x;

    /* JADX INFO: renamed from: y */
    public d61 f7177y;

    /* JADX INFO: renamed from: z */
    public AbstractC0731te f7178z;

    @Override // p000.os1
    /* JADX INFO: renamed from: L */
    public final void mo1847L() {
        this.f7176x = 9205357640488583168L;
        this.f7177y = null;
        this.f7178z = null;
        this.f7172A = null;
        ci0.m788M(this);
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: P */
    public final void mo1851P(t61 t61Var) {
        AbstractC0731te abstractC0731te;
        t61 t61Var2;
        C0915y9 c0915y9;
        t61 t61Var3 = t61Var;
        C0702sp c0702sp = t61Var3.f10581h;
        if (this.f7175w != sp0.f10267h) {
            xi0 xi0Var = xi0.f13041h;
            if (gr2.m2019a(c0702sp.mo3280d(), this.f7176x) && t61Var3.getLayoutDirection() == this.f7177y && t11.m5086l(this.f7172A, this.f7175w)) {
                abstractC0731te = this.f7178z;
                abstractC0731te.getClass();
            } else {
                s11.m4674S(this, new C0640r1(8, this, t61Var3));
                abstractC0731te = this.f7173B;
                this.f7173B = null;
            }
            this.f7178z = abstractC0731te;
            this.f7176x = c0702sp.mo3280d();
            this.f7177y = t61Var3.getLayoutDirection();
            this.f7172A = this.f7175w;
            abstractC0731te.getClass();
            if (!C0363ju.m2566c(this.f7174v, C0363ju.f5217g)) {
                long j = this.f7174v;
                if (abstractC0731te instanceof tv1) {
                    o62 o62Var = ((tv1) abstractC0731te).f10974j;
                    float f = o62Var.f7536a;
                    float f2 = o62Var.f7537b;
                    long jFloatToRawIntBits = Float.floatToRawIntBits(f);
                    long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
                    long jM5294W = AbstractC0738tl.m5294W(o62Var);
                    t61Var2 = t61Var;
                    t61Var2.mo3279c0(j, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), jM5294W, xi0Var, 3);
                } else {
                    t61Var2 = t61Var3;
                    if (abstractC0731te instanceof uv1) {
                        uv1 uv1Var = (uv1) abstractC0731te;
                        c0915y9 = uv1Var.f11515k;
                        if (c0915y9 == null) {
                            db2 db2Var = uv1Var.f11514j;
                            float f3 = db2Var.f1957b;
                            float f4 = db2Var.f1956a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (db2Var.f1963h >> 32));
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                            float f5 = db2Var.f1958c - f4;
                            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(db2Var.f1959d - f3)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
                            long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                            int i = (int) (jFloatToRawIntBits3 >> 32);
                            int i2 = (int) (jFloatToRawIntBits3 & 4294967295L);
                            c0702sp.f10256h.f9667c.mo1521j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (jFloatToRawIntBits4 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jFloatToRawIntBits5 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits5 & 4294967295L)), C0702sp.m4901a(c0702sp, j, xi0Var, 3));
                        }
                    } else {
                        if (!(abstractC0731te instanceof sv1)) {
                            c80.m675s();
                            return;
                        }
                        c0915y9 = ((sv1) abstractC0731te).f10384j;
                    }
                    t61Var2.mo3282t(c0915y9, j, xi0Var);
                }
            }
            t61Var2.m5125a();
        }
        if (!C0363ju.m2566c(this.f7174v, C0363ju.f5217g)) {
            nc0.m3270i0(t61Var, this.f7174v, 0L, 0L, 126);
            t61Var3 = t61Var;
        }
        t61Var2 = t61Var3;
        t61Var2.m5125a();
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: i */
    public final boolean mo1364i() {
        return false;
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: l0 */
    public final void mo232l0(zn2 zn2Var) {
        xn2.m6163c(zn2Var, this.f7175w);
    }
}
