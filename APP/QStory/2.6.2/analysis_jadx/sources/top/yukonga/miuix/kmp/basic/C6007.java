package top.yukonga.miuix.kmp.basic;

import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6007 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f16424;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16425;

    public C6007(long j, long j2) {
        this.f16425 = j;
        this.f16424 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6007)) {
            return false;
        }
        C6007 c6007 = (C6007) obj;
        return C1599.m2939(this.f16425, c6007.f16425) && C1599.m2939(this.f16424, c6007.f16424);
    }

    public final int hashCode() {
        int i = C1599.f4698;
        return Long.hashCode(this.f16424) + (Long.hashCode(this.f16425) * 31);
    }

    public final String toString() {
        return "CardColors(color=" + C1599.m2944(this.f16425) + ", contentColor=" + C1599.m2944(this.f16424) + ")";
    }
}
