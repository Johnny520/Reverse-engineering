package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nw1 extends th1 implements j61, mc0 {
    public cl A;
    public lw1 v;
    public boolean w;
    public rk x;
    public eb y;
    public float z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean N0(long j) {
        return !gr2.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean O0(long j) {
        return !gr2.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int D(kd1 kd1Var, if1 if1Var, int i) {
        if (!M0()) {
            return if1Var.X(i);
        }
        long jP0 = P0(gz.b(0, i, 0, 0, 13));
        return Math.max(fz.i(jP0), if1Var.X(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean M0() {
        return this.w && this.v.d() != 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mc0
    public final void P(t61 t61Var) {
        sp spVar = t61Var.h;
        long jD = this.v.d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(O0(jD) ? Float.intBitsToFloat((int) (jD >> 32)) : Float.intBitsToFloat((int) (spVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(N0(jD) ? Float.intBitsToFloat((int) (jD & 4294967295L)) : Float.intBitsToFloat((int) (spVar.d() & 4294967295L)))) & 4294967295L);
        long jZ = (Float.intBitsToFloat((int) (spVar.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (spVar.d() & 4294967295L)) == 0.0f) ? 0L : op0.z(jFloatToRawIntBits, this.y.v(jFloatToRawIntBits, spVar.d()));
        long jA = this.x.a((((long) Math.round(Float.intBitsToFloat((int) (jZ >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jZ & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (spVar.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (spVar.d() & 4294967295L)))) & 4294967295L), t61Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((n4) spVar.i.i).C(f, f2);
        try {
            this.v.c(t61Var, jZ, this.z, this.A);
            ((n4) spVar.i.i).C(-f, -f2);
            t61Var.a();
        } catch (Throwable th) {
            ((n4) spVar.i.i).C(-f, -f2);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long P0(long j) {
        boolean z = false;
        boolean z2 = fz.d(j) && fz.c(j);
        if (fz.f(j) && fz.e(j)) {
            z = true;
        }
        if ((!M0() && z2) || z) {
            return fz.a(j, fz.h(j), 0, fz.g(j), 0, 10);
        }
        long jD = this.v.d();
        int iRound = O0(jD) ? Math.round(Float.intBitsToFloat((int) (jD >> 32))) : fz.j(j);
        int iRound2 = N0(jD) ? Math.round(Float.intBitsToFloat((int) (jD & 4294967295L))) : fz.i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(gz.f(j, iRound2))) & 4294967295L) | (((long) Float.floatToRawIntBits(gz.g(j, iRound))) << 32);
        if (M0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!O0(this.v.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.v.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!N0(this.v.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.v.d() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : op0.z(jFloatToRawIntBits2, this.y.v(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return fz.a(j, gz.g(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))), 0, gz.f(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))), 0, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int U(kd1 kd1Var, if1 if1Var, int i) {
        if (!M0()) {
            return if1Var.N(i);
        }
        long jP0 = P0(gz.b(0, 0, 0, i, 7));
        return Math.max(fz.j(jP0), if1Var.N(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        sz1 sz1VarE = if1Var.e(P0(j));
        return pf1Var.j0(sz1VarE.h, sz1VarE.i, ce0.h, new n6(sz1VarE, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int g(kd1 kd1Var, if1 if1Var, int i) {
        if (!M0()) {
            return if1Var.W(i);
        }
        long jP0 = P0(gz.b(0, 0, 0, i, 7));
        return Math.max(fz.j(jP0), if1Var.W(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int p(kd1 kd1Var, if1 if1Var, int i) {
        if (!M0()) {
            return if1Var.f(i);
        }
        long jP0 = P0(gz.b(0, i, 0, 0, 13));
        return Math.max(fz.i(jP0), if1Var.f(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PainterModifier(painter=" + this.v + ", sizeToIntrinsics=" + this.w + ", alignment=" + this.x + ", alpha=" + this.z + ", colorFilter=" + this.A + ')';
    }
}
