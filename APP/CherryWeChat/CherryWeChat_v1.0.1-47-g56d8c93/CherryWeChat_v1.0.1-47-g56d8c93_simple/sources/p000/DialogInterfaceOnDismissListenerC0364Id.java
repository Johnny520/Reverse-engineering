package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: Id */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0364Id implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0450Kd f1234a;

    public DialogInterfaceOnDismissListenerC0364Id(DialogInterfaceOnCancelListenerC0450Kd r1) {
        this.f1234a = r1;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r2) {
        DialogInterfaceOnCancelListenerC0450Kd r22 = this.f1234a;
        Dialog r0 = r22.f1479c0;
        if (r0 == null) goto L6;
        r22.onDismiss(r0);
        return;
    }
}
