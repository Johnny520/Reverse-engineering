package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface nc0 extends e70 {
    /* JADX INFO: renamed from: F */
    static void m3266F(t61 t61Var, AbstractC0024an abstractC0024an, long j, long j2, float f, op0 op0Var, int i) {
        long j3 = (i & 2) != 0 ? 0L : j;
        long jM3273y0 = (i & 4) != 0 ? m3273y0(t61Var.f10581h.mo3280d(), j3) : j2;
        float f2 = (i & 8) != 0 ? 1.0f : f;
        op0 op0Var2 = (i & 16) != 0 ? xi0.f13041h : op0Var;
        C0702sp c0702sp = t61Var.f10581h;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        c0702sp.f10256h.f9667c.mo1526p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jM3273y0 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jM3273y0 & 4294967295L)) + Float.intBitsToFloat(i3), c0702sp.m4902c(abstractC0024an, op0Var2, f2, null, 3, 1));
    }

    /* JADX INFO: renamed from: O */
    static /* synthetic */ void m3267O(nc0 nc0Var, long j, float f, long j2, xv2 xv2Var, int i) {
        if ((i & 4) != 0) {
            j2 = nc0Var.mo3278a0();
        }
        long j3 = j2;
        op0 op0Var = xv2Var;
        if ((i & 16) != 0) {
            op0Var = xi0.f13041h;
        }
        nc0Var.mo3281o(j, f, j3, op0Var);
    }

    /* JADX INFO: renamed from: V */
    static void m3269V(nc0 nc0Var, C0122d9 c0122d9, long j, long j2, float f, C0095cl c0095cl, int i, int i2) {
        nc0Var.mo3276R(c0122d9, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, c0095cl, (i2 & AIChatConfig.DefaultMaxTokens) != 0 ? 1 : i);
    }

    /* JADX INFO: renamed from: i0 */
    static /* synthetic */ void m3270i0(nc0 nc0Var, long j, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        nc0Var.mo3279c0(j, j4, (i & 4) != 0 ? m3273y0(nc0Var.mo3280d(), j4) : j3, xi0.f13041h, (i & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: s0 */
    static /* synthetic */ void m3271s0(nc0 nc0Var, AbstractC0024an abstractC0024an, long j, long j2, long j3, op0 op0Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        nc0Var.mo3283z(abstractC0024an, j4, (i & 4) != 0 ? m3273y0(nc0Var.mo3280d(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? xi0.f13041h : op0Var);
    }

    /* JADX INFO: renamed from: v */
    static /* synthetic */ void m3272v(nc0 nc0Var, C0915y9 c0915y9, AbstractC0024an abstractC0024an, float f, xv2 xv2Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        op0 op0Var = xv2Var;
        if ((i & 8) != 0) {
            op0Var = xi0.f13041h;
        }
        nc0Var.mo3275G(c0915y9, abstractC0024an, f2, op0Var, (i & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: y0 */
    static long m3273y0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: E */
    C0043b5 mo3274E();

    /* JADX INFO: renamed from: G */
    void mo3275G(C0915y9 c0915y9, AbstractC0024an abstractC0024an, float f, op0 op0Var, int i);

    /* JADX INFO: renamed from: R */
    void mo3276R(C0122d9 c0122d9, long j, long j2, long j3, float f, C0095cl c0095cl, int i);

    /* JADX INFO: renamed from: Y */
    void mo3277Y(long j, long j2, long j3, float f, int i);

    /* JADX INFO: renamed from: a0 */
    default long mo3278a0() {
        return AbstractC0570p7.m3784t(mo3274E().m434u());
    }

    /* JADX INFO: renamed from: c0 */
    void mo3279c0(long j, long j2, long j3, op0 op0Var, int i);

    /* JADX INFO: renamed from: d */
    default long mo3280d() {
        return mo3274E().m434u();
    }

    d61 getLayoutDirection();

    /* JADX INFO: renamed from: o */
    void mo3281o(long j, float f, long j2, op0 op0Var);

    /* JADX INFO: renamed from: t */
    void mo3282t(C0915y9 c0915y9, long j, op0 op0Var);

    /* JADX INFO: renamed from: z */
    void mo3283z(AbstractC0024an abstractC0024an, long j, long j2, long j3, float f, op0 op0Var);

    /* JADX INFO: renamed from: z0 */
    void mo3284z0(long j, float f, float f2, long j2, long j3, op0 op0Var);
}
