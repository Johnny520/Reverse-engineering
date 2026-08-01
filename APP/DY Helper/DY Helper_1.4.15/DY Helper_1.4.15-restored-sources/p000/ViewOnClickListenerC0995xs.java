package p000;

/* JADX INFO: renamed from: xs */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0995xs implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12272;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.LinearLayout f12273;

    public /* synthetic */ ViewOnClickListenerC0995xs(android.widget.LinearLayout r1, int r2) {
            r0 = this;
            r0.f12272 = r2
            r0.f12273 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            int r3 = r2.f12272
            r0 = 0
            android.widget.LinearLayout r2 = r2.f12273
            switch(r3) {
                case 0: goto L2a;
                case 1: goto L24;
                default: goto L8;
            }
        L8:
            bv1 r3 = p000.bv1.f1853
            java.lang.String r3 = "settings_group_link_dismissed"
            r1 = 1
            p000.ui1.m5871(r3, r1)
            android.view.ViewParent r3 = r2.getParent()
            boolean r1 = r3 instanceof android.view.ViewGroup
            if (r1 == 0) goto L1b
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L1c
        L1b:
            r3 = r0
        L1c:
            if (r3 == 0) goto L21
            r3.removeView(r2)
        L21:
            p000.bv1.f1866 = r0
            return
        L24:
            q71 r3 = p000.q71.f8896
            p000.q71.m4794(r2)
            return
        L2a:
            if (r2 == 0) goto L4e
            java.lang.Object r3 = r2.getTag()
            boolean r3 = r3 instanceof android.app.AlertDialog
            if (r3 == 0) goto L41
            java.lang.Object r2 = r2.getTag()
            r2.getClass()
            android.app.AlertDialog r2 = (android.app.AlertDialog) r2
            r2.dismiss()
            goto L4e
        L41:
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L4c
            android.view.View r2 = (android.view.View) r2
            goto L2a
        L4c:
            r2 = r0
            goto L2a
        L4e:
            return
    }
}
