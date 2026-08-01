package androidx.compose.ui.platform;

import androidx.compose.runtime.C1363;
import androidx.compose.runtime.InterfaceC1371;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.InterfaceC2380;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$Event;
import com.davemorrissey.labs.subscaleview.R;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1851 implements InterfaceC1371, InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC6554 f5356 = AbstractC1906.f5620;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public AbstractC2402 f5357;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1363 f5358;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f5359;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5360;

    public C1851(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, C1363 c1363) {
        this.f5360 = viewTreeObserverOnGlobalLayoutListenerC1884;
        this.f5358 = c1363;
    }

    @Override // androidx.compose.runtime.InterfaceC1371
    public final void dispose() {
        if (!this.f5359) {
            this.f5359 = true;
            this.f5360.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC2402 abstractC2402 = this.f5357;
            if (abstractC2402 != null) {
                abstractC2402.mo4502(this);
            }
            this.f5357 = null;
        }
        this.f5358.dispose();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3479(InterfaceC6554 interfaceC6554) {
        this.f5360.setOnReadyForComposition(new WrappedComposition$setContent$1(this, interfaceC6554));
    }

    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            dispose();
        } else {
            if (lifecycle$Event != Lifecycle$Event.ON_CREATE || this.f5359) {
                return;
            }
            m3479(this.f5356);
        }
    }
}
