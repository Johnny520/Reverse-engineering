package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xf implements wf, yf {
    public final float h;
    public final s i;
    public final float j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xf(float f, s sVar) {
        this.h = f;
        this.i = sVar;
        this.j = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wf, defpackage.yf
    public final float b() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wf
    public final void e(pf1 pf1Var, int i, int[] iArr, d61 d61Var, int[] iArr2) {
        int i2;
        int iRound;
        if (iArr.length == 0) {
            return;
        }
        int iT = pf1Var.T(this.h);
        boolean z = d61Var == d61.i;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iT, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iT, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        if (i2 > 0) {
            int i11 = this.i.h;
            d61 d61Var2 = d61.h;
            switch (i11) {
                case 1:
                    iRound = Math.round((1.0f + (d61Var == d61Var2 ? 1.0f : (-1.0f) * 1.0f)) * ((i2 + 0) / 2.0f));
                    break;
                default:
                    iRound = Math.round((1.0f + (d61Var != d61Var2 ? 1.0f : -1.0f)) * (i2 / 2.0f));
                    break;
            }
            if (z) {
                iRound -= i2;
            }
            if (iRound != 0) {
                int length3 = iArr2.length;
                for (int i12 = 0; i12 < length3; i12++) {
                    iArr2[i12] = iArr2[i12] + iRound;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf)) {
            return false;
        }
        xf xfVar = (xf) obj;
        return za0.b(this.h, xfVar.h) && this.i.equals(xfVar.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yf
    public final void f(int i, pf1 pf1Var, int[] iArr, int[] iArr2) {
        e(pf1Var, i, iArr, d61.h, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.i.hashCode() + hk1.d(Float.hashCode(this.h) * 31, 31, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) za0.c(this.h)) + ", " + this.i + ')';
    }
}
