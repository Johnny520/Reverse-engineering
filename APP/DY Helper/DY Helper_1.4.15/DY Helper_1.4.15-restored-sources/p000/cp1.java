package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cp1 {

    /* JADX INFO: renamed from: α */
    public final p000.C0669p f2709;

    /* JADX INFO: renamed from: β */
    public final p000.ij0 f2710;

    /* JADX INFO: renamed from: γ */
    public final boolean f2711;

    /* JADX INFO: renamed from: δ */
    public final java.util.List f2712;

    /* JADX INFO: renamed from: ε */
    public int f2713;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object f2714;

    /* JADX INFO: renamed from: η */
    public final java.util.ArrayList f2715;

    public cp1(p000.C0669p r1, p000.ij0 r2, p000.uk1 r3, boolean r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f2709 = r1
            r0.f2710 = r2
            r0.f2711 = r4
            jz r2 = p000.C0450jz.f5672
            r0.f2712 = r2
            r0.f2714 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f2715 = r2
            og0 r2 = r1.f8371
            r2.getClass()
            java.net.URI r2 = r2.m4236()
            java.lang.String r3 = r2.getHost()
            if (r3 != 0) goto L33
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            java.net.Proxy[] r1 = new java.net.Proxy[]{r1}
            java.util.List r1 = p000.ud2.m5852(r1)
            goto L51
        L33:
            java.net.ProxySelector r1 = r1.f8370
            java.util.List r1 = r1.select(r2)
            if (r1 == 0) goto L47
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L42
            goto L47
        L42:
            java.util.List r1 = p000.ud2.m5851(r1)
            goto L51
        L47:
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            java.net.Proxy[] r1 = new java.net.Proxy[]{r1}
            java.util.List r1 = p000.ud2.m5852(r1)
        L51:
            r0.f2712 = r1
            r1 = 0
            r0.f2713 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m1608() {
            r2 = this;
            int r0 = r2.f2713
            java.util.List r1 = r2.f2712
            int r1 = r1.size()
            if (r0 >= r1) goto Lb
            goto L13
        Lb:
            java.util.ArrayList r2 = r2.f2715
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L15
        L13:
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }
}
