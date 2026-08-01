package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class s40 {

    /* JADX INFO: renamed from: α */
    public final p000.y40 f9706;

    /* JADX INFO: renamed from: β */
    public final androidx.compose.p001ui.platform.AndroidComposeView f9707;

    /* JADX INFO: renamed from: γ */
    public final p000.c21 f9708;

    /* JADX INFO: renamed from: δ */
    public final p000.c21 f9709;

    /* JADX INFO: renamed from: ε */
    public boolean f9710;

    public s40(p000.y40 r1, androidx.compose.p001ui.platform.AndroidComposeView r2) {
            r0 = this;
            r0.<init>()
            r0.f9706 = r1
            r0.f9707 = r2
            int r1 = p000.uq1.f10933
            c21 r1 = new c21
            r1.<init>()
            r0.f9708 = r1
            c21 r1 = new c21
            r1.<init>()
            r0.f9709 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m5364() {
            r9 = this;
            boolean r0 = r9.f9710
            if (r0 != 0) goto L24
            w0 r1 = new w0
            r7 = 0
            r8 = 2
            r2 = 0
            java.lang.Class<s40> r4 = p000.s40.class
            java.lang.String r5 = "invalidateNodes"
            java.lang.String r6 = "invalidateNodes()V"
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.platform.AndroidComposeView r9 = r3.f9707
            v11 r9 = r9.f957
            int r0 = r9.m6021(r1)
            if (r0 < 0) goto L1e
            goto L21
        L1e:
            r9.m6015(r1)
        L21:
            r9 = 1
            r3.f9710 = r9
        L24:
            return
    }
}
