package p000;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: j6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0280j6 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f470a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Dialog f471b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0280j6(Dialog dialog, int i) {
        this.f470a = i;
        this.f471b = dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f470a;
        Dialog dialog = this.f471b;
        switch (i) {
            case 0:
                dialog.dismiss();
                break;
            case 1:
                dialog.dismiss();
                break;
            case 2:
                dialog.dismiss();
                break;
            default:
                dialog.dismiss();
                break;
        }
    }
}
