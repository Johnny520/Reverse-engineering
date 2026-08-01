package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class to0 extends oe0 implements r50, InterfaceC0775tq {

    /* JADX INFO: renamed from: r */
    public ro0 f6023r;

    /* JADX INFO: renamed from: s */
    public boolean f6024s;

    /* JADX INFO: renamed from: t */
    public C0276ha f6025t;

    /* JADX INFO: renamed from: u */
    public C0675r3 f6026u;

    /* JADX INFO: renamed from: v */
    public float f6027v;

    /* JADX INFO: renamed from: w */
    public C0348ja f6028w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public static boolean m4209x0(long j) {
        return !q11.m3185a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public static boolean m4210y0(long j) {
        return !q11.m3185a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0775tq
    /* JADX INFO: renamed from: B */
    public final void mo1679B(d60 d60Var) {
        C0125dd c0125dd = d60Var.f976d;
        long jMo1568d = this.f6023r.mo1568d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m4210y0(jMo1568d) ? Float.intBitsToFloat((int) (jMo1568d >> 32)) : Float.intBitsToFloat((int) (c0125dd.mo649c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(m4209x0(jMo1568d) ? Float.intBitsToFloat((int) (jMo1568d & 4294967295L)) : Float.intBitsToFloat((int) (c0125dd.mo649c() & 4294967295L)))) & 4294967295L);
        long jM1675y = (Float.intBitsToFloat((int) (c0125dd.mo649c() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c0125dd.mo649c() & 4294967295L)) == 0.0f) ? 0L : j50.m1675y(jFloatToRawIntBits, this.f6026u.m3376d(jFloatToRawIntBits, c0125dd.mo649c()));
        long jM1284a = this.f6025t.m1284a((((long) Math.round(Float.intBitsToFloat((int) (jM1675y >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM1675y & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (c0125dd.mo649c() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (c0125dd.mo649c() & 4294967295L)))) & 4294967295L), d60Var.getLayoutDirection());
        float f = (int) (jM1284a >> 32);
        float f2 = (int) (jM1284a & 4294967295L);
        ((C0910x1) c0125dd.f1053e.f4480a).m5080u(f, f2);
        try {
            this.f6023r.m3980c(d60Var, jM1675y, this.f6027v, this.f6028w);
            ((C0910x1) c0125dd.f1053e.f4480a).m5080u(-f, -f2);
            d60Var.m648a();
        } catch (Throwable th) {
            ((C0910x1) c0125dd.f1053e.f4480a).m5080u(-f, -f2);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: G */
    public final int mo2086G(yb0 yb0Var, sd0 sd0Var, int i) {
        if (!m4211w0()) {
            return sd0Var.mo181I(i);
        }
        long jM4212z0 = m4212z0(AbstractC0654qj.m3255b(0, i, 7));
        return Math.max(C0617pj.m3139j(jM4212z0), sd0Var.mo181I(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        xq0 xq0VarMo184e = sd0Var.mo184e(m4212z0(j));
        return zd0Var.mo1279Q(xq0VarMo184e.f7400d, xq0VarMo184e.f7401e, C0330is.f2614d, new C0306i3(xq0VarMo184e, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: d */
    public final int mo2087d(yb0 yb0Var, sd0 sd0Var, int i) {
        if (!m4211w0()) {
            return sd0Var.mo182O(i);
        }
        long jM4212z0 = m4212z0(AbstractC0654qj.m3255b(0, i, 7));
        return Math.max(C0617pj.m3139j(jM4212z0), sd0Var.mo182O(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: i */
    public final int mo2088i(yb0 yb0Var, sd0 sd0Var, int i) {
        if (!m4211w0()) {
            return sd0Var.mo185f(i);
        }
        long jM4212z0 = m4212z0(AbstractC0654qj.m3255b(i, 0, 13));
        return Math.max(C0617pj.m3138i(jM4212z0), sd0Var.mo185f(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: s */
    public final int mo2089s(yb0 yb0Var, sd0 sd0Var, int i) {
        if (!m4211w0()) {
            return sd0Var.mo183R(i);
        }
        long jM4212z0 = m4212z0(AbstractC0654qj.m3255b(i, 0, 13));
        return Math.max(C0617pj.m3138i(jM4212z0), sd0Var.mo183R(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PainterModifier(painter=" + this.f6023r + ", sizeToIntrinsics=" + this.f6024s + ", alignment=" + this.f6025t + ", alpha=" + this.f6027v + ", colorFilter=" + this.f6028w + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public final boolean m4211w0() {
        return this.f6024s && this.f6023r.mo1568d() != 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public final long m4212z0(long j) {
        boolean z = false;
        boolean z2 = C0617pj.m3133d(j) && C0617pj.m3132c(j);
        if (C0617pj.m3135f(j) && C0617pj.m3134e(j)) {
            z = true;
        }
        if ((!m4211w0() && z2) || z) {
            return C0617pj.m3130a(j, C0617pj.m3137h(j), 0, C0617pj.m3136g(j), 0, 10);
        }
        long jMo1568d = this.f6023r.mo1568d();
        int iRound = m4210y0(jMo1568d) ? Math.round(Float.intBitsToFloat((int) (jMo1568d >> 32))) : C0617pj.m3139j(j);
        int iRound2 = m4209x0(jMo1568d) ? Math.round(Float.intBitsToFloat((int) (jMo1568d & 4294967295L))) : C0617pj.m3138i(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC0654qj.m3258e(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC0654qj.m3259f(iRound, j))) << 32);
        if (m4211w0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!m4210y0(this.f6023r.mo1568d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f6023r.mo1568d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m4209x0(this.f6023r.mo1568d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f6023r.mo1568d() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : j50.m1675y(jFloatToRawIntBits2, this.f6026u.m3376d(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return C0617pj.m3130a(j, AbstractC0654qj.m3259f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, AbstractC0654qj.m3258e(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }
}
