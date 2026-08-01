package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hd2 implements p000.InterfaceC0841tn, p000.fr0 {

    /* JADX INFO: renamed from: ε */
    public final androidx.compose.p001ui.platform.AndroidComposeView f4698;

    /* JADX INFO: renamed from: ζ */
    public final p000.C1064zn f4699;

    /* JADX INFO: renamed from: η */
    public boolean f4700;

    /* JADX INFO: renamed from: θ */
    public p000.jr0 f4701;

    /* JADX INFO: renamed from: ι */
    public p000.e80 f4702;

    public hd2(androidx.compose.p001ui.platform.AndroidComposeView r1, p000.C1064zn r2) {
            r0 = this;
            r0.<init>()
            r0.f4698 = r1
            r0.f4699 = r2
            an r1 = p000.AbstractC0119cn.f2209
            r0.f4702 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2494() {
            r3 = this;
            boolean r0 = r3.f4700
            if (r0 != 0) goto L1d
            r0 = 1
            r3.f4700 = r0
            androidx.compose.ui.platform.AndroidComposeView r0 = r3.f4698
            android.view.View r0 = r0.getView()
            r1 = 2131297167(0x7f09038f, float:1.8212271E38)
            r2 = 0
            r0.setTag(r1, r2)
            jr0 r0 = r3.f4701
            if (r0 == 0) goto L1b
            r0.m2985(r3)
        L1b:
            r3.f4701 = r2
        L1d:
            zn r3 = r3.f4699
            r3.m7193()
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m2495(p000.e80 r3) {
            r2 = this;
            i3 r0 = new i3
            r1 = 5
            r0.<init>(r2, r1, r3)
            androidx.compose.ui.platform.AndroidComposeView r2 = r2.f4698
            r2.setOnReadyForComposition(r0)
            return
    }

    @Override // p000.fr0
    /* JADX INFO: renamed from: κ */
    public final void mo743(p000.hr0 r1, p000.br0 r2) {
            r0 = this;
            br0 r1 = p000.br0.ON_DESTROY
            if (r2 != r1) goto L8
            r0.m2494()
            return
        L8:
            br0 r1 = p000.br0.ON_CREATE
            if (r2 != r1) goto L15
            boolean r1 = r0.f4700
            if (r1 != 0) goto L15
            e80 r1 = r0.f4702
            r0.m2495(r1)
        L15:
            return
    }
}
