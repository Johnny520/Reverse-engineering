package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.InterfaceC2380;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2342 implements InterfaceC2380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC2338 f6926;

    public C2342(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        this.f6926 = abstractComponentCallbacksC2338;
    }

    @Override // androidx.lifecycle.InterfaceC2380
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        View view;
        if (lifecycle$Event != Lifecycle$Event.ON_STOP || (view = this.f6926.f6881) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
