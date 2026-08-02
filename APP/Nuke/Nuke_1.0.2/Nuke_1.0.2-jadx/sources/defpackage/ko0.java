package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ko0 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final zj1 e;
    public final hx2 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ko0(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            j22.a("Invalid start index");
        }
        this.d = new ArrayList();
        zj1 zj1Var = new zj1();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            e51 e51Var = (e51) this.a.get(i3);
            int i4 = e51Var.c;
            int i5 = e51Var.d;
            zj1Var.h(i4, new br0(i3, i2, i5));
            i2 += i5;
        }
        this.e = zj1Var;
        this.f = new hx2(new jo0(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(int i, int i2) {
        br0 br0Var;
        int i3;
        int i4;
        zj1 zj1Var = this.e;
        br0 br0Var2 = (br0) zj1Var.b(i);
        if (br0Var2 == null) {
            return false;
        }
        int i5 = br0Var2.b;
        int i6 = i2 - br0Var2.c;
        br0Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = zj1Var.c;
        long[] jArr = zj1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (br0Var = (br0) objArr[(i7 << 3) + i9]).b) >= i5 && br0Var != br0Var2 && (i4 = i3 + i6) >= 0) {
                        br0Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
