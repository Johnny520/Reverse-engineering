package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0912 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f2588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2589;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ResolvedTextDirection f2590;

    public C0912(ResolvedTextDirection resolvedTextDirection, int i, long j) {
        this.f2590 = resolvedTextDirection;
        this.f2589 = i;
        this.f2588 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0912)) {
            return false;
        }
        C0912 c0912 = (C0912) obj;
        return this.f2590 == c0912.f2590 && this.f2589 == c0912.f2589 && this.f2588 == c0912.f2588;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2588) + AbstractC0053.m144(this.f2589, this.f2590.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f2590 + ", offset=" + this.f2589 + ", selectableId=" + this.f2588 + ')';
    }
}
