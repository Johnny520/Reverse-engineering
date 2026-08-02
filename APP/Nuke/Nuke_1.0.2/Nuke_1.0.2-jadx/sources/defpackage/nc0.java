package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface nc0 extends e70 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void F(t61 t61Var, an anVar, long j, long j2, float f, op0 op0Var, int i) {
        long j3 = (i & 2) != 0 ? 0L : j;
        long jY0 = (i & 4) != 0 ? y0(t61Var.h.d(), j3) : j2;
        float f2 = (i & 8) != 0 ? 1.0f : f;
        op0 op0Var2 = (i & 16) != 0 ? xi0.h : op0Var;
        sp spVar = t61Var.h;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        spVar.h.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (jY0 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (jY0 & 4294967295L)) + Float.intBitsToFloat(i3), spVar.c(anVar, op0Var2, f2, null, 3, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static /* synthetic */ void O(nc0 nc0Var, long j, float f, long j2, xv2 xv2Var, int i) {
        if ((i & 4) != 0) {
            j2 = nc0Var.a0();
        }
        long j3 = j2;
        op0 op0Var = xv2Var;
        if ((i & 16) != 0) {
            op0Var = xi0.h;
        }
        nc0Var.o(j, f, j3, op0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void V(nc0 nc0Var, d9 d9Var, long j, long j2, float f, cl clVar, int i, int i2) {
        nc0Var.R(d9Var, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, clVar, (i2 & AIChatConfig.DefaultMaxTokens) != 0 ? 1 : i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static /* synthetic */ void i0(nc0 nc0Var, long j, long j2, long j3, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        nc0Var.c0(j, j4, (i & 4) != 0 ? y0(nc0Var.d(), j4) : j3, xi0.h, (i & 64) != 0 ? 3 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static /* synthetic */ void s0(nc0 nc0Var, an anVar, long j, long j2, long j3, op0 op0Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        nc0Var.z(anVar, j4, (i & 4) != 0 ? y0(nc0Var.d(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? xi0.h : op0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static /* synthetic */ void v(nc0 nc0Var, y9 y9Var, an anVar, float f, xv2 xv2Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        op0 op0Var = xv2Var;
        if ((i & 8) != 0) {
            op0Var = xi0.h;
        }
        nc0Var.G(y9Var, anVar, f2, op0Var, (i & 32) != 0 ? 3 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static long y0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    b5 E();

    void G(y9 y9Var, an anVar, float f, op0 op0Var, int i);

    void R(d9 d9Var, long j, long j2, long j3, float f, cl clVar, int i);

    void Y(long j, long j2, long j3, float f, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long a0() {
        return p7.t(E().u());
    }

    void c0(long j, long j2, long j3, op0 op0Var, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long d() {
        return E().u();
    }

    d61 getLayoutDirection();

    void o(long j, float f, long j2, op0 op0Var);

    void t(y9 y9Var, long j, op0 op0Var);

    void z(an anVar, long j, long j2, long j3, float f, op0 op0Var);

    void z0(long j, float f, float f2, long j2, long j3, op0 op0Var);
}
