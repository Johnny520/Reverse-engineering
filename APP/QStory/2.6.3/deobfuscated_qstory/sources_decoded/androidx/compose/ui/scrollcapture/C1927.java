package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.semantics.C1953;
import p205.C7905;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC1794 f5674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7905 f5675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5676;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1953 f5677;

    public C1927(C1953 c1953, int i, C7905 c7905, AbstractC1794 abstractC1794) {
        this.f5677 = c1953;
        this.f5676 = i;
        this.f5675 = c7905;
        this.f5674 = abstractC1794;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.f5677 + ", depth=" + this.f5676 + ", viewportBoundsInWindow=" + this.f5675 + ", coordinates=" + this.f5674 + ')';
    }
}
