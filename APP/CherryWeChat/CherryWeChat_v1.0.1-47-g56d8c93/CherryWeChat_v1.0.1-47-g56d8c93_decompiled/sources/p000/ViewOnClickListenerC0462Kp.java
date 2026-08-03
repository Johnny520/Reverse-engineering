package p000;

import android.view.View;

/* JADX INFO: renamed from: Kp */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0462Kp implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1509a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0884Ui f1510b;

    public /* synthetic */ ViewOnClickListenerC0462Kp(int i, InterfaceC0884Ui interfaceC0884Ui) {
        this.f1509a = i;
        this.f1510b = interfaceC0884Ui;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1509a) {
            case 0:
                this.f1510b.mo6a();
                break;
            default:
                this.f1510b.mo6a();
                break;
        }
    }
}
