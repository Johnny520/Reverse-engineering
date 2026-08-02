package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jr1 implements g22 {

    /* JADX INFO: renamed from: h */
    public final int f5177h;

    /* JADX INFO: renamed from: i */
    public final int f5178i;

    /* JADX INFO: renamed from: j */
    public final C0590pr f5179j;

    public jr1(int i, int i2, C0590pr c0590pr) {
        this.f5177h = i;
        this.f5178i = i2;
        this.f5179j = c0590pr;
    }

    @Override // p000.g22
    /* JADX INFO: renamed from: a */
    public final long mo1788a(d11 d11Var, long j, d61 d61Var, long j2) {
        d11Var.getClass();
        d61Var.getClass();
        int i = d61Var == d61.f1885h ? d11Var.f1809c - ((int) (j2 >> 32)) : d11Var.f1807a;
        int i2 = this.f5178i;
        int i3 = (((int) (j >> 32)) - ((int) (j2 >> 32))) - i2;
        if (i3 < i2) {
            i3 = i2;
        }
        int iM779D = ci0.m779D(i, i2, i3);
        int i4 = d11Var.f1808b;
        int i5 = d11Var.f1810d;
        int i6 = (i4 + i5) / 2;
        int i7 = this.f5177h;
        int i8 = i6 + i7;
        int i9 = (int) (j2 & 4294967295L);
        int i10 = (i6 - i7) - i9;
        int i11 = (int) (j & 4294967295L);
        boolean z = i8 + i9 <= i11 - i2;
        boolean z2 = i10 >= i2;
        if (!z) {
            if (z2) {
                i8 = i10;
            } else {
                if (i4 <= i11 - i5) {
                    int i12 = (i11 - i9) - i2;
                    if (i12 >= i2) {
                        i2 = i12;
                    }
                    if (i8 > i2) {
                    }
                } else if (i10 >= i2) {
                    i2 = i10;
                }
                i8 = i2;
            }
        }
        this.f5179j.mo5j(Boolean.valueOf(i8 < i4));
        return (((long) iM779D) << 32) | (((long) i8) & 4294967295L);
    }
}
