package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5458 implements java.nio.channels.ByteChannel, Yue.InterfaceC7132, Yue.InterfaceC3204 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static java.nio.ByteBuffer f20245;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final /* synthetic */ boolean f20246 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.InterfaceC3804 f20247;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.util.concurrent.ExecutorService f20248;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.util.List<java.util.concurrent.Future<?>> f20249;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.nio.ByteBuffer f20250;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public java.nio.ByteBuffer f20251;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.nio.ByteBuffer f20252;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.nio.channels.SocketChannel f20253;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public java.nio.channels.SelectionKey f20254;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public javax.net.ssl.SSLEngine f20255;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public javax.net.ssl.SSLEngineResult f20256;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public javax.net.ssl.SSLEngineResult f20257;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f20258;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public byte[] f20259;

    static {
            r0 = 0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            Yue.C5458.f20245 = r0
            return
    }

    public C5458(java.nio.channels.SocketChannel r3, javax.net.ssl.SSLEngine r4, java.util.concurrent.ExecutorService r5, java.nio.channels.SelectionKey r6) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            java.lang.Class<Yue.ۥۡۧۢ> r0 = Yue.C5458.class
            Yue.ۥ۠ۨۡۥ r0 = Yue.C3805.m15249(r0)
            r2.f20247 = r0
            r0 = 0
            r2.f20258 = r0
            r1 = 0
            r2.f20259 = r1
            if (r3 == 0) goto L57
            if (r4 == 0) goto L57
            if (r5 == 0) goto L57
            r2.f20253 = r3
            r2.f20255 = r4
            r2.f20248 = r5
            javax.net.ssl.SSLEngineResult r3 = new javax.net.ssl.SSLEngineResult
            javax.net.ssl.SSLEngineResult$Status r5 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = r4.getHandshakeStatus()
            r3.<init>(r5, r1, r0, r0)
            r2.f20257 = r3
            r2.f20256 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 3
            r3.<init>(r5)
            r2.f20249 = r3
            if (r6 == 0) goto L41
            int r3 = r6.interestOps()
            r3 = r3 | 4
            r6.interestOps(r3)
            r2.f20254 = r6
        L41:
            javax.net.ssl.SSLSession r3 = r4.getSession()
            r2.m20597(r3)
            java.nio.channels.SocketChannel r3 = r2.f20253
            java.nio.ByteBuffer r4 = Yue.C5458.f20245
            java.nio.ByteBuffer r4 = r2.m20609(r4)
            r3.write(r4)
            r2.m20602()
            return
        L57:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "parameter must not be null"
            r3.<init>(r4)
            throw r3
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            javax.net.ssl.SSLEngine r0 = r2.f20255
            r0.closeOutbound()
            javax.net.ssl.SSLEngine r0 = r2.f20255
            javax.net.ssl.SSLSession r0 = r0.getSession()
            r0.invalidate()
            java.nio.channels.SocketChannel r0 = r2.f20253     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L24
            java.nio.channels.SocketChannel r0 = r2.f20253     // Catch: java.lang.Throwable -> L22
            java.nio.ByteBuffer r1 = Yue.C5458.f20245     // Catch: java.lang.Throwable -> L22
            java.nio.ByteBuffer r1 = r2.m20609(r1)     // Catch: java.lang.Throwable -> L22
            r0.write(r1)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r0 = move-exception
            goto L2a
        L24:
            java.nio.channels.SocketChannel r0 = r2.f20253
            r0.close()
            return
        L2a:
            java.nio.channels.SocketChannel r1 = r2.f20253
            r1.close()
            throw r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.f20253
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r3) throws java.io.IOException {
            r2 = this;
            r2.m20607()
        L3:
            boolean r0 = r3.hasRemaining()
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            boolean r0 = r2.m20600()
            if (r0 != 0) goto L2b
            boolean r0 = r2.mo564()
            if (r0 == 0) goto L21
        L17:
            boolean r0 = r2.m20600()
            if (r0 != 0) goto L2b
            r2.m20602()
            goto L17
        L21:
            r2.m20602()
            boolean r0 = r2.m20600()
            if (r0 != 0) goto L2b
            return r1
        L2b:
            int r0 = r2.m20603(r3)
            if (r0 == 0) goto L32
            return r0
        L32:
            java.nio.ByteBuffer r0 = r2.f20250
            r0.clear()
            java.nio.ByteBuffer r0 = r2.f20252
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L45
            java.nio.ByteBuffer r0 = r2.f20252
            r0.clear()
            goto L4a
        L45:
            java.nio.ByteBuffer r0 = r2.f20252
            r0.compact()
        L4a:
            boolean r0 = r2.mo564()
            if (r0 != 0) goto L5a
            javax.net.ssl.SSLEngineResult r0 = r2.f20256
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()
            javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW
            if (r0 != r1) goto L66
        L5a:
            java.nio.channels.SocketChannel r0 = r2.f20253
            java.nio.ByteBuffer r1 = r2.f20252
            int r0 = r0.read(r1)
            r1 = -1
            if (r0 != r1) goto L66
            return r1
        L66:
            java.nio.ByteBuffer r0 = r2.f20252
            r0.flip()
            r2.m20608()
            java.nio.ByteBuffer r0 = r2.f20250
            int r0 = r2.m20606(r0, r3)
            if (r0 != 0) goto L7d
            boolean r1 = r2.mo564()
            if (r1 == 0) goto L7d
            goto L3
        L7d:
            return r0
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.m20600()
            if (r0 != 0) goto Lb
            r2.m20602()
            r3 = 0
            return r3
        Lb:
            java.nio.channels.SocketChannel r0 = r2.f20253
            java.nio.ByteBuffer r3 = r2.m20609(r3)
            int r3 = r0.write(r3)
            javax.net.ssl.SSLEngineResult r0 = r2.f20257
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()
            javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.CLOSED
            if (r0 == r1) goto L20
            return r3
        L20:
            java.io.EOFException r3 = new java.io.EOFException
            java.lang.String r0 = "Connection is closed"
            r3.<init>(r0)
            throw r3
    }

    @Override // Yue.InterfaceC3204
    /* JADX INFO: renamed from: ۥ۟ */
    public javax.net.ssl.SSLEngine mo13618() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.f20255
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.nio.channels.SelectableChannel m20593(boolean r2) throws java.io.IOException {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.f20253
            java.nio.channels.SelectableChannel r2 = r0.configureBlocking(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m20594(java.net.SocketAddress r2) throws java.io.IOException {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.f20253
            boolean r2 = r0.connect(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m20595() {
            r3 = this;
        L0:
            javax.net.ssl.SSLEngine r0 = r3.f20255
            java.lang.Runnable r0 = r0.getDelegatedTask()
            if (r0 == 0) goto L14
            java.util.List<java.util.concurrent.Future<?>> r1 = r3.f20249
            java.util.concurrent.ExecutorService r2 = r3.f20248
            java.util.concurrent.Future r0 = r2.submit(r0)
            r1.add(r0)
            goto L0
        L14:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m20596(java.util.concurrent.Future<?> r2) {
            r1 = this;
        L0:
            r2.get()     // Catch: java.util.concurrent.ExecutionException -> L4 java.lang.InterruptedException -> L6
            return
        L4:
            r2 = move-exception
            goto Le
        L6:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.util.concurrent.ExecutionException -> L4
            r0.interrupt()     // Catch: java.util.concurrent.ExecutionException -> L4
            goto L0
        Le:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m20597(javax.net.ssl.SSLSession r5) {
            r4 = this;
            r4.m20604()
            int r0 = r5.getPacketBufferSize()
            int r5 = r5.getApplicationBufferSize()
            int r5 = java.lang.Math.max(r5, r0)
            java.nio.ByteBuffer r1 = r4.f20250
            if (r1 != 0) goto L26
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r5)
            r4.f20250 = r5
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r0)
            r4.f20251 = r5
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r0)
            r4.f20252 = r5
            goto L4e
        L26:
            int r1 = r1.capacity()
            if (r1 == r5) goto L32
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r5)
            r4.f20250 = r5
        L32:
            java.nio.ByteBuffer r5 = r4.f20251
            int r5 = r5.capacity()
            if (r5 == r0) goto L40
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r0)
            r4.f20251 = r5
        L40:
            java.nio.ByteBuffer r5 = r4.f20252
            int r5 = r5.capacity()
            if (r5 == r0) goto L4e
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r0)
            r4.f20252 = r5
        L4e:
            java.nio.ByteBuffer r5 = r4.f20250
            int r5 = r5.remaining()
            if (r5 == 0) goto L7a
            Yue.ۥ۠ۨۡۥ r5 = r4.f20247
            boolean r5 = r5.mo10329()
            if (r5 == 0) goto L7a
            Yue.ۥ۠ۨۡۥ r5 = r4.f20247
            java.lang.String r0 = new java.lang.String
            java.nio.ByteBuffer r1 = r4.f20250
            byte[] r1 = r1.array()
            java.nio.ByteBuffer r2 = r4.f20250
            int r2 = r2.position()
            java.nio.ByteBuffer r3 = r4.f20250
            int r3 = r3.remaining()
            r0.<init>(r1, r2, r3)
            r5.mo10348(r0)
        L7a:
            java.nio.ByteBuffer r5 = r4.f20250
            r5.rewind()
            java.nio.ByteBuffer r5 = r4.f20250
            r5.flip()
            java.nio.ByteBuffer r5 = r4.f20252
            int r5 = r5.remaining()
            if (r5 == 0) goto Lb0
            Yue.ۥ۠ۨۡۥ r5 = r4.f20247
            boolean r5 = r5.mo10329()
            if (r5 == 0) goto Lb0
            Yue.ۥ۠ۨۡۥ r5 = r4.f20247
            java.lang.String r0 = new java.lang.String
            java.nio.ByteBuffer r1 = r4.f20252
            byte[] r1 = r1.array()
            java.nio.ByteBuffer r2 = r4.f20252
            int r2 = r2.position()
            java.nio.ByteBuffer r3 = r4.f20252
            int r3 = r3.remaining()
            r0.<init>(r1, r2, r3)
            r5.mo10348(r0)
        Lb0:
            java.nio.ByteBuffer r5 = r4.f20252
            r5.rewind()
            java.nio.ByteBuffer r5 = r4.f20252
            r5.flip()
            java.nio.ByteBuffer r5 = r4.f20251
            r5.rewind()
            java.nio.ByteBuffer r5 = r4.f20251
            r5.flip()
            int r5 = r4.f20258
            int r5 = r5 + 1
            r4.f20258 = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m20598() throws java.io.IOException {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.f20253
            boolean r0 = r0.finishConnect()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m20599() {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.f20253
            boolean r0 = r0.isConnected()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final boolean m20600() {
            r2 = this;
            javax.net.ssl.SSLEngine r0 = r2.f20255
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED
            if (r0 == r1) goto L11
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public boolean mo564() {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.f20253
            boolean r0 = r0.isBlocking()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean m20601() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.f20255
            boolean r0 = r0.isInboundDone()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final synchronized void m20602() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            javax.net.ssl.SSLEngine r0 = r3.f20255     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.Throwable -> L31
            if (r0 != r1) goto Ld
            monitor-exit(r3)
            return
        Ld:
            java.util.List<java.util.concurrent.Future<?>> r0 = r3.f20249     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L3f
            java.util.List<java.util.concurrent.Future<?>> r0 = r3.f20249     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L31
        L1b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1     // Catch: java.lang.Throwable -> L31
            boolean r2 = r1.isDone()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L34
            r0.remove()     // Catch: java.lang.Throwable -> L31
            goto L1b
        L31:
            r0 = move-exception
            goto Lcd
        L34:
            boolean r0 = r3.mo564()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L3d
            r3.m20596(r1)     // Catch: java.lang.Throwable -> L31
        L3d:
            monitor-exit(r3)
            return
        L3f:
            javax.net.ssl.SSLEngine r0 = r3.f20255     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch: java.lang.Throwable -> L31
            if (r0 != r1) goto L93
            boolean r0 = r3.mo564()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L59
            javax.net.ssl.SSLEngineResult r0 = r3.f20256     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch: java.lang.Throwable -> L31
            if (r0 != r1) goto L6e
        L59:
            java.nio.ByteBuffer r0 = r3.f20252     // Catch: java.lang.Throwable -> L31
            r0.compact()     // Catch: java.lang.Throwable -> L31
            java.nio.channels.SocketChannel r0 = r3.f20253     // Catch: java.lang.Throwable -> L31
            java.nio.ByteBuffer r1 = r3.f20252     // Catch: java.lang.Throwable -> L31
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L31
            r1 = -1
            if (r0 == r1) goto L8b
            java.nio.ByteBuffer r0 = r3.f20252     // Catch: java.lang.Throwable -> L31
            r0.flip()     // Catch: java.lang.Throwable -> L31
        L6e:
            java.nio.ByteBuffer r0 = r3.f20250     // Catch: java.lang.Throwable -> L31
            r0.compact()     // Catch: java.lang.Throwable -> L31
            r3.m20608()     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult r0 = r3.f20256     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch: java.lang.Throwable -> L31
            if (r0 != r1) goto L93
            javax.net.ssl.SSLEngine r0 = r3.f20255     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLSession r0 = r0.getSession()     // Catch: java.lang.Throwable -> L31
            r3.m20597(r0)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)
            return
        L8b:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "connection closed unexpectedly by peer"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        L93:
            r3.m20595()     // Catch: java.lang.Throwable -> L31
            java.util.List<java.util.concurrent.Future<?>> r0 = r3.f20249     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto La8
            javax.net.ssl.SSLEngine r0 = r3.f20255     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch: java.lang.Throwable -> L31
            if (r0 != r1) goto Lc8
        La8:
            java.nio.channels.SocketChannel r0 = r3.f20253     // Catch: java.lang.Throwable -> L31
            java.nio.ByteBuffer r1 = Yue.C5458.f20245     // Catch: java.lang.Throwable -> L31
            java.nio.ByteBuffer r1 = r3.m20609(r1)     // Catch: java.lang.Throwable -> L31
            r0.write(r1)     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult r0 = r3.f20257     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch: java.lang.Throwable -> L31
            if (r0 != r1) goto Lc8
            javax.net.ssl.SSLEngine r0 = r3.f20255     // Catch: java.lang.Throwable -> L31
            javax.net.ssl.SSLSession r0 = r0.getSession()     // Catch: java.lang.Throwable -> L31
            r3.m20597(r0)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)
            return
        Lc8:
            r0 = 1
            r3.f20258 = r0     // Catch: java.lang.Throwable -> L31
            monitor-exit(r3)
            return
        Lcd:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L31
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final int m20603(java.nio.ByteBuffer r3) throws javax.net.ssl.SSLException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f20250
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto Lf
            java.nio.ByteBuffer r0 = r2.f20250
            int r3 = r2.m20606(r0, r3)
            return r3
        Lf:
            java.nio.ByteBuffer r0 = r2.f20250
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L1c
            java.nio.ByteBuffer r0 = r2.f20250
            r0.clear()
        L1c:
            r2.m20607()
            java.nio.ByteBuffer r0 = r2.f20252
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L3f
            r2.m20608()
            java.nio.ByteBuffer r0 = r2.f20250
            int r3 = r2.m20606(r0, r3)
            javax.net.ssl.SSLEngineResult r0 = r2.f20256
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()
            javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.CLOSED
            if (r0 != r1) goto L3c
            r3 = -1
            return r3
        L3c:
            if (r3 <= 0) goto L3f
            return r3
        L3f:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m20604() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f20252
            if (r0 == 0) goto L19
            int r0 = r0.remaining()
            if (r0 <= 0) goto L19
            java.nio.ByteBuffer r0 = r2.f20252
            int r0 = r0.remaining()
            byte[] r0 = new byte[r0]
            r2.f20259 = r0
            java.nio.ByteBuffer r1 = r2.f20252
            r1.get(r0)
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public java.net.Socket m20605() {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.f20253
            java.net.Socket r0 = r0.socket()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final int m20606(java.nio.ByteBuffer r4, java.nio.ByteBuffer r5) {
            r3 = this;
            int r0 = r4.remaining()
            int r1 = r5.remaining()
            if (r0 <= r1) goto L1c
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1b
            byte r2 = r4.get()
            r5.put(r2)
            int r1 = r1 + 1
            goto Lf
        L1b:
            return r0
        L1c:
            r5.put(r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m20607() {
            r2 = this;
            byte[] r0 = r2.f20259
            if (r0 == 0) goto L18
            java.nio.ByteBuffer r0 = r2.f20252
            r0.clear()
            java.nio.ByteBuffer r0 = r2.f20252
            byte[] r1 = r2.f20259
            r0.put(r1)
            java.nio.ByteBuffer r0 = r2.f20252
            r0.flip()
            r0 = 0
            r2.f20259 = r0
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final synchronized java.nio.ByteBuffer m20608() throws javax.net.ssl.SSLException {
            r4 = this;
            monitor-enter(r4)
            javax.net.ssl.SSLEngineResult r0 = r4.f20256     // Catch: java.lang.Throwable -> L19
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()     // Catch: java.lang.Throwable -> L19
            javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.Throwable -> L19
            if (r0 != r1) goto L1b
            javax.net.ssl.SSLEngine r0 = r4.f20255     // Catch: java.lang.Throwable -> L19
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch: java.lang.Throwable -> L19
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.Throwable -> L19
            if (r0 != r1) goto L1b
            r4.close()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            goto L1b
        L19:
            r0 = move-exception
            goto L50
        L1b:
            java.nio.ByteBuffer r0 = r4.f20250     // Catch: java.lang.Throwable -> L19
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L19
            javax.net.ssl.SSLEngine r1 = r4.f20255     // Catch: java.lang.Throwable -> L19
            java.nio.ByteBuffer r2 = r4.f20252     // Catch: java.lang.Throwable -> L19
            java.nio.ByteBuffer r3 = r4.f20250     // Catch: java.lang.Throwable -> L19
            javax.net.ssl.SSLEngineResult r1 = r1.unwrap(r2, r3)     // Catch: java.lang.Throwable -> L19
            r4.f20256 = r1     // Catch: java.lang.Throwable -> L19
            javax.net.ssl.SSLEngineResult$Status r1 = r1.getStatus()     // Catch: java.lang.Throwable -> L19
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch: java.lang.Throwable -> L19
            if (r1 != r2) goto L47
            java.nio.ByteBuffer r1 = r4.f20250     // Catch: java.lang.Throwable -> L19
            int r1 = r1.remaining()     // Catch: java.lang.Throwable -> L19
            if (r0 != r1) goto L1b
            javax.net.ssl.SSLEngine r0 = r4.f20255     // Catch: java.lang.Throwable -> L19
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch: java.lang.Throwable -> L19
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch: java.lang.Throwable -> L19
            if (r0 == r1) goto L1b
        L47:
            java.nio.ByteBuffer r0 = r4.f20250     // Catch: java.lang.Throwable -> L19
            r0.flip()     // Catch: java.lang.Throwable -> L19
            java.nio.ByteBuffer r0 = r4.f20250     // Catch: java.lang.Throwable -> L19
            monitor-exit(r4)
            return r0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final synchronized java.nio.ByteBuffer m20609(java.nio.ByteBuffer r3) throws javax.net.ssl.SSLException {
            r2 = this;
            monitor-enter(r2)
            java.nio.ByteBuffer r0 = r2.f20251     // Catch: java.lang.Throwable -> L19
            r0.compact()     // Catch: java.lang.Throwable -> L19
            javax.net.ssl.SSLEngine r0 = r2.f20255     // Catch: java.lang.Throwable -> L19
            java.nio.ByteBuffer r1 = r2.f20251     // Catch: java.lang.Throwable -> L19
            javax.net.ssl.SSLEngineResult r3 = r0.wrap(r3, r1)     // Catch: java.lang.Throwable -> L19
            r2.f20257 = r3     // Catch: java.lang.Throwable -> L19
            java.nio.ByteBuffer r3 = r2.f20251     // Catch: java.lang.Throwable -> L19
            r3.flip()     // Catch: java.lang.Throwable -> L19
            java.nio.ByteBuffer r3 = r2.f20251     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return r3
        L19:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public void mo565() throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f20251
            r1.write(r0)
            return
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ */
    public int mo566(java.nio.ByteBuffer r1) throws javax.net.ssl.SSLException {
            r0 = this;
            int r1 = r0.m20603(r1)
            return r1
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟ */
    public boolean mo567() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f20251
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L11
            boolean r0 = r1.m20600()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ */
    public boolean mo568() {
            r2 = this;
            byte[] r0 = r2.f20259
            if (r0 != 0) goto L2b
            java.nio.ByteBuffer r0 = r2.f20250
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L2b
            java.nio.ByteBuffer r0 = r2.f20252
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L29
            javax.net.ssl.SSLEngineResult r0 = r2.f20256
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()
            javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW
            if (r0 == r1) goto L29
            javax.net.ssl.SSLEngineResult r0 = r2.f20256
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()
            javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.CLOSED
            if (r0 == r1) goto L29
            goto L2b
        L29:
            r0 = 0
            goto L2c
        L2b:
            r0 = 1
        L2c:
            return r0
    }
}
