package top.yukonga.miuix.kmp.basic;

import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f16433;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16434;

    public C6013(long j, long j2) {
        this.f16434 = j;
        this.f16433 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6013)) {
            return false;
        }
        C6013 c6013 = (C6013) obj;
        return C1599.m2949(this.f16434, c6013.f16434) && C1599.m2949(this.f16433, c6013.f16433);
    }

    public final int hashCode() {
        int i = C1599.f4699;
        return Long.hashCode(this.f16433) + (Long.hashCode(this.f16434) * 31);
    }

    public final String toString() {
        return "CardColors(color=" + C1599.m2954(this.f16434) + ", contentColor=" + C1599.m2954(this.f16433) + ")";
    }
}
