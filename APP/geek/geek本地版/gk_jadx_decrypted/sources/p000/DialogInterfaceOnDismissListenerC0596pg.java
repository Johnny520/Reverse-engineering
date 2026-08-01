package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: pg */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0596pg implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0670rg f3890a;

    public DialogInterfaceOnDismissListenerC0596pg(DialogInterfaceOnCancelListenerC0670rg dialogInterfaceOnCancelListenerC0670rg) {
        this.f3890a = dialogInterfaceOnCancelListenerC0670rg;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0670rg dialogInterfaceOnCancelListenerC0670rg = this.f3890a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0670rg.f4280a0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0670rg.onDismiss(dialog);
        }
    }
}
