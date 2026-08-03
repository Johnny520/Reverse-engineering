package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class V7 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305a;
    public final /* synthetic */ a.Rc b;
    public final /* synthetic */ android.app.Activity c;

    public /* synthetic */ V7(a.Rc r1, android.app.Activity r2, int r3) {
            r0 = this;
            r0.f305a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f305a
            android.view.View r4 = (android.view.View) r4
            switch(r0) {
                case 0: goto L29;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = "v"
            a.C0193i9.e(r4, r0)
            int r0 = r4.getId()
            r1 = -1
            if (r0 <= r1) goto L26
            a.Rc r0 = r3.b
            int r1 = r0.f248a
            int r1 = r1 + 1
            r0.f248a = r1
            a.W7 r0 = new a.W7
            android.app.Activity r1 = r3.c
            r2 = 1
            r0.<init>(r4, r1, r2)
            r4.setOnLongClickListener(r0)
        L26:
            a.Wf r4 = a.Wf.f330a
            return r4
        L29:
            java.lang.String r0 = "v"
            a.C0193i9.e(r4, r0)
            int r0 = r4.getId()
            r1 = -1
            if (r0 <= r1) goto L48
            a.Rc r0 = r3.b
            int r1 = r0.f248a
            int r1 = r1 + 1
            r0.f248a = r1
            a.W7 r0 = new a.W7
            android.app.Activity r1 = r3.c
            r2 = 0
            r0.<init>(r4, r1, r2)
            r4.setOnLongClickListener(r0)
        L48:
            a.Wf r4 = a.Wf.f330a
            return r4
    }
}
