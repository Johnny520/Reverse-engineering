package defpackage;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gm2 {
    public final /* synthetic */ im2 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gm2(im2 im2Var) {
        this.a = im2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c A[PHI: r8
  0x014c: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:79:0x017b, B:68:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(long j, int i) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fG;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jD;
        boolean z;
        boolean zF;
        float f;
        float f2;
        boolean z2;
        int i3;
        boolean z3;
        im2 im2Var = this.a;
        im2Var.j = i;
        s8 s8Var = im2Var.b;
        if (s8Var == null || !(im2Var.a.c() || im2Var.a.a())) {
            return im2Var.c(im2Var.k, j, i);
        }
        int i4 = im2Var.j;
        v vVar = im2Var.m;
        jd0 jd0Var = s8Var.c;
        if (gr2.c(s8Var.g)) {
            im2 im2Var2 = (im2) vVar.i;
            return new rs1(im2Var2.c(im2Var2.k, j, im2Var2.j)).a;
        }
        if (!s8Var.f) {
            if (jd0.g(jd0Var.f)) {
                s8Var.f(0L);
            }
            if (jd0.g(jd0Var.g)) {
                s8Var.g(0L);
            }
            if (jd0.g(jd0Var.d)) {
                s8Var.h(0L);
            }
            if (jd0.g(jd0Var.e)) {
                s8Var.e(0L);
            }
            s8Var.f = true;
        }
        int i5 = p9.a;
        float f3 = i4 == 2 ? 4.0f : 1.0f;
        long jF = rs1.f(f3, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!jd0.g(jd0Var.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (jd0.g(jd0Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float fE = s8Var.e(jF);
                    if (!jd0.g(jd0Var.e)) {
                        jd0Var.b().finish();
                    }
                    fIntBitsToFloat = fE == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i6) : fE / f3;
                }
            } else {
                float fH = s8Var.h(jF);
                j2 = 4294967295L;
                if (!jd0.g(jd0Var.d)) {
                    jd0Var.e().finish();
                }
                fIntBitsToFloat = fH == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i6) : fH / f3;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                if (jd0.g(jd0Var.f) && Float.intBitsToFloat(i2) < 0.0f) {
                    fG = s8Var.f(jF);
                    if (!jd0.g(jd0Var.f)) {
                        jd0Var.c().finish();
                    }
                    if (fG == Float.intBitsToFloat((int) (jF >> 32))) {
                        fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                } else if (!jd0.g(jd0Var.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    fG = s8Var.g(jF);
                    if (!jd0.g(jd0Var.g)) {
                        jd0Var.d().finish();
                    }
                    fIntBitsToFloat2 = fG == Float.intBitsToFloat((int) (jF >> 32)) ? Float.intBitsToFloat(i2) : fG / f3;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!rs1.b(jFloatToRawIntBits, 0L)) {
                s8Var.d();
            }
            jD = rs1.d(j, jFloatToRawIntBits);
            im2 im2Var3 = (im2) vVar.i;
            long j3 = new rs1(im2Var3.c(im2Var3.k, jD, im2Var3.j)).a;
            long jD2 = rs1.d(jD, j3);
            if ((Float.intBitsToFloat((int) (jD >> 32)) == 0.0f || Float.intBitsToFloat((int) (jD & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (jd0.g(jd0Var.f) || jd0.g(jd0Var.d) || jd0.g(jd0Var.g) || jd0.g(jd0Var.e)))) {
                s8Var.a();
            }
            if (i4 != 1) {
                int i7 = (int) (jD2 >> 32);
                if (Float.intBitsToFloat(i7) > 0.5f) {
                    s8Var.f(jD2);
                } else if (Float.intBitsToFloat(i7) < -0.5f) {
                    s8Var.g(jD2);
                } else {
                    f = 0.5f;
                    f2 = -0.5f;
                    z2 = false;
                    i3 = (int) (jD2 & j2);
                    if (Float.intBitsToFloat(i3) <= f) {
                        s8Var.h(jD2);
                    } else if (Float.intBitsToFloat(i3) < f2) {
                        s8Var.e(jD2);
                    } else {
                        z3 = false;
                        z = !z2 || z3;
                    }
                    z3 = true;
                    if (z2) {
                    }
                }
                f = 0.5f;
                f2 = -0.5f;
                z2 = true;
                i3 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i3) <= f) {
                }
                z3 = true;
                if (z2) {
                }
            }
            if (!rs1.b(jD, 0L)) {
                if (!jd0.f(jd0Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = jd0Var.c();
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof jq0) {
                        jq0 jq0Var = (jq0) edgeEffectC;
                        float f4 = jq0Var.b + fIntBitsToFloat3;
                        jq0Var.b = f4;
                        if (Math.abs(f4) > jq0Var.a) {
                            jq0Var.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = jd0.f(jd0Var.f);
                }
                if (jd0.f(jd0Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    EdgeEffect edgeEffectD = jd0Var.d();
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof jq0) {
                        jq0 jq0Var2 = (jq0) edgeEffectD;
                        float f5 = jq0Var2.b + fIntBitsToFloat4;
                        jq0Var2.b = f5;
                        if (Math.abs(f5) > jq0Var2.a) {
                            jq0Var2.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    zF = zF || jd0.f(jd0Var.g);
                }
                if (jd0.f(jd0Var.d) && Float.intBitsToFloat(i6) < 0.0f) {
                    EdgeEffect edgeEffectE = jd0Var.e();
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i6);
                    if (edgeEffectE instanceof jq0) {
                        jq0 jq0Var3 = (jq0) edgeEffectE;
                        float f6 = jq0Var3.b + fIntBitsToFloat5;
                        jq0Var3.b = f6;
                        if (Math.abs(f6) > jq0Var3.a) {
                            jq0Var3.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    zF = zF || jd0.f(jd0Var.d);
                }
                if (jd0.f(jd0Var.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    EdgeEffect edgeEffectB = jd0Var.b();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i6);
                    if (edgeEffectB instanceof jq0) {
                        jq0 jq0Var4 = (jq0) edgeEffectB;
                        float f7 = jq0Var4.b + fIntBitsToFloat6;
                        jq0Var4.b = f7;
                        if (Math.abs(f7) > jq0Var4.a) {
                            jq0Var4.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    zF = zF || jd0.f(jd0Var.e);
                }
                z = zF || z;
            }
            if (z) {
                s8Var.d();
            }
            return rs1.e(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!rs1.b(jFloatToRawIntBits, 0L)) {
        }
        jD = rs1.d(j, jFloatToRawIntBits);
        im2 im2Var32 = (im2) vVar.i;
        long j32 = new rs1(im2Var32.c(im2Var32.k, jD, im2Var32.j)).a;
        long jD22 = rs1.d(jD, j32);
        if (Float.intBitsToFloat((int) (jD >> 32)) == 0.0f) {
            s8Var.a();
        } else {
            s8Var.a();
        }
        if (i4 != 1) {
        }
        if (!rs1.b(jD, 0L)) {
        }
        if (z) {
        }
        return rs1.e(jFloatToRawIntBits, j32);
    }
}
