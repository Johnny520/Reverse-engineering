package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f2638;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f2639;

    public C0930(long j, long j2) {
        this.f2639 = j;
        this.f2638 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0930)) {
            return false;
        }
        C0930 c0930 = (C0930) obj;
        return C1599.m2939(this.f2639, c0930.f2639) && C1599.m2939(this.f2638, c0930.f2638);
    }

    public final int hashCode() {
        int i = C1599.f4698;
        return Long.hashCode(this.f2638) + (Long.hashCode(this.f2639) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC0053.m138(this.f2639, sb, ", selectionBackgroundColor=");
        sb.append((Object) C1599.m2944(this.f2638));
        sb.append(')');
        return sb.toString();
    }
}
