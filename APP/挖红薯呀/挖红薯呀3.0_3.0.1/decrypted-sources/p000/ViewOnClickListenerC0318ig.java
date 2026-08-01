package p000;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: ig */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0318ig implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2550a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f2551b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f2552c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Dialog f2553d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0318ig(Dialog dialog, List list, Context context) {
        this.f2550a = 3;
        this.f2553d = dialog;
        this.f2552c = list;
        this.f2551b = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2550a;
        Context context = this.f2551b;
        List list = this.f2552c;
        Dialog dialog = this.f2553d;
        switch (i) {
            case 0:
                C0473mg.m2504E(context, list, dialog, view);
                break;
            case 1:
                C0473mg.m2507H(context, list, dialog, view);
                break;
            case 2:
                C0473mg.m2508I(context, list, dialog, view);
                break;
            default:
                ob0.m2865z(dialog, list, context, view);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0318ig(Context context, List list, Dialog dialog, int i) {
        this.f2550a = i;
        this.f2551b = context;
        this.f2552c = list;
        this.f2553d = dialog;
    }
}
