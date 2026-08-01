package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wk0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11746;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.View f11747;

    public /* synthetic */ wk0(android.view.View r1, int r2) {
            r0 = this;
            r0.f11746 = r2
            r0.f11747 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f11746
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            switch(r0) {
                case 0: goto L37;
                case 1: goto L1f;
                default: goto L7;
            }
        L7:
            r2.getClass()
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L19
            android.view.View r1 = r1.f11747
            if (r2 != r1) goto L17
            goto L19
        L17:
            r1 = 0
            goto L1a
        L19:
            r1 = 1
        L1a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L1f:
            r2.getClass()
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L31
            android.view.View r1 = r1.f11747
            if (r2 != r1) goto L2f
            goto L31
        L2f:
            r1 = 0
            goto L32
        L31:
            r1 = 1
        L32:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L37:
            java.lang.Object r2 = r2.get()
            android.view.View r1 = r1.f11747
            boolean r1 = p000.ln0.m3626(r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }
}
