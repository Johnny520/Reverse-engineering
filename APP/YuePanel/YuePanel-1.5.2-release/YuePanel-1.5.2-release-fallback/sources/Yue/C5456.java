package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5456 implements Yue.InterfaceC7132, java.nio.channels.ByteChannel, Yue.InterfaceC3204 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.InterfaceC3804 f20235;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.nio.channels.SocketChannel f20236;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final javax.net.ssl.SSLEngine f20237;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.nio.ByteBuffer f20238;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public java.nio.ByteBuffer f20239;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.nio.ByteBuffer f20240;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.nio.ByteBuffer f20241;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public java.util.concurrent.ExecutorService f20242;

    /* JADX INFO: renamed from: Yue.ۥۡۧۡۨ$ۥ, reason: contains not printable characters */
    public static /* synthetic */ class C5457 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f20243 = null;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final /* synthetic */ int[] f20244 = null;

        static {
                javax.net.ssl.SSLEngineResult$HandshakeStatus[] r0 = javax.net.ssl.SSLEngineResult.HandshakeStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yue.C5456.C5457.f20244 = r0
                r1 = 1
                javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = Yue.C5456.C5457.f20244     // Catch: java.lang.NoSuchFieldError -> L1d
                javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = Yue.C5456.C5457.f20244     // Catch: java.lang.NoSuchFieldError -> L28
                javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = Yue.C5456.C5457.f20244     // Catch: java.lang.NoSuchFieldError -> L33
                javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_TASK     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r4 = Yue.C5456.C5457.f20244     // Catch: java.lang.NoSuchFieldError -> L3e
                javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch: java.lang.NoSuchFieldError -> L3e
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r6 = 5
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                javax.net.ssl.SSLEngineResult$Status[] r4 = javax.net.ssl.SSLEngineResult.Status.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                Yue.C5456.C5457.f20243 = r4
                javax.net.ssl.SSLEngineResult$Status r5 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch: java.lang.NoSuchFieldError -> L4f
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4f
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L4f
            L4f:
                int[] r1 = Yue.C5456.C5457.f20243     // Catch: java.lang.NoSuchFieldError -> L59
                javax.net.ssl.SSLEngineResult$Status r4 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch: java.lang.NoSuchFieldError -> L59
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L59
            L59:
                int[] r0 = Yue.C5456.C5457.f20243     // Catch: java.lang.NoSuchFieldError -> L63
                javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW     // Catch: java.lang.NoSuchFieldError -> L63
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L63
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L63
            L63:
                int[] r0 = Yue.C5456.C5457.f20243     // Catch: java.lang.NoSuchFieldError -> L6d
                javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L6d
            L6d:
                return
        }
    }

    public C5456(java.nio.channels.SocketChannel r2, javax.net.ssl.SSLEngine r3, java.util.concurrent.ExecutorService r4, java.nio.channels.SelectionKey r5) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            java.lang.Class<Yue.ۥۡۧۡۨ> r0 = Yue.C5456.class
            Yue.ۥ۠ۨۡۥ r0 = Yue.C3805.m15249(r0)
            r1.f20235 = r0
            if (r2 == 0) goto L57
            if (r3 == 0) goto L57
            java.util.concurrent.ExecutorService r0 = r1.f20242
            if (r0 == r4) goto L57
            r1.f20236 = r2
            r1.f20237 = r3
            r1.f20242 = r4
            javax.net.ssl.SSLSession r4 = r3.getSession()
            int r4 = r4.getPacketBufferSize()
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r1.f20239 = r4
            javax.net.ssl.SSLSession r4 = r3.getSession()
            int r4 = r4.getPacketBufferSize()
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r1.f20241 = r4
            r3.beginHandshake()
            boolean r3 = r1.m20587()
            if (r3 == 0) goto L4a
            if (r5 == 0) goto L56
            int r2 = r5.interestOps()
            r2 = r2 | 4
            r5.interestOps(r2)
            goto L56
        L4a:
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L56
        L4e:
            r2 = move-exception
            Yue.ۥ۠ۨۡۥ r3 = r1.f20235
            java.lang.String r4 = "Exception during the closing of the channel"
            r3.error(r4, r2)
        L56:
            return
        L57:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "parameter must not be null"
            r2.<init>(r3)
            throw r2
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            r0.m20586()
            return
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.f20236
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // java.nio.channels.ReadableByteChannel
    public synchronized int read(java.nio.ByteBuffer r4) throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r4.hasRemaining()     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto La
            monitor-exit(r3)
            r4 = 0
            return r4
        La:
            java.nio.ByteBuffer r0 = r3.f20240     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r0.hasRemaining()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L22
            java.nio.ByteBuffer r0 = r3.f20240     // Catch: java.lang.Throwable -> L1f
            r0.flip()     // Catch: java.lang.Throwable -> L1f
            java.nio.ByteBuffer r0 = r3.f20240     // Catch: java.lang.Throwable -> L1f
            int r4 = Yue.C0873.m5006(r0, r4)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)
            return r4
        L1f:
            r4 = move-exception
            goto Ld1
        L22:
            java.nio.ByteBuffer r0 = r3.f20241     // Catch: java.lang.Throwable -> L1f
            r0.compact()     // Catch: java.lang.Throwable -> L1f
            java.nio.channels.SocketChannel r0 = r3.f20236     // Catch: java.lang.Throwable -> L1f
            java.nio.ByteBuffer r1 = r3.f20241     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L1f
            if (r0 > 0) goto L41
            java.nio.ByteBuffer r1 = r3.f20241     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.hasRemaining()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L3a
            goto L41
        L3a:
            if (r0 >= 0) goto Lca
            r3.m20592()     // Catch: java.lang.Throwable -> L1f
            goto Lca
        L41:
            java.nio.ByteBuffer r1 = r3.f20241     // Catch: java.lang.Throwable -> L1f
            r1.flip()     // Catch: java.lang.Throwable -> L1f
            java.nio.ByteBuffer r1 = r3.f20241     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.hasRemaining()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto Lca
            java.nio.ByteBuffer r0 = r3.f20240     // Catch: java.lang.Throwable -> L1f
            r0.compact()     // Catch: java.lang.Throwable -> L1f
            javax.net.ssl.SSLEngine r0 = r3.f20237     // Catch: java.lang.Throwable -> L1f javax.net.ssl.SSLException -> Lc1
            java.nio.ByteBuffer r1 = r3.f20241     // Catch: java.lang.Throwable -> L1f javax.net.ssl.SSLException -> Lc1
            java.nio.ByteBuffer r2 = r3.f20240     // Catch: java.lang.Throwable -> L1f javax.net.ssl.SSLException -> Lc1
            javax.net.ssl.SSLEngineResult r0 = r0.unwrap(r1, r2)     // Catch: java.lang.Throwable -> L1f javax.net.ssl.SSLException -> Lc1
            int[] r1 = Yue.C5456.C5457.f20243     // Catch: java.lang.Throwable -> L1f
            javax.net.ssl.SSLEngineResult$Status r2 = r0.getStatus()     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L1f
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            if (r1 == r2) goto Lb4
            r2 = 2
            if (r1 == r2) goto La7
            r2 = 3
            if (r1 == r2) goto L99
            r2 = 4
            if (r1 != r2) goto L7e
            r3.m20586()     // Catch: java.lang.Throwable -> L1f
            r4.clear()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)
            r4 = -1
            return r4
        L7e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r1.<init>()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "Invalid SSL status: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1f
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()     // Catch: java.lang.Throwable -> L1f
            r1.append(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L1f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            throw r4     // Catch: java.lang.Throwable -> L1f
        L99:
            java.nio.ByteBuffer r0 = r3.f20240     // Catch: java.lang.Throwable -> L1f
            java.nio.ByteBuffer r0 = r3.m20588(r0)     // Catch: java.lang.Throwable -> L1f
            r3.f20240 = r0     // Catch: java.lang.Throwable -> L1f
            int r4 = r3.read(r4)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)
            return r4
        La7:
            java.nio.ByteBuffer r0 = r3.f20240     // Catch: java.lang.Throwable -> L1f
            r0.flip()     // Catch: java.lang.Throwable -> L1f
            java.nio.ByteBuffer r0 = r3.f20240     // Catch: java.lang.Throwable -> L1f
            int r4 = Yue.C0873.m5006(r0, r4)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)
            return r4
        Lb4:
            java.nio.ByteBuffer r0 = r3.f20240     // Catch: java.lang.Throwable -> L1f
            r0.flip()     // Catch: java.lang.Throwable -> L1f
            java.nio.ByteBuffer r0 = r3.f20240     // Catch: java.lang.Throwable -> L1f
            int r4 = Yue.C0873.m5006(r0, r4)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)
            return r4
        Lc1:
            r4 = move-exception
            Yue.ۥ۠ۨۡۥ r0 = r3.f20235     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "SSLException during unwrap"
            r0.error(r1, r4)     // Catch: java.lang.Throwable -> L1f
            throw r4     // Catch: java.lang.Throwable -> L1f
        Lca:
            java.nio.ByteBuffer r1 = r3.f20240     // Catch: java.lang.Throwable -> L1f
            Yue.C0873.m5006(r1, r4)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)
            return r0
        Ld1:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            throw r4
    }

    @Override // java.nio.channels.WritableByteChannel
    public synchronized int write(java.nio.ByteBuffer r6) throws java.io.IOException {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = r0
        L3:
            boolean r2 = r6.hasRemaining()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L78
            java.nio.ByteBuffer r2 = r5.f20239     // Catch: java.lang.Throwable -> L33
            r2.clear()     // Catch: java.lang.Throwable -> L33
            javax.net.ssl.SSLEngine r2 = r5.f20237     // Catch: java.lang.Throwable -> L33
            java.nio.ByteBuffer r3 = r5.f20239     // Catch: java.lang.Throwable -> L33
            javax.net.ssl.SSLEngineResult r2 = r2.wrap(r6, r3)     // Catch: java.lang.Throwable -> L33
            int[] r3 = Yue.C5456.C5457.f20243     // Catch: java.lang.Throwable -> L33
            javax.net.ssl.SSLEngineResult$Status r4 = r2.getStatus()     // Catch: java.lang.Throwable -> L33
            int r4 = r4.ordinal()     // Catch: java.lang.Throwable -> L33
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L33
            r4 = 1
            if (r3 == r4) goto L61
            r4 = 2
            if (r3 == r4) goto L59
            r4 = 3
            if (r3 == r4) goto L50
            r6 = 4
            if (r3 != r6) goto L35
            r5.m20586()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r5)
            return r0
        L33:
            r6 = move-exception
            goto L7a
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r0.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "Invalid SSL status: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L33
            javax.net.ssl.SSLEngineResult$Status r1 = r2.getStatus()     // Catch: java.lang.Throwable -> L33
            r0.append(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L33
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L33
            throw r6     // Catch: java.lang.Throwable -> L33
        L50:
            java.nio.ByteBuffer r2 = r5.f20239     // Catch: java.lang.Throwable -> L33
            java.nio.ByteBuffer r2 = r5.m20590(r2)     // Catch: java.lang.Throwable -> L33
            r5.f20239 = r2     // Catch: java.lang.Throwable -> L33
            goto L3
        L59:
            javax.net.ssl.SSLException r6 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "Buffer underflow occurred after a wrap. I don't think we should ever get here."
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L33
            throw r6     // Catch: java.lang.Throwable -> L33
        L61:
            java.nio.ByteBuffer r2 = r5.f20239     // Catch: java.lang.Throwable -> L33
            r2.flip()     // Catch: java.lang.Throwable -> L33
        L66:
            java.nio.ByteBuffer r2 = r5.f20239     // Catch: java.lang.Throwable -> L33
            boolean r2 = r2.hasRemaining()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L3
            java.nio.channels.SocketChannel r2 = r5.f20236     // Catch: java.lang.Throwable -> L33
            java.nio.ByteBuffer r3 = r5.f20239     // Catch: java.lang.Throwable -> L33
            int r2 = r2.write(r3)     // Catch: java.lang.Throwable -> L33
            int r1 = r1 + r2
            goto L66
        L78:
            monitor-exit(r5)
            return r1
        L7a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            throw r6
    }

    @Override // Yue.InterfaceC3204
    /* JADX INFO: renamed from: ۥ۟ */
    public javax.net.ssl.SSLEngine mo13618() {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.f20237
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m20586() throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.f20237
            r0.closeOutbound()
            r1.m20587()     // Catch: java.io.IOException -> L8
        L8:
            java.nio.channels.SocketChannel r0 = r1.f20236
            r0.close()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m20587() throws java.io.IOException {
            r11 = this;
            javax.net.ssl.SSLEngine r0 = r11.f20237
            javax.net.ssl.SSLSession r0 = r0.getSession()
            int r0 = r0.getApplicationBufferSize()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            r11.f20238 = r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r11.f20240 = r0
            java.nio.ByteBuffer r0 = r11.f20239
            r0.clear()
            java.nio.ByteBuffer r0 = r11.f20241
            r0.clear()
            javax.net.ssl.SSLEngine r0 = r11.f20237
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()
            r1 = 0
            r2 = r1
        L28:
            r3 = 1
            if (r2 != 0) goto L1c3
            int[] r4 = Yue.C5456.C5457.f20244
            int r5 = r0.ordinal()
            r4 = r4[r5]
            if (r4 == r3) goto L1b0
            java.lang.String r5 = "Invalid SSL status: "
            r6 = 4
            r7 = 3
            r8 = 2
            if (r4 == r8) goto L107
            if (r4 == r7) goto L6e
            if (r4 == r6) goto L59
            r3 = 5
            if (r4 != r3) goto L44
            goto L28
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L59:
            javax.net.ssl.SSLEngine r0 = r11.f20237
            java.lang.Runnable r0 = r0.getDelegatedTask()
            if (r0 == 0) goto L67
            java.util.concurrent.ExecutorService r3 = r11.f20242
            r3.execute(r0)
            goto L59
        L67:
            javax.net.ssl.SSLEngine r0 = r11.f20237
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()
            goto L28
        L6e:
            java.nio.ByteBuffer r0 = r11.f20239
            r0.clear()
            javax.net.ssl.SSLEngine r0 = r11.f20237     // Catch: javax.net.ssl.SSLException -> Lfa
            java.nio.ByteBuffer r4 = r11.f20238     // Catch: javax.net.ssl.SSLException -> Lfa
            java.nio.ByteBuffer r9 = r11.f20239     // Catch: javax.net.ssl.SSLException -> Lfa
            javax.net.ssl.SSLEngineResult r0 = r0.wrap(r4, r9)     // Catch: javax.net.ssl.SSLException -> Lfa
            javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = r0.getHandshakeStatus()     // Catch: javax.net.ssl.SSLException -> Lfa
            int[] r9 = Yue.C5456.C5457.f20243
            javax.net.ssl.SSLEngineResult$Status r10 = r0.getStatus()
            int r10 = r10.ordinal()
            r9 = r9[r10]
            if (r9 == r3) goto Le2
            if (r9 == r8) goto Lda
            if (r9 == r7) goto Ld1
            if (r9 != r6) goto Lb8
            java.nio.ByteBuffer r0 = r11.f20239     // Catch: java.lang.Exception -> Lb0
            r0.flip()     // Catch: java.lang.Exception -> Lb0
        L9a:
            java.nio.ByteBuffer r0 = r11.f20239     // Catch: java.lang.Exception -> Lb0
            boolean r0 = r0.hasRemaining()     // Catch: java.lang.Exception -> Lb0
            if (r0 == 0) goto Laa
            java.nio.channels.SocketChannel r0 = r11.f20236     // Catch: java.lang.Exception -> Lb0
            java.nio.ByteBuffer r3 = r11.f20239     // Catch: java.lang.Exception -> Lb0
            r0.write(r3)     // Catch: java.lang.Exception -> Lb0
            goto L9a
        Laa:
            java.nio.ByteBuffer r0 = r11.f20241     // Catch: java.lang.Exception -> Lb0
            r0.clear()     // Catch: java.lang.Exception -> Lb0
            goto Lf7
        Lb0:
            javax.net.ssl.SSLEngine r0 = r11.f20237
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()
            goto L28
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        Ld1:
            java.nio.ByteBuffer r0 = r11.f20239
            java.nio.ByteBuffer r0 = r11.m20590(r0)
            r11.f20239 = r0
            goto Lf7
        Lda:
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            java.lang.String r1 = "Buffer underflow occurred after a wrap. I don't think we should ever get here."
            r0.<init>(r1)
            throw r0
        Le2:
            java.nio.ByteBuffer r0 = r11.f20239
            r0.flip()
        Le7:
            java.nio.ByteBuffer r0 = r11.f20239
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto Lf7
            java.nio.channels.SocketChannel r0 = r11.f20236
            java.nio.ByteBuffer r3 = r11.f20239
            r0.write(r3)
            goto Le7
        Lf7:
            r0 = r4
            goto L28
        Lfa:
            javax.net.ssl.SSLEngine r0 = r11.f20237
            r0.closeOutbound()
            javax.net.ssl.SSLEngine r0 = r11.f20237
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()
            goto L28
        L107:
            java.nio.channels.SocketChannel r0 = r11.f20236
            java.nio.ByteBuffer r4 = r11.f20241
            int r0 = r0.read(r4)
            if (r0 >= 0) goto L134
            javax.net.ssl.SSLEngine r0 = r11.f20237
            boolean r0 = r0.isInboundDone()
            if (r0 == 0) goto L122
            javax.net.ssl.SSLEngine r0 = r11.f20237
            boolean r0 = r0.isOutboundDone()
            if (r0 == 0) goto L122
            return r1
        L122:
            javax.net.ssl.SSLEngine r0 = r11.f20237     // Catch: javax.net.ssl.SSLException -> L127
            r0.closeInbound()     // Catch: javax.net.ssl.SSLException -> L127
        L127:
            javax.net.ssl.SSLEngine r0 = r11.f20237
            r0.closeOutbound()
            javax.net.ssl.SSLEngine r0 = r11.f20237
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()
            goto L28
        L134:
            java.nio.ByteBuffer r0 = r11.f20241
            r0.flip()
            javax.net.ssl.SSLEngine r0 = r11.f20237     // Catch: javax.net.ssl.SSLException -> L1a3
            java.nio.ByteBuffer r4 = r11.f20241     // Catch: javax.net.ssl.SSLException -> L1a3
            java.nio.ByteBuffer r9 = r11.f20240     // Catch: javax.net.ssl.SSLException -> L1a3
            javax.net.ssl.SSLEngineResult r0 = r0.unwrap(r4, r9)     // Catch: javax.net.ssl.SSLException -> L1a3
            java.nio.ByteBuffer r4 = r11.f20241     // Catch: javax.net.ssl.SSLException -> L1a3
            r4.compact()     // Catch: javax.net.ssl.SSLException -> L1a3
            javax.net.ssl.SSLEngineResult$HandshakeStatus r4 = r0.getHandshakeStatus()     // Catch: javax.net.ssl.SSLException -> L1a3
            int[] r9 = Yue.C5456.C5457.f20243
            javax.net.ssl.SSLEngineResult$Status r10 = r0.getStatus()
            int r10 = r10.ordinal()
            r9 = r9[r10]
            if (r9 == r3) goto Lf7
            if (r9 == r8) goto L199
            if (r9 == r7) goto L18f
            if (r9 != r6) goto L176
            javax.net.ssl.SSLEngine r0 = r11.f20237
            boolean r0 = r0.isOutboundDone()
            if (r0 == 0) goto L169
            return r1
        L169:
            javax.net.ssl.SSLEngine r0 = r11.f20237
            r0.closeOutbound()
            javax.net.ssl.SSLEngine r0 = r11.f20237
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()
            goto L28
        L176:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L18f:
            java.nio.ByteBuffer r0 = r11.f20240
            java.nio.ByteBuffer r0 = r11.m20588(r0)
            r11.f20240 = r0
            goto Lf7
        L199:
            java.nio.ByteBuffer r0 = r11.f20241
            java.nio.ByteBuffer r0 = r11.m20591(r0)
            r11.f20241 = r0
            goto Lf7
        L1a3:
            javax.net.ssl.SSLEngine r0 = r11.f20237
            r0.closeOutbound()
            javax.net.ssl.SSLEngine r0 = r11.f20237
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()
            goto L28
        L1b0:
            java.nio.ByteBuffer r2 = r11.f20241
            boolean r2 = r2.hasRemaining()
            r2 = r2 ^ r3
            if (r2 == 0) goto L1ba
            return r3
        L1ba:
            java.nio.channels.SocketChannel r3 = r11.f20236
            java.nio.ByteBuffer r4 = r11.f20241
            r3.write(r4)
            goto L28
        L1c3:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.nio.ByteBuffer m20588(java.nio.ByteBuffer r2) {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.f20237
            javax.net.ssl.SSLSession r0 = r0.getSession()
            int r0 = r0.getApplicationBufferSize()
            java.nio.ByteBuffer r2 = r1.m20589(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.nio.ByteBuffer m20589(java.nio.ByteBuffer r2, int r3) {
            r1 = this;
            int r0 = r2.capacity()
            if (r3 <= r0) goto Lb
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r3)
            goto L15
        Lb:
            int r2 = r2.capacity()
            int r2 = r2 * 2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
        L15:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final java.nio.ByteBuffer m20590(java.nio.ByteBuffer r2) {
            r1 = this;
            javax.net.ssl.SSLEngine r0 = r1.f20237
            javax.net.ssl.SSLSession r0 = r0.getSession()
            int r0 = r0.getPacketBufferSize()
            java.nio.ByteBuffer r2 = r1.m20589(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final java.nio.ByteBuffer m20591(java.nio.ByteBuffer r3) {
            r2 = this;
            javax.net.ssl.SSLEngine r0 = r2.f20237
            javax.net.ssl.SSLSession r0 = r0.getSession()
            int r0 = r0.getPacketBufferSize()
            int r1 = r3.limit()
            if (r0 >= r1) goto L11
            return r3
        L11:
            java.nio.ByteBuffer r0 = r2.m20590(r3)
            r3.flip()
            r0.put(r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m20592() throws java.io.IOException {
            r2 = this;
            javax.net.ssl.SSLEngine r0 = r2.f20237     // Catch: java.lang.Exception -> L6
            r0.closeInbound()     // Catch: java.lang.Exception -> L6
            goto Ld
        L6:
            Yue.ۥ۠ۨۡۥ r0 = r2.f20235
            java.lang.String r1 = "This engine was forced to close inbound, without having received the proper SSL/TLS close notification message from the peer, due to end of stream."
            r0.error(r1)
        Ld:
            r2.m20586()
            return
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public boolean mo564() {
            r1 = this;
            java.nio.channels.SocketChannel r0 = r1.f20236
            boolean r0 = r0.isBlocking()
            return r0
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public void mo565() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ */
    public int mo566(java.nio.ByteBuffer r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.read(r1)
            return r1
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟ */
    public boolean mo567() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC7132
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ */
    public boolean mo568() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f20241
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L13
            java.nio.ByteBuffer r0 = r1.f20240
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }
}
