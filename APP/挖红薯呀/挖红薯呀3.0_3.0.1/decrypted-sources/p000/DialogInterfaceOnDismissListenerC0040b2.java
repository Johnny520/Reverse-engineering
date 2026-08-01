package p000;

import android.content.DialogInterface;
import p000.DialogC0076c2;
import p000.m90;

/* JADX INFO: renamed from: b2 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC0040b2 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f357a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c2.a.g(android.app.Activity):void, m90.a.b(android.content.Context, java.lang.String, boolean, hw):void, vf0.B2(android.content.Context, android.app.Dialog):na1] */
    public /* synthetic */ DialogInterfaceOnDismissListenerC0040b2(int i) {
        this.f357a = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: c2.a.a(android.content.DialogInterface):void */
    /* JADX DEBUG: Class process forced to load method for inline: m90.a.a(android.content.DialogInterface):void */
    /* JADX DEBUG: Class process forced to load method for inline: vf0.q0(android.content.DialogInterface):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f357a) {
            case 0:
                DialogC0076c2.a.m431h(dialogInterface);
                break;
            case 1:
                m90.C0465a.m2483c(dialogInterface);
                break;
            default:
                vf0.m4486C2(dialogInterface);
                break;
        }
    }
}
