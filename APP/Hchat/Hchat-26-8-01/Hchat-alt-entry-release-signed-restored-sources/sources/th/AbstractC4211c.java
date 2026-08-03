package th;

import ac.AbstractC0063p;
import ai.C0089b;
import android.os.Build;
import p015b0.C0146l;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1000e0;
import p071f1.AbstractC1018n0;
import p071f1.C1015m;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p118i1.C1902b;
import p119i2.C1954y;
import p259r9.AbstractC3754e0;
import p259r9.C3766p;
import p320vh.AbstractC4574a;
import p320vh.AbstractC4577d;
import p320vh.C4575b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: th.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4211c {

    /* JADX INFO: renamed from: a */
    public static final C1954y f13812a = new C1954y(24);

    /* JADX INFO: renamed from: b */
    public static final C3766p f13813b = new C3766p(8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m8475a(C4215g c4215g, float f3, float f10) {
        int i9;
        int i10;
        float f11;
        float f12;
        C1015m c1015mM402L;
        int iM9021a;
        int iM9021a2;
        float[] fArr;
        float[] fArr2;
        C4575b c4575b;
        c4215g.getClass();
        if (m8477c()) {
            float[][] fArr3 = c4215g.f13851s;
            float[][] fArr4 = c4215g.f13850r;
            float f13 = f3 * 0.45f;
            float f14 = 0.45f * f10;
            int i11 = c4215g.f13834D;
            if (i11 < 0) {
                float fMax = Math.max(f13, f14);
                float[] fArr5 = AbstractC4574a.f15066d;
                int length = fArr5.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        float f15 = fArr5[i12];
                        float f16 = 0.88f * f15;
                        float f17 = f15 * 1.12f;
                        if (fMax > f16 && fMax < f17) {
                            float fM7907q = AbstractC3754e0.m7907q((fMax - f16) / (f17 - f16), 0.0f, 1.0f);
                            c4575b = new C4575b((3.0f - (fM7907q * 2.0f)) * fM7907q * fM7907q, i12, i12 + 1);
                            break;
                        }
                        i12++;
                    } else {
                        float f18 = fMax * fMax;
                        int i13 = f18 >= 1945.0f ? 4 : f18 > 400.0f ? 3 : f18 >= 90.25f ? 2 : f18 >= 12.6f ? 1 : 0;
                        c4575b = new C4575b(0.0f, i13, i13);
                    }
                }
                i11 = c4575b.f15067a;
                c4215g.f13835E = i11;
                c4215g.f13836F = c4575b.f15068b;
                c4215g.f13837G = c4575b.f15069c;
            }
            int i14 = 1 << i11;
            float f19 = i14 * 13;
            if (f19 > c4215g.f13843k) {
                c4215g.f13843k = f19;
            }
            float fIntBitsToFloat = (c4215g.f13843k * 2.0f) + Float.intBitsToFloat((int) (c4215g.f13841i >> 32));
            float fIntBitsToFloat2 = (c4215g.f13843k * 2.0f) + Float.intBitsToFloat((int) (c4215g.f13841i & 4294967295L));
            AbstractC1018n0 abstractC1018n0M416i = c4215g.f13857y;
            if (abstractC1018n0M416i != null && c4215g.f13852t == f3 && c4215g.f13853u == f10 && c4215g.f13854v == fIntBitsToFloat && c4215g.f13855w == fIntBitsToFloat2 && c4215g.f13856x == i11) {
                i9 = i14;
            } else {
                float f20 = i14;
                float f21 = AbstractC4574a.f15065c[i11];
                float f22 = f20 * f20;
                float f23 = ((f13 * f13) - f21) / f22;
                if (f23 < 0.1f) {
                    f23 = 0.1f;
                }
                float f24 = ((f14 * f14) - f21) / f22;
                if (f24 < 0.1f) {
                    f24 = 0.1f;
                }
                i9 = i14;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
                if (f3 > 0.0f || f10 > 0.0f) {
                    int iIntBitsToFloat = ((int) Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) / i9;
                    if (iIntBitsToFloat < 1) {
                        iIntBitsToFloat = 1;
                    }
                    float f25 = iIntBitsToFloat;
                    int iIntBitsToFloat2 = ((int) Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))) / i9;
                    if (iIntBitsToFloat2 < 1) {
                        iIntBitsToFloat2 = 1;
                    }
                    float f26 = iIntBitsToFloat2;
                    double[] dArr = c4215g.f13847o;
                    float[] fArr6 = c4215g.f13848p;
                    float[] fArr7 = c4215g.f13849q;
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i9);
                    if (f3 <= 0.0f || (iM9021a2 = AbstractC4574a.m9021a(f23, dArr, fArr6, fArr7)) <= 0) {
                        i10 = i11;
                        f11 = fIntBitsToFloat;
                        f12 = f26;
                        c1015mM402L = null;
                    } else {
                        float[] fArr8 = fArr4[iM9021a2];
                        if (fArr8 == null) {
                            f11 = fIntBitsToFloat;
                            fArr = new float[iM9021a2 * 2];
                            fArr4[iM9021a2] = fArr;
                        } else {
                            f11 = fIntBitsToFloat;
                            fArr = fArr8;
                        }
                        float[] fArr9 = fArr3[iM9021a2];
                        if (fArr9 == null) {
                            f12 = f26;
                            fArr2 = new float[iM9021a2];
                            fArr3[iM9021a2] = fArr2;
                        } else {
                            f12 = f26;
                            fArr2 = fArr9;
                        }
                        i10 = i11;
                        for (int i15 = 0; i15 < iM9021a2; i15++) {
                            int i16 = i15 * 2;
                            fArr[i16] = fArr6[i15];
                            fArr[i16 + 1] = 0.0f;
                            fArr2[i15] = fArr7[i15];
                        }
                        C0089b c0089bMo8482e = c4215g.mo8482e(AbstractC4574a.f15063a[iM9021a2][iNumberOfTrailingZeros], AbstractC4577d.f15077a[iM9021a2]);
                        c0089bMo8482e.f255a.setFloatUniform("in_blurOffset", fArr);
                        c0089bMo8482e.f255a.setFloatUniform("in_blurWeight", fArr2);
                        c0089bMo8482e.f255a.setFloatUniform("in_maxCoord", f25 - 0.5f, f12 - 0.5f);
                        c1015mM402L = AbstractC0063p.m402L(c0089bMo8482e, "child");
                    }
                    if (f10 <= 0.0f || (iM9021a = AbstractC4574a.m9021a(f24, dArr, fArr6, fArr7)) <= 0) {
                        abstractC1018n0M416i = c1015mM402L;
                    } else {
                        float[] fArr10 = fArr4[iM9021a];
                        if (fArr10 == null) {
                            fArr10 = new float[iM9021a * 2];
                            fArr4[iM9021a] = fArr10;
                        }
                        float[] fArr11 = fArr3[iM9021a];
                        if (fArr11 == null) {
                            fArr11 = new float[iM9021a];
                            fArr3[iM9021a] = fArr11;
                        }
                        for (int i17 = 0; i17 < iM9021a; i17++) {
                            int i18 = i17 * 2;
                            fArr10[i18] = 0.0f;
                            fArr10[i18 + 1] = fArr6[i17];
                            fArr11[i17] = fArr7[i17];
                        }
                        C0089b c0089bMo8482e2 = c4215g.mo8482e(AbstractC4574a.f15064b[iM9021a][iNumberOfTrailingZeros], AbstractC4577d.f15077a[iM9021a]);
                        c0089bMo8482e2.f255a.setFloatUniform("in_blurOffset", fArr10);
                        c0089bMo8482e2.f255a.setFloatUniform("in_blurWeight", fArr11);
                        c0089bMo8482e2.f255a.setFloatUniform("in_maxCoord", f25 - 0.5f, f12 - 0.5f);
                        abstractC1018n0M416i = c1015mM402L != null ? AbstractC0063p.m416i(c1015mM402L, AbstractC0063p.m402L(c0089bMo8482e2, "child")) : AbstractC0063p.m402L(c0089bMo8482e2, "child");
                    }
                } else {
                    i10 = i11;
                    f11 = fIntBitsToFloat;
                    abstractC1018n0M416i = null;
                }
                c4215g.f13852t = f3;
                c4215g.f13853u = f10;
                c4215g.f13854v = f11;
                c4215g.f13855w = fIntBitsToFloat2;
                c4215g.f13856x = i10;
                c4215g.f13857y = abstractC1018n0M416i;
            }
            if (abstractC1018n0M416i == null) {
                return;
            }
            c4215g.f13845m = i9;
            AbstractC1018n0 abstractC1018n0 = c4215g.f13844l;
            if (abstractC1018n0 != null) {
                abstractC1018n0M416i = AbstractC0063p.m416i(abstractC1018n0, abstractC1018n0M416i);
            }
            c4215g.f13844l = abstractC1018n0M416i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static InterfaceC5853o m8476b(InterfaceC5853o interfaceC5853o, InterfaceC4209a interfaceC4209a, InterfaceC1220a interfaceC1220a, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1231l interfaceC1231l3, InterfaceC1231l interfaceC1231l4, int i9) {
        InterfaceC1231l interfaceC1231l5 = (i9 & 8) != 0 ? null : interfaceC1231l2;
        InterfaceC1231l interfaceC1231l6 = (i9 & 16) != 0 ? null : interfaceC1231l3;
        interfaceC5853o.getClass();
        interfaceC4209a.getClass();
        interfaceC1220a.getClass();
        interfaceC1231l.getClass();
        boolean zM8477c = m8477c();
        InterfaceC5853o interfaceC5853oM2516m = C5850l.f23787a;
        if (interfaceC1231l6 != null) {
            interfaceC5853oM2516m = AbstractC0996c0.m2516m(interfaceC5853oM2516m, interfaceC1231l6);
        }
        return interfaceC5853o.mo10549d(interfaceC5853oM2516m).mo10549d(new C4210b(interfaceC4209a, interfaceC1220a, interfaceC1231l, interfaceC1231l5, interfaceC1231l6, f13812a, interfaceC1231l4, zM8477c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m8477c() {
        return Build.VERSION.SDK_INT >= 33;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC5853o m8478d(InterfaceC5853o interfaceC5853o, C4218j c4218j) {
        interfaceC5853o.getClass();
        c4218j.getClass();
        return interfaceC5853o.mo10549d(new C4219k(c4218j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final C4218j m8479e(C1902b c1902b, C1836h0 c1836h0, int i9, int i10) {
        if ((i10 & 1) != 0) {
            c1902b = AbstractC1000e0.m2554a(c1836h0);
        }
        InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(f13813b, c1836h0);
        boolean z9 = ((i9 & 14) ^ 6) > 4 && c1836h0.m4534f(c1902b);
        Object objM4514P = c1836h0.m4514P();
        if (z9 || objM4514P == C1851l.f6155a) {
            objM4514P = new C4218j(c1902b, new C0146l(interfaceC1809a1M4643y, 11));
            c1836h0.m4545k0(objM4514P);
        }
        return (C4218j) objM4514P;
    }
}
