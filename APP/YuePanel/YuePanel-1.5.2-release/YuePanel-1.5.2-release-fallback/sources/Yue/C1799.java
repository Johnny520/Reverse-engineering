package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1799 implements Yue.InterfaceC5818 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C1799.InterfaceC1800 f5529;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC5818 f5530;

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۧۧ$ۥ, reason: contains not printable characters */
    public interface InterfaceC1800 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo1437(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r1);

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟ */
        Yue.InterfaceC5818 mo1438(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r1);
    }

    public C1799(@Yue.InterfaceC4418 Yue.C1799.InterfaceC1800 r2) {
            r1 = this;
            java.lang.String r0 = "socketAdapterFactory"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f5529 = r2
            return
    }

    @Override // Yue.InterfaceC5818
    public boolean isSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.InterfaceC5818
    /* JADX INFO: renamed from: ۥ */
    public boolean mo1400(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟ۨۧۧ$ۥ r0 = r1.f5529
            boolean r2 = r0.mo1437(r2)
            return r2
    }

    @Override // Yue.InterfaceC5818
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟ */
    public java.lang.String mo1401(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۢ۟ۢۢ r0 = r1.m8482(r2)
            if (r0 == 0) goto L10
            java.lang.String r2 = r0.mo1401(r2)
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    @Override // Yue.InterfaceC5818
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ */
    public javax.net.ssl.X509TrustManager mo1402(@Yue.InterfaceC4418 javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            javax.net.ssl.X509TrustManager r1 = Yue.InterfaceC5818.C5819.m21665(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC5818
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo1403(@Yue.InterfaceC4418 javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            boolean r1 = Yue.InterfaceC5818.C5819.m21664(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC5818
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo1404(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2, @Yue.InterfaceC4543 java.lang.String r3, @Yue.InterfaceC4418 java.util.List<? extends Yue.EnumC4981> r4) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "protocols"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥۢ۟ۢۢ r0 = r1.m8482(r2)
            if (r0 == 0) goto L13
            r0.mo1404(r2, r3, r4)
        L13:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final synchronized Yue.InterfaceC5818 m8482(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            monitor-enter(r1)
            Yue.ۥۢ۟ۢۢ r0 = r1.f5530     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            Yue.ۥ۟ۨۧۧ$ۥ r0 = r1.f5529     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.mo1437(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            Yue.ۥ۟ۨۧۧ$ۥ r0 = r1.f5529     // Catch: java.lang.Throwable -> L16
            Yue.ۥۢ۟ۢۢ r2 = r0.mo1438(r2)     // Catch: java.lang.Throwable -> L16
            r1.f5530 = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1c
        L18:
            Yue.ۥۢ۟ۢۢ r2 = r1.f5530     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r2
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }
}
