package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements t0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f21559b;

    public e(int r2) {
            r1 = this;
            r1.f21558a = r2
            switch(r2) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            r1.<init>()
            return
        L9:
            t0.c r2 = new t0.c
            r2.<init>()
            r1.<init>()
            r1.f21559b = r2
            boolean r0 = r2.f12975b
            if (r0 == 0) goto L18
            goto L27
        L18:
            boolean r0 = r2.f12976c
            if (r0 == 0) goto L21
            java.lang.String r0 = "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"
            u0.a.a(r0)
        L21:
            r2.a()
            r0 = 1
            r2.f12976c = r0
        L27:
            return
    }

    public e(android.view.autofill.AutofillManager r2) {
            r1 = this;
            r0 = 3
            r1.f21558a = r0
            r1.<init>()
            r1.f21559b = r2
            return
    }

    public e(pd.i r2) {
            r1 = this;
            r0 = 2
            r1.f21558a = r0
            r1.<init>()
            md.a r0 = md.a.f8842w
            r2.w(r0)
            r1.f21559b = r2
            return
    }

    public qd.l a() {
            r2 = this;
            java.lang.Object r0 = r2.f21559b
            pd.i r0 = (pd.i) r0
            r1 = 1
            qd.l r0 = r0.S(r1)
            return r0
    }

    public void b(android.view.View r2, int r3, boolean r4) {
            r1 = this;
            java.lang.Object r0 = r1.f21559b
            android.view.autofill.AutofillManager r0 = (android.view.autofill.AutofillManager) r0
            r0.notifyViewVisibilityChanged(r2, r3, r4)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f21558a
            switch(r0) {
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r4.f21559b
            pd.i r0 = (pd.i) r0
            r1 = 0
            qd.l r1 = r0.S(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r0 = r0.f10492p
            java.lang.String r0 = p.a.f(r0)
            qd.l r2 = r4.a()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = " "
            java.lang.String r0 = bc.e.v(r1, r3, r0, r3, r2)
            return r0
    }
}
