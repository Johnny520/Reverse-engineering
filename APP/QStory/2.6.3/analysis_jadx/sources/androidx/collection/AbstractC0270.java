package androidx.collection;

import kotlin.collections.AbstractC4347;
import p144.C7547;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0270 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0247 f975 = new C0247(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0247 m835(int... iArr) {
        C0247 c0247 = new C0247(iArr.length);
        int i = c0247.f985;
        if (i < 0) {
            C7547.m12772("");
            return null;
        }
        if (iArr.length == 0) {
            return c0247;
        }
        c0247.m794(iArr.length + i);
        int[] iArr2 = c0247.f986;
        int i2 = c0247.f985;
        if (i != i2) {
            AbstractC4347.m8836(iArr.length + i, i, i2, iArr2, iArr2);
        }
        AbstractC4347.m8841(i, 0, 12, iArr, iArr2);
        c0247.f985 += iArr.length;
        return c0247;
    }
}
