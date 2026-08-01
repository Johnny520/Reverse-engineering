package p203n;

import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p186k.C2438t;
import p186k.C2439u;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: n.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2666l0 implements InterfaceC2660i0 {

    /* JADX INFO: renamed from: d */
    public final C2438t f8488d;

    /* JADX INFO: renamed from: e */
    public final C2439u f8489e;

    /* JADX INFO: renamed from: f */
    public final int f8490f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2675t f8491g;

    /* JADX INFO: renamed from: h */
    public int[] f8492h = AbstractC2658h0.f8474a;

    /* JADX INFO: renamed from: i */
    public float[] f8493i;

    /* JADX INFO: renamed from: j */
    public AbstractC2670o f8494j;

    /* JADX INFO: renamed from: k */
    public AbstractC2670o f8495k;

    /* JADX INFO: renamed from: l */
    public AbstractC2670o f8496l;

    /* JADX INFO: renamed from: m */
    public AbstractC2670o f8497m;

    /* JADX INFO: renamed from: n */
    public float[] f8498n;

    /* JADX INFO: renamed from: o */
    public float[] f8499o;

    /* JADX INFO: renamed from: p */
    public C1753n f8500p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2666l0(C2438t c2438t, C2439u c2439u, int i5, InterfaceC2675t interfaceC2675t) {
        this.f8488d = c2438t;
        this.f8489e = c2439u;
        this.f8490f = i5;
        this.f8491g = interfaceC2675t;
        float[] fArr = AbstractC2658h0.f8475b;
        this.f8493i = fArr;
        this.f8498n = fArr;
        this.f8499o = fArr;
        this.f8500p = AbstractC2658h0.f8476c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m4629c(int i5) {
        int i6;
        C2438t c2438t = this.f8488d;
        int i7 = c2438t.f7878b;
        c2438t.getClass();
        if (i7 <= 0 || i7 > c2438t.f7878b) {
            AbstractC2477a.m4423d("");
            throw null;
        }
        int i8 = i7 - 1;
        int i9 = 0;
        while (true) {
            if (i9 <= i8) {
                i6 = (i9 + i8) >>> 1;
                int i10 = c2438t.f7877a[i6];
                if (i10 >= i5) {
                    if (i10 <= i5) {
                        break;
                    }
                    i8 = i6 - 1;
                } else {
                    i9 = i6 + 1;
                }
            } else {
                i6 = -(i9 + 1);
                break;
            }
        }
        return i6 < -1 ? -(i6 + 2) : i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final float m4630d(int i5, int i6, boolean z5) {
        InterfaceC2675t interfaceC2675t;
        float f2;
        C2438t c2438t = this.f8488d;
        if (i5 >= c2438t.f7878b - 1) {
            f2 = i6;
        } else {
            int iM4336c = c2438t.m4336c(i5);
            int iM4336c2 = c2438t.m4336c(i5 + 1);
            if (i6 == iM4336c) {
                f2 = iM4336c;
            } else {
                int i7 = iM4336c2 - iM4336c;
                C2664k0 c2664k0 = (C2664k0) this.f8489e.m4318b(iM4336c);
                if (c2664k0 == null || (interfaceC2675t = c2664k0.f8485b) == null) {
                    interfaceC2675t = this.f8491g;
                }
                float f5 = i7;
                float fMo600a = interfaceC2675t.mo600a((i6 - iM4336c) / f5);
                if (z5) {
                    return fMo600a;
                }
                f2 = (f5 * fMo600a) + iM4336c;
            }
        }
        return f2 / 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4631e(AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2, AbstractC2670o abstractC2670o3) {
        float[] fArr;
        boolean z5 = this.f8500p != AbstractC2658h0.f8476c;
        AbstractC2670o abstractC2670o4 = this.f8494j;
        C2439u c2439u = this.f8489e;
        C2438t c2438t = this.f8488d;
        if (abstractC2670o4 == null) {
            this.f8494j = abstractC2670o.mo4626c();
            this.f8495k = abstractC2670o3.mo4626c();
            int i5 = c2438t.f7878b;
            float[] fArr2 = new float[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                fArr2[i6] = c2438t.m4336c(i6) / 1000;
            }
            this.f8493i = fArr2;
            int i7 = c2438t.f7878b;
            int[] iArr = new int[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                iArr[i8] = 0;
            }
            this.f8492h = iArr;
        }
        if (z5) {
            if (this.f8500p != AbstractC2658h0.f8476c && AbstractC1665j.m2981a(this.f8496l, abstractC2670o) && AbstractC1665j.m2981a(this.f8497m, abstractC2670o2)) {
                return;
            }
            this.f8496l = abstractC2670o;
            this.f8497m = abstractC2670o2;
            int iMo4625b = abstractC2670o.mo4625b() + (abstractC2670o.mo4625b() % 2);
            this.f8498n = new float[iMo4625b];
            this.f8499o = new float[iMo4625b];
            int i9 = c2438t.f7878b;
            float[][] fArr3 = new float[i9][];
            for (int i10 = 0; i10 < i9; i10++) {
                int iM4336c = c2438t.m4336c(i10);
                C2664k0 c2664k0 = (C2664k0) c2439u.m4318b(iM4336c);
                if (iM4336c == 0 && c2664k0 == null) {
                    fArr = new float[iMo4625b];
                    for (int i11 = 0; i11 < iMo4625b; i11++) {
                        fArr[i11] = abstractC2670o.mo4624a(i11);
                    }
                } else if (iM4336c == this.f8490f && c2664k0 == null) {
                    fArr = new float[iMo4625b];
                    for (int i12 = 0; i12 < iMo4625b; i12++) {
                        fArr[i12] = abstractC2670o2.mo4624a(i12);
                    }
                } else {
                    AbstractC1665j.m2982b(c2664k0);
                    AbstractC2670o abstractC2670o5 = c2664k0.f8484a;
                    float[] fArr4 = new float[iMo4625b];
                    for (int i13 = 0; i13 < iMo4625b; i13++) {
                        fArr4[i13] = abstractC2670o5.mo4624a(i13);
                    }
                    fArr = fArr4;
                }
                fArr3[i10] = fArr;
            }
            this.f8500p = new C1753n(this.f8492h, this.f8493i, fArr3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2660i0
    /* JADX INFO: renamed from: k */
    public final int mo2502k() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2656g0
    /* JADX INFO: renamed from: o */
    public final AbstractC2670o mo258o(long j5, AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2, AbstractC2670o abstractC2670o3) {
        int[] iArr = AbstractC2658h0.f8474a;
        int i5 = 0;
        long j6 = (j5 / 1000000) - ((long) 0);
        long j7 = this.f8490f;
        if (j6 < 0) {
            j6 = 0;
        }
        long j8 = j6 > j7 ? j7 : j6;
        if (j8 < 0) {
            return abstractC2670o3;
        }
        m4631e(abstractC2670o, abstractC2670o2, abstractC2670o3);
        AbstractC2670o abstractC2670o4 = this.f8495k;
        AbstractC1665j.m2982b(abstractC2670o4);
        if (this.f8500p != AbstractC2658h0.f8476c) {
            int i6 = (int) j8;
            float fM4630d = m4630d(m4629c(i6), i6, false);
            float[] fArr = this.f8499o;
            C2671p[][] c2671pArr = (C2671p[][]) this.f8500p.f6028e;
            float f2 = c2671pArr[0][0].f8509a;
            float f5 = c2671pArr[c2671pArr.length - 1][0].f8510b;
            if (fM4630d < f2) {
                fM4630d = f2;
            }
            if (fM4630d <= f5) {
                f5 = fM4630d;
            }
            int length = fArr.length;
            boolean z5 = false;
            for (C2671p[] c2671pArr2 : c2671pArr) {
                int i7 = 0;
                int i8 = 0;
                while (i7 < length - 1) {
                    C2671p c2671p = c2671pArr2[i8];
                    if (f5 <= c2671p.f8510b) {
                        if (c2671p.f8524p) {
                            fArr[i7] = c2671p.f8525q;
                            fArr[i7 + 1] = c2671p.f8526r;
                        } else {
                            c2671p.m4634c(f5);
                            fArr[i7] = c2671p.m4632a();
                            fArr[i7 + 1] = c2671p.m4633b();
                        }
                        z5 = true;
                    }
                    i7 += 2;
                    i8++;
                }
                if (z5) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i5 < length2) {
                abstractC2670o4.mo4628e(fArr[i5], i5);
                i5++;
            }
        } else {
            AbstractC2670o abstractC2670oMo259r = mo259r((j8 - 1) * 1000000, abstractC2670o, abstractC2670o2, abstractC2670o3);
            AbstractC2670o abstractC2670oMo259r2 = mo259r(j8 * 1000000, abstractC2670o, abstractC2670o2, abstractC2670o3);
            int iMo4625b = abstractC2670oMo259r.mo4625b();
            while (i5 < iMo4625b) {
                abstractC2670o4.mo4628e((abstractC2670oMo259r.mo4624a(i5) - abstractC2670oMo259r2.mo4624a(i5)) * 1000.0f, i5);
                i5++;
            }
        }
        return abstractC2670o4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2656g0
    /* JADX INFO: renamed from: r */
    public final AbstractC2670o mo259r(long j5, AbstractC2670o abstractC2670o, AbstractC2670o abstractC2670o2, AbstractC2670o abstractC2670o3) {
        AbstractC2670o abstractC2670o4;
        AbstractC2670o abstractC2670o5;
        float f2;
        boolean z5;
        AbstractC2670o abstractC2670o6 = abstractC2670o;
        AbstractC2670o abstractC2670o7 = abstractC2670o2;
        int[] iArr = AbstractC2658h0.f8474a;
        int i5 = 0;
        long j6 = (j5 / 1000000) - ((long) 0);
        int i6 = this.f8490f;
        long j7 = i6;
        if (j6 < 0) {
            j6 = 0;
        }
        if (j6 <= j7) {
            j7 = j6;
        }
        int i7 = (int) j7;
        C2439u c2439u = this.f8489e;
        C2664k0 c2664k0 = (C2664k0) c2439u.m4318b(i7);
        if (c2664k0 != null) {
            return c2664k0.f8484a;
        }
        if (i7 >= i6) {
            return abstractC2670o7;
        }
        if (i7 <= 0) {
            return abstractC2670o6;
        }
        m4631e(abstractC2670o6, abstractC2670o7, abstractC2670o3);
        AbstractC2670o abstractC2670o8 = this.f8494j;
        AbstractC1665j.m2982b(abstractC2670o8);
        boolean z6 = true;
        if (this.f8500p != AbstractC2658h0.f8476c) {
            float fM4630d = m4630d(m4629c(i7), i7, false);
            float[] fArr = this.f8498n;
            C2671p[][] c2671pArr = (C2671p[][]) this.f8500p.f6028e;
            int length = c2671pArr.length - 1;
            float f5 = c2671pArr[0][0].f8509a;
            float f6 = c2671pArr[length][0].f8510b;
            int length2 = fArr.length;
            if (fM4630d < f5 || fM4630d > f6) {
                if (fM4630d > f6) {
                    f5 = f6;
                } else {
                    length = 0;
                }
                float f7 = fM4630d - f5;
                int i8 = 0;
                int i9 = 0;
                while (i8 < length2 - 1) {
                    C2671p c2671p = c2671pArr[length][i9];
                    boolean z7 = c2671p.f8524p;
                    float f8 = c2671p.f8526r;
                    float f9 = c2671p.f8525q;
                    if (z7) {
                        float f10 = c2671p.f8509a;
                        float f11 = c2671p.f8519k;
                        f2 = f7;
                        float f12 = c2671p.f8511c;
                        fArr[i8] = (f9 * f2) + ((c2671p.f8513e - f12) * (f5 - f10) * f11) + f12;
                        float f13 = c2671p.f8512d;
                        fArr[i8 + 1] = (f2 * f8) + ((c2671p.f8514f - f13) * (f5 - f10) * f11) + f13;
                    } else {
                        f2 = f7;
                        c2671p.m4634c(f5);
                        fArr[i8] = (c2671p.m4632a() * f2) + (c2671p.f8522n * c2671p.f8516h) + f9;
                        fArr[i8 + 1] = (c2671p.m4633b() * f2) + (c2671p.f8523o * c2671p.f8517i) + f8;
                    }
                    i8 += 2;
                    i9++;
                    f7 = f2;
                }
            } else {
                int length3 = c2671pArr.length;
                int i10 = 0;
                boolean z8 = false;
                while (i10 < length3) {
                    int i11 = i5;
                    int i12 = i11;
                    while (i11 < length2 - 1) {
                        C2671p c2671p2 = c2671pArr[i10][i12];
                        if (fM4630d <= c2671p2.f8510b) {
                            if (c2671p2.f8524p) {
                                float f14 = c2671p2.f8509a;
                                float f15 = c2671p2.f8519k;
                                float f16 = c2671p2.f8511c;
                                z5 = z6;
                                fArr[i11] = ((c2671p2.f8513e - f16) * (fM4630d - f14) * f15) + f16;
                                float f17 = c2671p2.f8512d;
                                fArr[i11 + 1] = ((c2671p2.f8514f - f17) * (fM4630d - f14) * f15) + f17;
                            } else {
                                z5 = z6;
                                c2671p2.m4634c(fM4630d);
                                fArr[i11] = (c2671p2.f8522n * c2671p2.f8516h) + c2671p2.f8525q;
                                fArr[i11 + 1] = (c2671p2.f8523o * c2671p2.f8517i) + c2671p2.f8526r;
                            }
                            z8 = z5;
                        } else {
                            z5 = z6;
                        }
                        i11 += 2;
                        i12++;
                        z6 = z5;
                    }
                    boolean z9 = z6;
                    if (z8) {
                        break;
                    }
                    i10++;
                    z6 = z9;
                    i5 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i13 = 0; i13 < length4; i13++) {
                abstractC2670o8.mo4628e(fArr[i13], i13);
            }
        } else {
            int iM4629c = m4629c(i7);
            float fM4630d2 = m4630d(iM4629c, i7, true);
            C2438t c2438t = this.f8488d;
            C2664k0 c2664k02 = (C2664k0) c2439u.m4318b(c2438t.m4336c(iM4629c));
            if (c2664k02 != null && (abstractC2670o5 = c2664k02.f8484a) != null) {
                abstractC2670o6 = abstractC2670o5;
            }
            C2664k0 c2664k03 = (C2664k0) c2439u.m4318b(c2438t.m4336c(iM4629c + 1));
            if (c2664k03 != null && (abstractC2670o4 = c2664k03.f8484a) != null) {
                abstractC2670o7 = abstractC2670o4;
            }
            int iMo4625b = abstractC2670o8.mo4625b();
            for (int i14 = 0; i14 < iMo4625b; i14++) {
                abstractC2670o8.mo4628e((abstractC2670o7.mo4624a(i14) * fM4630d2) + ((1 - fM4630d2) * abstractC2670o6.mo4624a(i14)), i14);
            }
        }
        return abstractC2670o8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2660i0
    /* JADX INFO: renamed from: s */
    public final int mo2503s() {
        return this.f8490f;
    }
}
