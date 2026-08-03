package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1490 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<Yue.C1487> f4649;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f4650;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f4651;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f4652;

    public C1490(@Yue.InterfaceC4418 java.util.List<Yue.C1487> r2) {
            r1 = this;
            java.lang.String r0 = "connectionSpecs"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f4649 = r2
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C1487 m7352(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r5, r0)
            int r0 = r4.f4650
            java.util.List<Yue.ۥ۟ۦۧۨ> r1 = r4.f4649
            int r1 = r1.size()
        Ld:
            if (r0 >= r1) goto L25
            java.util.List<Yue.ۥ۟ۦۧۨ> r2 = r4.f4649
            java.lang.Object r2 = r2.get(r0)
            Yue.ۥ۟ۦۧۨ r2 = (Yue.C1487) r2
            boolean r3 = r2.m7331(r5)
            if (r3 == 0) goto L22
            int r0 = r0 + 1
            r4.f4650 = r0
            goto L26
        L22:
            int r0 = r0 + 1
            goto Ld
        L25:
            r2 = 0
        L26:
            if (r2 == 0) goto L34
            boolean r0 = r4.m7354(r5)
            r4.f4651 = r0
            boolean r0 = r4.f4652
            r2.m7329(r5, r0)
            return r2
        L34:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to find acceptable protocols. isFallback="
            r1.append(r2)
            boolean r2 = r4.f4652
            r1.append(r2)
            java.lang.String r2 = ", modes="
            r1.append(r2)
            java.util.List<Yue.ۥ۟ۦۧۨ> r2 = r4.f4649
            r1.append(r2)
            java.lang.String r2 = ", supported protocols="
            r1.append(r2)
            java.lang.String[] r5 = r5.getEnabledProtocols()
            Yue.C3329.m13903(r5)
            java.lang.String r5 = java.util.Arrays.toString(r5)
            java.lang.String r2 = "toString(this)"
            Yue.C3329.m13905(r5, r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m7353(@Yue.InterfaceC4418 java.io.IOException r4) {
            r3 = this;
            java.lang.String r0 = "e"
            Yue.C3329.m13906(r4, r0)
            r0 = 1
            r3.f4652 = r0
            boolean r1 = r3.f4651
            r2 = 0
            if (r1 != 0) goto Lf
        Ld:
            r0 = r2
            goto L2f
        Lf:
            boolean r1 = r4 instanceof java.net.ProtocolException
            if (r1 == 0) goto L14
            goto Ld
        L14:
            boolean r1 = r4 instanceof java.io.InterruptedIOException
            if (r1 == 0) goto L19
            goto Ld
        L19:
            boolean r1 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r1 == 0) goto L26
            java.lang.Throwable r1 = r4.getCause()
            boolean r1 = r1 instanceof java.security.cert.CertificateException
            if (r1 == 0) goto L26
            goto Ld
        L26:
            boolean r1 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r1 == 0) goto L2b
            goto Ld
        L2b:
            boolean r4 = r4 instanceof javax.net.ssl.SSLException
            if (r4 == 0) goto Ld
        L2f:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m7354(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            int r0 = r3.f4650
            java.util.List<Yue.ۥ۟ۦۧۨ> r1 = r3.f4649
            int r1 = r1.size()
        L8:
            if (r0 >= r1) goto L1d
            java.util.List<Yue.ۥ۟ۦۧۨ> r2 = r3.f4649
            java.lang.Object r2 = r2.get(r0)
            Yue.ۥ۟ۦۧۨ r2 = (Yue.C1487) r2
            boolean r2 = r2.m7331(r4)
            if (r2 == 0) goto L1a
            r4 = 1
            return r4
        L1a:
            int r0 = r0 + 1
            goto L8
        L1d:
            r4 = 0
            return r4
    }
}
