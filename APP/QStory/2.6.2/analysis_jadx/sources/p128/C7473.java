package p128;

import androidx.collection.C0257;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7473 extends AbstractC7474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC7477 f20231;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0257 f20232;

    public C7473(ViewTreeObserverOnPreDrawListenerC7477 viewTreeObserverOnPreDrawListenerC7477, C0257 c0257) {
        this.f20231 = viewTreeObserverOnPreDrawListenerC7477;
        this.f20232 = c0257;
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo12639(AbstractC7482 abstractC7482) {
        ((ArrayList) this.f20232.get(this.f20231.f20236)).remove(abstractC7482);
        abstractC7482.mo12648(this);
    }
}
