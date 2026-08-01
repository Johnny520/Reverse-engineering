package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import p193.C7820;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2066 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6123;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6124;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7820 f6125;

    public C2066(C7820 c7820, int i, int i2) {
        this.f6125 = c7820;
        this.f6124 = i;
        this.f6123 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2066) {
            C2066 c2066 = (C2066) obj;
            if (this.f6125 == c2066.f6125 && this.f6124 == c2066.f6124 && this.f6123 == c2066.f6123) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6123) + AbstractC0053.m143(this.f6124, this.f6125.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f6125);
        sb.append(", startIndex=");
        sb.append(this.f6124);
        sb.append(", endIndex=");
        return AbstractC0053.m154(sb, this.f6123, ')');
    }
}
