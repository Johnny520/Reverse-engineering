package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: Hd */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0321Hd implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0450Kd f1088a;

    public DialogInterfaceOnCancelListenerC0321Hd(DialogInterfaceOnCancelListenerC0450Kd r1) {
        this.f1088a = r1;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface r2) {
        DialogInterfaceOnCancelListenerC0450Kd r22 = this.f1088a;
        Dialog r0 = r22.f1479c0;
        if (r0 == null) goto L6;
        r22.onCancel(r0);
        return;
    }
}
