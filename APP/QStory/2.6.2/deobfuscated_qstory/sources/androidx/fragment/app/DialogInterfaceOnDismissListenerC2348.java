package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC2348 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC2343 f6951;

    public DialogInterfaceOnDismissListenerC2348(DialogInterfaceOnCancelListenerC2343 dialogInterfaceOnCancelListenerC2343) {
        this.f6951 = dialogInterfaceOnCancelListenerC2343;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC2343 dialogInterfaceOnCancelListenerC2343 = this.f6951;
        Dialog dialog = dialogInterfaceOnCancelListenerC2343.f6927;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC2343.onDismiss(dialog);
        }
    }
}
