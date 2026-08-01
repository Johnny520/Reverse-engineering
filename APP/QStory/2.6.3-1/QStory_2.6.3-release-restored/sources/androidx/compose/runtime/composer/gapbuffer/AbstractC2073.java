package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2209;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2073 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m2696() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m2697(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((C2065) arrayList.get(i4)).f3879;
            if (i5 < 0) {
                i5 += i2;
            }
            int iM9464 = AbstractC5227.m9464(i5, i);
            if (iM9464 < 0) {
                i3 = i4 + 1;
            } else {
                if (iM9464 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2068 m2698(AbstractC2202 abstractC2202) {
        C2068 c2068 = abstractC2202 instanceof C2068 ? (C2068) abstractC2202 : null;
        if (c2068 != null) {
            return c2068;
        }
        AbstractC2209.m3066("Inconsistent composition");
        C5043.m9161();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2699(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int m2700(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m2701(ArrayList arrayList, int i, int i2) {
        int iM2697 = m2697(arrayList, i, i2);
        return iM2697 >= 0 ? iM2697 : -(iM2697 + 1);
    }
}
