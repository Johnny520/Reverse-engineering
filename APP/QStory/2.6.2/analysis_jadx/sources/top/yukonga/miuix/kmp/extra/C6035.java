package top.yukonga.miuix.kmp.extra;

import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6035 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f16512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16513;

    public C6035(long j, long j2) {
        this.f16513 = j;
        this.f16512 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6035)) {
            return false;
        }
        C6035 c6035 = (C6035) obj;
        return C1599.m2939(this.f16513, c6035.f16513) && C1599.m2939(this.f16512, c6035.f16512);
    }

    public final int hashCode() {
        int i = C1599.f4698;
        return Long.hashCode(this.f16512) + (Long.hashCode(this.f16513) * 31);
    }

    public final String toString() {
        return "EndActionColors(color=" + C1599.m2944(this.f16513) + ", disabledColor=" + C1599.m2944(this.f16512) + ")";
    }
}
