package p000;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gm2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ im2 f3582a;

    public gm2(im2 im2Var) {
        this.f3582a = im2Var;
    }

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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m1940a(long j, int i) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fM4757g;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jM4611d;
        boolean z;
        boolean zM2482f;
        float f;
        float f2;
        boolean z2;
        int i3;
        boolean z3;
        im2 im2Var = this.f3582a;
        im2Var.f4696j = i;
        C0685s8 c0685s8 = im2Var.f4688b;
        if (c0685s8 == null || !(im2Var.f4687a.mo569c() || im2Var.f4687a.mo567a())) {
            return im2Var.m2366c(im2Var.f4697k, j, i);
        }
        int i4 = im2Var.f4696j;
        C0792v c0792v = im2Var.f4699m;
        jd0 jd0Var = c0685s8.f9964c;
        if (gr2.m2021c(c0685s8.f9968g)) {
            im2 im2Var2 = (im2) c0792v.f11573i;
            return new rs1(im2Var2.m2366c(im2Var2.f4697k, j, im2Var2.f4696j)).f9744a;
        }
        if (!c0685s8.f9967f) {
            if (jd0.m2483g(jd0Var.f4974f)) {
                c0685s8.m4756f(0L);
            }
            if (jd0.m2483g(jd0Var.f4975g)) {
                c0685s8.m4757g(0L);
            }
            if (jd0.m2483g(jd0Var.f4972d)) {
                c0685s8.m4758h(0L);
            }
            if (jd0.m2483g(jd0Var.f4973e)) {
                c0685s8.m4755e(0L);
            }
            c0685s8.f9967f = true;
        }
        int i5 = AbstractC0572p9.f8042a;
        float f3 = i4 == 2 ? 4.0f : 1.0f;
        long jM4613f = rs1.m4613f(f3, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!jd0.m2483g(jd0Var.f4972d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (jd0.m2483g(jd0Var.f4973e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float fM4755e = c0685s8.m4755e(jM4613f);
                    if (!jd0.m2483g(jd0Var.f4973e)) {
                        jd0Var.m2485b().finish();
                    }
                    fIntBitsToFloat = fM4755e == Float.intBitsToFloat((int) (jM4613f & 4294967295L)) ? Float.intBitsToFloat(i6) : fM4755e / f3;
                }
            } else {
                float fM4758h = c0685s8.m4758h(jM4613f);
                j2 = 4294967295L;
                if (!jd0.m2483g(jd0Var.f4972d)) {
                    jd0Var.m2488e().finish();
                }
                fIntBitsToFloat = fM4758h == Float.intBitsToFloat((int) (jM4613f & 4294967295L)) ? Float.intBitsToFloat(i6) : fM4758h / f3;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                if (jd0.m2483g(jd0Var.f4974f) && Float.intBitsToFloat(i2) < 0.0f) {
                    fM4757g = c0685s8.m4756f(jM4613f);
                    if (!jd0.m2483g(jd0Var.f4974f)) {
                        jd0Var.m2486c().finish();
                    }
                    if (fM4757g == Float.intBitsToFloat((int) (jM4613f >> 32))) {
                        fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                } else if (!jd0.m2483g(jd0Var.f4975g) || Float.intBitsToFloat(i2) <= 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    fM4757g = c0685s8.m4757g(jM4613f);
                    if (!jd0.m2483g(jd0Var.f4975g)) {
                        jd0Var.m2487d().finish();
                    }
                    fIntBitsToFloat2 = fM4757g == Float.intBitsToFloat((int) (jM4613f >> 32)) ? Float.intBitsToFloat(i2) : fM4757g / f3;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!rs1.m4609b(jFloatToRawIntBits, 0L)) {
                c0685s8.m4754d();
            }
            jM4611d = rs1.m4611d(j, jFloatToRawIntBits);
            im2 im2Var3 = (im2) c0792v.f11573i;
            long j3 = new rs1(im2Var3.m2366c(im2Var3.f4697k, jM4611d, im2Var3.f4696j)).f9744a;
            long jM4611d2 = rs1.m4611d(jM4611d, j3);
            if ((Float.intBitsToFloat((int) (jM4611d >> 32)) == 0.0f || Float.intBitsToFloat((int) (jM4611d & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (jd0.m2483g(jd0Var.f4974f) || jd0.m2483g(jd0Var.f4972d) || jd0.m2483g(jd0Var.f4975g) || jd0.m2483g(jd0Var.f4973e)))) {
                c0685s8.m4751a();
            }
            if (i4 != 1) {
                int i7 = (int) (jM4611d2 >> 32);
                if (Float.intBitsToFloat(i7) > 0.5f) {
                    c0685s8.m4756f(jM4611d2);
                } else if (Float.intBitsToFloat(i7) < -0.5f) {
                    c0685s8.m4757g(jM4611d2);
                } else {
                    f = 0.5f;
                    f2 = -0.5f;
                    z2 = false;
                    i3 = (int) (jM4611d2 & j2);
                    if (Float.intBitsToFloat(i3) <= f) {
                        c0685s8.m4758h(jM4611d2);
                    } else if (Float.intBitsToFloat(i3) < f2) {
                        c0685s8.m4755e(jM4611d2);
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
                i3 = (int) (jM4611d2 & j2);
                if (Float.intBitsToFloat(i3) <= f) {
                }
                z3 = true;
                if (z2) {
                }
            }
            if (!rs1.m4609b(jM4611d, 0L)) {
                if (!jd0.m2482f(jd0Var.f4974f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zM2482f = false;
                } else {
                    EdgeEffect edgeEffectM2486c = jd0Var.m2486c();
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
                    if (edgeEffectM2486c instanceof jq0) {
                        jq0 jq0Var = (jq0) edgeEffectM2486c;
                        float f4 = jq0Var.f5156b + fIntBitsToFloat3;
                        jq0Var.f5156b = f4;
                        if (Math.abs(f4) > jq0Var.f5155a) {
                            jq0Var.onRelease();
                        }
                    } else {
                        edgeEffectM2486c.onRelease();
                    }
                    zM2482f = jd0.m2482f(jd0Var.f4974f);
                }
                if (jd0.m2482f(jd0Var.f4975g) && Float.intBitsToFloat(i2) > 0.0f) {
                    EdgeEffect edgeEffectM2487d = jd0Var.m2487d();
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
                    if (edgeEffectM2487d instanceof jq0) {
                        jq0 jq0Var2 = (jq0) edgeEffectM2487d;
                        float f5 = jq0Var2.f5156b + fIntBitsToFloat4;
                        jq0Var2.f5156b = f5;
                        if (Math.abs(f5) > jq0Var2.f5155a) {
                            jq0Var2.onRelease();
                        }
                    } else {
                        edgeEffectM2487d.onRelease();
                    }
                    zM2482f = zM2482f || jd0.m2482f(jd0Var.f4975g);
                }
                if (jd0.m2482f(jd0Var.f4972d) && Float.intBitsToFloat(i6) < 0.0f) {
                    EdgeEffect edgeEffectM2488e = jd0Var.m2488e();
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i6);
                    if (edgeEffectM2488e instanceof jq0) {
                        jq0 jq0Var3 = (jq0) edgeEffectM2488e;
                        float f6 = jq0Var3.f5156b + fIntBitsToFloat5;
                        jq0Var3.f5156b = f6;
                        if (Math.abs(f6) > jq0Var3.f5155a) {
                            jq0Var3.onRelease();
                        }
                    } else {
                        edgeEffectM2488e.onRelease();
                    }
                    zM2482f = zM2482f || jd0.m2482f(jd0Var.f4972d);
                }
                if (jd0.m2482f(jd0Var.f4973e) && Float.intBitsToFloat(i6) > 0.0f) {
                    EdgeEffect edgeEffectM2485b = jd0Var.m2485b();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i6);
                    if (edgeEffectM2485b instanceof jq0) {
                        jq0 jq0Var4 = (jq0) edgeEffectM2485b;
                        float f7 = jq0Var4.f5156b + fIntBitsToFloat6;
                        jq0Var4.f5156b = f7;
                        if (Math.abs(f7) > jq0Var4.f5155a) {
                            jq0Var4.onRelease();
                        }
                    } else {
                        edgeEffectM2485b.onRelease();
                    }
                    zM2482f = zM2482f || jd0.m2482f(jd0Var.f4973e);
                }
                z = zM2482f || z;
            }
            if (z) {
                c0685s8.m4754d();
            }
            return rs1.m4612e(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!rs1.m4609b(jFloatToRawIntBits, 0L)) {
        }
        jM4611d = rs1.m4611d(j, jFloatToRawIntBits);
        im2 im2Var32 = (im2) c0792v.f11573i;
        long j32 = new rs1(im2Var32.m2366c(im2Var32.f4697k, jM4611d, im2Var32.f4696j)).f9744a;
        long jM4611d22 = rs1.m4611d(jM4611d, j32);
        if (Float.intBitsToFloat((int) (jM4611d >> 32)) == 0.0f) {
            c0685s8.m4751a();
        } else {
            c0685s8.m4751a();
        }
        if (i4 != 1) {
        }
        if (!rs1.m4609b(jM4611d, 0L)) {
        }
        if (z) {
        }
        return rs1.m4612e(jFloatToRawIntBits, j32);
    }
}
