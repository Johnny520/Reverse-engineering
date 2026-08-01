package top.yukonga.miuix.kmp.basic;

import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6009 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f16427;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16428;

    public C6009(long j, long j2) {
        this.f16428 = j;
        this.f16427 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6009)) {
            return false;
        }
        C6009 c6009 = (C6009) obj;
        return C1599.m2939(this.f16428, c6009.f16428) && C1599.m2939(this.f16427, c6009.f16427);
    }

    public final int hashCode() {
        int i = C1599.f4698;
        return Long.hashCode(this.f16427) + (Long.hashCode(this.f16428) * 31);
    }

    public final String toString() {
        return "BasicComponentColors(color=" + C1599.m2944(this.f16428) + ", disabledColor=" + C1599.m2944(this.f16427) + ")";
    }
}
