package p000;

/* JADX INFO: renamed from: sr */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0808sr implements p000.mx1 {

    /* JADX INFO: renamed from: α */
    public final p000.InterfaceC0771rr f10000;

    /* JADX INFO: renamed from: β */
    public p000.mx1 f10001;

    public C0808sr(p000.InterfaceC0771rr r1) {
            r0 = this;
            r0.<init>()
            r0.f10000 = r1
            return
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: α */
    public final boolean mo1120(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            rr r0 = r0.f10000
            boolean r0 = r0.mo2603(r1)
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: β */
    public final java.lang.String mo1121(javax.net.ssl.SSLSocket r1) {
            r0 = this;
            mx1 r0 = r0.m5529(r1)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.mo1121(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: γ */
    public final boolean mo1122() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: δ */
    public final void mo1123(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r3.getClass()
            mx1 r0 = r0.m5529(r1)
            if (r0 == 0) goto Lc
            r0.mo1123(r1, r2, r3)
        Lc:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final synchronized p000.mx1 m5529(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            monitor-enter(r1)
            mx1 r0 = r1.f10001     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            rr r0 = r1.f10000     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.mo2603(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            rr r0 = r1.f10000     // Catch: java.lang.Throwable -> L16
            mx1 r2 = r0.mo2604(r2)     // Catch: java.lang.Throwable -> L16
            r1.f10001 = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1c
        L18:
            mx1 r2 = r1.f10001     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r2
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }
}
