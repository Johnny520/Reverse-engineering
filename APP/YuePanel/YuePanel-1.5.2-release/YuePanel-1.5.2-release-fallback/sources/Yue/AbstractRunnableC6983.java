package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC6983 extends Yue.AbstractC0099 implements java.lang.Runnable, Yue.InterfaceC6981 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public java.net.URI f24348;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public Yue.C6989 f24349;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public java.net.Socket f24350;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public javax.net.SocketFactory f24351;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public java.io.OutputStream f24352;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public java.net.Proxy f24353;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public java.lang.Thread f24354;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public java.lang.Thread f24355;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public Yue.AbstractC1986 f24356;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public java.util.Map<java.lang.String, java.lang.String> f24357;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public java.util.concurrent.CountDownLatch f24358;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public java.util.concurrent.CountDownLatch f24359;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int f24360;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public Yue.InterfaceC1946 f24361;

    /* JADX INFO: renamed from: Yue.ۥۢۥۡۢ$ۥ, reason: contains not printable characters */
    public class C6984 implements Yue.InterfaceC1946 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractRunnableC6983 f24362;

        public C6984(Yue.AbstractRunnableC6983 r1) {
                r0 = this;
                r0.f24362 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC1946
        /* JADX INFO: renamed from: ۥ */
        public java.net.InetAddress mo8934(java.net.URI r1) throws java.net.UnknownHostException {
                r0 = this;
                java.lang.String r1 = r1.getHost()
                java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۡۢ$ۥ۟, reason: contains not printable characters */
    public class RunnableC6985 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Yue.AbstractRunnableC6983 f24363;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractRunnableC6983 f24364;

        public RunnableC6985(Yue.AbstractRunnableC6983 r1, Yue.AbstractRunnableC6983 r2) {
                r0 = this;
                r0.f24364 = r1
                r0.<init>()
                r0.f24363 = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "WebSocketWriteThread-"
                r1.append(r2)
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                long r2 = r2.getId()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.setName(r1)
                r0 = 0
                r4.m27006()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            L24:
                r4.m27005()
                Yue.ۥۢۥۡۢ r1 = r4.f24364
                Yue.AbstractRunnableC6983.m26965(r1, r0)
                goto L36
            L2d:
                r1 = move-exception
                goto L37
            L2f:
                r1 = move-exception
                Yue.ۥۢۥۡۢ r2 = r4.f24364     // Catch: java.lang.Throwable -> L2d
                Yue.AbstractRunnableC6983.m26964(r2, r1)     // Catch: java.lang.Throwable -> L2d
                goto L24
            L36:
                return
            L37:
                r4.m27005()
                Yue.ۥۢۥۡۢ r2 = r4.f24364
                Yue.AbstractRunnableC6983.m26965(r2, r0)
                throw r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m27005() {
                r3 = this;
                Yue.ۥۢۥۡۢ r0 = r3.f24364     // Catch: java.io.IOException -> L12
                java.net.Socket r0 = Yue.AbstractRunnableC6983.m26968(r0)     // Catch: java.io.IOException -> L12
                if (r0 == 0) goto L1a
                Yue.ۥۢۥۡۢ r0 = r3.f24364     // Catch: java.io.IOException -> L12
                java.net.Socket r0 = Yue.AbstractRunnableC6983.m26968(r0)     // Catch: java.io.IOException -> L12
                r0.close()     // Catch: java.io.IOException -> L12
                goto L1a
            L12:
                r0 = move-exception
                Yue.ۥۢۥۡۢ r1 = r3.f24364
                Yue.ۥۢۥۡۢ r2 = r3.f24363
                r1.mo26979(r2, r0)
            L1a:
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m27006() throws java.io.IOException {
                r5 = this;
            L0:
                r0 = 0
                boolean r1 = java.lang.Thread.interrupted()     // Catch: java.lang.InterruptedException -> L30
                if (r1 != 0) goto L6a
                Yue.ۥۢۥۡۢ r1 = r5.f24364     // Catch: java.lang.InterruptedException -> L30
                Yue.ۥۢۥۡۥ r1 = Yue.AbstractRunnableC6983.m26966(r1)     // Catch: java.lang.InterruptedException -> L30
                java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r1 = r1.f24378     // Catch: java.lang.InterruptedException -> L30
                java.lang.Object r1 = r1.take()     // Catch: java.lang.InterruptedException -> L30
                java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch: java.lang.InterruptedException -> L30
                Yue.ۥۢۥۡۢ r2 = r5.f24364     // Catch: java.lang.InterruptedException -> L30
                java.io.OutputStream r2 = Yue.AbstractRunnableC6983.m26967(r2)     // Catch: java.lang.InterruptedException -> L30
                byte[] r3 = r1.array()     // Catch: java.lang.InterruptedException -> L30
                int r1 = r1.limit()     // Catch: java.lang.InterruptedException -> L30
                r2.write(r3, r0, r1)     // Catch: java.lang.InterruptedException -> L30
                Yue.ۥۢۥۡۢ r1 = r5.f24364     // Catch: java.lang.InterruptedException -> L30
                java.io.OutputStream r1 = Yue.AbstractRunnableC6983.m26967(r1)     // Catch: java.lang.InterruptedException -> L30
                r1.flush()     // Catch: java.lang.InterruptedException -> L30
                goto L0
            L30:
                Yue.ۥۢۥۡۢ r1 = r5.f24364
                Yue.ۥۢۥۡۥ r1 = Yue.AbstractRunnableC6983.m26966(r1)
                java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r1 = r1.f24378
                java.util.Iterator r1 = r1.iterator()
            L3c:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L63
                java.lang.Object r2 = r1.next()
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                Yue.ۥۢۥۡۢ r3 = r5.f24364
                java.io.OutputStream r3 = Yue.AbstractRunnableC6983.m26967(r3)
                byte[] r4 = r2.array()
                int r2 = r2.limit()
                r3.write(r4, r0, r2)
                Yue.ۥۢۥۡۢ r2 = r5.f24364
                java.io.OutputStream r2 = Yue.AbstractRunnableC6983.m26967(r2)
                r2.flush()
                goto L3c
            L63:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L6a:
                return
        }
    }

    public AbstractRunnableC6983(java.net.URI r2) {
            r1 = this;
            Yue.ۥ۠۠۠۠ r0 = new Yue.ۥ۠۠۠۠
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public AbstractRunnableC6983(java.net.URI r3, Yue.AbstractC1986 r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public AbstractRunnableC6983(java.net.URI r2, Yue.AbstractC1986 r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public AbstractRunnableC6983(java.net.URI r4, Yue.AbstractC1986 r5, java.util.Map<java.lang.String, java.lang.String> r6, int r7) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f24348 = r0
            r3.f24349 = r0
            r3.f24350 = r0
            r3.f24351 = r0
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            r3.f24353 = r1
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r1.<init>(r2)
            r3.f24358 = r1
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch
            r1.<init>(r2)
            r3.f24359 = r1
            r1 = 0
            r3.f24360 = r1
            r3.f24361 = r0
            if (r4 == 0) goto L59
            if (r5 == 0) goto L51
            r3.f24348 = r4
            r3.f24356 = r5
            Yue.ۥۢۥۡۢ$ۥ r4 = new Yue.ۥۢۥۡۢ$ۥ
            r4.<init>(r3)
            r3.f24361 = r4
            if (r6 == 0) goto L41
            java.util.TreeMap r4 = new java.util.TreeMap
            java.util.Comparator r0 = java.lang.String.CASE_INSENSITIVE_ORDER
            r4.<init>(r0)
            r3.f24357 = r4
            r4.putAll(r6)
        L41:
            r3.f24360 = r7
            r3.m561(r1)
            r3.m560(r1)
            Yue.ۥۢۥۡۥ r4 = new Yue.ۥۢۥۡۥ
            r4.<init>(r3, r5)
            r3.f24349 = r4
            return
        L51:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "null as draft is permitted for `WebSocketServer` only!"
            r4.<init>(r5)
            throw r4
        L59:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
    }

    public AbstractRunnableC6983(java.net.URI r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r1 = this;
            Yue.ۥ۠۠۠۠ r0 = new Yue.ۥ۠۠۠۠
            r0.<init>()
            r1.<init>(r2, r0, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m26964(Yue.AbstractRunnableC6983 r0, java.io.IOException r1) {
            r0.m26989(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Thread m26965(Yue.AbstractRunnableC6983 r0, java.lang.Thread r1) {
            r0.f24354 = r1
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ Yue.C6989 m26966(Yue.AbstractRunnableC6983 r0) {
            Yue.ۥۢۥۡۥ r0 = r0.f24349
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ java.io.OutputStream m26967(Yue.AbstractRunnableC6983 r0) {
            java.io.OutputStream r0 = r0.f24352
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static /* synthetic */ java.net.Socket m26968(Yue.AbstractRunnableC6983 r0) {
            java.net.Socket r0 = r0.f24350
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    private int m26969() {
            r4 = this;
            java.net.URI r0 = r4.f24348
            int r0 = r0.getPort()
            java.net.URI r1 = r4.f24348
            java.lang.String r1 = r1.getScheme()
            java.lang.String r2 = "wss"
            boolean r2 = r2.equals(r1)
            r3 = -1
            if (r2 == 0) goto L1a
            if (r0 != r3) goto L19
            r0 = 443(0x1bb, float:6.21E-43)
        L19:
            return r0
        L1a:
            java.lang.String r2 = "ws"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L27
            if (r0 != r3) goto L26
            r0 = 80
        L26:
            return r0
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unknown scheme: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC6981
    public void close() {
            r2 = this;
            java.lang.Thread r0 = r2.f24354
            if (r0 == 0) goto Lb
            Yue.ۥۢۥۡۥ r0 = r2.f24349
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.mo26941(r1)
        Lb:
            return
    }

    @Override // Yue.InterfaceC6981
    public boolean isOpen() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r6 = this;
            r0 = -1
            boolean r1 = r6.m26994()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            java.net.Socket r2 = r6.f24350     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            boolean r3 = r6.m557()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            r2.setTcpNoDelay(r3)     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            java.net.Socket r2 = r6.f24350     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            boolean r3 = r6.m556()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            r2.setReuseAddress(r3)     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            java.net.Socket r2 = r6.f24350     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            boolean r2 = r2.isConnected()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            if (r2 != 0) goto L50
            Yue.ۥۣ۠۟ۧ r2 = r6.f24361     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            if (r2 != 0) goto L38
            java.net.URI r2 = r6.f24348     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            java.lang.String r2 = r2.getHost()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            int r3 = r6.m26969()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            java.net.InetSocketAddress r2 = java.net.InetSocketAddress.createUnresolved(r2, r3)     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            goto L49
        L32:
            r1 = move-exception
            goto Ld6
        L35:
            r1 = move-exception
            goto L104
        L38:
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            Yue.ۥۣ۠۟ۧ r3 = r6.f24361     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            java.net.URI r4 = r6.f24348     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            java.net.InetAddress r3 = r3.mo8934(r4)     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            int r4 = r6.m26969()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            r2.<init>(r3, r4)     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
        L49:
            java.net.Socket r3 = r6.f24350     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            int r4 = r6.f24360     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            r3.connect(r2, r4)     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
        L50:
            if (r1 == 0) goto L63
            java.lang.String r1 = "wss"
            java.net.URI r2 = r6.f24348     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            java.lang.String r2 = r2.getScheme()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            boolean r1 = r1.equals(r2)     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            if (r1 == 0) goto L63
            r6.m27004()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
        L63:
            java.net.Socket r1 = r6.f24350     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            boolean r2 = r1 instanceof javax.net.ssl.SSLSocket     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            if (r2 == 0) goto L75
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            javax.net.ssl.SSLParameters r2 = r1.getSSLParameters()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            r6.m26993(r2)     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            r1.setSSLParameters(r2)     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
        L75:
            java.net.Socket r1 = r6.f24350     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            java.net.Socket r2 = r6.f24350     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            java.io.OutputStream r2 = r2.getOutputStream()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            r6.f24352 = r2     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            r6.m26999()     // Catch: java.lang.InternalError -> L32 java.lang.Exception -> L35
            java.lang.Thread r2 = new java.lang.Thread
            Yue.ۥۢۥۡۢ$ۥ۟ r3 = new Yue.ۥۢۥۡۢ$ۥ۟
            r3.<init>(r6, r6)
            r2.<init>(r3)
            r6.f24354 = r2
            r2.start()
            r2 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r2]
        L99:
            boolean r3 = r6.mo26938()     // Catch: java.lang.RuntimeException -> Lb6 java.io.IOException -> Lb8
            if (r3 != 0) goto Lba
            boolean r3 = r6.mo26947()     // Catch: java.lang.RuntimeException -> Lb6 java.io.IOException -> Lb8
            if (r3 != 0) goto Lba
            int r3 = r1.read(r2)     // Catch: java.lang.RuntimeException -> Lb6 java.io.IOException -> Lb8
            if (r3 == r0) goto Lba
            Yue.ۥۢۥۡۥ r4 = r6.f24349     // Catch: java.lang.RuntimeException -> Lb6 java.io.IOException -> Lb8
            r5 = 0
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r2, r5, r3)     // Catch: java.lang.RuntimeException -> Lb6 java.io.IOException -> Lb8
            r4.m27024(r3)     // Catch: java.lang.RuntimeException -> Lb6 java.io.IOException -> Lb8
            goto L99
        Lb6:
            r0 = move-exception
            goto Lc0
        Lb8:
            r0 = move-exception
            goto Lcf
        Lba:
            Yue.ۥۢۥۡۥ r0 = r6.f24349     // Catch: java.lang.RuntimeException -> Lb6 java.io.IOException -> Lb8
            r0.m27027()     // Catch: java.lang.RuntimeException -> Lb6 java.io.IOException -> Lb8
            goto Ld2
        Lc0:
            r6.mo17183(r0)
            Yue.ۥۢۥۡۥ r1 = r6.f24349
            r2 = 1006(0x3ee, float:1.41E-42)
            java.lang.String r0 = r0.getMessage()
            r1.mo26955(r2, r0)
            goto Ld2
        Lcf:
            r6.m26989(r0)
        Ld2:
            r0 = 0
            r6.f24355 = r0
            return
        Ld6:
            java.lang.Throwable r2 = r1.getCause()
            boolean r2 = r2 instanceof java.lang.reflect.InvocationTargetException
            if (r2 == 0) goto L103
            java.lang.Throwable r2 = r1.getCause()
            java.lang.Throwable r2 = r2.getCause()
            boolean r2 = r2 instanceof java.io.IOException
            if (r2 == 0) goto L103
            java.lang.Throwable r1 = r1.getCause()
            java.lang.Throwable r1 = r1.getCause()
            java.io.IOException r1 = (java.io.IOException) r1
            Yue.ۥۢۥۡۥ r2 = r6.f24349
            r6.mo26979(r2, r1)
            Yue.ۥۢۥۡۥ r2 = r6.f24349
            java.lang.String r1 = r1.getMessage()
            r2.mo26955(r0, r1)
            return
        L103:
            throw r1
        L104:
            Yue.ۥۢۥۡۥ r2 = r6.f24349
            r6.mo26979(r2, r1)
            Yue.ۥۢۥۡۥ r2 = r6.f24349
            java.lang.String r1 = r1.getMessage()
            r2.mo26955(r0, r1)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ */
    public void mo26934(java.lang.String r2) {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            r0.mo26934(r2)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟ */
    public java.lang.String mo26935() {
            r1 = this;
            java.net.URI r0 = r1.f24348
            java.lang.String r0 = r0.getPath()
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo26936(int r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            r0.mo26936(r2, r3)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo26937(byte[] r2) {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            r0.mo26937(r2)
            return
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void mo26970(Yue.InterfaceC6981 r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.m26992(r2)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo26938() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            boolean r0 = r0.mo26938()
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo26939(Yue.InterfaceC2813 r2) {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            r0.mo26939(r2)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.EnumC5210 mo26940() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            Yue.ۥۡۦ۠ۡ r0 = r0.mo26940()
            return r0
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo26971(Yue.InterfaceC6981 r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.m26990(r2, r3)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo26941(int r2) {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            r0.mo26941(r2)
            return
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void mo26972(Yue.InterfaceC6981 r1, int r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.m563()
            java.lang.Thread r1 = r0.f24354
            if (r1 == 0) goto La
            r1.interrupt()
        La:
            r0.mo17182(r2, r3, r4)
            java.util.concurrent.CountDownLatch r1 = r0.f24358
            r1.countDown()
            java.util.concurrent.CountDownLatch r1 = r0.f24359
            r1.countDown()
            return
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void mo26973(Yue.InterfaceC6981 r1) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo26974(Yue.InterfaceC6981 r1, int r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.m26991(r2, r3, r4)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public boolean mo26942() {
            r1 = this;
            java.net.Socket r0 = r1.f24350
            boolean r0 = r0 instanceof javax.net.ssl.SSLSocket
            return r0
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public java.net.InetSocketAddress mo26975(Yue.InterfaceC6981 r1) {
            r0 = this;
            java.net.Socket r1 = r0.f24350
            if (r1 == 0) goto Lb
            java.net.SocketAddress r1 = r1.getRemoteSocketAddress()
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public java.net.InetSocketAddress mo26976(Yue.InterfaceC6981 r1) {
            r0 = this;
            java.net.Socket r1 = r0.f24350
            if (r1 == 0) goto Lb
            java.net.SocketAddress r1 = r1.getLocalSocketAddress()
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public Yue.AbstractC1986 mo26943() {
            r1 = this;
            Yue.ۥ۠۠۠۟ r0 = r1.f24356
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public Yue.InterfaceC3193 mo26944() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            Yue.ۥ۠ۥۣ۟ r0 = r0.mo26944()
            return r0
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void mo26977(Yue.InterfaceC6981 r1, Yue.InterfaceC2981 r2) {
            r0 = this;
            r0.m562()
            Yue.ۥۣۡۨۡ r2 = (Yue.InterfaceC5669) r2
            r0.mo17185(r2)
            java.util.concurrent.CountDownLatch r1 = r0.f24358
            r1.countDown()
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public void mo26945() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            r0.mo26945()
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public void mo26946(java.util.Collection<Yue.InterfaceC2813> r2) {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            r0.mo26946(r2)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public boolean mo26947() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            boolean r0 = r0.mo26947()
            return r0
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void mo26978(Yue.InterfaceC6981 r1, java.lang.String r2) {
            r0 = this;
            r0.mo17184(r2)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public void mo26948(java.nio.ByteBuffer r2) {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            r0.mo26948(r2)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public boolean mo26949() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            boolean r0 = r0.mo26949()
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo26950(Yue.EnumC4633 r2, java.nio.ByteBuffer r3, boolean r4) {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            r0.mo26950(r2, r3, r4)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public <T> void mo26951(T r2) {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            r0.mo26951(r2)
            return
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void mo26979(Yue.InterfaceC6981 r1, java.lang.Exception r2) {
            r0 = this;
            r0.mo17183(r2)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo26952() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            boolean r0 = r0.mo26952()
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public <T> T mo26953() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            java.lang.Object r0 = r0.mo26953()
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public java.net.InetSocketAddress mo26954() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            java.net.InetSocketAddress r0 = r0.mo26954()
            return r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public void mo26955(int r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            r0.mo26955(r2, r3)
            return
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public javax.net.ssl.SSLSession mo26956() {
            r2 = this;
            boolean r0 = r2.mo26942()
            if (r0 == 0) goto Lf
            java.net.Socket r0 = r2.f24350
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0
            javax.net.ssl.SSLSession r0 = r0.getSession()
            return r0
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "This websocket uses ws instead of wss. No SSLSession available."
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.InterfaceC6981
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public java.net.InetSocketAddress mo26957() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            java.net.InetSocketAddress r0 = r0.mo26957()
            return r0
    }

    @Override // Yue.AbstractC0099
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public java.util.Collection<Yue.InterfaceC6981> mo555() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public void m26980(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f24357
            if (r0 != 0) goto Ld
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            r2.f24357 = r0
        Ld:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f24357
            r0.put(r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void m26981() {
            r1 = this;
            r0 = 0
            r1.f24357 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public void m26982() throws java.lang.InterruptedException {
            r1 = this;
            r1.close()
            java.util.concurrent.CountDownLatch r0 = r1.f24359
            r0.await()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m26983() {
            r4 = this;
            java.lang.Thread r0 = r4.f24355
            if (r0 != 0) goto L2b
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r4)
            r4.f24355 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "WebSocketConnectReadThread-"
            r1.append(r2)
            java.lang.Thread r2 = r4.f24355
            long r2 = r2.getId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setName(r1)
            java.lang.Thread r0 = r4.f24355
            r0.start()
            return
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "WebSocketClient objects are not reuseable"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public boolean m26984() throws java.lang.InterruptedException {
            r1 = this;
            r1.m26983()
            java.util.concurrent.CountDownLatch r0 = r1.f24358
            r0.await()
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            boolean r0 = r0.isOpen()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public boolean m26985(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            r1.m26983()
            java.util.concurrent.CountDownLatch r0 = r1.f24358
            boolean r2 = r0.await(r2, r4)
            if (r2 == 0) goto L15
            Yue.ۥۢۥۡۥ r2 = r1.f24349
            boolean r2 = r2.isOpen()
            if (r2 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public Yue.InterfaceC6981 m26986() {
            r1 = this;
            Yue.ۥۢۥۡۥ r0 = r1.f24349
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public java.net.Socket m26987() {
            r1 = this;
            java.net.Socket r0 = r1.f24350
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public java.net.URI m26988() {
            r1 = this;
            java.net.URI r0 = r1.f24348
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final void m26989(java.io.IOException r2) {
            r1 = this;
            boolean r0 = r2 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L7
            r1.mo17183(r2)
        L7:
            Yue.ۥۢۥۡۥ r2 = r1.f24349
            r2.m27027()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public abstract void mo17182(int r1, java.lang.String r2, boolean r3);

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public void m26990(int r1, java.lang.String r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public void m26991(int r1, java.lang.String r2, boolean r3) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ */
    public abstract void mo17183(java.lang.Exception r1);

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ */
    public abstract void mo17184(java.lang.String r1);

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public void m26992(java.nio.ByteBuffer r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ */
    public abstract void mo17185(Yue.InterfaceC5669 r1);

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m26993(javax.net.ssl.SSLParameters r2) {
            r1 = this;
            java.lang.String r0 = "HTTPS"
            r2.setEndpointIdentificationAlgorithm(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public final boolean m26994() throws java.io.IOException {
            r3 = this;
            java.net.Proxy r0 = r3.f24353
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            r2 = 1
            if (r0 == r1) goto L11
            java.net.Socket r0 = new java.net.Socket
            java.net.Proxy r1 = r3.f24353
            r0.<init>(r1)
            r3.f24350 = r0
            goto L31
        L11:
            javax.net.SocketFactory r0 = r3.f24351
            if (r0 == 0) goto L1c
            java.net.Socket r0 = r0.createSocket()
            r3.f24350 = r0
            goto L30
        L1c:
            java.net.Socket r0 = r3.f24350
            if (r0 != 0) goto L2a
            java.net.Socket r0 = new java.net.Socket
            java.net.Proxy r1 = r3.f24353
            r0.<init>(r1)
            r3.f24350 = r0
            goto L31
        L2a:
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L32
        L30:
            r2 = 0
        L31:
            return r2
        L32:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m26995() {
            r0 = this;
            r0.m26998()
            r0.m26983()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public boolean m26996() throws java.lang.InterruptedException {
            r1 = this;
            r1.m26998()
            boolean r0 = r1.m26984()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public java.lang.String m26997(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f24357
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Object r2 = r0.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public final void m26998() {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = r3.f24354
            if (r0 == r1) goto L5b
            java.lang.Thread r1 = r3.f24355
            if (r0 == r1) goto L5b
            r3.m26982()     // Catch: java.lang.Exception -> L1a
            java.lang.Thread r0 = r3.f24354     // Catch: java.lang.Exception -> L1a
            r1 = 0
            if (r0 == 0) goto L1c
            r0.interrupt()     // Catch: java.lang.Exception -> L1a
            r3.f24354 = r1     // Catch: java.lang.Exception -> L1a
            goto L1c
        L1a:
            r0 = move-exception
            goto L4c
        L1c:
            java.lang.Thread r0 = r3.f24355     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L25
            r0.interrupt()     // Catch: java.lang.Exception -> L1a
            r3.f24355 = r1     // Catch: java.lang.Exception -> L1a
        L25:
            Yue.ۥ۠۠۠۟ r0 = r3.f24356     // Catch: java.lang.Exception -> L1a
            r0.mo9169()     // Catch: java.lang.Exception -> L1a
            java.net.Socket r0 = r3.f24350     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L33
            r0.close()     // Catch: java.lang.Exception -> L1a
            r3.f24350 = r1     // Catch: java.lang.Exception -> L1a
        L33:
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r3.f24358 = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r0.<init>(r1)
            r3.f24359 = r0
            Yue.ۥۢۥۡۥ r0 = new Yue.ۥۢۥۡۥ
            Yue.ۥ۠۠۠۟ r1 = r3.f24356
            r0.<init>(r3, r1)
            r3.f24349 = r0
            return
        L4c:
            r3.mo17183(r0)
            Yue.ۥۢۥۡۥ r1 = r3.f24349
            r2 = 1006(0x3ee, float:1.41E-42)
            java.lang.String r0 = r0.getMessage()
            r1.mo26955(r2, r0)
            return
        L5b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to ensure a successful cleanup."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public final void m26999() throws Yue.C3345 {
            r5 = this;
            java.net.URI r0 = r5.f24348
            java.lang.String r0 = r0.getRawPath()
            java.net.URI r1 = r5.f24348
            java.lang.String r1 = r1.getRawQuery()
            if (r0 == 0) goto L14
            int r2 = r0.length()
            if (r2 != 0) goto L16
        L14:
            java.lang.String r0 = "/"
        L16:
            if (r1 == 0) goto L2c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r0 = 63
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
        L2c:
            int r1 = r5.m26969()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.net.URI r3 = r5.f24348
            java.lang.String r3 = r3.getHost()
            r2.append(r3)
            r3 = 80
            if (r1 == r3) goto L58
            r3 = 443(0x1bb, float:6.21E-43)
            if (r1 == r3) goto L58
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ":"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L5a
        L58:
            java.lang.String r1 = ""
        L5a:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            Yue.ۥ۠ۤۡۢ r2 = new Yue.ۥ۠ۤۡۢ
            r2.<init>()
            r2.mo6096(r0)
            java.lang.String r0 = "Host"
            r2.put(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.f24357
            if (r0 == 0) goto L96
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L7a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L96
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.put(r3, r1)
            goto L7a
        L96:
            Yue.ۥۢۥۡۥ r0 = r5.f24349
            r0.m27040(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public void m27000(Yue.InterfaceC1946 r1) {
            r0 = this;
            r0.f24361 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public void m27001(java.net.Proxy r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.f24353 = r1
            return
        L5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public void m27002(java.net.Socket r2) {
            r1 = this;
            java.net.Socket r0 = r1.f24350
            if (r0 != 0) goto L7
            r1.f24350 = r2
            return
        L7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "socket has already been set"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public void m27003(javax.net.SocketFactory r1) {
            r0 = this;
            r0.f24351 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public final void m27004() throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException, java.io.IOException {
            r5 = this;
            javax.net.SocketFactory r0 = r5.f24351
            boolean r1 = r0 instanceof javax.net.ssl.SSLSocketFactory
            if (r1 == 0) goto L9
            javax.net.ssl.SSLSocketFactory r0 = (javax.net.ssl.SSLSocketFactory) r0
            goto L17
        L9:
            java.lang.String r0 = "TLSv1.2"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            r1 = 0
            r0.init(r1, r1, r1)
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
        L17:
            java.net.Socket r1 = r5.f24350
            java.net.URI r2 = r5.f24348
            java.lang.String r2 = r2.getHost()
            int r3 = r5.m26969()
            r4 = 1
            java.net.Socket r0 = r0.createSocket(r1, r2, r3, r4)
            r5.f24350 = r0
            return
    }
}
