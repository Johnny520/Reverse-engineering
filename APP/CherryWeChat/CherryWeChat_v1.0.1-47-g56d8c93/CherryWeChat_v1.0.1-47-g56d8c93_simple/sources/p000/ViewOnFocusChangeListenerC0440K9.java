package p000;

import android.view.View;

/* JADX INFO: renamed from: K9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0440K9 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1440a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1221bg f1441b;

    public /* synthetic */ ViewOnFocusChangeListenerC0440K9(AbstractC1221bg r1, int r2) {
        this.f1440a = r2;
        this.f1441b = r1;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View r1, boolean r2) {
        switch(this.f1440a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        C0494Le r12 = (C0494Le) this.f1441b;
        r12.f1613l = r2;
        r12.m2348p();
        if (r2 == true) goto L10;
        r12.m959s(false);
        r12.f1614m = false;
        return;
    L10:
        return;
    L8:
        C0569N9 r13 = (C0569N9) this.f1441b;
        r13.m1114s(r13.m1115t());
    }
}
