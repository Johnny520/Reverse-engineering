package p088s0;

import android.view.View;
import p025M0.InterfaceC0193a;

/* JADX INFO: renamed from: s0.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0998t implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3585b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0193a f3586c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0998t(InterfaceC0193a interfaceC0193a, int i2) {
        this.f3585b = i2;
        this.f3586c = interfaceC0193a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3585b) {
            case 0:
                this.f3586c.mo7b();
                break;
            default:
                this.f3586c.mo7b();
                break;
        }
    }
}
