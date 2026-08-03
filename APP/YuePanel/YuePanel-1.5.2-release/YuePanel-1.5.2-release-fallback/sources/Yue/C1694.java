package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1694 extends Yue.C1782 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.String[] f5325;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.lang.String[] f5326;

    public C1694(javax.net.ssl.SSLContext r1, java.util.concurrent.ExecutorService r2, java.lang.String[] r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f5325 = r3
            r0.f5326 = r4
            return
    }

    public C1694(javax.net.ssl.SSLContext r2, java.lang.String[] r3, java.lang.String[] r4) {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            r1.<init>(r2, r0, r3, r4)
            return
    }

    @Override // Yue.C1782, Yue.InterfaceC6998
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.nio.channels.ByteChannel mo8111(java.nio.channels.SocketChannel r4, java.nio.channels.SelectionKey r5) throws java.io.IOException {
            r3 = this;
            javax.net.ssl.SSLContext r0 = r3.f5498
            javax.net.ssl.SSLEngine r0 = r0.createSSLEngine()
            java.lang.String[] r1 = r3.f5325
            if (r1 == 0) goto Ld
            r0.setEnabledProtocols(r1)
        Ld:
            java.lang.String[] r1 = r3.f5326
            if (r1 == 0) goto L14
            r0.setEnabledCipherSuites(r1)
        L14:
            r1 = 0
            r0.setUseClientMode(r1)
            Yue.ۥۡۧۢ r1 = new Yue.ۥۡۧۢ
            java.util.concurrent.ExecutorService r2 = r3.f5499
            r1.<init>(r4, r0, r2, r5)
            return r1
    }
}
