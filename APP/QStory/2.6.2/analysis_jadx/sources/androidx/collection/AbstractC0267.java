package androidx.collection;

import kotlin.jvm.internal.AbstractC4394;
import p187.AbstractC7771;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0267 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object f962 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long[] f961 = new long[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f960 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m829(C0275 c0275, Object obj, int i) {
        int i2 = c0275.f981;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM13096 = AbstractC7771.m13096(c0275.f982, i2, i);
            if (iM13096 < 0 || AbstractC4394.m8917(obj, c0275.f980[iM13096])) {
                return iM13096;
            }
            int i3 = iM13096 + 1;
            while (i3 < i2 && c0275.f982[i3] == i) {
                if (AbstractC4394.m8917(obj, c0275.f980[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM13096 - 1; i4 >= 0 && c0275.f982[i4] == i; i4--) {
                if (AbstractC4394.m8917(obj, c0275.f980[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            C0276.m839();
            return 0;
        }
    }
}
