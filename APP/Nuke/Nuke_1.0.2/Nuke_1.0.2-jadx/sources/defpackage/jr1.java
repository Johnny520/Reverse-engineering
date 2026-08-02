package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jr1 implements g22 {
    public final int h;
    public final int i;
    public final pr j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jr1(int i, int i2, pr prVar) {
        this.h = i;
        this.i = i2;
        this.j = prVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g22
    public final long a(d11 d11Var, long j, d61 d61Var, long j2) {
        d11Var.getClass();
        d61Var.getClass();
        int i = d61Var == d61.h ? d11Var.c - ((int) (j2 >> 32)) : d11Var.a;
        int i2 = this.i;
        int i3 = (((int) (j >> 32)) - ((int) (j2 >> 32))) - i2;
        if (i3 < i2) {
            i3 = i2;
        }
        int iD = ci0.D(i, i2, i3);
        int i4 = d11Var.b;
        int i5 = d11Var.d;
        int i6 = (i4 + i5) / 2;
        int i7 = this.h;
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
        this.j.j(Boolean.valueOf(i8 < i4));
        return (((long) iD) << 32) | (((long) i8) & 4294967295L);
    }
}
