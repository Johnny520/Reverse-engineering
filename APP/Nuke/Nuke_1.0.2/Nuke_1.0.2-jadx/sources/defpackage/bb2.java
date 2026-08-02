package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bb2 {
    public final boolean a;
    public final int b;
    public int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bb2(b5 b5Var, int i, z8 z8Var) {
        this.d = b5Var;
        this.e = new b5(b5Var);
        this.c = i;
        this.h = null;
        boolean[] zArr = {true};
        bk bkVar = (bk) b5Var.i;
        Object[] objArr = bkVar.i;
        if (bkVar.k == -1) {
            ak akVar = new ak();
            akVar.h = 0;
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                j01 j01Var = ((zj) bkVar.e(i2)).b;
                int length2 = j01Var.i.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    ((i01) j01Var.e(i3)).d(akVar);
                }
            }
            bkVar.k = akVar.h;
        }
        ko koVar = new ko(bkVar.k, i, zArr);
        int length3 = objArr.length;
        for (int i4 = 0; i4 < length3; i4++) {
            j01 j01Var2 = ((zj) bkVar.e(i4)).b;
            int length4 = j01Var2.i.length;
            for (int i5 = 0; i5 < length4; i5++) {
                ((i01) j01Var2.e(i5)).d(koVar);
            }
        }
        this.a = zArr[0];
        int length5 = objArr.length * 3;
        int length6 = 0;
        for (Object obj : objArr) {
            zj zjVar = (zj) obj;
            if (zjVar != null) {
                length6 += zjVar.b.i.length;
            }
        }
        int i6 = length5 + length6;
        if (bkVar.k == -1) {
            ak akVar2 = new ak();
            akVar2.h = 0;
            int length7 = objArr.length;
            for (int i7 = 0; i7 < length7; i7++) {
                j01 j01Var3 = ((zj) bkVar.e(i7)).b;
                int length8 = j01Var3.i.length;
                for (int i8 = 0; i8 < length8; i8++) {
                    ((i01) j01Var3.e(i8)).d(akVar2);
                }
            }
            bkVar.k = akVar2.h;
        }
        int i9 = bkVar.k + (this.a ? 0 : this.c);
        this.b = i9;
        dq1 dq1Var = new dq1(z8Var, i6, length5, i9, i);
        this.f = dq1Var;
        this.g = new kj1(this, dq1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s72 c(i01 i01Var, r72 r72Var) {
        s72 s72VarI = i01Var.k;
        int i = i01Var.h.a;
        if (i != 14 && i != 16) {
            switch (i) {
            }
        } else if (s72VarI.i.length == 2 && r72Var.h == ((r72) s72VarI.e(1)).h) {
            s72VarI = s72.i((r72) s72VarI.e(1), (r72) s72VarI.e(0));
        }
        if (r72Var == null) {
            return s72VarI;
        }
        int length = s72VarI.i.length;
        s72 s72Var = new s72(length + 1);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            s72Var.f(i3, s72VarI.e(i2));
            i2 = i3;
        }
        s72Var.f(0, r72Var);
        if (!s72VarI.h) {
            s72Var.h = false;
        }
        return s72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(float f, long j) {
        int i = (this.c + 1) % 20;
        this.c = i;
        i40[] i40VarArr = (i40[]) this.e;
        i40 i40Var = i40VarArr[i];
        if (i40Var != null) {
            i40Var.a = j;
            i40Var.b = f;
        } else {
            i40 i40Var2 = new i40();
            i40Var2.a = j;
            i40Var2.b = f;
            i40VarArr[i] = i40Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float b(float f) {
        float f2;
        fa3 fa3Var;
        boolean z;
        int i;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            kz0.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        fa3 fa3Var2 = (fa3) this.d;
        float[] fArr = (float[]) this.f;
        float[] fArr2 = (float[]) this.g;
        int i2 = this.c;
        i40[] i40VarArr = (i40[]) this.e;
        i40 i40Var = i40VarArr[i2];
        if (i40Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            i40 i40Var2 = i40Var;
            while (true) {
                i40 i40Var3 = i40VarArr[i2];
                boolean z2 = this.a;
                if (i40Var3 == null) {
                    f2 = f4;
                    fa3Var = fa3Var2;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = i40Var.a;
                z = z2;
                i = 1;
                long j2 = i40Var3.a;
                float f5 = j - j2;
                f2 = f4;
                float fAbs = Math.abs(j2 - i40Var2.a);
                fa3Var = fa3Var2;
                i40 i40Var4 = (fa3Var == fa3.h || z) ? i40Var3 : i40Var;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = i40Var3.b;
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
            if (i3 >= this.b) {
                int iOrdinal = fa3Var.ordinal();
                if (iOrdinal != 0) {
                    int i4 = i;
                    if (iOrdinal != i4) {
                        c80.s();
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
                        float[] fArr3 = (float[]) this.h;
                        ga3.c(fArr2, fArr, i3, fArr3);
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
        this.a = z;
        this.d = fa3Var;
        if (z && fa3Var.equals(fa3.h)) {
            s.l("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = fa3Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                c80.s();
                throw null;
            }
            i = 2;
        }
        this.b = i;
        this.e = new i40[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR false, (wrap:fa3:0x0000: SGET  A[WRAPPED] (LINE:236) fa3.h fa3) A[MD:(boolean, fa3):void (m)] (LINE:236) call: bb2.<init>(boolean, fa3):void type: THIS */
    public /* synthetic */ bb2() {
        this(false, fa3.h);
    }

    public bb2(int i) {
        this(true, fa3.i);
    }
}
