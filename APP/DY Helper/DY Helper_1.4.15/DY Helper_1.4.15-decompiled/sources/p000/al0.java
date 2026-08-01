package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class al0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f306;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.LinearLayout f307;

    public /* synthetic */ al0(android.widget.LinearLayout r1, int r2) {
            r0 = this;
            r0.f306 = r2
            r0.f307 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f306
            s62 r1 = p000.s62.f9751
            android.widget.LinearLayout r4 = r4.f307
            switch(r0) {
                case 0: goto L26;
                default: goto L9;
            }
        L9:
            java.lang.Object r0 = p000.ui1.f10844
            java.lang.String r0 = "operation_beta_apply_prompt_dismissed_at"
            long r2 = java.lang.System.currentTimeMillis()
            p000.ui1.m5874(r2, r0)
            android.view.ViewParent r0 = r4.getParent()
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L1f
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L25
            r0.removeView(r4)
        L25:
            return r1
        L26:
            android.view.View r4 = r4.getRootView()
            java.lang.Object r4 = r4.getTag()
            r4.getClass()
            android.app.AlertDialog r4 = (android.app.AlertDialog) r4
            r4.dismiss()
            return r1
    }
}
