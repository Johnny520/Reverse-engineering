package top.yukonga.miuix.kmp.extra;

import androidx.compose.p001ui.graphics.C2434;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6871 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f16866;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16867;

    public C6871(long j, long j2) {
        this.f16867 = j;
        this.f16866 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6871)) {
            return false;
        }
        C6871 c6871 = (C6871) obj;
        return C2434.m3509(this.f16867, c6871.f16867) && C2434.m3509(this.f16866, c6871.f16866);
    }

    public final int hashCode() {
        int i = C2434.f5044;
        return Long.hashCode(this.f16866) + (Long.hashCode(this.f16867) * 31);
    }

    public final String toString() {
        return "EndActionColors(color=" + C2434.m3514(this.f16867) + ", disabledColor=" + C2434.m3514(this.f16866) + ")";
    }
}
