package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0912 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f2587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ResolvedTextDirection f2589;

    public C0912(ResolvedTextDirection resolvedTextDirection, int i, long j) {
        this.f2589 = resolvedTextDirection;
        this.f2588 = i;
        this.f2587 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0912)) {
            return false;
        }
        C0912 c0912 = (C0912) obj;
        return this.f2589 == c0912.f2589 && this.f2588 == c0912.f2588 && this.f2587 == c0912.f2587;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2587) + AbstractC0053.m143(this.f2588, this.f2589.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f2589 + ", offset=" + this.f2588 + ", selectableId=" + this.f2587 + ')';
    }
}
