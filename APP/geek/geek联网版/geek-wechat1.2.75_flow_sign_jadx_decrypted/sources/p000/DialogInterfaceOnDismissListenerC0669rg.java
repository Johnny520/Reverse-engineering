package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: rg */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0669rg implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0743tg f4129a;

    public DialogInterfaceOnDismissListenerC0669rg(DialogInterfaceOnCancelListenerC0743tg dialogInterfaceOnCancelListenerC0743tg) {
        this.f4129a = dialogInterfaceOnCancelListenerC0743tg;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0743tg dialogInterfaceOnCancelListenerC0743tg = this.f4129a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0743tg.f4519a0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0743tg.onDismiss(dialog);
        }
    }
}
