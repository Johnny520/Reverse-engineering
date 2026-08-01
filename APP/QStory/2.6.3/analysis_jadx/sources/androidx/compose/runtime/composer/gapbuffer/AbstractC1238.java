package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1374;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1238 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m2136() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m2137(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((C1230) arrayList.get(i4)).f3534;
            if (i5 < 0) {
                i5 += i2;
            }
            int iM8905 = AbstractC4395.m8905(i5, i);
            if (iM8905 < 0) {
                i3 = i4 + 1;
            } else {
                if (iM8905 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1233 m2138(AbstractC1367 abstractC1367) {
        C1233 c1233 = abstractC1367 instanceof C1233 ? (C1233) abstractC1367 : null;
        if (c1233 != null) {
            return c1233;
        }
        AbstractC1374.m2506("Inconsistent composition");
        C4211.m8602();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2139(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int m2140(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m2141(ArrayList arrayList, int i, int i2) {
        int iM2137 = m2137(arrayList, i, i2);
        return iM2137 >= 0 ? iM2137 : -(iM2137 + 1);
    }
}
