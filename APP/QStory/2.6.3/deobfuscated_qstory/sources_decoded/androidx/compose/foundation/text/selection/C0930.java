package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2639;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f2640;

    public C0930(long j, long j2) {
        this.f2640 = j;
        this.f2639 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0930)) {
            return false;
        }
        C0930 c0930 = (C0930) obj;
        return C1599.m2949(this.f2640, c0930.f2640) && C1599.m2949(this.f2639, c0930.f2639);
    }

    public final int hashCode() {
        int i = C1599.f4699;
        return Long.hashCode(this.f2639) + (Long.hashCode(this.f2640) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC0053.m138(this.f2640, sb, ", selectionBackgroundColor=");
        sb.append((Object) C1599.m2954(this.f2639));
        sb.append(')');
        return sb.toString();
    }
}
