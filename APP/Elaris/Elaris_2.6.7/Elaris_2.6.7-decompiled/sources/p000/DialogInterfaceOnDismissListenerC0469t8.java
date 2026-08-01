package p000;

import android.content.DialogInterface;

/* JADX INFO: renamed from: t8 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0469t8 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0533x8 f897a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogInterfaceOnDismissListenerC0469t8(C0533x8 c0533x8) {
        this.f897a = c0533x8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C0533x8 c0533x8 = this.f897a;
        C0314l8 c0314l8 = c0533x8.f1042a;
        if (c0314l8 != null) {
            c0314l8.m752a();
        }
        c0533x8.f1042a = null;
    }
}
