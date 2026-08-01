package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: qg */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0632qg implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0743tg f3906a;

    public DialogInterfaceOnCancelListenerC0632qg(DialogInterfaceOnCancelListenerC0743tg dialogInterfaceOnCancelListenerC0743tg) {
        this.f3906a = dialogInterfaceOnCancelListenerC0743tg;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0743tg dialogInterfaceOnCancelListenerC0743tg = this.f3906a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0743tg.f4519a0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0743tg.onCancel(dialog);
        }
    }
}
