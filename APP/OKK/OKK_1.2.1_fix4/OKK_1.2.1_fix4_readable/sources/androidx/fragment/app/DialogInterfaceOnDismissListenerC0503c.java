package androidx.fragment.app;

import android.content.DialogInterface;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0503c implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0504d f1418a;

    public DialogInterfaceOnDismissListenerC0503c(DialogInterfaceOnCancelListenerC0504d dialogInterfaceOnCancelListenerC0504d) {
        this.f1418a = dialogInterfaceOnCancelListenerC0504d;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f1418a.getClass();
    }
}
