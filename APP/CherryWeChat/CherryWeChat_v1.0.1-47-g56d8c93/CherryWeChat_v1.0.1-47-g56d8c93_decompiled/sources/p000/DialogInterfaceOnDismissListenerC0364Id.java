package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: Id */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0364Id implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0450Kd f1234a;

    public DialogInterfaceOnDismissListenerC0364Id(DialogInterfaceOnCancelListenerC0450Kd dialogInterfaceOnCancelListenerC0450Kd) {
        this.f1234a = dialogInterfaceOnCancelListenerC0450Kd;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0450Kd dialogInterfaceOnCancelListenerC0450Kd = this.f1234a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0450Kd.f1479c0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0450Kd.onDismiss(dialog);
        }
    }
}
