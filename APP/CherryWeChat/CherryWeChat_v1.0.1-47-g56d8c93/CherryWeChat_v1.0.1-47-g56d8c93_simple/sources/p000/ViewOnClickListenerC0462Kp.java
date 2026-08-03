package p000;

import android.view.View;

/* JADX INFO: renamed from: Kp */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0462Kp implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1509a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0884Ui f1510b;

    public /* synthetic */ ViewOnClickListenerC0462Kp(int r1, InterfaceC0884Ui r2) {
        this.f1509a = r1;
        this.f1510b = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r1) {
        switch(this.f1509a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f1510b.mo6a();
        return;
    L6:
        this.f1510b.mo6a();
    }
}
