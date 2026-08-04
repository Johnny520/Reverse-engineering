package yyds;

import android.content.DialogInterface;

/* JADX INFO: renamed from: yyds.ᛸᛱᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC1709 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f8648;

    public /* synthetic */ DialogInterfaceOnDismissListenerC1709(int i) {
        this.f8648 = i;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8648) {
            case 0:
                C2743.f13453 = false;
                break;
            default:
                C1664.f8513.getClass();
                C1664.f8476 = false;
                C1664.f8494.removeCallbacks(C1664.f8515);
                C1664.f8511.clear();
                C1664.f8496 = null;
                C1664.f8480 = null;
                C1664.m3391();
                break;
        }
    }
}
