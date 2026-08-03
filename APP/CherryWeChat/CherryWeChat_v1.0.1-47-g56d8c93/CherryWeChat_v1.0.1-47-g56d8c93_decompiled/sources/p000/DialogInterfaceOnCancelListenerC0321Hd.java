package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: Hd */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0321Hd implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0450Kd f1088a;

    public DialogInterfaceOnCancelListenerC0321Hd(DialogInterfaceOnCancelListenerC0450Kd dialogInterfaceOnCancelListenerC0450Kd) {
        this.f1088a = dialogInterfaceOnCancelListenerC0450Kd;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0450Kd dialogInterfaceOnCancelListenerC0450Kd = this.f1088a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0450Kd.f1479c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0450Kd.onCancel(dialog);
        }
    }
}
