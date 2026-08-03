package p116i;

import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import okio.C3193a;
import p069f.C0964v;
import p069f.C0965w;

/* JADX INFO: renamed from: i.t1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1792t1 implements InterfaceC1780p1 {

    /* JADX INFO: renamed from: g */
    public final C0964v f5978g;

    /* JADX INFO: renamed from: h */
    public final C0965w f5979h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC1796v f5980i;

    /* JADX INFO: renamed from: j */
    public int[] f5981j = AbstractC1777o1.f5921a;

    /* JADX INFO: renamed from: k */
    public float[] f5982k;

    /* JADX INFO: renamed from: l */
    public AbstractC1781q f5983l;

    /* JADX INFO: renamed from: m */
    public AbstractC1781q f5984m;

    /* JADX INFO: renamed from: n */
    public AbstractC1781q f5985n;

    /* JADX INFO: renamed from: o */
    public AbstractC1781q f5986o;

    /* JADX INFO: renamed from: p */
    public float[] f5987p;

    /* JADX INFO: renamed from: q */
    public float[] f5988q;

    /* JADX INFO: renamed from: r */
    public C0119x f5989r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1792t1(C0964v c0964v, C0965w c0965w, InterfaceC1796v interfaceC1796v) {
        this.f5978g = c0964v;
        this.f5979h = c0965w;
        this.f5980i = interfaceC1796v;
        float[] fArr = AbstractC1777o1.f5922b;
        this.f5982k = fArr;
        this.f5987p = fArr;
        this.f5988q = fArr;
        this.f5989r = AbstractC1777o1.f5923c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m4439c(int i9) {
        int i10;
        C0964v c0964v = this.f5978g;
        int i11 = c0964v.f3036b;
        if (i11 <= 0) {
            C3193a.m6820i(HttpUrl.FRAGMENT_ENCODE_SET);
            return 0;
        }
        int i12 = i11 - 1;
        int i13 = 0;
        while (true) {
            if (i13 <= i12) {
                i10 = (i13 + i12) >>> 1;
                int i14 = c0964v.f3035a[i10];
                if (i14 >= i9) {
                    if (i14 <= i9) {
                        break;
                    }
                    i12 = i10 - 1;
                } else {
                    i13 = i10 + 1;
                }
            } else {
                i10 = -(i13 + 1);
                break;
            }
        }
        return i10 < -1 ? -(i10 + 2) : i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final float m4440d(int i9, int i10, boolean z9) {
        InterfaceC1796v interfaceC1796v;
        float f3;
        C0964v c0964v = this.f5978g;
        if (i9 >= c0964v.f3036b - 1) {
            f3 = i10;
        } else {
            int iM2371c = c0964v.m2371c(i9);
            int iM2371c2 = c0964v.m2371c(i9 + 1);
            if (i10 == iM2371c) {
                f3 = iM2371c;
            } else {
                int i11 = iM2371c2 - iM2371c;
                C1789s1 c1789s1 = (C1789s1) this.f5979h.m2313b(iM2371c);
                if (c1789s1 == null || (interfaceC1796v = c1789s1.f5967b) == null) {
                    interfaceC1796v = this.f5980i;
                }
                float f10 = i11;
                float fMo3416b = interfaceC1796v.mo3416b((i10 - iM2371c) / f10);
                if (z9) {
                    return fMo3416b;
                }
                f3 = (f10 * fMo3416b) + iM2371c;
            }
        }
        return f3 / 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4441e(AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        float[] fArr;
        boolean z9 = this.f5989r != AbstractC1777o1.f5923c;
        AbstractC1781q abstractC1781q4 = this.f5983l;
        C0965w c0965w = this.f5979h;
        C0964v c0964v = this.f5978g;
        if (abstractC1781q4 == null) {
            this.f5983l = abstractC1781q.mo4425c();
            this.f5984m = abstractC1781q3.mo4425c();
            int i9 = c0964v.f3036b;
            float[] fArr2 = new float[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                fArr2[i10] = c0964v.m2371c(i10) / 1000;
            }
            this.f5982k = fArr2;
            int i11 = c0964v.f3036b;
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = 0;
            }
            this.f5981j = iArr;
        }
        if (z9) {
            if (this.f5989r != AbstractC1777o1.f5923c && AbstractC1416l.m3825a(this.f5985n, abstractC1781q) && AbstractC1416l.m3825a(this.f5986o, abstractC1781q2)) {
                return;
            }
            this.f5985n = abstractC1781q;
            this.f5986o = abstractC1781q2;
            int iMo4424b = abstractC1781q.mo4424b() + (abstractC1781q.mo4424b() % 2);
            this.f5987p = new float[iMo4424b];
            this.f5988q = new float[iMo4424b];
            int i13 = c0964v.f3036b;
            float[][] fArr3 = new float[i13][];
            for (int i14 = 0; i14 < i13; i14++) {
                int iM2371c = c0964v.m2371c(i14);
                C1789s1 c1789s1 = (C1789s1) c0965w.m2313b(iM2371c);
                if (iM2371c == 0 && c1789s1 == null) {
                    fArr = new float[iMo4424b];
                    for (int i15 = 0; i15 < iMo4424b; i15++) {
                        fArr[i15] = abstractC1781q.mo4423a(i15);
                    }
                } else if (iM2371c == 300 && c1789s1 == null) {
                    fArr = new float[iMo4424b];
                    for (int i16 = 0; i16 < iMo4424b; i16++) {
                        fArr[i16] = abstractC1781q2.mo4423a(i16);
                    }
                } else {
                    c1789s1.getClass();
                    AbstractC1781q abstractC1781q5 = c1789s1.f5966a;
                    float[] fArr4 = new float[iMo4424b];
                    for (int i17 = 0; i17 < iMo4424b; i17++) {
                        fArr4[i17] = abstractC1781q5.mo4423a(i17);
                    }
                    fArr = fArr4;
                }
                fArr3[i14] = fArr;
            }
            this.f5989r = new C0119x(this.f5981j, this.f5982k, fArr3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: n */
    public final AbstractC1781q mo607n(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        int[] iArr = AbstractC1777o1.f5921a;
        int i9 = 0;
        long j4 = (j3 / 1000000) - ((long) 0);
        long j5 = 300;
        if (j4 < 0) {
            j4 = 0;
        }
        long j10 = j4 > j5 ? j5 : j4;
        if (j10 < 0) {
            return abstractC1781q3;
        }
        m4441e(abstractC1781q, abstractC1781q2, abstractC1781q3);
        AbstractC1781q abstractC1781q4 = this.f5984m;
        abstractC1781q4.getClass();
        if (this.f5989r != AbstractC1777o1.f5923c) {
            int i10 = (int) j10;
            float fM4440d = m4440d(m4439c(i10), i10, false);
            float[] fArr = this.f5988q;
            C1784r[][] c1784rArr = (C1784r[][]) this.f5989r.f310h;
            float f3 = c1784rArr[0][0].f5933a;
            float f10 = c1784rArr[c1784rArr.length - 1][0].f5934b;
            if (fM4440d < f3) {
                fM4440d = f3;
            }
            if (fM4440d <= f10) {
                f10 = fM4440d;
            }
            int length = fArr.length;
            boolean z9 = false;
            for (C1784r[] c1784rArr2 : c1784rArr) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < length - 1) {
                    C1784r c1784r = c1784rArr2[i12];
                    if (f10 <= c1784r.f5934b) {
                        if (c1784r.f5948p) {
                            fArr[i11] = c1784r.f5949q;
                            fArr[i11 + 1] = c1784r.f5950r;
                        } else {
                            c1784r.m4436c(f10);
                            fArr[i11] = c1784r.m4434a();
                            fArr[i11 + 1] = c1784r.m4435b();
                        }
                        z9 = true;
                    }
                    i11 += 2;
                    i12++;
                }
                if (z9) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i9 < length2) {
                abstractC1781q4.mo4427e(i9, fArr[i9]);
                i9++;
            }
        } else {
            AbstractC1781q abstractC1781qMo612w = mo612w((j10 - 1) * 1000000, abstractC1781q, abstractC1781q2, abstractC1781q3);
            AbstractC1781q abstractC1781qMo612w2 = mo612w(j10 * 1000000, abstractC1781q, abstractC1781q2, abstractC1781q3);
            int iMo4424b = abstractC1781qMo612w.mo4424b();
            while (i9 < iMo4424b) {
                abstractC1781q4.mo4427e(i9, (abstractC1781qMo612w.mo4423a(i9) - abstractC1781qMo612w2.mo4423a(i9)) * 1000.0f);
                i9++;
            }
        }
        return abstractC1781q4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1780p1
    /* JADX INFO: renamed from: s */
    public final int mo4431s() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1780p1
    /* JADX INFO: renamed from: v */
    public final int mo4432v() {
        return 300;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: w */
    public final AbstractC1781q mo612w(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        AbstractC1781q abstractC1781q4;
        AbstractC1781q abstractC1781q5;
        float f3;
        boolean z9;
        AbstractC1781q abstractC1781q6 = abstractC1781q;
        AbstractC1781q abstractC1781q7 = abstractC1781q2;
        int[] iArr = AbstractC1777o1.f5921a;
        int i9 = 0;
        long j4 = (j3 / 1000000) - ((long) 0);
        long j5 = 300;
        if (j4 < 0) {
            j4 = 0;
        }
        if (j4 <= j5) {
            j5 = j4;
        }
        int i10 = (int) j5;
        C0965w c0965w = this.f5979h;
        C1789s1 c1789s1 = (C1789s1) c0965w.m2313b(i10);
        if (c1789s1 != null) {
            return c1789s1.f5966a;
        }
        if (i10 >= 300) {
            return abstractC1781q7;
        }
        if (i10 <= 0) {
            return abstractC1781q6;
        }
        m4441e(abstractC1781q6, abstractC1781q7, abstractC1781q3);
        AbstractC1781q abstractC1781q8 = this.f5983l;
        abstractC1781q8.getClass();
        boolean z10 = true;
        if (this.f5989r != AbstractC1777o1.f5923c) {
            float fM4440d = m4440d(m4439c(i10), i10, false);
            float[] fArr = this.f5987p;
            C1784r[][] c1784rArr = (C1784r[][]) this.f5989r.f310h;
            int length = c1784rArr.length - 1;
            float f10 = c1784rArr[0][0].f5933a;
            float f11 = c1784rArr[length][0].f5934b;
            int length2 = fArr.length;
            if (fM4440d < f10 || fM4440d > f11) {
                if (fM4440d > f11) {
                    f10 = f11;
                } else {
                    length = 0;
                }
                float f12 = fM4440d - f10;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length2 - 1) {
                    C1784r c1784r = c1784rArr[length][i12];
                    boolean z11 = c1784r.f5948p;
                    float f13 = c1784r.f5950r;
                    float f14 = c1784r.f5949q;
                    if (z11) {
                        float f15 = c1784r.f5933a;
                        float f16 = c1784r.f5943k;
                        f3 = f12;
                        float f17 = c1784r.f5935c;
                        fArr[i11] = (f14 * f3) + ((c1784r.f5937e - f17) * (f10 - f15) * f16) + f17;
                        float f18 = c1784r.f5936d;
                        fArr[i11 + 1] = (f3 * f13) + ((c1784r.f5938f - f18) * (f10 - f15) * f16) + f18;
                    } else {
                        f3 = f12;
                        c1784r.m4436c(f10);
                        fArr[i11] = (c1784r.m4434a() * f3) + (c1784r.f5946n * c1784r.f5940h) + f14;
                        fArr[i11 + 1] = (c1784r.m4435b() * f3) + (c1784r.f5947o * c1784r.f5941i) + f13;
                    }
                    i11 += 2;
                    i12++;
                    f12 = f3;
                }
            } else {
                int length3 = c1784rArr.length;
                int i13 = 0;
                boolean z12 = false;
                while (i13 < length3) {
                    int i14 = i9;
                    int i15 = i14;
                    while (i14 < length2 - 1) {
                        C1784r c1784r2 = c1784rArr[i13][i15];
                        if (fM4440d <= c1784r2.f5934b) {
                            if (c1784r2.f5948p) {
                                float f19 = c1784r2.f5933a;
                                float f20 = c1784r2.f5943k;
                                float f21 = c1784r2.f5935c;
                                z9 = z10;
                                fArr[i14] = ((c1784r2.f5937e - f21) * (fM4440d - f19) * f20) + f21;
                                float f22 = c1784r2.f5936d;
                                fArr[i14 + 1] = ((c1784r2.f5938f - f22) * (fM4440d - f19) * f20) + f22;
                            } else {
                                z9 = z10;
                                c1784r2.m4436c(fM4440d);
                                fArr[i14] = (c1784r2.f5946n * c1784r2.f5940h) + c1784r2.f5949q;
                                fArr[i14 + 1] = (c1784r2.f5947o * c1784r2.f5941i) + c1784r2.f5950r;
                            }
                            z12 = z9;
                        } else {
                            z9 = z10;
                        }
                        i14 += 2;
                        i15++;
                        z10 = z9;
                    }
                    boolean z13 = z10;
                    if (z12) {
                        break;
                    }
                    i13++;
                    z10 = z13;
                    i9 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i16 = 0; i16 < length4; i16++) {
                abstractC1781q8.mo4427e(i16, fArr[i16]);
            }
        } else {
            int iM4439c = m4439c(i10);
            float fM4440d2 = m4440d(iM4439c, i10, true);
            C0964v c0964v = this.f5978g;
            C1789s1 c1789s12 = (C1789s1) c0965w.m2313b(c0964v.m2371c(iM4439c));
            if (c1789s12 != null && (abstractC1781q5 = c1789s12.f5966a) != null) {
                abstractC1781q6 = abstractC1781q5;
            }
            C1789s1 c1789s13 = (C1789s1) c0965w.m2313b(c0964v.m2371c(iM4439c + 1));
            if (c1789s13 != null && (abstractC1781q4 = c1789s13.f5966a) != null) {
                abstractC1781q7 = abstractC1781q4;
            }
            int iMo4424b = abstractC1781q8.mo4424b();
            for (int i17 = 0; i17 < iMo4424b; i17++) {
                abstractC1781q8.mo4427e(i17, (abstractC1781q7.mo4423a(i17) * fM4440d2) + ((1 - fM4440d2) * abstractC1781q6.mo4423a(i17)));
            }
        }
        return abstractC1781q8;
    }
}
