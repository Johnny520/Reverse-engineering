package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: i6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnShowListenerC0261i6 implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f402a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Dialog f403b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ DialogInterfaceOnShowListenerC0261i6(Dialog dialog, int i) {
        this.f402a = i;
        this.f403b = dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = this.f402a;
        Dialog dialog = this.f403b;
        switch (i) {
            case 0:
                AbstractC0451s6.m954g(dialog);
                break;
            case 1:
                AbstractC0451s6.m954g(dialog);
                break;
            default:
                AbstractC0451s6.m954g(dialog);
                break;
        }
    }
}
