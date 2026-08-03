package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3808 extends Yue.AbstractC2233 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3164.InterfaceC3166 f12073;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public long f12074;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۢ$ۥ, reason: contains not printable characters */
    public static class C3809 implements Yue.AbstractC2233.InterfaceC2236 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.C3164.InterfaceC3166 f12075;

        @Yue.InterfaceC3422
        public C3809() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
        }

        @Yue.InterfaceC3422
        public C3809(@Yue.InterfaceC4418 Yue.C3164.InterfaceC3166 r2) {
                r1 = this;
                java.lang.String r0 = "logger"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f12075 = r2
                return
        }

        public /* synthetic */ C3809(Yue.C3164.InterfaceC3166 r1, int r2, Yue.C1769 r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L6
                Yue.ۥ۠ۤۨۢ$ۥ۟ r1 = Yue.C3164.InterfaceC3166.f10458
            L6:
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC2233.InterfaceC2236
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ */
        public Yue.AbstractC2233 mo10250(@Yue.InterfaceC4418 Yue.InterfaceC0904 r3) {
                r2 = this;
                java.lang.String r0 = "call"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥ۠ۨۢ r3 = new Yue.ۥ۠ۨۢ
                Yue.ۥ۠ۤۨۢ$ۥ۟ r0 = r2.f12075
                r1 = 0
                r3.<init>(r0, r1)
                return r3
        }
    }

    public C3808(Yue.C3164.InterfaceC3166 r1) {
            r0 = this;
            r0.<init>()
            r0.f12073 = r1
            return
    }

    public /* synthetic */ C3808(Yue.C3164.InterfaceC3166 r1, Yue.C1769 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ */
    public void mo10221(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 Yue.C5377 r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "cachedResponse"
            Yue.C3329.m13906(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "cacheConditionalHit: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo10222(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 Yue.C5377 r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "response"
            Yue.C3329.m13906(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "cacheHit: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo10223(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "cacheMiss"
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo10224(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "callEnd"
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo10225(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "ioe"
            Yue.C3329.m13906(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "callFailed: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo10226(@Yue.InterfaceC4418 Yue.InterfaceC0904 r3) {
            r2 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r3, r0)
            long r0 = java.lang.System.nanoTime()
            r2.f12074 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "callStart: "
            r0.append(r1)
            Yue.ۥۡۦۤۧ r3 = r3.mo5241()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.m15271(r3)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo10227(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "canceled"
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo10228(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 java.net.InetSocketAddress r3, @Yue.InterfaceC4418 java.net.Proxy r4, @Yue.InterfaceC4543 Yue.EnumC4981 r5) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "inetSocketAddress"
            Yue.C3329.m13906(r3, r2)
            java.lang.String r2 = "proxy"
            Yue.C3329.m13906(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "connectEnd: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo10229(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 java.net.InetSocketAddress r3, @Yue.InterfaceC4418 java.net.Proxy r4, @Yue.InterfaceC4543 Yue.EnumC4981 r5, @Yue.InterfaceC4418 java.io.IOException r6) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "inetSocketAddress"
            Yue.C3329.m13906(r3, r2)
            java.lang.String r2 = "proxy"
            Yue.C3329.m13906(r4, r2)
            java.lang.String r2 = "ioe"
            Yue.C3329.m13906(r6, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "connectFailed: "
            r2.append(r3)
            r2.append(r5)
            r3 = 32
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo10230(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 java.net.InetSocketAddress r3, @Yue.InterfaceC4418 java.net.Proxy r4) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "inetSocketAddress"
            Yue.C3329.m13906(r3, r2)
            java.lang.String r2 = "proxy"
            Yue.C3329.m13906(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "connectStart: "
            r2.append(r0)
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo10231(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 Yue.InterfaceC1484 r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "connection"
            Yue.C3329.m13906(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "connectionAcquired: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo10232(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 Yue.InterfaceC1484 r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "connection"
            Yue.C3329.m13906(r3, r2)
            java.lang.String r2 = "connectionReleased"
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo10233(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 java.util.List<? extends java.net.InetAddress> r4) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "domainName"
            Yue.C3329.m13906(r3, r2)
            java.lang.String r2 = "inetAddressList"
            Yue.C3329.m13906(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "dnsEnd: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo10234(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "domainName"
            Yue.C3329.m13906(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "dnsStart: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo10235(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 Yue.C3171 r3, @Yue.InterfaceC4418 java.util.List<? extends java.net.Proxy> r4) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "url"
            Yue.C3329.m13906(r3, r2)
            java.lang.String r2 = "proxies"
            Yue.C3329.m13906(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "proxySelectEnd: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo10236(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 Yue.C3171 r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "url"
            Yue.C3329.m13906(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "proxySelectStart: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo10237(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, long r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "requestBodyEnd: byteCount="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo10238(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "requestBodyStart"
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo10239(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "ioe"
            Yue.C3329.m13906(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "requestFailed: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo10240(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 Yue.C5317 r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "request"
            Yue.C3329.m13906(r3, r2)
            java.lang.String r2 = "requestHeadersEnd"
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public void mo10241(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "requestHeadersStart"
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo10242(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, long r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "responseBodyEnd: byteCount="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public void mo10243(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "responseBodyStart"
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public void mo10244(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "ioe"
            Yue.C3329.m13906(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "responseFailed: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public void mo10245(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 Yue.C5377 r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "response"
            Yue.C3329.m13906(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "responseHeadersEnd: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public void mo10246(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "responseHeadersStart"
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public void mo10247(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4418 Yue.C5377 r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "response"
            Yue.C3329.m13906(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "satisfactionFailure: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public void mo10248(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2, @Yue.InterfaceC4543 Yue.C2972 r3) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "secureConnectEnd: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m15271(r2)
            return
    }

    @Override // Yue.AbstractC2233
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo10249(@Yue.InterfaceC4418 Yue.InterfaceC0904 r2) {
            r1 = this;
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "secureConnectStart"
            r1.m15271(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m15271(java.lang.String r6) {
            r5 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = java.lang.System.nanoTime()
            long r3 = r5.f12074
            long r1 = r1 - r3
            long r0 = r0.toMillis(r1)
            Yue.ۥ۠ۤۨۢ$ۥ۟ r2 = r5.f12073
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 91
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " ms] "
            r3.append(r0)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.mo13423(r6)
            return
    }
}
