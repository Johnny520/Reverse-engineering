package p000;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sr2 {
    /* JADX INFO: renamed from: a */
    public static final int m4989a(ArrayList arrayList, int i, int i2) {
        int iM4993e = m4993e(arrayList, i, i2);
        return iM4993e >= 0 ? iM4993e : -(iM4993e + 1);
    }

    /* JADX INFO: renamed from: b */
    public static final int m4990b(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    /* JADX INFO: renamed from: c */
    public static final void m4991c(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* JADX INFO: renamed from: d */
    public static final qr2 m4992d(qr2 qr2Var) {
        if (!(qr2Var instanceof qr2)) {
            qr2Var = null;
        }
        if (qr2Var != null) {
            return qr2Var;
        }
        AbstractC0752tx.m5444b("Inconsistent composition");
        C0676s.m4644b();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final int m4993e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((ao0) arrayList.get(i4)).f313a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iM5089o = t11.m5089o(i5, i);
            if (iM5089o < 0) {
                i3 = i4 + 1;
            } else {
                if (iM5089o <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: f */
    public static final void m4994f() {
        throw new ConcurrentModificationException();
    }
}
