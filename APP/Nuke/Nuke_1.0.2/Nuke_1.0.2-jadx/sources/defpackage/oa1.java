package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oa1 extends fb3 {
    public final zj1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public oa1() {
        zj1 zj1Var = y01.a;
        this.b = new zj1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fb3
    public final void b() {
        zj1 zj1Var = this.b;
        int[] iArr = zj1Var.b;
        Object[] objArr = zj1Var.c;
        long[] jArr = zj1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        lk1 lk1Var = (lk1) objArr[i4];
                        Object[] objArr2 = lk1Var.a;
                        int i6 = lk1Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            na1 na1Var = (na1) objArr2[i7];
                            np npVar = na1Var.d;
                            if (npVar != null) {
                                npVar.cancel();
                            }
                            na1Var.d = null;
                            le1 le1Var = (le1) na1Var.a.i;
                            le1Var.i = true;
                            le1Var.h = false;
                            le1Var.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
