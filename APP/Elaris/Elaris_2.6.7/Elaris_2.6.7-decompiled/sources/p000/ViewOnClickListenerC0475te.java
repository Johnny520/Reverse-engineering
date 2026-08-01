package p000;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.p001mr.elaris.AbstractC0169w;

/* JADX INFO: renamed from: te */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0475te implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0515w6[] f932b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Dialog f933c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0475te(Activity activity, C0515w6[] c0515w6Arr, Dialog dialog) {
        this.f931a = activity;
        this.f932b = c0515w6Arr;
        this.f933c = dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0169w.m290d(this.f931a, this.f932b[0]);
        this.f933c.dismiss();
    }
}
