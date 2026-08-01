package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.app.C0108;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0720 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0108 f2027;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2028;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2029;

    public C0720(int i, int i2, C0108 c0108) {
        this.f2029 = i;
        this.f2028 = i2;
        this.f2027 = c0108;
        if (i < 0) {
            AbstractC7741.m13097("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        AbstractC7741.m13097("size should be > 0");
    }
}
