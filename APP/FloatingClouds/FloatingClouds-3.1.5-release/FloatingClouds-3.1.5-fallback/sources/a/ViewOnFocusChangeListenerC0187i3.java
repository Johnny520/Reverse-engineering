package a;

/* JADX INFO: renamed from: a.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0187i3 implements android.view.View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f506a;
    public final /* synthetic */ a.AbstractC0082c6 b;

    public /* synthetic */ ViewOnFocusChangeListenerC0187i3(a.AbstractC0082c6 r1, int r2) {
            r0 = this;
            r0.f506a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View r1, boolean r2) {
            r0 = this;
            int r1 = r0.f506a
            switch(r1) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            a.c6 r1 = r0.b
            a.F5 r1 = (a.F5) r1
            r1.l = r2
            r1.q()
            if (r2 != 0) goto L16
            r2 = 0
            r1.t(r2)
            r1.m = r2
        L16:
            return
        L17:
            a.c6 r1 = r0.b
            a.l3 r1 = (a.C0240l3) r1
            boolean r2 = r1.u()
            r1.t(r2)
            return
    }
}
