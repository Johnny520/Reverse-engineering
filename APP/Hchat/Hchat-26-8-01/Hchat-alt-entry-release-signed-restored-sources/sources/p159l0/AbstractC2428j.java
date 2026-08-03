package p159l0;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import okio.C3193a;
import p117i0.AbstractC1855m;

/* JADX INFO: renamed from: l0.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2428j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m5787a(ArrayList arrayList, int i9, int i10) {
        int iM5791e = m5791e(arrayList, i9, i10);
        return iM5791e >= 0 ? iM5791e : -(iM5791e + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final int m5788b(int[] iArr, int i9) {
        int i10 = i9 * 5;
        return Integer.bitCount(iArr[i10 + 1] >> 28) + iArr[i10 + 4];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m5789c(int[] iArr, int i9, int i10) {
        if (i10 >= 0) {
        }
        int i11 = (i9 * 5) + 1;
        iArr[i11] = i10 | (iArr[i11] & (-67108864));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final C2426h m5790d(C2426h c2426h) {
        if (!(c2426h instanceof C2426h)) {
            c2426h = null;
        }
        if (c2426h != null) {
            return c2426h;
        }
        AbstractC1855m.m4574b("Inconsistent composition");
        C3193a.m6814c();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m5791e(ArrayList arrayList, int i9, int i10) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = ((C2420b) arrayList.get(i12)).f7923a;
            if (i13 < 0) {
                i13 += i10;
            }
            int iM3827c = AbstractC1416l.m3827c(i13, i9);
            if (iM3827c < 0) {
                i11 = i12 + 1;
            } else {
                if (iM3827c <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m5792f() {
        throw new ConcurrentModificationException();
    }
}
