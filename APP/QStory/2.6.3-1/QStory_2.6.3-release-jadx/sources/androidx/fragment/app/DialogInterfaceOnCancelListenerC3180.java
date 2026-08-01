package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC3180 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC3176 f7296;

    public DialogInterfaceOnCancelListenerC3180(DialogInterfaceOnCancelListenerC3176 dialogInterfaceOnCancelListenerC3176) {
        this.f7296 = dialogInterfaceOnCancelListenerC3176;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC3176 dialogInterfaceOnCancelListenerC3176 = this.f7296;
        Dialog dialog = dialogInterfaceOnCancelListenerC3176.f7273;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC3176.onCancel(dialog);
        }
    }
}
