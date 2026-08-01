package androidx.collection;

import kotlin.collections.AbstractC4346;
import p144.C7546;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0270 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0247 f975 = new C0247(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0247 m834(int... iArr) {
        C0247 c0247 = new C0247(iArr.length);
        int i = c0247.f985;
        if (i < 0) {
            C7546.m12743("");
            return null;
        }
        if (iArr.length == 0) {
            return c0247;
        }
        c0247.m793(iArr.length + i);
        int[] iArr2 = c0247.f986;
        int i2 = c0247.f985;
        if (i != i2) {
            AbstractC4346.m8842(iArr.length + i, i, i2, iArr2, iArr2);
        }
        AbstractC4346.m8838(i, 0, 12, iArr, iArr2);
        c0247.f985 += iArr.length;
        return c0247;
    }
}
