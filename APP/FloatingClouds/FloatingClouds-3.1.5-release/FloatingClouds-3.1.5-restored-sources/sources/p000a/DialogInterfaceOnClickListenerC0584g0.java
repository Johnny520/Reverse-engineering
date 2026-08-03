package p000a;

import android.content.DialogInterface;
import p000a.C0186K3;

/* JADX INFO: renamed from: a.g0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0584g0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2182a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f2182a) {
            case 0:
                dialogInterface.dismiss();
                break;
            default:
                C0186K3.f638a.getClass();
                try {
                    C0186K3.a.m509j().edit().putBoolean(C0186K3.f643f, true).apply();
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }
}
