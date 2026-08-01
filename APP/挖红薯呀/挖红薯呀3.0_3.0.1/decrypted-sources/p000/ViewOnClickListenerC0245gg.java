package p000;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: gg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0245gg implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1986a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f1987b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0245gg(Context context, int i) {
        this.f1986a = i;
        this.f1987b = context;
    }

    /* JADX DEBUG: Class process forced to load method for inline: mg.b(android.content.Context, android.view.View):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1986a;
        Context context = this.f1987b;
        switch (i) {
            case 0:
                C0473mg.m2501B(context, view);
                break;
            case 1:
                vf0.m4500F1(context, view);
                break;
            case 2:
                vf0.m4514I1(context, view);
                break;
            default:
                vf0.m4530M1(context, view);
                break;
        }
    }
}
