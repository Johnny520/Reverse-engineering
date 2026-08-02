package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bb2 {

    /* JADX INFO: renamed from: a */
    public final boolean f760a;

    /* JADX INFO: renamed from: b */
    public final int f761b;

    /* JADX INFO: renamed from: c */
    public int f762c;

    /* JADX INFO: renamed from: d */
    public final Object f763d;

    /* JADX INFO: renamed from: e */
    public final Object f764e;

    /* JADX INFO: renamed from: f */
    public final Object f765f;

    /* JADX INFO: renamed from: g */
    public final Object f766g;

    /* JADX INFO: renamed from: h */
    public Object f767h;

    public bb2(C0043b5 c0043b5, int i, C0953z8 c0953z8) {
        this.f763d = c0043b5;
        this.f764e = new C0043b5(c0043b5);
        this.f762c = i;
        this.f767h = null;
        boolean[] zArr = {true};
        C0058bk c0058bk = (C0058bk) c0043b5.f562i;
        Object[] objArr = c0058bk.f5590i;
        if (c0058bk.f904k == -1) {
            C0021ak c0021ak = new C0021ak();
            c0021ak.f232h = 0;
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                j01 j01Var = ((C0964zj) c0058bk.m2693e(i2)).f13926b;
                int length2 = j01Var.f5590i.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    ((i01) j01Var.m2693e(i3)).mo2239d(c0021ak);
                }
            }
            c0058bk.f904k = c0021ak.f232h;
        }
        C0394ko c0394ko = new C0394ko(c0058bk.f904k, i, zArr);
        int length3 = objArr.length;
        for (int i4 = 0; i4 < length3; i4++) {
            j01 j01Var2 = ((C0964zj) c0058bk.m2693e(i4)).f13926b;
            int length4 = j01Var2.f5590i.length;
            for (int i5 = 0; i5 < length4; i5++) {
                ((i01) j01Var2.m2693e(i5)).mo2239d(c0394ko);
            }
        }
        this.f760a = zArr[0];
        int length5 = objArr.length * 3;
        int length6 = 0;
        for (Object obj : objArr) {
            C0964zj c0964zj = (C0964zj) obj;
            if (c0964zj != null) {
                length6 += c0964zj.f13926b.f5590i.length;
            }
        }
        int i6 = length5 + length6;
        if (c0058bk.f904k == -1) {
            C0021ak c0021ak2 = new C0021ak();
            c0021ak2.f232h = 0;
            int length7 = objArr.length;
            for (int i7 = 0; i7 < length7; i7++) {
                j01 j01Var3 = ((C0964zj) c0058bk.m2693e(i7)).f13926b;
                int length8 = j01Var3.f5590i.length;
                for (int i8 = 0; i8 < length8; i8++) {
                    ((i01) j01Var3.m2693e(i8)).mo2239d(c0021ak2);
                }
            }
            c0058bk.f904k = c0021ak2.f232h;
        }
        int i9 = c0058bk.f904k + (this.f760a ? 0 : this.f762c);
        this.f761b = i9;
        dq1 dq1Var = new dq1(c0953z8, i6, length5, i9, i);
        this.f765f = dq1Var;
        this.f766g = new kj1(this, dq1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s72 m508c(i01 i01Var, r72 r72Var) {
        s72 s72VarM4747i = i01Var.f4205k;
        int i = i01Var.f4202h.f13811a;
        if (i != 14 && i != 16) {
            switch (i) {
            }
        } else if (s72VarM4747i.f5590i.length == 2 && r72Var.f9419h == ((r72) s72VarM4747i.m2693e(1)).f9419h) {
            s72VarM4747i = s72.m4747i((r72) s72VarM4747i.m2693e(1), (r72) s72VarM4747i.m2693e(0));
        }
        if (r72Var == null) {
            return s72VarM4747i;
        }
        int length = s72VarM4747i.f5590i.length;
        s72 s72Var = new s72(length + 1);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            s72Var.m2694f(i3, s72VarM4747i.m2693e(i2));
            i2 = i3;
        }
        s72Var.m2694f(0, r72Var);
        if (!s72VarM4747i.f11990h) {
            s72Var.f11990h = false;
        }
        return s72Var;
    }

    /* JADX INFO: renamed from: a */
    public void m509a(float f, long j) {
        int i = (this.f762c + 1) % 20;
        this.f762c = i;
        i40[] i40VarArr = (i40[]) this.f764e;
        i40 i40Var = i40VarArr[i];
        if (i40Var != null) {
            i40Var.f4257a = j;
            i40Var.f4258b = f;
        } else {
            i40 i40Var2 = new i40();
            i40Var2.f4257a = j;
            i40Var2.f4258b = f;
            i40VarArr[i] = i40Var2;
        }
    }

    /* JADX INFO: renamed from: b */
    public float m510b(float f) {
        float f2;
        fa3 fa3Var;
        boolean z;
        int i;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            kz0.m2764b("maximumVelocity should be a positive value. You specified=" + f);
        }
        fa3 fa3Var2 = (fa3) this.f763d;
        float[] fArr = (float[]) this.f765f;
        float[] fArr2 = (float[]) this.f766g;
        int i2 = this.f762c;
        i40[] i40VarArr = (i40[]) this.f764e;
        i40 i40Var = i40VarArr[i2];
        if (i40Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            i40 i40Var2 = i40Var;
            while (true) {
                i40 i40Var3 = i40VarArr[i2];
                boolean z2 = this.f760a;
                if (i40Var3 == null) {
                    f2 = f4;
                    fa3Var = fa3Var2;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = i40Var.f4257a;
                z = z2;
                i = 1;
                long j2 = i40Var3.f4257a;
                float f5 = j - j2;
                f2 = f4;
                float fAbs = Math.abs(j2 - i40Var2.f4257a);
                fa3Var = fa3Var2;
                i40 i40Var4 = (fa3Var == fa3.f2884h || z) ? i40Var3 : i40Var;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = i40Var3.f4258b;
                fArr2[i3] = -f5;
                if (i2 == 0) {
                    i2 = 20;
                }
                i2--;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                i40Var2 = i40Var4;
                fa3Var2 = fa3Var;
                f4 = f2;
            }
            if (i3 >= this.f761b) {
                int iOrdinal = fa3Var.ordinal();
                if (iOrdinal != 0) {
                    int i4 = i;
                    if (iOrdinal != i4) {
                        c80.m675s();
                        return f2;
                    }
                    int i5 = i3 - i4;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f));
                } else {
                    try {
                        float[] fArr3 = (float[]) this.f767h;
                        ga3.m1818c(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                }
                f3 = fSignum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public bb2(boolean z, fa3 fa3Var) {
        int i;
        this.f760a = z;
        this.f763d = fa3Var;
        if (z && fa3Var.equals(fa3.f2884h)) {
            C0676s.m4653l("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = fa3Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                c80.m675s();
                throw null;
            }
            i = 2;
        }
        this.f761b = i;
        this.f764e = new i40[20];
        this.f765f = new float[20];
        this.f766g = new float[20];
        this.f767h = new float[3];
    }

    public /* synthetic */ bb2() {
        this(false, fa3.f2884h);
    }

    public bb2(int i) {
        this(true, fa3.f2885i);
    }
}
