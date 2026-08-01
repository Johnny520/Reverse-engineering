package top.yukonga.miuix.kmp.basic;

import androidx.compose.p001ui.graphics.C2434;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6843 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f16778;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16779;

    public C6843(long j, long j2) {
        this.f16779 = j;
        this.f16778 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6843)) {
            return false;
        }
        C6843 c6843 = (C6843) obj;
        return C2434.m3509(this.f16779, c6843.f16779) && C2434.m3509(this.f16778, c6843.f16778);
    }

    public final int hashCode() {
        int i = C2434.f5044;
        return Long.hashCode(this.f16778) + (Long.hashCode(this.f16779) * 31);
    }

    public final String toString() {
        return "CardColors(color=" + C2434.m3514(this.f16779) + ", contentColor=" + C2434.m3514(this.f16778) + ")";
    }
}
