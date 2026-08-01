package top.yukonga.miuix.kmp.basic;

import androidx.compose.p001ui.graphics.C2434;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6845 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f16781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16782;

    public C6845(long j, long j2) {
        this.f16782 = j;
        this.f16781 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6845)) {
            return false;
        }
        C6845 c6845 = (C6845) obj;
        return C2434.m3509(this.f16782, c6845.f16782) && C2434.m3509(this.f16781, c6845.f16781);
    }

    public final int hashCode() {
        int i = C2434.f5044;
        return Long.hashCode(this.f16781) + (Long.hashCode(this.f16782) * 31);
    }

    public final String toString() {
        return "BasicComponentColors(color=" + C2434.m3514(this.f16782) + ", disabledColor=" + C2434.m3514(this.f16781) + ")";
    }
}
