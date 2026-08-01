package top.yukonga.miuix.kmp.extra;

import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6041 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f16521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16522;

    public C6041(long j, long j2) {
        this.f16522 = j;
        this.f16521 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6041)) {
            return false;
        }
        C6041 c6041 = (C6041) obj;
        return C1599.m2949(this.f16522, c6041.f16522) && C1599.m2949(this.f16521, c6041.f16521);
    }

    public final int hashCode() {
        int i = C1599.f4699;
        return Long.hashCode(this.f16521) + (Long.hashCode(this.f16522) * 31);
    }

    public final String toString() {
        return "EndActionColors(color=" + C1599.m2954(this.f16522) + ", disabledColor=" + C1599.m2954(this.f16521) + ")";
    }
}
