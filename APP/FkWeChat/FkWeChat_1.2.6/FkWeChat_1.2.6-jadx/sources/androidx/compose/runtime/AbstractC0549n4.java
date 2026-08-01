package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: androidx.compose.runtime.n4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0549n4 {

    /* JADX INFO: renamed from: a */
    public static final long[] f1501a = new long[0];

    /* JADX INFO: renamed from: m */
    public static final int m1954m(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 29);
    }

    /* JADX INFO: renamed from: n */
    public static final C0460b m1955n(ArrayList arrayList, int i10, int i11) {
        int iM1960s = m1960s(arrayList, i10, i11);
        if (iM1960s >= 0) {
            return (C0460b) arrayList.get(iM1960s);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static final int m1956o(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    /* JADX INFO: renamed from: p */
    public static final void m1957p(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        int i14 = i10 * 5;
        iArr[i14] = i11;
        iArr[i14 + 1] = ((z10 ? 1 : 0) << 30) | ((z11 ? 1 : 0) << 29) | ((z12 ? 1 : 0) << 28);
        iArr[i14 + 2] = i12;
        iArr[i14 + 3] = 0;
        iArr[i14 + 4] = i13;
    }

    /* JADX INFO: renamed from: q */
    public static final int m1958q(ArrayList arrayList, int i10, int i11) {
        int iM1960s = m1960s(arrayList, i10, i11);
        return iM1960s >= 0 ? iM1960s : -(iM1960s + 1);
    }

    /* JADX INFO: renamed from: r */
    public static final int m1959r(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 30);
    }

    /* JADX INFO: renamed from: s */
    public static final int m1960s(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int iM1527a = ((C0460b) arrayList.get(i13)).m1527a();
            if (iM1527a < 0) {
                iM1527a += i11;
            }
            int iM3843d = AbstractC1061t.m3843d(iM1527a, i10);
            if (iM3843d < 0) {
                i12 = i13 + 1;
            } else {
                if (iM3843d <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: renamed from: t */
    public static final int m1961t(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 28);
    }

    /* JADX INFO: renamed from: u */
    public static final void m1962u() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: v */
    public static final void m1963v(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = ((z10 ? 1 : 0) << 26) | (iArr[i11] & (-67108865));
    }

    /* JADX INFO: renamed from: w */
    public static final void m1964w(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 3] = i11;
    }

    /* JADX INFO: renamed from: x */
    public static final void m1965x(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = ((z10 ? 1 : 0) << 27) | (iArr[i11] & (-134217729));
    }

    /* JADX INFO: renamed from: y */
    public static final void m1966y(int[] iArr, int i10, int i11) {
        if (i11 >= 0) {
        }
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }
}
