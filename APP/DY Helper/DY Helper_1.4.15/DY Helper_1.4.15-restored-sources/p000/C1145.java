package p000;

/* JADX INFO: renamed from: ｏ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1145 extends androidx.appcompat.widget.AbstractViewOnTouchListenerC0033 {

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ int f13506;

    /* JADX INFO: renamed from: ο */
    public final /* synthetic */ android.view.View f13507;

    public C1145(androidx.appcompat.view.menu.ActionMenuItemView r2) {
            r1 = this;
            r0 = 0
            r1.f13506 = r0
            r1.f13507 = r2
            r1.<init>(r2)
            return
    }

    public C1145(androidx.appcompat.widget.ActivityChooserView r2, android.widget.FrameLayout r3) {
            r1 = this;
            r0 = 1
            r1.f13506 = r0
            r1.f13507 = r2
            r1.<init>(r3)
            return
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0033
    /* JADX INFO: renamed from: β */
    public final p000.ew1 mo317() {
            r1 = this;
            int r0 = r1.f13506
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            android.view.View r1 = r1.f13507
            androidx.appcompat.widget.ActivityChooserView r1 = (androidx.appcompat.widget.ActivityChooserView) r1
            androidx.appcompat.widget.θ r1 = r1.getListPopupWindow()
            return r1
        Le:
            android.view.View r1 = r1.f13507
            androidx.appcompat.view.menu.ActionMenuItemView r1 = (androidx.appcompat.view.menu.ActionMenuItemView) r1
            ｐ r1 = r1.f428
            if (r1 == 0) goto L23
            ｒ r1 = (p000.C1148) r1
            androidx.appcompat.widget.γ r1 = r1.f13510
            ｑ r1 = r1.f809
            if (r1 == 0) goto L23
            oz0 r1 = r1.m5038()
            goto L24
        L23:
            r1 = 0
        L24:
            return r1
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0033
    /* JADX INFO: renamed from: γ */
    public final boolean mo318() {
            r2 = this;
            int r0 = r2.f13506
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            android.view.View r2 = r2.f13507
            androidx.appcompat.widget.ActivityChooserView r2 = (androidx.appcompat.widget.ActivityChooserView) r2
            boolean r0 = r2.m268()
            if (r0 != 0) goto L20
            boolean r0 = r2.f539
            if (r0 != 0) goto L14
            goto L20
        L14:
            f r2 = r2.f529
            r2.getClass()
            java.lang.String r2 = "No data model. Did you call #setDataModel?"
            p000.C1080.m7279(r2)
            r2 = 0
            goto L21
        L20:
            r2 = 1
        L21:
            return r2
        L22:
            android.view.View r0 = r2.f13507
            androidx.appcompat.view.menu.ActionMenuItemView r0 = (androidx.appcompat.view.menu.ActionMenuItemView) r0
            hz0 r1 = r0.f426
            if (r1 == 0) goto L40
            lz0 r0 = r0.f423
            boolean r0 = r1.mo237(r0)
            if (r0 == 0) goto L40
            ew1 r2 = r2.mo317()
            if (r2 == 0) goto L40
            boolean r2 = r2.mo340()
            if (r2 == 0) goto L40
            r2 = 1
            goto L41
        L40:
            r2 = 0
        L41:
            return r2
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0033
    /* JADX INFO: renamed from: δ */
    public boolean mo319() {
            r1 = this;
            int r0 = r1.f13506
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.mo319()
            return r1
        La:
            android.view.View r1 = r1.f13507
            androidx.appcompat.widget.ActivityChooserView r1 = (androidx.appcompat.widget.ActivityChooserView) r1
            r1.m267()
            r1 = 1
            return r1
    }
}
