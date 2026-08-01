package p000;

import android.app.Activity;
import android.content.DialogInterface;
import com.p001mr.elaris.AbstractC0169w;

/* JADX INFO: renamed from: me */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0336me implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f580a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f581b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f582c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ DialogInterfaceOnDismissListenerC0336me(Object obj, Object obj2, int i) {
        this.f580a = i;
        this.f581b = obj;
        this.f582c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f580a) {
            case 0:
                if (!((boolean[]) this.f581b)[0]) {
                    C0507ve c0507ve = (C0507ve) this.f582c;
                    c0507ve.f977a = true;
                    Thread thread = c0507ve.f978b;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
                break;
            default:
                AbstractC0169w.m290d((Activity) this.f581b, ((C0515w6[]) this.f582c)[0]);
                break;
        }
    }
}
