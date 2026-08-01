package androidx.compose.p001ui.scrollcapture;

import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.semantics.C2788;
import p221.C8734;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2762 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2629 f6019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8734 f6020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6021;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2788 f6022;

    public C2762(C2788 c2788, int i, C8734 c8734, AbstractC2629 abstractC2629) {
        this.f6022 = c2788;
        this.f6021 = i;
        this.f6020 = c8734;
        this.f6019 = abstractC2629;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.f6022 + ", depth=" + this.f6021 + ", viewportBoundsInWindow=" + this.f6020 + ", coordinates=" + this.f6019 + ')';
    }
}
