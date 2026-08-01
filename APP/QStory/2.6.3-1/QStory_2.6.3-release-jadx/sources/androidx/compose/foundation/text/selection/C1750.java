package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.text.style.ResolvedTextDirection;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f2933;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ResolvedTextDirection f2935;

    public C1750(ResolvedTextDirection resolvedTextDirection, int i, long j) {
        this.f2935 = resolvedTextDirection;
        this.f2934 = i;
        this.f2933 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1750)) {
            return false;
        }
        C1750 c1750 = (C1750) obj;
        return this.f2935 == c1750.f2935 && this.f2934 == c1750.f2934 && this.f2933 == c1750.f2933;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2933) + AbstractC0900.m704(this.f2934, this.f2935.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f2935 + ", offset=" + this.f2934 + ", selectableId=" + this.f2933 + ')';
    }
}
