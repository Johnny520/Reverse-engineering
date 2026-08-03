package p001A0;

import android.view.View;

/* JADX INFO: renamed from: A0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0026b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0046v f67b;

    public /* synthetic */ ViewOnFocusChangeListenerC0026b(AbstractC0046v r1, int r2) {
        this.f66a = r2;
        this.f67b = r1;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View r1, boolean r2) {
        switch(this.f66a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        C0039o r12 = (C0039o) this.f67b;
        r12.f101l = r2;
        r12.m156q();
        if (r2 == true) goto L10;
        r12.m77t(false);
        r12.f102m = false;
        return;
    L10:
        return;
    L8:
        C0030f r13 = (C0030f) this.f67b;
        r13.m67t(r13.m68u());
    }
}
