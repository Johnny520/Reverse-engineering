package p000;

/* JADX INFO: renamed from: j1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0415j1 extends p000.bp0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5287;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.ViewOnAttachStateChangeListenerC0496l1 f5288;

    public /* synthetic */ C0415j1(p000.ViewOnAttachStateChangeListenerC0496l1 r1, int r2) {
            r0 = this;
            r0.f5287 = r2
            r0.f5288 = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f5287
            switch(r0) {
                case 0: goto L27;
                default: goto L5;
            }
        L5:
            br1 r4 = (p000.br1) r4
            java.util.List r0 = r4.f1819
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L10
            goto L24
        L10:
            l1 r3 = r3.f5288
            androidx.compose.ui.platform.AndroidComposeView r0 = r3.f6358
            y81 r0 = r0.getSnapshotObserver()
            j1 r1 = r3.f6357
            k1 r2 = new k1
            r2.<init>(r4, r3)
            kx1 r3 = r0.f12491
            r3.m3425(r4, r1, r2)
        L24:
            s62 r3 = p000.s62.f9751
            return r3
        L27:
            android.view.accessibility.AccessibilityEvent r4 = (android.view.accessibility.AccessibilityEvent) r4
            l1 r3 = r3.f5288
            androidx.compose.ui.platform.AndroidComposeView r3 = r3.f6358
            android.view.ViewParent r0 = r3.getParent()
            boolean r3 = r0.requestSendAccessibilityEvent(r3, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
    }
}
