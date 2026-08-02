package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ca3 implements z93 {

    /* JADX INFO: renamed from: h */
    public final yj1 f1280h;

    /* JADX INFO: renamed from: i */
    public final zj1 f1281i;

    /* JADX INFO: renamed from: j */
    public final int f1282j;

    /* JADX INFO: renamed from: k */
    public final gd0 f1283k;

    /* JADX INFO: renamed from: l */
    public int[] f1284l = y93.f13370a;

    /* JADX INFO: renamed from: m */
    public float[] f1285m;

    /* JADX INFO: renamed from: n */
    public AbstractC0494nd f1286n;

    /* JADX INFO: renamed from: o */
    public AbstractC0494nd f1287o;

    /* JADX INFO: renamed from: p */
    public AbstractC0494nd f1288p;

    /* JADX INFO: renamed from: q */
    public AbstractC0494nd f1289q;

    /* JADX INFO: renamed from: r */
    public float[] f1290r;

    /* JADX INFO: renamed from: s */
    public float[] f1291s;

    /* JADX INFO: renamed from: t */
    public C0485n4 f1292t;

    public ca3(yj1 yj1Var, zj1 zj1Var, int i, gd0 gd0Var) {
        this.f1280h = yj1Var;
        this.f1281i = zj1Var;
        this.f1282j = i;
        this.f1283k = gd0Var;
        float[] fArr = y93.f13371b;
        this.f1285m = fArr;
        this.f1290r = fArr;
        this.f1291s = fArr;
        this.f1292t = y93.f13372c;
    }

    /* JADX INFO: renamed from: c */
    public final int m733c(int i) {
        int i2;
        yj1 yj1Var = this.f1280h;
        int i3 = yj1Var.f13491b;
        int i4 = 0;
        if (i3 <= 0) {
            C0676s.m4646d("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = yj1Var.f13490a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    /* JADX INFO: renamed from: d */
    public final float m734d(int i, int i2, boolean z) {
        gd0 gd0Var;
        float f;
        yj1 yj1Var = this.f1280h;
        if (i >= yj1Var.f13491b - 1) {
            f = i2;
        } else {
            int iM6283c = yj1Var.m6283c(i);
            int iM6283c2 = yj1Var.m6283c(i + 1);
            if (i2 != iM6283c) {
                int i3 = iM6283c2 - iM6283c;
                ba3 ba3Var = (ba3) this.f1281i.m6022b(iM6283c);
                if (ba3Var == null || (gd0Var = ba3Var.f753b) == null) {
                    gd0Var = this.f1283k;
                }
                float f2 = i3;
                float fMo684b = gd0Var.mo684b((i2 - iM6283c) / f2);
                return z ? fMo684b : ((f2 * fMo684b) + iM6283c) / 1000.0f;
            }
            f = iM6283c;
        }
        return f / 1000.0f;
    }

    /* JADX INFO: renamed from: e */
    public final void m735e(AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        float[] fArr;
        boolean z = this.f1292t != y93.f13372c;
        AbstractC0494nd abstractC0494nd4 = this.f1286n;
        zj1 zj1Var = this.f1281i;
        yj1 yj1Var = this.f1280h;
        if (abstractC0494nd4 == null) {
            this.f1286n = abstractC0494nd.mo2479c();
            this.f1287o = abstractC0494nd3.mo2479c();
            int i = yj1Var.f13491b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = yj1Var.m6283c(i2) / 1000.0f;
            }
            this.f1285m = fArr2;
            int i3 = yj1Var.f13491b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.f1284l = iArr;
        }
        if (z) {
            if (this.f1292t != y93.f13372c && t11.m5086l(this.f1288p, abstractC0494nd) && t11.m5086l(this.f1289q, abstractC0494nd2)) {
                return;
            }
            this.f1288p = abstractC0494nd;
            this.f1289q = abstractC0494nd2;
            int iMo2478b = abstractC0494nd.mo2478b() + (abstractC0494nd.mo2478b() % 2);
            this.f1290r = new float[iMo2478b];
            this.f1291s = new float[iMo2478b];
            int i5 = yj1Var.f13491b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iM6283c = yj1Var.m6283c(i6);
                ba3 ba3Var = (ba3) zj1Var.m6022b(iM6283c);
                if (iM6283c == 0 && ba3Var == null) {
                    fArr = new float[iMo2478b];
                    for (int i7 = 0; i7 < iMo2478b; i7++) {
                        fArr[i7] = abstractC0494nd.mo2477a(i7);
                    }
                } else if (iM6283c == this.f1282j && ba3Var == null) {
                    fArr = new float[iMo2478b];
                    for (int i8 = 0; i8 < iMo2478b; i8++) {
                        fArr[i8] = abstractC0494nd2.mo2477a(i8);
                    }
                } else {
                    ba3Var.getClass();
                    AbstractC0494nd abstractC0494nd5 = ba3Var.f752a;
                    float[] fArr4 = new float[iMo2478b];
                    for (int i9 = 0; i9 < iMo2478b; i9++) {
                        fArr4[i9] = abstractC0494nd5.mo2477a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.f1292t = new C0485n4(this.f1284l, this.f1285m, fArr3);
        }
    }

    @Override // p000.z93
    /* JADX INFO: renamed from: k */
    public final int mo736k() {
        return 0;
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: q */
    public final AbstractC0494nd mo737q(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        long j2 = j / 1000000;
        int[] iArr = y93.f13370a;
        long j3 = this.f1282j;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return abstractC0494nd3;
        }
        m735e(abstractC0494nd, abstractC0494nd2, abstractC0494nd3);
        AbstractC0494nd abstractC0494nd4 = this.f1287o;
        abstractC0494nd4.getClass();
        int i = 0;
        if (this.f1292t != y93.f13372c) {
            int i2 = (int) j4;
            float fM734d = m734d(m733c(i2), i2, false);
            float[] fArr = this.f1291s;
            C0692sf[][] c0692sfArr = (C0692sf[][]) this.f1292t.f6983i;
            float f = c0692sfArr[0][0].f10082a;
            float f2 = c0692sfArr[c0692sfArr.length - 1][0].f10083b;
            if (fM734d < f) {
                fM734d = f;
            }
            if (fM734d <= f2) {
                f2 = fM734d;
            }
            int length = fArr.length;
            boolean z = false;
            for (C0692sf[] c0692sfArr2 : c0692sfArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    C0692sf c0692sf = c0692sfArr2[i4];
                    if (f2 <= c0692sf.f10083b) {
                        if (c0692sf.f10097p) {
                            fArr[i3] = c0692sf.f10098q;
                            fArr[i3 + 1] = c0692sf.f10099r;
                        } else {
                            c0692sf.m4861c(f2);
                            fArr[i3] = c0692sf.m4859a();
                            fArr[i3 + 1] = c0692sf.m4860b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                abstractC0494nd4.mo2481e(fArr[i], i);
                i++;
            }
        } else {
            AbstractC0494nd abstractC0494ndMo739s = mo739s((j4 - 1) * 1000000, abstractC0494nd, abstractC0494nd2, abstractC0494nd3);
            AbstractC0494nd abstractC0494ndMo739s2 = mo739s(j4 * 1000000, abstractC0494nd, abstractC0494nd2, abstractC0494nd3);
            int iMo2478b = abstractC0494ndMo739s.mo2478b();
            while (i < iMo2478b) {
                abstractC0494nd4.mo2481e((abstractC0494ndMo739s.mo2477a(i) - abstractC0494ndMo739s2.mo2477a(i)) * 1000.0f, i);
                i++;
            }
        }
        return abstractC0494nd4;
    }

    @Override // p000.z93
    /* JADX INFO: renamed from: r */
    public final int mo738r() {
        return this.f1282j;
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: s */
    public final AbstractC0494nd mo739s(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        AbstractC0494nd abstractC0494nd4;
        AbstractC0494nd abstractC0494nd5;
        C0692sf[][] c0692sfArr;
        AbstractC0494nd abstractC0494nd6 = abstractC0494nd;
        long j2 = j / 1000000;
        int[] iArr = y93.f13370a;
        int i = this.f1282j;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        zj1 zj1Var = this.f1281i;
        ba3 ba3Var = (ba3) zj1Var.m6022b(i2);
        if (ba3Var != null) {
            return ba3Var.f752a;
        }
        if (i2 >= i) {
            return abstractC0494nd2;
        }
        if (i2 <= 0) {
            return abstractC0494nd6;
        }
        m735e(abstractC0494nd6, abstractC0494nd2, abstractC0494nd3);
        AbstractC0494nd abstractC0494nd7 = this.f1286n;
        abstractC0494nd7.getClass();
        int i3 = 0;
        if (this.f1292t != y93.f13372c) {
            float fM734d = m734d(m733c(i2), i2, false);
            float[] fArr = this.f1290r;
            C0692sf[][] c0692sfArr2 = (C0692sf[][]) this.f1292t.f6983i;
            int length = c0692sfArr2.length - 1;
            float f = c0692sfArr2[0][0].f10082a;
            float f2 = c0692sfArr2[length][0].f10083b;
            int length2 = fArr.length;
            if (fM734d < f || fM734d > f2) {
                if (fM734d > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fM734d - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    C0692sf c0692sf = c0692sfArr2[length][i5];
                    boolean z = c0692sf.f10097p;
                    float f4 = c0692sf.f10099r;
                    float f5 = c0692sf.f10098q;
                    if (z) {
                        float f6 = c0692sf.f10082a;
                        float f7 = c0692sf.f10092k;
                        float f8 = c0692sf.f10084c;
                        c0692sfArr = c0692sfArr2;
                        fArr[i4] = (f5 * f3) + ((c0692sf.f10086e - f8) * (f - f6) * f7) + f8;
                        float f9 = (f - f6) * f7;
                        float f10 = c0692sf.f10085d;
                        fArr[i4 + 1] = (f4 * f3) + ((c0692sf.f10087f - f10) * f9) + f10;
                    } else {
                        c0692sfArr = c0692sfArr2;
                        c0692sf.m4861c(f);
                        fArr[i4] = (c0692sf.m4859a() * f3) + (c0692sf.f10095n * c0692sf.f10089h) + f5;
                        fArr[i4 + 1] = (c0692sf.m4860b() * f3) + (c0692sf.f10096o * c0692sf.f10090i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    c0692sfArr2 = c0692sfArr;
                }
            } else {
                int length3 = c0692sfArr2.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        C0692sf c0692sf2 = c0692sfArr2[i6][i8];
                        if (fM734d <= c0692sf2.f10083b) {
                            if (c0692sf2.f10097p) {
                                float f11 = c0692sf2.f10082a;
                                float f12 = c0692sf2.f10092k;
                                float f13 = c0692sf2.f10084c;
                                fArr[i7] = ((c0692sf2.f10086e - f13) * (fM734d - f11) * f12) + f13;
                                float f14 = c0692sf2.f10085d;
                                fArr[i7 + 1] = ((c0692sf2.f10087f - f14) * (fM734d - f11) * f12) + f14;
                            } else {
                                c0692sf2.m4861c(fM734d);
                                fArr[i7] = (c0692sf2.f10095n * c0692sf2.f10089h) + c0692sf2.f10098q;
                                fArr[i7 + 1] = (c0692sf2.f10096o * c0692sf2.f10090i) + c0692sf2.f10099r;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                abstractC0494nd7.mo2481e(fArr[i9], i9);
            }
        } else {
            int iM733c = m733c(i2);
            float fM734d2 = m734d(iM733c, i2, true);
            yj1 yj1Var = this.f1280h;
            ba3 ba3Var2 = (ba3) zj1Var.m6022b(yj1Var.m6283c(iM733c));
            if (ba3Var2 != null && (abstractC0494nd5 = ba3Var2.f752a) != null) {
                abstractC0494nd6 = abstractC0494nd5;
            }
            ba3 ba3Var3 = (ba3) zj1Var.m6022b(yj1Var.m6283c(iM733c + 1));
            if (ba3Var3 == null || (abstractC0494nd4 = ba3Var3.f752a) == null) {
                abstractC0494nd4 = abstractC0494nd2;
            }
            int iMo2478b = abstractC0494nd7.mo2478b();
            for (int i10 = 0; i10 < iMo2478b; i10++) {
                abstractC0494nd7.mo2481e((abstractC0494nd4.mo2477a(i10) * fM734d2) + ((1.0f - fM734d2) * abstractC0494nd6.mo2477a(i10)), i10);
            }
        }
        return abstractC0494nd7;
    }
}
