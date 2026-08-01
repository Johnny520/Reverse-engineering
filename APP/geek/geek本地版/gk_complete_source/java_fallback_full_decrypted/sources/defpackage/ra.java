package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ra implements android.view.View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.fj b;

    public /* synthetic */ ra(defpackage.fj r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View r1, boolean r2) {
            r0 = this;
            int r1 = r0.a
            switch(r1) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            fj r1 = r0.b
            ph r1 = (defpackage.ph) r1
            r1.l = r2
            r1.p()
            if (r2 != 0) goto L16
            r2 = 0
            r1.s(r2)
            r1.m = r2
        L16:
            return
        L17:
            fj r1 = r0.b
            ua r1 = (defpackage.ua) r1
            boolean r2 = r1.t()
            r1.s(r2)
            return
    }
}
