package p211;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.vector.C1543;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7939 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f21977;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1543 f21978;

    public C7939(C1543 c1543, int i) {
        this.f21978 = c1543;
        this.f21977 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7939)) {
            return false;
        }
        C7939 c7939 = (C7939) obj;
        return this.f21978.equals(c7939.f21978) && this.f21977 == c7939.f21977;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21977) + (this.f21978.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f21978);
        sb.append(", configFlags=");
        return AbstractC0053.m154(sb, this.f21977, ')');
    }
}
