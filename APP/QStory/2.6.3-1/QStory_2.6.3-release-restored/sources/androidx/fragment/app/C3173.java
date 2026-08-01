package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC3203;
import androidx.lifecycle.InterfaceC3221;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3173 implements InterfaceC3203 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC3176 f7269;

    public C3173(DialogInterfaceOnCancelListenerC3176 dialogInterfaceOnCancelListenerC3176) {
        this.f7269 = dialogInterfaceOnCancelListenerC3176;
    }

    @Override // androidx.lifecycle.InterfaceC3203
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5024(Object obj) {
        if (((InterfaceC3221) obj) != null) {
            DialogInterfaceOnCancelListenerC3176 dialogInterfaceOnCancelListenerC3176 = this.f7269;
            if (dialogInterfaceOnCancelListenerC3176.f7277) {
                View viewM4994 = dialogInterfaceOnCancelListenerC3176.m4994();
                if (viewM4994.getParent() != null) {
                    C6755.m11870("DialogFragment can not be attached to a container view");
                    return;
                }
                if (dialogInterfaceOnCancelListenerC3176.f7273 != null) {
                    if (AbstractC3146.m4922(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC3176.f7273);
                    }
                    dialogInterfaceOnCancelListenerC3176.f7273.setContentView(viewM4994);
                }
            }
        }
    }
}
