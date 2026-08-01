package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.semantics.C1953;
import p205.C7904;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC1794 f5673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7904 f5674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1953 f5676;

    public C1927(C1953 c1953, int i, C7904 c7904, AbstractC1794 abstractC1794) {
        this.f5676 = c1953;
        this.f5675 = i;
        this.f5674 = c7904;
        this.f5673 = abstractC1794;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.f5676 + ", depth=" + this.f5675 + ", viewportBoundsInWindow=" + this.f5674 + ", coordinates=" + this.f5673 + ')';
    }
}
