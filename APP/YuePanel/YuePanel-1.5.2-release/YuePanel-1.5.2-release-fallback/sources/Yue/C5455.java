package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5455 extends Yue.C1782 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final javax.net.ssl.SSLParameters f20234;

    public C5455(javax.net.ssl.SSLContext r1, java.util.concurrent.ExecutorService r2, javax.net.ssl.SSLParameters r3) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r3 == 0) goto L8
            r0.f20234 = r3
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    public C5455(javax.net.ssl.SSLContext r2, javax.net.ssl.SSLParameters r3) {
            r1 = this;
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            r1.<init>(r2, r0, r3)
            return
    }

    @Override // Yue.C1782, Yue.InterfaceC6998
    /* JADX INFO: renamed from: ۥ۟۟ */
    public java.nio.channels.ByteChannel mo8111(java.nio.channels.SocketChannel r4, java.nio.channels.SelectionKey r5) throws java.io.IOException {
            r3 = this;
            javax.net.ssl.SSLContext r0 = r3.f5498
            javax.net.ssl.SSLEngine r0 = r0.createSSLEngine()
            r1 = 0
            r0.setUseClientMode(r1)
            javax.net.ssl.SSLParameters r1 = r3.f20234
            r0.setSSLParameters(r1)
            Yue.ۥۡۧۢ r1 = new Yue.ۥۡۧۢ
            java.util.concurrent.ExecutorService r2 = r3.f5499
            r1.<init>(r4, r0, r2, r5)
            return r1
    }
}
