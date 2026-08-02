package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nw1 extends th1 implements j61, mc0 {

    /* JADX INFO: renamed from: A */
    public C0095cl f7349A;

    /* JADX INFO: renamed from: v */
    public lw1 f7350v;

    /* JADX INFO: renamed from: w */
    public boolean f7351w;

    /* JADX INFO: renamed from: x */
    public C0659rk f7352x;

    /* JADX INFO: renamed from: y */
    public C0160eb f7353y;

    /* JADX INFO: renamed from: z */
    public float f7354z;

    /* JADX INFO: renamed from: N0 */
    public static boolean m3452N0(long j) {
        return !gr2.m2019a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: O0 */
    public static boolean m3453O0(long j) {
        return !gr2.m2019a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: D */
    public final int mo2360D(kd1 kd1Var, if1 if1Var, int i) {
        if (!m3454M0()) {
            return if1Var.mo2339X(i);
        }
        long jM3455P0 = m3455P0(AbstractC0258gz.m2028b(0, i, 0, 0, 13));
        return Math.max(C0221fz.m1764i(jM3455P0), if1Var.mo2339X(i));
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m3454M0() {
        return this.f7351w && this.f7350v.mo2977d() != 9205357640488583168L;
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: P */
    public final void mo1851P(t61 t61Var) {
        C0702sp c0702sp = t61Var.f10581h;
        long jMo2977d = this.f7350v.mo2977d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m3453O0(jMo2977d) ? Float.intBitsToFloat((int) (jMo2977d >> 32)) : Float.intBitsToFloat((int) (c0702sp.mo3280d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(m3452N0(jMo2977d) ? Float.intBitsToFloat((int) (jMo2977d & 4294967295L)) : Float.intBitsToFloat((int) (c0702sp.mo3280d() & 4294967295L)))) & 4294967295L);
        long jM3603z = (Float.intBitsToFloat((int) (c0702sp.mo3280d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c0702sp.mo3280d() & 4294967295L)) == 0.0f) ? 0L : op0.m3603z(jFloatToRawIntBits, this.f7353y.m1332v(jFloatToRawIntBits, c0702sp.mo3280d()));
        long jMo3571a = this.f7352x.mo3571a((((long) Math.round(Float.intBitsToFloat((int) (jM3603z >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM3603z & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (c0702sp.mo3280d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (c0702sp.mo3280d() & 4294967295L)))) & 4294967295L), t61Var.getLayoutDirection());
        float f = (int) (jMo3571a >> 32);
        float f2 = (int) (jMo3571a & 4294967295L);
        ((C0485n4) c0702sp.f10257i.f562i).m3235C(f, f2);
        try {
            this.f7350v.m2976c(t61Var, jM3603z, this.f7354z, this.f7349A);
            ((C0485n4) c0702sp.f10257i.f562i).m3235C(-f, -f2);
            t61Var.m5125a();
        } catch (Throwable th) {
            ((C0485n4) c0702sp.f10257i.f562i).m3235C(-f, -f2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final long m3455P0(long j) {
        boolean z = false;
        boolean z2 = C0221fz.m1759d(j) && C0221fz.m1758c(j);
        if (C0221fz.m1761f(j) && C0221fz.m1760e(j)) {
            z = true;
        }
        if ((!m3454M0() && z2) || z) {
            return C0221fz.m1756a(j, C0221fz.m1763h(j), 0, C0221fz.m1762g(j), 0, 10);
        }
        long jMo2977d = this.f7350v.mo2977d();
        int iRound = m3453O0(jMo2977d) ? Math.round(Float.intBitsToFloat((int) (jMo2977d >> 32))) : C0221fz.m1765j(j);
        int iRound2 = m3452N0(jMo2977d) ? Math.round(Float.intBitsToFloat((int) (jMo2977d & 4294967295L))) : C0221fz.m1764i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC0258gz.m2032f(j, iRound2))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC0258gz.m2033g(j, iRound))) << 32);
        if (m3454M0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!m3453O0(this.f7350v.mo2977d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f7350v.mo2977d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m3452N0(this.f7350v.mo2977d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f7350v.mo2977d() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : op0.m3603z(jFloatToRawIntBits2, this.f7353y.m1332v(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return C0221fz.m1756a(j, AbstractC0258gz.m2033g(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))), 0, AbstractC0258gz.m2032f(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))), 0, 10);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: U */
    public final int mo2361U(kd1 kd1Var, if1 if1Var, int i) {
        if (!m3454M0()) {
            return if1Var.mo2337N(i);
        }
        long jM3455P0 = m3455P0(AbstractC0258gz.m2028b(0, 0, 0, i, 7));
        return Math.max(C0221fz.m1765j(jM3455P0), if1Var.mo2337N(i));
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        sz1 sz1VarMo2340e = if1Var.mo2340e(m3455P0(j));
        return pf1Var.mo696j0(sz1VarMo2340e.f10438h, sz1VarMo2340e.f10439i, ce0.f1492h, new C0487n6(sz1VarMo2340e, 5));
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: g */
    public final int mo2362g(kd1 kd1Var, if1 if1Var, int i) {
        if (!m3454M0()) {
            return if1Var.mo2338W(i);
        }
        long jM3455P0 = m3455P0(AbstractC0258gz.m2028b(0, 0, 0, i, 7));
        return Math.max(C0221fz.m1765j(jM3455P0), if1Var.mo2338W(i));
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: p */
    public final int mo2363p(kd1 kd1Var, if1 if1Var, int i) {
        if (!m3454M0()) {
            return if1Var.mo2341f(i);
        }
        long jM3455P0 = m3455P0(AbstractC0258gz.m2028b(0, i, 0, 0, 13));
        return Math.max(C0221fz.m1764i(jM3455P0), if1Var.mo2341f(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f7350v + ", sizeToIntrinsics=" + this.f7351w + ", alignment=" + this.f7352x + ", alpha=" + this.f7354z + ", colorFilter=" + this.f7349A + ')';
    }
}
