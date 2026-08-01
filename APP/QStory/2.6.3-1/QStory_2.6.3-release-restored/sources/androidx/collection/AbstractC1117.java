package androidx.collection;

import kotlin.collections.AbstractC5179;
import p160.C8376;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1117 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1094 f1320 = new C1094(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1094 m1395(int... iArr) {
        C1094 c1094 = new C1094(iArr.length);
        int i = c1094.f1330;
        if (i < 0) {
            C8376.m13331("");
            return null;
        }
        if (iArr.length == 0) {
            return c1094;
        }
        c1094.m1354(iArr.length + i);
        int[] iArr2 = c1094.f1331;
        int i2 = c1094.f1330;
        if (i != i2) {
            AbstractC5179.m9395(iArr.length + i, i, i2, iArr2, iArr2);
        }
        AbstractC5179.m9400(i, 0, 12, iArr, iArr2);
        c1094.f1330 += iArr.length;
        return c1094;
    }
}
