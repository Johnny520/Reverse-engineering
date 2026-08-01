package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ra implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fj b;

    public /* synthetic */ ra(fj r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View r1, boolean r2) {
        switch(this.a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        ph r12 = (ph) this.b;
        r12.l = r2;
        r12.p();
        if (r2 == true) goto L10;
        r12.s(false);
        r12.m = false;
        return;
    L10:
        return;
    L8:
        ua r13 = (ua) this.b;
        r13.s(r13.t());
    }
}
