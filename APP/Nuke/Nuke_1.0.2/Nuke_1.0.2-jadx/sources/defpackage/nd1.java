package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nd1 implements c61 {
    public final md1 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nd1(md1 md1Var) {
        this.h = md1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final void C(float[] fArr) {
        this.h.v.C(fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long D(c61 c61Var, long j) {
        boolean z = c61Var instanceof nd1;
        md1 md1Var = this.h;
        if (!z) {
            md1 md1VarZ = t11.z(md1Var);
            zn1 zn1Var = md1VarZ.v;
            long jD = rs1.d(D(md1VarZ.y, j), (4294967295L & ((long) Float.floatToRawIntBits((int) (md1VarZ.w & 4294967295L)))) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!zn1Var.S0().u) {
                kz0.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            zn1Var.b1();
            zn1 zn1Var2 = zn1Var.x;
            if (zn1Var2 != null) {
                zn1Var = zn1Var2;
            }
            return rs1.e(jD, zn1Var.D(c61Var, 0L));
        }
        md1 md1Var2 = ((nd1) c61Var).h;
        zn1 zn1Var3 = md1Var2.v;
        zn1Var3.b1();
        md1 md1VarQ0 = md1Var.v.O0(zn1Var3).Q0();
        if (md1VarQ0 != null) {
            long jB = z01.b(z01.c(md1Var2.K0(md1VarQ0, false), tp0.J(j)), md1Var.K0(md1VarQ0, false));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        md1 md1VarZ2 = t11.z(md1Var2);
        long jC = z01.c(z01.c(md1Var2.K0(md1VarZ2, false), md1VarZ2.w), tp0.J(j));
        md1 md1VarZ3 = t11.z(md1Var);
        long jB2 = z01.b(jC, z01.c(md1Var.K0(md1VarZ3, false), md1VarZ3.w));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L;
        zn1 zn1Var4 = md1VarZ3.v.x;
        zn1Var4.getClass();
        zn1 zn1Var5 = md1VarZ2.v.x;
        zn1Var5.getClass();
        return zn1Var4.D(zn1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final void H(c61 c61Var, float[] fArr) {
        this.h.v.H(c61Var, fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final o62 J(c61 c61Var, boolean z) {
        return this.h.v.J(c61Var, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long L() {
        md1 md1Var = this.h;
        return (((long) md1Var.h) << 32) | (((long) md1Var.i) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long M(long j) {
        return this.h.v.M(rs1.e(j, a()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a() {
        md1 md1Var = this.h;
        md1 md1VarZ = t11.z(md1Var);
        return rs1.d(D(md1VarZ.y, 0L), md1Var.v.D(md1VarZ.v, 0L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long c(long j) {
        return this.h.v.c(rs1.e(0L, a()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long g(long j) {
        return rs1.e(this.h.v.g(j), a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long h(long j) {
        return this.h.v.h(rs1.e(j, a()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final c61 j() {
        md1 md1VarQ0;
        if (!w()) {
            kz0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        zn1 zn1Var = ((zn1) this.h.v.v.M.e).x;
        if (zn1Var == null || (md1VarQ0 = zn1Var.Q0()) == null) {
            return null;
        }
        return md1VarQ0.y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long r(c61 c61Var, long j) {
        return D(c61Var, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final long s(long j) {
        return rs1.e(this.h.v.s(j), a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.c61
    public final boolean w() {
        return this.h.v.S0().u;
    }
}
