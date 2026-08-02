package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ca3 implements z93 {
    public final yj1 h;
    public final zj1 i;
    public final int j;
    public final gd0 k;
    public int[] l = y93.a;
    public float[] m;
    public nd n;
    public nd o;
    public nd p;
    public nd q;
    public float[] r;
    public float[] s;
    public n4 t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ca3(yj1 yj1Var, zj1 zj1Var, int i, gd0 gd0Var) {
        this.h = yj1Var;
        this.i = zj1Var;
        this.j = i;
        this.k = gd0Var;
        float[] fArr = y93.b;
        this.m = fArr;
        this.r = fArr;
        this.s = fArr;
        this.t = y93.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(int i) {
        int i2;
        yj1 yj1Var = this.h;
        int i3 = yj1Var.b;
        int i4 = 0;
        if (i3 <= 0) {
            s.d("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = yj1Var.a[i2];
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d(int i, int i2, boolean z) {
        gd0 gd0Var;
        float f;
        yj1 yj1Var = this.h;
        if (i >= yj1Var.b - 1) {
            f = i2;
        } else {
            int iC = yj1Var.c(i);
            int iC2 = yj1Var.c(i + 1);
            if (i2 != iC) {
                int i3 = iC2 - iC;
                ba3 ba3Var = (ba3) this.i.b(iC);
                if (ba3Var == null || (gd0Var = ba3Var.b) == null) {
                    gd0Var = this.k;
                }
                float f2 = i3;
                float fB = gd0Var.b((i2 - iC) / f2);
                return z ? fB : ((f2 * fB) + iC) / 1000.0f;
            }
            f = iC;
        }
        return f / 1000.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(nd ndVar, nd ndVar2, nd ndVar3) {
        float[] fArr;
        boolean z = this.t != y93.c;
        nd ndVar4 = this.n;
        zj1 zj1Var = this.i;
        yj1 yj1Var = this.h;
        if (ndVar4 == null) {
            this.n = ndVar.c();
            this.o = ndVar3.c();
            int i = yj1Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = yj1Var.c(i2) / 1000.0f;
            }
            this.m = fArr2;
            int i3 = yj1Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.l = iArr;
        }
        if (z) {
            if (this.t != y93.c && t11.l(this.p, ndVar) && t11.l(this.q, ndVar2)) {
                return;
            }
            this.p = ndVar;
            this.q = ndVar2;
            int iB = ndVar.b() + (ndVar.b() % 2);
            this.r = new float[iB];
            this.s = new float[iB];
            int i5 = yj1Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = yj1Var.c(i6);
                ba3 ba3Var = (ba3) zj1Var.b(iC);
                if (iC == 0 && ba3Var == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = ndVar.a(i7);
                    }
                } else if (iC == this.j && ba3Var == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = ndVar2.a(i8);
                    }
                } else {
                    ba3Var.getClass();
                    nd ndVar5 = ba3Var.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = ndVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.t = new n4(this.l, this.m, fArr3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.z93
    public final int k() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public final nd q(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        long j2 = j / 1000000;
        int[] iArr = y93.a;
        long j3 = this.j;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return ndVar3;
        }
        e(ndVar, ndVar2, ndVar3);
        nd ndVar4 = this.o;
        ndVar4.getClass();
        int i = 0;
        if (this.t != y93.c) {
            int i2 = (int) j4;
            float fD = d(c(i2), i2, false);
            float[] fArr = this.s;
            sf[][] sfVarArr = (sf[][]) this.t.i;
            float f = sfVarArr[0][0].a;
            float f2 = sfVarArr[sfVarArr.length - 1][0].b;
            if (fD < f) {
                fD = f;
            }
            if (fD <= f2) {
                f2 = fD;
            }
            int length = fArr.length;
            boolean z = false;
            for (sf[] sfVarArr2 : sfVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    sf sfVar = sfVarArr2[i4];
                    if (f2 <= sfVar.b) {
                        if (sfVar.p) {
                            fArr[i3] = sfVar.q;
                            fArr[i3 + 1] = sfVar.r;
                        } else {
                            sfVar.c(f2);
                            fArr[i3] = sfVar.a();
                            fArr[i3 + 1] = sfVar.b();
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
                ndVar4.e(fArr[i], i);
                i++;
            }
        } else {
            nd ndVarS = s((j4 - 1) * 1000000, ndVar, ndVar2, ndVar3);
            nd ndVarS2 = s(j4 * 1000000, ndVar, ndVar2, ndVar3);
            int iB = ndVarS.b();
            while (i < iB) {
                ndVar4.e((ndVarS.a(i) - ndVarS2.a(i)) * 1000.0f, i);
                i++;
            }
        }
        return ndVar4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.z93
    public final int r() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x93
    public final nd s(long j, nd ndVar, nd ndVar2, nd ndVar3) {
        nd ndVar4;
        nd ndVar5;
        sf[][] sfVarArr;
        nd ndVar6 = ndVar;
        long j2 = j / 1000000;
        int[] iArr = y93.a;
        int i = this.j;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        zj1 zj1Var = this.i;
        ba3 ba3Var = (ba3) zj1Var.b(i2);
        if (ba3Var != null) {
            return ba3Var.a;
        }
        if (i2 >= i) {
            return ndVar2;
        }
        if (i2 <= 0) {
            return ndVar6;
        }
        e(ndVar6, ndVar2, ndVar3);
        nd ndVar7 = this.n;
        ndVar7.getClass();
        int i3 = 0;
        if (this.t != y93.c) {
            float fD = d(c(i2), i2, false);
            float[] fArr = this.r;
            sf[][] sfVarArr2 = (sf[][]) this.t.i;
            int length = sfVarArr2.length - 1;
            float f = sfVarArr2[0][0].a;
            float f2 = sfVarArr2[length][0].b;
            int length2 = fArr.length;
            if (fD < f || fD > f2) {
                if (fD > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fD - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    sf sfVar = sfVarArr2[length][i5];
                    boolean z = sfVar.p;
                    float f4 = sfVar.r;
                    float f5 = sfVar.q;
                    if (z) {
                        float f6 = sfVar.a;
                        float f7 = sfVar.k;
                        float f8 = sfVar.c;
                        sfVarArr = sfVarArr2;
                        fArr[i4] = (f5 * f3) + ((sfVar.e - f8) * (f - f6) * f7) + f8;
                        float f9 = (f - f6) * f7;
                        float f10 = sfVar.d;
                        fArr[i4 + 1] = (f4 * f3) + ((sfVar.f - f10) * f9) + f10;
                    } else {
                        sfVarArr = sfVarArr2;
                        sfVar.c(f);
                        fArr[i4] = (sfVar.a() * f3) + (sfVar.n * sfVar.h) + f5;
                        fArr[i4 + 1] = (sfVar.b() * f3) + (sfVar.o * sfVar.i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    sfVarArr2 = sfVarArr;
                }
            } else {
                int length3 = sfVarArr2.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        sf sfVar2 = sfVarArr2[i6][i8];
                        if (fD <= sfVar2.b) {
                            if (sfVar2.p) {
                                float f11 = sfVar2.a;
                                float f12 = sfVar2.k;
                                float f13 = sfVar2.c;
                                fArr[i7] = ((sfVar2.e - f13) * (fD - f11) * f12) + f13;
                                float f14 = sfVar2.d;
                                fArr[i7 + 1] = ((sfVar2.f - f14) * (fD - f11) * f12) + f14;
                            } else {
                                sfVar2.c(fD);
                                fArr[i7] = (sfVar2.n * sfVar2.h) + sfVar2.q;
                                fArr[i7 + 1] = (sfVar2.o * sfVar2.i) + sfVar2.r;
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
                ndVar7.e(fArr[i9], i9);
            }
        } else {
            int iC = c(i2);
            float fD2 = d(iC, i2, true);
            yj1 yj1Var = this.h;
            ba3 ba3Var2 = (ba3) zj1Var.b(yj1Var.c(iC));
            if (ba3Var2 != null && (ndVar5 = ba3Var2.a) != null) {
                ndVar6 = ndVar5;
            }
            ba3 ba3Var3 = (ba3) zj1Var.b(yj1Var.c(iC + 1));
            if (ba3Var3 == null || (ndVar4 = ba3Var3.a) == null) {
                ndVar4 = ndVar2;
            }
            int iB = ndVar7.b();
            for (int i10 = 0; i10 < iB; i10++) {
                ndVar7.e((ndVar4.a(i10) * fD2) + ((1.0f - fD2) * ndVar6.a(i10)), i10);
            }
        }
        return ndVar7;
    }
}
