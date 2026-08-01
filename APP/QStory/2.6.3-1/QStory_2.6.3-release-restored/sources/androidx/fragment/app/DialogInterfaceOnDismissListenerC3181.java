package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC3181 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC3176 f7297;

    public DialogInterfaceOnDismissListenerC3181(DialogInterfaceOnCancelListenerC3176 dialogInterfaceOnCancelListenerC3176) {
        this.f7297 = dialogInterfaceOnCancelListenerC3176;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC3176 dialogInterfaceOnCancelListenerC3176 = this.f7297;
        Dialog dialog = dialogInterfaceOnCancelListenerC3176.f7273;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC3176.onDismiss(dialog);
        }
    }
}
