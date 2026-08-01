package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import p193.C7821;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2066 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6124;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7821 f6126;

    public C2066(C7821 c7821, int i, int i2) {
        this.f6126 = c7821;
        this.f6125 = i;
        this.f6124 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2066) {
            C2066 c2066 = (C2066) obj;
            if (this.f6126 == c2066.f6126 && this.f6125 == c2066.f6125 && this.f6124 == c2066.f6124) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6124) + AbstractC0053.m144(this.f6125, this.f6126.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f6126);
        sb.append(", startIndex=");
        sb.append(this.f6125);
        sb.append(", endIndex=");
        return AbstractC0053.m156(sb, this.f6124, ')');
    }
}
