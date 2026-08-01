package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC2370;
import androidx.lifecycle.InterfaceC2388;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2340 implements InterfaceC2370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC2343 f6923;

    public C2340(DialogInterfaceOnCancelListenerC2343 dialogInterfaceOnCancelListenerC2343) {
        this.f6923 = dialogInterfaceOnCancelListenerC2343;
    }

    @Override // androidx.lifecycle.InterfaceC2370
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo4454(Object obj) {
        if (((InterfaceC2388) obj) != null) {
            DialogInterfaceOnCancelListenerC2343 dialogInterfaceOnCancelListenerC2343 = this.f6923;
            if (dialogInterfaceOnCancelListenerC2343.f6931) {
                View viewM4424 = dialogInterfaceOnCancelListenerC2343.m4424();
                if (viewM4424.getParent() != null) {
                    C5919.m11250("DialogFragment can not be attached to a container view");
                    return;
                }
                if (dialogInterfaceOnCancelListenerC2343.f6927 != null) {
                    if (AbstractC2313.m4352(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC2343.f6927);
                    }
                    dialogInterfaceOnCancelListenerC2343.f6927.setContentView(viewM4424);
                }
            }
        }
    }
}
