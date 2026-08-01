package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: vy */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0869vy implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6873c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6874d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0869vy(Object obj, Object obj2, Dialog dialog, int i) {
        this.f6871a = i;
        this.f6873c = obj;
        this.f6874d = obj2;
        this.f6872b = dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f6871a;
        Object obj = this.f6872b;
        Object obj2 = this.f6874d;
        Object obj3 = this.f6873c;
        switch (i) {
            case 0:
                C0906wy.m5035H((Dialog) obj, (InterfaceC0742sw) obj3, (View) obj2, view);
                break;
            case 1:
                vf0.m4551R2((Context) obj3, (xt0) obj2, (Dialog) obj, view);
                break;
            case 2:
                vf0.m4657o2((yt0) obj, (xt0) obj3, (Context) obj2, view);
                break;
            default:
                vf0.m4506G2((EditText) obj3, (SharedPreferences) obj2, (Dialog) obj, view);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0869vy(Object obj, Object obj2, Object obj3, int i) {
        this.f6871a = i;
        this.f6872b = obj;
        this.f6873c = obj2;
        this.f6874d = obj3;
    }
}
