package p000;

/* JADX INFO: renamed from: ξ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1091 extends p000.bp0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13407;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f13408;

    public /* synthetic */ C1091(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f13407 = r1
            r0.f13408 = r2
            r1 = 2
            r0.<init>(r1)
            return
    }

    public /* synthetic */ C1091(androidx.compose.p001ui.platform.AbstractComposeView r1, int r2, int r3) {
            r0 = this;
            r0.f13407 = r3
            r0.f13408 = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.f13407
            switch(r0) {
                case 0: goto L43;
                case 1: goto L31;
                case 2: goto L1b;
                default: goto L5;
            }
        L5:
            v80 r5 = (p000.v80) r5
            java.lang.Number r6 = (java.lang.Number) r6
            r6.intValue()
            java.lang.Object r4 = r4.f13408
            androidx.compose.ui.window.PopupLayout r4 = (androidx.compose.p001ui.window.PopupLayout) r4
            r6 = 1
            int r6 = p000.v81.m6136(r6)
            r4.mo355(r5, r6)
            s62 r4 = p000.s62.f9751
            return r4
        L1b:
            v80 r5 = (p000.v80) r5
            java.lang.Number r6 = (java.lang.Number) r6
            r6.intValue()
            java.lang.Object r4 = r4.f13408
            androidx.compose.ui.platform.ComposeView r4 = (androidx.compose.p001ui.platform.ComposeView) r4
            r6 = 1
            int r6 = p000.v81.m6136(r6)
            r4.mo355(r5, r6)
            s62 r4 = p000.s62.f9751
            return r4
        L31:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            bs1 r6 = (p000.bs1) r6
            java.lang.Object r4 = r4.f13408
            z1 r4 = (p000.ViewOnAttachStateChangeListenerC1042z1) r4
            r4.m7063(r5, r6)
            s62 r4 = p000.s62.f9751
            return r4
        L43:
            v80 r5 = (p000.v80) r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0 = r6 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L54
            r0 = r3
            goto L55
        L54:
            r0 = r2
        L55:
            r6 = r6 & r3
            boolean r6 = r5.m6075(r6, r0)
            if (r6 == 0) goto L64
            java.lang.Object r4 = r4.f13408
            androidx.compose.ui.platform.AbstractComposeView r4 = (androidx.compose.p001ui.platform.AbstractComposeView) r4
            r4.mo355(r5, r2)
            goto L67
        L64:
            r5.m6078()
        L67:
            s62 r4 = p000.s62.f9751
            return r4
    }
}
