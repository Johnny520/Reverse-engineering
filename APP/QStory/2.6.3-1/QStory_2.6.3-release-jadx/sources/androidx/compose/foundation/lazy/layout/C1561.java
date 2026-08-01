package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.app.C0955;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1561 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0955 f2372;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2373;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2374;

    public C1561(int i, int i2, C0955 c0955) {
        this.f2374 = i;
        this.f2373 = i2;
        this.f2372 = c0955;
        if (i < 0) {
            AbstractC8570.m13656("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        AbstractC8570.m13656("size should be > 0");
    }
}
