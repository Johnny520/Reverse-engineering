package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC2370;
import androidx.lifecycle.InterfaceC2388;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2340 implements InterfaceC2370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC2343 f6924;

    public C2340(DialogInterfaceOnCancelListenerC2343 dialogInterfaceOnCancelListenerC2343) {
        this.f6924 = dialogInterfaceOnCancelListenerC2343;
    }

    @Override // androidx.lifecycle.InterfaceC2370
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo4464(Object obj) {
        if (((InterfaceC2388) obj) != null) {
            DialogInterfaceOnCancelListenerC2343 dialogInterfaceOnCancelListenerC2343 = this.f6924;
            if (dialogInterfaceOnCancelListenerC2343.f6932) {
                View viewM4434 = dialogInterfaceOnCancelListenerC2343.m4434();
                if (viewM4434.getParent() != null) {
                    C5925.m11311("DialogFragment can not be attached to a container view");
                    return;
                }
                if (dialogInterfaceOnCancelListenerC2343.f6928 != null) {
                    if (AbstractC2313.m4362(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC2343.f6928);
                    }
                    dialogInterfaceOnCancelListenerC2343.f6928.setContentView(viewM4434);
                }
            }
        }
    }
}
