package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class a52 extends p000.i91 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f71;

    /* JADX INFO: renamed from: β */
    public boolean f72;

    /* JADX INFO: renamed from: γ */
    public int f73;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ java.lang.Object f74;

    public a52(p000.b52 r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f71 = r0
            r1.<init>()
            r1.f74 = r2
            r1.f73 = r3
            r2 = 0
            r1.f72 = r2
            return
    }

    public a52(p000.y92 r2) {
            r1 = this;
            r0 = 1
            r1.f71 = r0
            r1.<init>()
            r1.f74 = r2
            r2 = 0
            r1.f72 = r2
            r1.f73 = r2
            return
    }

    @Override // p000.z92
    /* JADX INFO: renamed from: α */
    public final void mo38() {
            r3 = this;
            int r0 = r3.f71
            switch(r0) {
                case 0: goto L26;
                default: goto L5;
            }
        L5:
            int r0 = r3.f73
            int r0 = r0 + 1
            r3.f73 = r0
            java.lang.Object r1 = r3.f74
            y92 r1 = (p000.y92) r1
            java.util.ArrayList r2 = r1.f12504
            int r2 = r2.size()
            if (r0 != r2) goto L25
            z92 r0 = r1.f12507
            if (r0 == 0) goto L1e
            r0.mo38()
        L1e:
            r0 = 0
            r3.f73 = r0
            r3.f72 = r0
            r1.f12508 = r0
        L25:
            return
        L26:
            boolean r0 = r3.f72
            if (r0 != 0) goto L35
            java.lang.Object r0 = r3.f74
            b52 r0 = (p000.b52) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f1484
            int r3 = r3.f73
            r0.setVisibility(r3)
        L35:
            return
    }

    @Override // p000.i91, p000.z92
    /* JADX INFO: renamed from: β */
    public void mo39() {
            r1 = this;
            int r0 = r1.f71
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            r0 = 1
            r1.f72 = r0
            return
    }

    @Override // p000.i91, p000.z92
    /* JADX INFO: renamed from: γ */
    public final void mo40() {
            r1 = this;
            int r0 = r1.f71
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            boolean r0 = r1.f72
            if (r0 == 0) goto La
            goto L18
        La:
            r0 = 1
            r1.f72 = r0
            java.lang.Object r1 = r1.f74
            y92 r1 = (p000.y92) r1
            z92 r1 = r1.f12507
            if (r1 == 0) goto L18
            r1.mo40()
        L18:
            return
        L19:
            java.lang.Object r1 = r1.f74
            b52 r1 = (p000.b52) r1
            androidx.appcompat.widget.Toolbar r1 = r1.f1484
            r0 = 0
            r1.setVisibility(r0)
            return
    }
}
