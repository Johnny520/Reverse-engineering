package p000;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

/* JADX INFO: renamed from: p8 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0405p8 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f713a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f714b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Dialog f715c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f716d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ListView f717e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0565z8 f718f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0533x8 f719g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0405p8(Activity activity, Dialog dialog, TextView textView, ListView listView, C0565z8 c0565z8, C0533x8 c0533x8, int i) {
        this.f713a = i;
        this.f714b = activity;
        this.f715c = dialog;
        this.f716d = textView;
        this.f717e = listView;
        this.f718f = c0565z8;
        this.f719g = c0533x8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f713a) {
            case 0:
                AbstractC0260i5.m570T0(this.f714b, this.f715c, this.f716d, this.f717e, this.f718f, this.f719g);
                break;
            default:
                AbstractC0260i5.m570T0(this.f714b, this.f715c, this.f716d, this.f717e, this.f718f, this.f719g);
                break;
        }
    }
}
