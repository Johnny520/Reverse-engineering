package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;
import p209.C8650;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6469;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6470;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8650 f6471;

    public C2900(C8650 c8650, int i, int i2) {
        this.f6471 = c8650;
        this.f6470 = i;
        this.f6469 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2900) {
            C2900 c2900 = (C2900) obj;
            if (this.f6471 == c2900.f6471 && this.f6470 == c2900.f6470 && this.f6469 == c2900.f6469) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6469) + AbstractC0900.m704(this.f6470, this.f6471.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f6471);
        sb.append(", startIndex=");
        sb.append(this.f6470);
        sb.append(", endIndex=");
        return AbstractC0900.m716(sb, this.f6469, ')');
    }
}
