package p000;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: jg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0354jg implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2863a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f2864b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f2865c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Dialog f2866d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0354jg(Dialog dialog, String str, Context context) {
        this.f2863a = 2;
        this.f2866d = dialog;
        this.f2865c = str;
        this.f2864b = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2863a;
        Context context = this.f2864b;
        String str = this.f2865c;
        Dialog dialog = this.f2866d;
        switch (i) {
            case 0:
                C0473mg.m2505F(context, str, dialog, view);
                break;
            case 1:
                C0473mg.m2506G(context, str, dialog, view);
                break;
            default:
                hk0.m1345Q(dialog, str, context, view);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0354jg(Context context, String str, Dialog dialog, int i) {
        this.f2863a = i;
        this.f2864b = context;
        this.f2865c = str;
        this.f2866d = dialog;
    }
}
