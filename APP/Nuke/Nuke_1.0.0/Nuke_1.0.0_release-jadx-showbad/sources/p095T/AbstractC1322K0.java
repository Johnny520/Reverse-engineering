package p095T;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: T.K0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1322K0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m2442a(int[] iArr, int i5) {
        return iArr[(i5 * 5) + 3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final int m2443b(ArrayList arrayList, int i5, int i6) {
        int iM2446e = m2446e(arrayList, i5, i6);
        return iM2446e >= 0 ? iM2446e : -(iM2446e + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final int m2444c(int[] iArr, int i5) {
        int i6 = i5 * 5;
        return Integer.bitCount(iArr[i6 + 1] >> 28) + iArr[i6 + 4];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m2445d(int[] iArr, int i5, int i6) {
        if (i6 >= 0) {
        }
        int i7 = (i5 * 5) + 1;
        iArr[i7] = i6 | (iArr[i7] & (-67108864));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m2446e(ArrayList arrayList, int i5, int i6) {
        int size = arrayList.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i8 = (i7 + size) >>> 1;
            int i9 = ((C1349a) arrayList.get(i8)).f4783a;
            if (i9 < 0) {
                i9 += i6;
            }
            int iM2987g = AbstractC1665j.m2987g(i9, i5);
            if (iM2987g < 0) {
                i7 = i8 + 1;
            } else {
                if (iM2987g <= 0) {
                    return i8;
                }
                size = i8 - 1;
            }
        }
        return -(i7 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m2447f() {
        throw new ConcurrentModificationException();
    }
}
