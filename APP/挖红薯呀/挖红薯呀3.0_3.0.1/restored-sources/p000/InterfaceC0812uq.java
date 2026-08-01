package p000;

/* JADX INFO: renamed from: uq */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0812uq extends InterfaceC0968ym {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    static void m4334H(InterfaceC0812uq interfaceC0812uq, C0752t5 c0752t5, long j, long j2, float f, C0348ja c0348ja, int i, int i2) {
        interfaceC0812uq.mo640D(c0752t5, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, c0348ja, (i2 & 512) != 0 ? 1 : i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    static void m4335W(d60 d60Var, long j, float f) {
        long jMo643K = d60Var.f976d.mo643K();
        C0125dd c0125dd = d60Var.f976d;
        c0125dd.getClass();
        c0125dd.f1052d.f789c.mo236b(f, jMo643K, C0125dd.m681a(c0125dd, j, C0664qt.f5220Q, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    static void m4336g(d60 d60Var, pf1 pf1Var, long j, long j2, long j3, o30 o30Var, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        long jM4338j0 = (i & 4) != 0 ? m4338j0(d60Var.f976d.mo649c(), j4) : j2;
        o30 o30Var2 = (i & 32) != 0 ? C0664qt.f5220Q : o30Var;
        C0125dd c0125dd = d60Var.f976d;
        int i2 = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        c0125dd.f1052d.f789c.mo242h(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jM4338j0 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jM4338j0 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), c0125dd.m682d(pf1Var, o30Var2, 1.0f, null, 3, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    static /* synthetic */ void m4337h0(InterfaceC0812uq interfaceC0812uq, C0118d6 c0118d6, pf1 pf1Var, float f, s41 s41Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        o30 o30Var = s41Var;
        if ((i & 8) != 0) {
            o30Var = C0664qt.f5220Q;
        }
        interfaceC0812uq.mo642J(c0118d6, pf1Var, f2, o30Var, (i & 32) != 0 ? 3 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    static long m4338j0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    static /* synthetic */ void m4339v(InterfaceC0812uq interfaceC0812uq, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = m4338j0(interfaceC0812uq.mo649c(), 0L);
        }
        interfaceC0812uq.mo639C(j, 0L, j2, C0664qt.f5220Q, (i & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: C */
    void mo639C(long j, long j2, long j3, o30 o30Var, int i);

    /* JADX INFO: renamed from: D */
    void mo640D(C0752t5 c0752t5, long j, long j2, long j3, float f, C0348ja c0348ja, int i);

    /* JADX INFO: renamed from: J */
    void mo642J(C0118d6 c0118d6, pf1 pf1Var, float f, o30 o30Var, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    default long mo643K() {
        return r60.m3415q(mo655t().m2803h());
    }

    /* JADX INFO: renamed from: T */
    void mo646T(long j, long j2, long j3, float f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    default long mo649c() {
        return mo655t().m2803h();
    }

    k50 getLayoutDirection();

    /* JADX INFO: renamed from: t */
    C0541o8 mo655t();
}
