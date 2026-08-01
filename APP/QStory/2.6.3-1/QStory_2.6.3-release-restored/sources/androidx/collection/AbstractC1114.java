package androidx.collection;

import kotlin.jvm.internal.AbstractC5227;
import p203.AbstractC8601;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1114 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object f1307 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long[] f1306 = new long[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f1305 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m1390(C1122 c1122, Object obj, int i) {
        int i2 = c1122.f1326;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM13683 = AbstractC8601.m13683(c1122.f1327, i2, i);
            if (iM13683 < 0 || AbstractC5227.m9466(obj, c1122.f1325[iM13683])) {
                return iM13683;
            }
            int i3 = iM13683 + 1;
            while (i3 < i2 && c1122.f1327[i3] == i) {
                if (AbstractC5227.m9466(obj, c1122.f1325[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM13683 - 1; i4 >= 0 && c1122.f1327[i4] == i; i4--) {
                if (AbstractC5227.m9466(obj, c1122.f1325[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            C1123.m1400();
            return 0;
        }
    }
}
