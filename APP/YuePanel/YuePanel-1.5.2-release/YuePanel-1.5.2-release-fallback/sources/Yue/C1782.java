package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1782 implements Yue.InterfaceC6998 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public javax.net.ssl.SSLContext f5498;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.concurrent.ExecutorService f5499;

    public C1782(javax.net.ssl.SSLContext r2) {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            r1.<init>(r2, r0)
            return
    }

    public C1782(javax.net.ssl.SSLContext r1, java.util.concurrent.ExecutorService r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto Lc
            if (r2 == 0) goto Lc
            r0.f5498 = r1
            r0.f5499 = r2
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    @Override // Yue.InterfaceC6998
    public void close() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f5499
            r0.shutdown()
            return
    }

    @Override // Yue.InterfaceC6988
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.InterfaceC6981 mo8468(Yue.AbstractC6982 r1, Yue.AbstractC1986 r2) {
            r0 = this;
            Yue.ۥۢۥۡۥ r1 = r0.mo8468(r1, r2)
            return r1
    }

    @Override // Yue.InterfaceC6998, Yue.InterfaceC6988
    /* JADX INFO: renamed from: ۥ */
    public Yue.C6989 mo8468(Yue.AbstractC6982 r2, Yue.AbstractC1986 r3) {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = new Yue.ۥۢۥۡۥ
            r0.<init>(r2, r3)
            return r0
    }

    @Override // Yue.InterfaceC6988
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.InterfaceC6981 mo8469(Yue.AbstractC6982 r1, java.util.List r2) {
            r0 = this;
            Yue.ۥۢۥۡۥ r1 = r0.mo8469(r1, r2)
            return r1
    }

    @Override // Yue.InterfaceC6998, Yue.InterfaceC6988
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.C6989 mo8469(Yue.AbstractC6982 r2, java.util.List<Yue.AbstractC1986> r3) {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = new Yue.ۥۢۥۡۥ
            r0.<init>(r2, r3)
            return r0
    }

    @Override // Yue.InterfaceC6998
    /* JADX INFO: renamed from: ۥ۟۟ */
    public java.nio.channels.ByteChannel mo8111(java.nio.channels.SocketChannel r4, java.nio.channels.SelectionKey r5) throws java.io.IOException {
            r3 = this;
            javax.net.ssl.SSLContext r0 = r3.f5498
            javax.net.ssl.SSLEngine r0 = r0.createSSLEngine()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.String[] r2 = r0.getEnabledCipherSuites()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            java.lang.String r2 = "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"
            r1.remove(r2)
            int r2 = r1.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.setEnabledCipherSuites(r1)
            r1 = 0
            r0.setUseClientMode(r1)
            Yue.ۥۡۧۢ r1 = new Yue.ۥۡۧۢ
            java.util.concurrent.ExecutorService r2 = r3.f5499
            r1.<init>(r4, r0, r2, r5)
            return r1
    }
}
