package p098x0;

import android.content.DialogInterface;
import p084q0.C0806f;

/* JADX INFO: renamed from: x0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC1035a implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3650b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3651c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ DialogInterfaceOnDismissListenerC1035a(int i2, Object obj) {
        this.f3650b = i2;
        this.f3651c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f3650b) {
            case 0:
                ((C1036b) this.f3651c).f3652d = false;
                break;
            case 1:
                ((C1036b) this.f3651c).f3652d = false;
                break;
            default:
                ((C0806f) this.f3651c).f2679b = false;
                break;
        }
    }
}
