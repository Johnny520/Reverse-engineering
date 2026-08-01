package p000;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: jp */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0363jp implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ KeyEvent.Callback f2922b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0363jp(KeyEvent.Callback callback, int i) {
        this.f2921a = i;
        this.f2922b = callback;
    }

    /* JADX DEBUG: Class process forced to load method for inline: kp.b(android.widget.TextView, android.view.View):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2921a;
        KeyEvent.Callback callback = this.f2922b;
        switch (i) {
            case 0:
                DialogC0402kp.m1947f((TextView) callback, view);
                break;
            case 1:
                m00.m2191V2((TextView) callback, view);
                break;
            default:
                m90.m2466k((m90) callback, view);
                break;
        }
    }
}
