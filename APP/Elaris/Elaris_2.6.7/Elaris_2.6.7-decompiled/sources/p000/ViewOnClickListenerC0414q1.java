package p000;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: q1 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0414q1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Dialog f731b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0414q1(Dialog dialog, int i) {
        this.f730a = i;
        this.f731b = dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f730a;
        Dialog dialog = this.f731b;
        switch (i) {
            case 0:
                dialog.dismiss();
                break;
            case 1:
                dialog.dismiss();
                break;
            default:
                dialog.dismiss();
                break;
        }
    }
}
