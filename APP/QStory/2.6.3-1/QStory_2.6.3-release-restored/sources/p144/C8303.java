package p144;

import androidx.collection.C1104;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8303 extends AbstractC8304 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC8307 f20571;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1104 f20572;

    public C8303(ViewTreeObserverOnPreDrawListenerC8307 viewTreeObserverOnPreDrawListenerC8307, C1104 c1104) {
        this.f20571 = viewTreeObserverOnPreDrawListenerC8307;
        this.f20572 = c1104;
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo13225(AbstractC8312 abstractC8312) {
        ((ArrayList) this.f20572.get(this.f20571.f20576)).remove(abstractC8312);
        abstractC8312.mo13234(this);
    }
}
