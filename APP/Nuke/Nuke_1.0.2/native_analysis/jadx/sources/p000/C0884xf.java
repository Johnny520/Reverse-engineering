package p000;

/* JADX INFO: renamed from: xf */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0884xf implements InterfaceC0845wf, InterfaceC0921yf {

    /* JADX INFO: renamed from: h */
    public final float f13003h;

    /* JADX INFO: renamed from: i */
    public final C0676s f13004i;

    /* JADX INFO: renamed from: j */
    public final float f13005j;

    public C0884xf(float f, C0676s c0676s) {
        this.f13003h = f;
        this.f13004i = c0676s;
        this.f13005j = f;
    }

    @Override // p000.InterfaceC0845wf, p000.InterfaceC0921yf
    /* JADX INFO: renamed from: b */
    public final float mo5883b() {
        return this.f13005j;
    }

    @Override // p000.InterfaceC0845wf
    /* JADX INFO: renamed from: e */
    public final void mo5488e(pf1 pf1Var, int i, int[] iArr, d61 d61Var, int[] iArr2) {
        int i2;
        int iRound;
        if (iArr.length == 0) {
            return;
        }
        int iMo692T = pf1Var.mo692T(this.f13003h);
        boolean z = d61Var == d61.f1886i;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iMo692T, iMax);
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
                int iMin3 = Math.min(iMo692T, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        if (i2 > 0) {
            int i11 = this.f13004i.f9836h;
            d61 d61Var2 = d61.f1885h;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0884xf)) {
            return false;
        }
        C0884xf c0884xf = (C0884xf) obj;
        return za0.m6404b(this.f13003h, c0884xf.f13003h) && this.f13004i.equals(c0884xf.f13004i);
    }

    @Override // p000.InterfaceC0921yf
    /* JADX INFO: renamed from: f */
    public final void mo5670f(int i, pf1 pf1Var, int[] iArr, int[] iArr2) {
        mo5488e(pf1Var, i, iArr, d61.f1885h, iArr2);
    }

    public final int hashCode() {
        return this.f13004i.hashCode() + hk1.m2205d(Float.hashCode(this.f13003h) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) za0.m6405c(this.f13003h)) + ", " + this.f13004i + ')';
    }
}
