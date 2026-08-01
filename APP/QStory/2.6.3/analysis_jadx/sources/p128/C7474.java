package p128;

import androidx.collection.C0257;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7474 extends AbstractC7475 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC7478 f20226;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0257 f20227;

    public C7474(ViewTreeObserverOnPreDrawListenerC7478 viewTreeObserverOnPreDrawListenerC7478, C0257 c0257) {
        this.f20226 = viewTreeObserverOnPreDrawListenerC7478;
        this.f20227 = c0257;
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo12666(AbstractC7483 abstractC7483) {
        ((ArrayList) this.f20227.get(this.f20226.f20231)).remove(abstractC7483);
        abstractC7483.mo12675(this);
    }
}
