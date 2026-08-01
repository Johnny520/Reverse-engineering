package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.InterfaceC3213;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3175 implements InterfaceC3213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC3171 f7271;

    public C3175(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        this.f7271 = abstractComponentCallbacksC3171;
    }

    @Override // androidx.lifecycle.InterfaceC3213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        View view;
        if (lifecycle$Event != Lifecycle$Event.ON_STOP || (view = this.f7271.f7226) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
