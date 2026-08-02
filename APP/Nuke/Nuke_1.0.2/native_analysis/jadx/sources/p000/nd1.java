package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nd1 implements c61 {

    /* JADX INFO: renamed from: h */
    public final md1 f7110h;

    public nd1(md1 md1Var) {
        this.f7110h = md1Var;
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: C */
    public final void mo641C(float[] fArr) {
        this.f7110h.f6572v.mo641C(fArr);
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: D */
    public final long mo642D(c61 c61Var, long j) {
        boolean z = c61Var instanceof nd1;
        md1 md1Var = this.f7110h;
        if (!z) {
            md1 md1VarM5100z = t11.m5100z(md1Var);
            zn1 zn1Var = md1VarM5100z.f6572v;
            long jM4611d = rs1.m4611d(mo642D(md1VarM5100z.f6575y, j), (4294967295L & ((long) Float.floatToRawIntBits((int) (md1VarM5100z.f6573w & 4294967295L)))) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!zn1Var.mo2843S0().f10770u) {
                kz0.m2764b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            zn1Var.m6459b1();
            zn1 zn1Var2 = zn1Var.f13987x;
            if (zn1Var2 != null) {
                zn1Var = zn1Var2;
            }
            return rs1.m4612e(jM4611d, zn1Var.mo642D(c61Var, 0L));
        }
        md1 md1Var2 = ((nd1) c61Var).f7110h;
        zn1 zn1Var3 = md1Var2.f6572v;
        zn1Var3.m6459b1();
        md1 md1VarMo2842Q0 = md1Var.f6572v.m6449O0(zn1Var3).mo2842Q0();
        if (md1VarMo2842Q0 != null) {
            long jM6372b = z01.m6372b(z01.m6373c(md1Var2.m3064K0(md1VarMo2842Q0, false), tp0.m5346J(j)), md1Var.m3064K0(md1VarMo2842Q0, false));
            return (((long) Float.floatToRawIntBits((int) (jM6372b >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM6372b & 4294967295L))) & 4294967295L);
        }
        md1 md1VarM5100z2 = t11.m5100z(md1Var2);
        long jM6373c = z01.m6373c(z01.m6373c(md1Var2.m3064K0(md1VarM5100z2, false), md1VarM5100z2.f6573w), tp0.m5346J(j));
        md1 md1VarM5100z3 = t11.m5100z(md1Var);
        long jM6372b2 = z01.m6372b(jM6373c, z01.m6373c(md1Var.m3064K0(md1VarM5100z3, false), md1VarM5100z3.f6573w));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM6372b2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jM6372b2 & 4294967295L))) & 4294967295L;
        zn1 zn1Var4 = md1VarM5100z3.f6572v.f13987x;
        zn1Var4.getClass();
        zn1 zn1Var5 = md1VarM5100z2.f6572v.f13987x;
        zn1Var5.getClass();
        return zn1Var4.mo642D(zn1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: H */
    public final void mo643H(c61 c61Var, float[] fArr) {
        this.f7110h.f6572v.mo643H(c61Var, fArr);
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: J */
    public final o62 mo644J(c61 c61Var, boolean z) {
        return this.f7110h.f6572v.mo644J(c61Var, z);
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: L */
    public final long mo645L() {
        md1 md1Var = this.f7110h;
        return (((long) md1Var.f10438h) << 32) | (((long) md1Var.f10439i) & 4294967295L);
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: M */
    public final long mo646M(long j) {
        return this.f7110h.f6572v.mo646M(rs1.m4612e(j, m3285a()));
    }

    /* JADX INFO: renamed from: a */
    public final long m3285a() {
        md1 md1Var = this.f7110h;
        md1 md1VarM5100z = t11.m5100z(md1Var);
        return rs1.m4611d(mo642D(md1VarM5100z.f6575y, 0L), md1Var.f6572v.mo642D(md1VarM5100z.f6572v, 0L));
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: c */
    public final long mo647c(long j) {
        return this.f7110h.f6572v.mo647c(rs1.m4612e(0L, m3285a()));
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: g */
    public final long mo648g(long j) {
        return rs1.m4612e(this.f7110h.f6572v.mo648g(j), m3285a());
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: h */
    public final long mo649h(long j) {
        return this.f7110h.f6572v.mo649h(rs1.m4612e(j, m3285a()));
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: j */
    public final c61 mo650j() {
        md1 md1VarMo2842Q0;
        if (!mo653w()) {
            kz0.m2764b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        zn1 zn1Var = ((zn1) this.f7110h.f6572v.f13985v.f9372M.f12034e).f13987x;
        if (zn1Var == null || (md1VarMo2842Q0 = zn1Var.mo2842Q0()) == null) {
            return null;
        }
        return md1VarMo2842Q0.f6575y;
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: r */
    public final long mo651r(c61 c61Var, long j) {
        return mo642D(c61Var, j);
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: s */
    public final long mo652s(long j) {
        return rs1.m4612e(this.f7110h.f6572v.mo652s(j), m3285a());
    }

    @Override // p000.c61
    /* JADX INFO: renamed from: w */
    public final boolean mo653w() {
        return this.f7110h.f6572v.mo2843S0().f10770u;
    }
}
