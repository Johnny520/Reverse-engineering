package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.app.C0108;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0720 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0108 f2026;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2027;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2028;

    public C0720(int i, int i2, C0108 c0108) {
        this.f2028 = i;
        this.f2027 = i2;
        this.f2026 = c0108;
        if (i < 0) {
            AbstractC7740.m13069("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        AbstractC7740.m13069("size should be > 0");
    }
}
