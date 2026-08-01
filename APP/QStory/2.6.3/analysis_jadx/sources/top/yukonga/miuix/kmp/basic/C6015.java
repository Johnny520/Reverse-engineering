package top.yukonga.miuix.kmp.basic;

import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6015 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f16436;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f16437;

    public C6015(long j, long j2) {
        this.f16437 = j;
        this.f16436 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6015)) {
            return false;
        }
        C6015 c6015 = (C6015) obj;
        return C1599.m2949(this.f16437, c6015.f16437) && C1599.m2949(this.f16436, c6015.f16436);
    }

    public final int hashCode() {
        int i = C1599.f4699;
        return Long.hashCode(this.f16436) + (Long.hashCode(this.f16437) * 31);
    }

    public final String toString() {
        return "BasicComponentColors(color=" + C1599.m2954(this.f16437) + ", disabledColor=" + C1599.m2954(this.f16436) + ")";
    }
}
