package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.InterfaceC2380;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2342 implements InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC2338 f6925;

    public C2342(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        this.f6925 = abstractComponentCallbacksC2338;
    }

    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        View view;
        if (lifecycle$Event != Lifecycle$Event.ON_STOP || (view = this.f6925.f6880) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
