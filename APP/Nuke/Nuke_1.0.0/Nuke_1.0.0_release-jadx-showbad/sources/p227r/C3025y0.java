package p227r;

import android.widget.EdgeEffect;
import p000A.C0049a;
import p204n0.C2683b;
import p204n0.C2686e;
import p216p.AbstractC2851j;
import p216p.C2809B;
import p216p.C2813F;
import p216p.C2847h;

/* JADX INFO: renamed from: r.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3025y0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2940A0 f9592a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3025y0(C2940A0 c2940a0) {
        this.f9592a = c2940a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e8  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m5224a(long j5, int i5) {
        long j6;
        long j7;
        float fIntBitsToFloat;
        int i6;
        char c5;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jM4646d;
        boolean z5;
        boolean zM5007f;
        float f2;
        boolean z6;
        int i7;
        boolean z7;
        C2940A0 c2940a0 = this.f9592a;
        c2940a0.f9279j = i5;
        C2847h c2847h = c2940a0.f9271b;
        if (c2847h == null || !(c2940a0.f9270a.mo13d() || c2940a0.f9270a.mo10a())) {
            return c2940a0.m5143c(c2940a0.f9280k, j5, i5);
        }
        int i8 = c2940a0.f9279j;
        C0049a c0049a = c2940a0.f9282m;
        C2809B c2809b = c2847h.f8944c;
        if (C2686e.m4663c(c2847h.f8948g)) {
            C2940A0 c2940a02 = (C2940A0) c0049a.f203e;
            return new C2683b(c2940a02.m5143c(c2940a02.f9280k, j5, c2940a02.f9279j)).f8556a;
        }
        if (!c2847h.f8947f) {
            if (C2809B.m5008g(c2809b.f8846f)) {
                c2847h.m5037f(0L);
            }
            if (C2809B.m5008g(c2809b.f8847g)) {
                c2847h.m5038g(0L);
            }
            if (C2809B.m5008g(c2809b.f8844d)) {
                c2847h.m5039h(0L);
            }
            if (C2809B.m5008g(c2809b.f8845e)) {
                c2847h.m5036e(0L);
            }
            c2847h.f8947f = true;
        }
        int i9 = AbstractC2851j.f8972a;
        float f5 = i8 == 2 ? 4.0f : 1.0f;
        long jM4648f = C2683b.m4648f(f5, j5);
        int i10 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i10) != 0.0f) {
            if (!C2809B.m5008g(c2809b.f8844d) || Float.intBitsToFloat(i10) >= 0.0f) {
                j6 = 4294967295L;
                if (!C2809B.m5008g(c2809b.f8845e) || Float.intBitsToFloat(i10) <= 0.0f) {
                    j7 = jM4648f;
                } else {
                    float fM5036e = c2847h.m5036e(jM4648f);
                    if (!C2809B.m5008g(c2809b.f8845e)) {
                        c2809b.m5010b().finish();
                    }
                    j7 = jM4648f;
                    fIntBitsToFloat = fM5036e == Float.intBitsToFloat((int) (j7 & 4294967295L)) ? Float.intBitsToFloat(i10) : fM5036e / f5;
                }
            } else {
                float fM5039h = c2847h.m5039h(jM4648f);
                j6 = 4294967295L;
                if (!C2809B.m5008g(c2809b.f8844d)) {
                    c2809b.m5013e().finish();
                }
                fIntBitsToFloat = fM5039h == Float.intBitsToFloat((int) (jM4648f & 4294967295L)) ? Float.intBitsToFloat(i10) : fM5039h / f5;
                j7 = jM4648f;
            }
            i6 = (int) (j5 >> 32);
            if (Float.intBitsToFloat(i6) == 0.0f) {
                if (!C2809B.m5008g(c2809b.f8846f) || Float.intBitsToFloat(i6) >= 0.0f) {
                    long j8 = j7;
                    c5 = ' ';
                    if (C2809B.m5008g(c2809b.f8847g) && Float.intBitsToFloat(i6) > 0.0f) {
                        float fM5038g = c2847h.m5038g(j8);
                        if (!C2809B.m5008g(c2809b.f8847g)) {
                            c2809b.m5012d().finish();
                        }
                        fIntBitsToFloat2 = fM5038g == Float.intBitsToFloat((int) (j8 >> 32)) ? Float.intBitsToFloat(i6) : fM5038g / f5;
                    }
                } else {
                    long j9 = j7;
                    float fM5037f = c2847h.m5037f(j9);
                    c5 = ' ';
                    if (!C2809B.m5008g(c2809b.f8846f)) {
                        c2809b.m5011c().finish();
                    }
                    fIntBitsToFloat2 = fM5037f == Float.intBitsToFloat((int) (j9 >> 32)) ? Float.intBitsToFloat(i6) : fM5037f / f5;
                }
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j6) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c5);
                if (!C2683b.m4644b(jFloatToRawIntBits, 0L)) {
                    c2847h.m5035d();
                }
                jM4646d = C2683b.m4646d(j5, jFloatToRawIntBits);
                C2940A0 c2940a03 = (C2940A0) c0049a.f203e;
                long j10 = new C2683b(c2940a03.m5143c(c2940a03.f9280k, jM4646d, c2940a03.f9279j)).f8556a;
                long jM4646d2 = C2683b.m4646d(jM4646d, j10);
                if ((Float.intBitsToFloat((int) (jM4646d >> c5)) != 0.0f || Float.intBitsToFloat((int) (jM4646d & j6)) != 0.0f) && ((Float.intBitsToFloat((int) (j10 >> c5)) != 0.0f || Float.intBitsToFloat((int) (j10 & j6)) != 0.0f) && (C2809B.m5008g(c2809b.f8846f) || C2809B.m5008g(c2809b.f8844d) || C2809B.m5008g(c2809b.f8847g) || C2809B.m5008g(c2809b.f8845e)))) {
                    c2847h.m5032a();
                }
                if (i8 == 1) {
                    int i11 = (int) (jM4646d2 >> c5);
                    if (Float.intBitsToFloat(i11) > 0.5f) {
                        c2847h.m5037f(jM4646d2);
                    } else if (Float.intBitsToFloat(i11) < -0.5f) {
                        c2847h.m5038g(jM4646d2);
                    } else {
                        f2 = 0.5f;
                        z6 = false;
                        i7 = (int) (jM4646d2 & j6);
                        if (Float.intBitsToFloat(i7) <= f2) {
                            c2847h.m5039h(jM4646d2);
                        } else if (Float.intBitsToFloat(i7) < -0.5f) {
                            c2847h.m5036e(jM4646d2);
                        } else {
                            z7 = false;
                            z5 = !z6 || z7;
                        }
                        z7 = true;
                        if (z6) {
                        }
                    }
                    f2 = 0.5f;
                    z6 = true;
                    i7 = (int) (jM4646d2 & j6);
                    if (Float.intBitsToFloat(i7) <= f2) {
                    }
                    z7 = true;
                    if (z6) {
                    }
                }
                if (!C2683b.m4644b(jM4646d, 0L)) {
                    if (!C2809B.m5007f(c2809b.f8846f) || Float.intBitsToFloat(i6) >= 0.0f) {
                        zM5007f = false;
                    } else {
                        EdgeEffect edgeEffectM5011c = c2809b.m5011c();
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i6);
                        if (edgeEffectM5011c instanceof C2813F) {
                            C2813F c2813f = (C2813F) edgeEffectM5011c;
                            float f6 = c2813f.f8861b + fIntBitsToFloat3;
                            c2813f.f8861b = f6;
                            if (Math.abs(f6) > c2813f.f8860a) {
                                c2813f.onRelease();
                            }
                        } else {
                            edgeEffectM5011c.onRelease();
                        }
                        zM5007f = C2809B.m5007f(c2809b.f8846f);
                    }
                    if (C2809B.m5007f(c2809b.f8847g) && Float.intBitsToFloat(i6) > 0.0f) {
                        EdgeEffect edgeEffectM5012d = c2809b.m5012d();
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i6);
                        if (edgeEffectM5012d instanceof C2813F) {
                            C2813F c2813f2 = (C2813F) edgeEffectM5012d;
                            float f7 = c2813f2.f8861b + fIntBitsToFloat4;
                            c2813f2.f8861b = f7;
                            if (Math.abs(f7) > c2813f2.f8860a) {
                                c2813f2.onRelease();
                            }
                        } else {
                            edgeEffectM5012d.onRelease();
                        }
                        zM5007f = zM5007f || C2809B.m5007f(c2809b.f8847g);
                    }
                    if (C2809B.m5007f(c2809b.f8844d) && Float.intBitsToFloat(i10) < 0.0f) {
                        EdgeEffect edgeEffectM5013e = c2809b.m5013e();
                        float fIntBitsToFloat5 = Float.intBitsToFloat(i10);
                        if (edgeEffectM5013e instanceof C2813F) {
                            C2813F c2813f3 = (C2813F) edgeEffectM5013e;
                            float f8 = c2813f3.f8861b + fIntBitsToFloat5;
                            c2813f3.f8861b = f8;
                            if (Math.abs(f8) > c2813f3.f8860a) {
                                c2813f3.onRelease();
                            }
                        } else {
                            edgeEffectM5013e.onRelease();
                        }
                        zM5007f = zM5007f || C2809B.m5007f(c2809b.f8844d);
                    }
                    if (C2809B.m5007f(c2809b.f8845e) && Float.intBitsToFloat(i10) > 0.0f) {
                        EdgeEffect edgeEffectM5010b = c2809b.m5010b();
                        float fIntBitsToFloat6 = Float.intBitsToFloat(i10);
                        if (edgeEffectM5010b instanceof C2813F) {
                            C2813F c2813f4 = (C2813F) edgeEffectM5010b;
                            float f9 = c2813f4.f8861b + fIntBitsToFloat6;
                            c2813f4.f8861b = f9;
                            if (Math.abs(f9) > c2813f4.f8860a) {
                                c2813f4.onRelease();
                            }
                        } else {
                            edgeEffectM5010b.onRelease();
                        }
                        zM5007f = zM5007f || C2809B.m5007f(c2809b.f8845e);
                    }
                    z5 = zM5007f || z5;
                }
                if (z5) {
                    c2847h.m5035d();
                }
                return C2683b.m4647e(jFloatToRawIntBits, j10);
            }
            c5 = ' ';
            fIntBitsToFloat2 = 0.0f;
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j6) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c5);
            if (!C2683b.m4644b(jFloatToRawIntBits, 0L)) {
            }
            jM4646d = C2683b.m4646d(j5, jFloatToRawIntBits);
            C2940A0 c2940a032 = (C2940A0) c0049a.f203e;
            long j102 = new C2683b(c2940a032.m5143c(c2940a032.f9280k, jM4646d, c2940a032.f9279j)).f8556a;
            long jM4646d22 = C2683b.m4646d(jM4646d, j102);
            if (Float.intBitsToFloat((int) (jM4646d >> c5)) != 0.0f) {
                c2847h.m5032a();
            } else {
                c2847h.m5032a();
            }
            if (i8 == 1) {
            }
            if (!C2683b.m4644b(jM4646d, 0L)) {
            }
            if (z5) {
            }
            return C2683b.m4647e(jFloatToRawIntBits, j102);
        }
        j7 = jM4648f;
        j6 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i6 = (int) (j5 >> 32);
        if (Float.intBitsToFloat(i6) == 0.0f) {
        }
        fIntBitsToFloat2 = 0.0f;
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j6) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c5);
        if (!C2683b.m4644b(jFloatToRawIntBits, 0L)) {
        }
        jM4646d = C2683b.m4646d(j5, jFloatToRawIntBits);
        C2940A0 c2940a0322 = (C2940A0) c0049a.f203e;
        long j1022 = new C2683b(c2940a0322.m5143c(c2940a0322.f9280k, jM4646d, c2940a0322.f9279j)).f8556a;
        long jM4646d222 = C2683b.m4646d(jM4646d, j1022);
        if (Float.intBitsToFloat((int) (jM4646d >> c5)) != 0.0f) {
        }
        if (i8 == 1) {
        }
        if (!C2683b.m4644b(jM4646d, 0L)) {
        }
        if (z5) {
        }
        return C2683b.m4647e(jFloatToRawIntBits, j1022);
    }
}
