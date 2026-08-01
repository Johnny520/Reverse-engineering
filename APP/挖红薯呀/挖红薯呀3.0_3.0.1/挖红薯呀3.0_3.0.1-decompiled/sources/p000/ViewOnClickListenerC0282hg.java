package p000;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: hg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0282hg implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f2254b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Dialog f2255c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0282hg(Dialog dialog, Context context) {
        this.f2253a = 7;
        this.f2255c = dialog;
        this.f2254b = context;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ob0.e(android.app.Dialog, android.content.Context, android.view.View):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2253a;
        Context context = this.f2254b;
        Dialog dialog = this.f2255c;
        switch (i) {
            case 0:
                C0473mg.m2502C(context, dialog, view);
                break;
            case 1:
                C0473mg.m2503D(context, dialog, view);
                break;
            case 2:
                ob0.m2826K(context, dialog, view);
                break;
            case 3:
                ob0.m2827L(context, dialog, view);
                break;
            case 4:
                ob0.m2862w(context, dialog, view);
                break;
            case 5:
                ob0.m2863x(context, dialog, view);
                break;
            case 6:
                ob0.m2864y(context, dialog, view);
                break;
            default:
                vf0.m4623h3(dialog, context, view);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0282hg(Context context, int i, Dialog dialog) {
        this.f2253a = i;
        this.f2254b = context;
        this.f2255c = dialog;
    }
}
