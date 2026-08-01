package p000;

/* JADX INFO: renamed from: nn */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0592nn extends p000.bp0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7685;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.C0693pn f7686;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ androidx.compose.p001ui.platform.AndroidComposeView f7687;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.e80 f7688;

    public C0592nn(androidx.compose.p001ui.platform.AndroidComposeView r2, p000.C0693pn r3, p000.e80 r4) {
            r1 = this;
            r0 = 0
            r1.f7685 = r0
            r1.f7687 = r2
            r1.f7686 = r3
            r1.f7688 = r4
            r2 = 2
            r1.<init>(r2)
            return
    }

    public C0592nn(p000.C0693pn r1, androidx.compose.p001ui.platform.AndroidComposeView r2, p000.e80 r3, int r4) {
            r0 = this;
            r4 = 1
            r0.f7685 = r4
            r0.f7686 = r1
            r0.f7687 = r2
            r0.f7688 = r3
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.f7685
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            v80 r5 = (p000.v80) r5
            java.lang.Number r6 = (java.lang.Number) r6
            r6.intValue()
            r6 = 1
            int r6 = p000.v81.m6136(r6)
            pn r0 = r4.f7686
            androidx.compose.ui.platform.AndroidComposeView r1 = r4.f7687
            e80 r4 = r4.f7688
            r0.m4552(r1, r4, r5, r6)
            s62 r4 = p000.s62.f9751
            return r4
        L1d:
            v80 r5 = (p000.v80) r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0 = r6 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L2e
            r0 = r2
            goto L2f
        L2e:
            r0 = r3
        L2f:
            r6 = r6 & r2
            boolean r6 = r5.m6075(r6, r0)
            if (r6 == 0) goto L4b
            r6 = 866651995(0x33a80f5b, float:7.825903E-8)
            r5.m6082(r6)
            pn r6 = r4.f7686
            i2 r6 = r6.f8606
            e80 r0 = r4.f7688
            androidx.compose.ui.platform.AndroidComposeView r4 = r4.f7687
            p000.AbstractC0292fo.m2154(r4, r6, r0, r5, r3)
            r5.m6100(r3)
            goto L4e
        L4b:
            r5.m6078()
        L4e:
            s62 r4 = p000.s62.f9751
            return r4
    }
}
