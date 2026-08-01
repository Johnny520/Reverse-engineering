package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: og */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0558og implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0670rg f3534a;

    public DialogInterfaceOnCancelListenerC0558og(DialogInterfaceOnCancelListenerC0670rg dialogInterfaceOnCancelListenerC0670rg) {
        this.f3534a = dialogInterfaceOnCancelListenerC0670rg;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0670rg dialogInterfaceOnCancelListenerC0670rg = this.f3534a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0670rg.f4280a0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0670rg.onCancel(dialog);
        }
    }
}
