package androidx.collection;

import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import p160.C8376;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1094 extends AbstractC1125 {
    public C1094(int i) {
        this.f1331 = i == 0 ? AbstractC1121.f1324 : new int[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1352(int i, int i2) {
        if (i < 0 || i >= this.f1330) {
            C8376.m13331("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f1331;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1353(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f1330)) {
            C8376.m13331("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f1331;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            AbstractC5179.m9395(i, i + 1, i2, iArr, iArr);
        }
        this.f1330--;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m1354(int i) {
        int[] iArr = this.f1331;
        if (iArr.length < i) {
            this.f1331 = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1355(int i) {
        m1354(this.f1330 + 1);
        int[] iArr = this.f1331;
        int i2 = this.f1330;
        iArr[i2] = i;
        this.f1330 = i2 + 1;
    }

    public /* synthetic */ C1094() {
        this(16);
    }
}
