package androidx.compose.p001ui.platform;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends androidx.compose.p001ui.platform.AbstractComposeView {

    /* JADX INFO: renamed from: ο */
    public final p000.x91 f962;

    /* JADX INFO: renamed from: π */
    public boolean f963;

    public ComposeView(android.content.Context r4) {
            r3 = this;
            r0 = 6
            r1 = 0
            r2 = 0
            r3.<init>(r4, r2, r0, r1)
            return
    }

    public ComposeView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public ComposeView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            x91 r1 = p000.j81.m2882(r1)
            r0.f962 = r1
            return
    }

    public /* synthetic */ ComposeView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r0 = this;
            java.lang.String r0 = "androidx.compose.ui.platform.ComposeView"
            return r0
    }

    @Override // androidx.compose.p001ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
            r0 = this;
            boolean r0 = r0.f963
            return r0
    }

    public final void setContent(p000.e80 r3) {
            r2 = this;
            r0 = 1
            r2.f963 = r0
            x91 r1 = r2.f962
            r1.setValue(r3)
            boolean r3 = r2.isAttachedToWindow()
            if (r3 != 0) goto L16
            pn r3 = r2.getComposeViewContext$ui()
            if (r3 == 0) goto L15
            goto L16
        L15:
            return
        L16:
            un r3 = r2.f866
            if (r3 != 0) goto L35
            boolean r3 = r2.isAttachedToWindow()
            if (r3 != 0) goto L35
            pn r3 = r2.f867
            if (r3 == 0) goto L2f
            android.view.View r3 = r3.f8596
            if (r3 == 0) goto L2f
            boolean r3 = r3.isAttachedToWindow()
            if (r3 != r0) goto L2f
            goto L35
        L2f:
            java.lang.String r2 = "createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference."
            p000.C1080.m7279(r2)
            return
        L35:
            r2.m359()
            return
    }

    @Override // androidx.compose.p001ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: α */
    public final void mo355(p000.v80 r6, int r7) {
            r5 = this;
            r0 = 420213850(0x190bf45a, float:7.235478E-24)
            r6.m6083(r0)
            boolean r0 = r6.m6092(r5)
            r1 = 2
            if (r0 == 0) goto Lf
            r0 = 4
            goto L10
        Lf:
            r0 = r1
        L10:
            r0 = r0 | r7
            r2 = r0 & 3
            r3 = 1
            r4 = 0
            if (r2 == r1) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = r4
        L1a:
            r0 = r0 & r3
            boolean r0 = r6.m6075(r0, r1)
            if (r0 == 0) goto L43
            x91 r0 = r5.f962
            java.lang.Object r0 = r0.getValue()
            e80 r0 = (p000.e80) r0
            if (r0 != 0) goto L35
            r0 = -1238823553(0xffffffffb6290d7f, float:-2.5190818E-6)
            r6.m6082(r0)
        L31:
            r6.m6100(r4)
            goto L46
        L35:
            r1 = 98585282(0x5e04ac2, float:2.109232E-35)
            r6.m6082(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.invoke(r6, r1)
            goto L31
        L43:
            r6.m6078()
        L46:
            bl1 r6 = r6.m6101()
            if (r6 == 0) goto L54
            ξ r0 = new ξ
            r1 = 2
            r0.<init>(r5, r7, r1)
            r6.f1780 = r0
        L54:
            return
    }
}
