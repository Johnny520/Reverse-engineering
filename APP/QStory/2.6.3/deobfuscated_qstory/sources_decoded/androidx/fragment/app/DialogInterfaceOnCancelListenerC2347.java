package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC2347 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC2343 f6951;

    public DialogInterfaceOnCancelListenerC2347(DialogInterfaceOnCancelListenerC2343 dialogInterfaceOnCancelListenerC2343) {
        this.f6951 = dialogInterfaceOnCancelListenerC2343;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC2343 dialogInterfaceOnCancelListenerC2343 = this.f6951;
        Dialog dialog = dialogInterfaceOnCancelListenerC2343.f6928;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC2343.onCancel(dialog);
        }
    }
}
