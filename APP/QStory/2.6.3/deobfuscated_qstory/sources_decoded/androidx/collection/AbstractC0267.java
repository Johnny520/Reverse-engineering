package androidx.collection;

import kotlin.jvm.internal.AbstractC4395;
import p187.AbstractC7772;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0267 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object f962 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long[] f961 = new long[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f960 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m830(C0275 c0275, Object obj, int i) {
        int i2 = c0275.f981;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM13124 = AbstractC7772.m13124(c0275.f982, i2, i);
            if (iM13124 < 0 || AbstractC4395.m8907(obj, c0275.f980[iM13124])) {
                return iM13124;
            }
            int i3 = iM13124 + 1;
            while (i3 < i2 && c0275.f982[i3] == i) {
                if (AbstractC4395.m8907(obj, c0275.f980[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM13124 - 1; i4 >= 0 && c0275.f982[i4] == i; i4--) {
                if (AbstractC4395.m8907(obj, c0275.f980[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            C0276.m840();
            return 0;
        }
    }
}
