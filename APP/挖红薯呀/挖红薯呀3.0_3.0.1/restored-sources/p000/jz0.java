package p000;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class jz0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lz0 f2961a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jz0(lz0 lz0Var) {
        this.f2961a = lz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b A[PHI: r8
  0x014b: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:79:0x0179, B:68:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0197  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m1741a(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fM1646g;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jM2933d;
        boolean z;
        boolean zM959f;
        boolean z2;
        int i3;
        boolean z3;
        lz0 lz0Var = this.f2961a;
        lz0Var.f3630j = i;
        C0343j5 c0343j5 = lz0Var.f3622b;
        if (c0343j5 == null || !(lz0Var.f3621a.mo502c() || lz0Var.f3621a.mo500a())) {
            return lz0Var.m2092c(lz0Var.f3631k, j, i);
        }
        int i4 = lz0Var.f3630j;
        C0532o c0532o = lz0Var.f3633m;
        C0182er c0182er = c0343j5.f2723c;
        if (q11.m3187c(c0343j5.f2727g)) {
            lz0 lz0Var2 = (lz0) c0532o.f4376e;
            return new ok0(lz0Var2.m2092c(lz0Var2.f3631k, j, lz0Var2.f3630j)).f4590a;
        }
        if (!c0343j5.f2726f) {
            if (C0182er.m960g(c0182er.f1515f)) {
                c0343j5.m1645f(0L);
            }
            if (C0182er.m960g(c0182er.f1516g)) {
                c0343j5.m1646g(0L);
            }
            if (C0182er.m960g(c0182er.f1513d)) {
                c0343j5.m1647h(0L);
            }
            if (C0182er.m960g(c0182er.f1514e)) {
                c0343j5.m1644e(0L);
            }
            c0343j5.f2726f = true;
        }
        int i5 = AbstractC0828v5.f6409a;
        float f = i4 == 2 ? 4.0f : 1.0f;
        long jM2935f = ok0.m2935f(f, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!C0182er.m960g(c0182er.f1513d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (C0182er.m960g(c0182er.f1514e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float fM1644e = c0343j5.m1644e(jM2935f);
                    if (!C0182er.m960g(c0182er.f1514e)) {
                        c0182er.m962b().finish();
                    }
                    fIntBitsToFloat = fM1644e == Float.intBitsToFloat((int) (jM2935f & 4294967295L)) ? Float.intBitsToFloat(i6) : fM1644e / f;
                }
            } else {
                float fM1647h = c0343j5.m1647h(jM2935f);
                j2 = 4294967295L;
                if (!C0182er.m960g(c0182er.f1513d)) {
                    c0182er.m965e().finish();
                }
                fIntBitsToFloat = fM1647h == Float.intBitsToFloat((int) (jM2935f & 4294967295L)) ? Float.intBitsToFloat(i6) : fM1647h / f;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                if (C0182er.m960g(c0182er.f1515f) && Float.intBitsToFloat(i2) < 0.0f) {
                    fM1646g = c0343j5.m1645f(jM2935f);
                    if (!C0182er.m960g(c0182er.f1515f)) {
                        c0182er.m963c().finish();
                    }
                    if (fM1646g == Float.intBitsToFloat((int) (jM2935f >> 32))) {
                        fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                } else if (!C0182er.m960g(c0182er.f1516g) || Float.intBitsToFloat(i2) <= 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    fM1646g = c0343j5.m1646g(jM2935f);
                    if (!C0182er.m960g(c0182er.f1516g)) {
                        c0182er.m964d().finish();
                    }
                    fIntBitsToFloat2 = fM1646g == Float.intBitsToFloat((int) (jM2935f >> 32)) ? Float.intBitsToFloat(i2) : fM1646g / f;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!ok0.m2931b(jFloatToRawIntBits, 0L)) {
                c0343j5.m1643d();
            }
            jM2933d = ok0.m2933d(j, jFloatToRawIntBits);
            lz0 lz0Var3 = (lz0) c0532o.f4376e;
            long j3 = new ok0(lz0Var3.m2092c(lz0Var3.f3631k, jM2933d, lz0Var3.f3630j)).f4590a;
            long jM2933d2 = ok0.m2933d(jM2933d, j3);
            if ((Float.intBitsToFloat((int) (jM2933d >> 32)) == 0.0f || Float.intBitsToFloat((int) (jM2933d & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (C0182er.m960g(c0182er.f1515f) || C0182er.m960g(c0182er.f1513d) || C0182er.m960g(c0182er.f1516g) || C0182er.m960g(c0182er.f1514e)))) {
                c0343j5.m1640a();
            }
            if (i4 != 1) {
                int i7 = (int) (jM2933d2 >> 32);
                if (Float.intBitsToFloat(i7) > 0.5f) {
                    c0343j5.m1645f(jM2933d2);
                } else if (Float.intBitsToFloat(i7) < -0.5f) {
                    c0343j5.m1646g(jM2933d2);
                } else {
                    z2 = false;
                    i3 = (int) (jM2933d2 & j2);
                    if (Float.intBitsToFloat(i3) <= 0.5f) {
                        c0343j5.m1647h(jM2933d2);
                    } else if (Float.intBitsToFloat(i3) < -0.5f) {
                        c0343j5.m1644e(jM2933d2);
                    } else {
                        z3 = false;
                        z = !z2 || z3;
                    }
                    z3 = true;
                    if (z2) {
                    }
                }
                z2 = true;
                i3 = (int) (jM2933d2 & j2);
                if (Float.intBitsToFloat(i3) <= 0.5f) {
                }
                z3 = true;
                if (z2) {
                }
            }
            if (!ok0.m2931b(jM2933d, 0L)) {
                if (!C0182er.m959f(c0182er.f1515f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zM959f = false;
                } else {
                    EdgeEffect edgeEffectM963c = c0182er.m963c();
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
                    if (edgeEffectM963c instanceof C0743sx) {
                        C0743sx c0743sx = (C0743sx) edgeEffectM963c;
                        float f2 = c0743sx.f5855b + fIntBitsToFloat3;
                        c0743sx.f5855b = f2;
                        if (Math.abs(f2) > c0743sx.f5854a) {
                            c0743sx.onRelease();
                        }
                    } else {
                        edgeEffectM963c.onRelease();
                    }
                    zM959f = C0182er.m959f(c0182er.f1515f);
                }
                if (C0182er.m959f(c0182er.f1516g) && Float.intBitsToFloat(i2) > 0.0f) {
                    EdgeEffect edgeEffectM964d = c0182er.m964d();
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
                    if (edgeEffectM964d instanceof C0743sx) {
                        C0743sx c0743sx2 = (C0743sx) edgeEffectM964d;
                        float f3 = c0743sx2.f5855b + fIntBitsToFloat4;
                        c0743sx2.f5855b = f3;
                        if (Math.abs(f3) > c0743sx2.f5854a) {
                            c0743sx2.onRelease();
                        }
                    } else {
                        edgeEffectM964d.onRelease();
                    }
                    zM959f = zM959f || C0182er.m959f(c0182er.f1516g);
                }
                if (C0182er.m959f(c0182er.f1513d) && Float.intBitsToFloat(i6) < 0.0f) {
                    EdgeEffect edgeEffectM965e = c0182er.m965e();
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i6);
                    if (edgeEffectM965e instanceof C0743sx) {
                        C0743sx c0743sx3 = (C0743sx) edgeEffectM965e;
                        float f4 = c0743sx3.f5855b + fIntBitsToFloat5;
                        c0743sx3.f5855b = f4;
                        if (Math.abs(f4) > c0743sx3.f5854a) {
                            c0743sx3.onRelease();
                        }
                    } else {
                        edgeEffectM965e.onRelease();
                    }
                    zM959f = zM959f || C0182er.m959f(c0182er.f1513d);
                }
                if (C0182er.m959f(c0182er.f1514e) && Float.intBitsToFloat(i6) > 0.0f) {
                    EdgeEffect edgeEffectM962b = c0182er.m962b();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i6);
                    if (edgeEffectM962b instanceof C0743sx) {
                        C0743sx c0743sx4 = (C0743sx) edgeEffectM962b;
                        float f5 = c0743sx4.f5855b + fIntBitsToFloat6;
                        c0743sx4.f5855b = f5;
                        if (Math.abs(f5) > c0743sx4.f5854a) {
                            c0743sx4.onRelease();
                        }
                    } else {
                        edgeEffectM962b.onRelease();
                    }
                    zM959f = zM959f || C0182er.m959f(c0182er.f1514e);
                }
                z = zM959f || z;
            }
            if (z) {
                c0343j5.m1643d();
            }
            return ok0.m2934e(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!ok0.m2931b(jFloatToRawIntBits, 0L)) {
        }
        jM2933d = ok0.m2933d(j, jFloatToRawIntBits);
        lz0 lz0Var32 = (lz0) c0532o.f4376e;
        long j32 = new ok0(lz0Var32.m2092c(lz0Var32.f3631k, jM2933d, lz0Var32.f3630j)).f4590a;
        long jM2933d22 = ok0.m2933d(jM2933d, j32);
        if (Float.intBitsToFloat((int) (jM2933d >> 32)) == 0.0f) {
            c0343j5.m1640a();
        } else {
            c0343j5.m1640a();
        }
        if (i4 != 1) {
        }
        if (!ok0.m2931b(jM2933d, 0L)) {
        }
        if (z) {
        }
        return ok0.m2934e(jFloatToRawIntBits, j32);
    }
}
