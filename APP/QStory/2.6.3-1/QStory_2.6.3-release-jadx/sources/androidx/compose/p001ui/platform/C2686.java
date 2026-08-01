package androidx.compose.p001ui.platform;

import androidx.compose.runtime.C2198;
import androidx.compose.runtime.InterfaceC2206;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.InterfaceC3213;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.Lifecycle$Event;
import com.davemorrissey.labs.subscaleview.C0328R;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2686 implements InterfaceC2206, InterfaceC3213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC7383 f5701 = AbstractC2741.f5965;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public AbstractC3235 f5702;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2198 f5703;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f5704;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f5705;

    public C2686(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, C2198 c2198) {
        this.f5705 = viewTreeObserverOnGlobalLayoutListenerC2719;
        this.f5703 = c2198;
    }

    @Override // androidx.compose.runtime.InterfaceC2206
    public final void dispose() {
        if (!this.f5704) {
            this.f5704 = true;
            this.f5705.getView().setTag(C0328R.id.wrapped_composition_tag, null);
            AbstractC3235 abstractC3235 = this.f5702;
            if (abstractC3235 != null) {
                abstractC3235.mo5062(this);
            }
            this.f5702 = null;
        }
        this.f5703.dispose();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4039(InterfaceC7383 interfaceC7383) {
        this.f5705.setOnReadyForComposition(new WrappedComposition$setContent$1(this, interfaceC7383));
    }

    @Override // androidx.lifecycle.InterfaceC3213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            dispose();
        } else {
            if (lifecycle$Event != Lifecycle$Event.ON_CREATE || this.f5704) {
                return;
            }
            m4039(this.f5701);
        }
    }
}
