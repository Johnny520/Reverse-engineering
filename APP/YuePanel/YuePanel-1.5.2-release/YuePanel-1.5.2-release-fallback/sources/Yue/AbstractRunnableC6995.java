package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC6995 extends Yue.AbstractC0099 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f24437 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final Yue.InterfaceC3804 f24438;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final java.util.Collection<Yue.InterfaceC6981> f24439;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final java.net.InetSocketAddress f24440;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public java.nio.channels.ServerSocketChannel f24441;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public java.nio.channels.Selector f24442;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public java.util.List<Yue.AbstractC1986> f24443;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public java.lang.Thread f24444;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicBoolean f24445;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public java.util.List<Yue.AbstractRunnableC6995.C6996> f24446;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public java.util.List<Yue.C6989> f24447;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> f24448;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int f24449;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicInteger f24450;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public Yue.InterfaceC6998 f24451;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public int f24452;

    /* JADX INFO: renamed from: Yue.ۥۢۥۢ۟$ۥ, reason: contains not printable characters */
    public class C6996 extends java.lang.Thread {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final /* synthetic */ boolean f24453 = false;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.util.concurrent.BlockingQueue<Yue.C6989> f24454;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractRunnableC6995 f24455;

        /* JADX INFO: renamed from: Yue.ۥۢۥۢ۟$ۥ$ۥ, reason: contains not printable characters */
        public class C6997 implements java.lang.Thread.UncaughtExceptionHandler {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.AbstractRunnableC6995 f24456;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public final /* synthetic */ Yue.AbstractRunnableC6995.C6996 f24457;

            public C6997(Yue.AbstractRunnableC6995.C6996 r1, Yue.AbstractRunnableC6995 r2) {
                    r0 = this;
                    r0.f24457 = r1
                    r0.f24456 = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
                    r2 = this;
                    Yue.ۥۢۥۢ۟$ۥ r0 = r2.f24457
                    Yue.ۥۢۥۢ۟ r0 = r0.f24455
                    Yue.ۥ۠ۨۡۥ r0 = Yue.AbstractRunnableC6995.m27061(r0)
                    java.lang.String r1 = "Uncaught exception in thread {}: {}"
                    java.lang.String r3 = r3.getName()
                    r0.mo10330(r1, r3, r4)
                    return
            }
        }

        static {
                return
        }

        public C6996(Yue.AbstractRunnableC6995 r4) {
                r3 = this;
                r3.f24455 = r4
                r3.<init>()
                java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
                r0.<init>()
                r3.f24454 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "WebSocketWorker-"
                r0.append(r1)
                long r1 = r3.getId()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.setName(r0)
                Yue.ۥۢۥۢ۟$ۥ$ۥ r0 = new Yue.ۥۢۥۢ۟$ۥ$ۥ
                r0.<init>(r3, r4)
                r3.setUncaughtExceptionHandler(r0)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r6 = this;
            L0:
                r0 = 0
                java.util.concurrent.BlockingQueue<Yue.ۥۢۥۡۥ> r1 = r6.f24454     // Catch: java.lang.Throwable -> L1d java.lang.LinkageError -> L22 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 java.lang.InterruptedException -> L64
                java.lang.Object r1 = r1.take()     // Catch: java.lang.Throwable -> L1d java.lang.LinkageError -> L22 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 java.lang.InterruptedException -> L64
                Yue.ۥۢۥۡۥ r1 = (Yue.C6989) r1     // Catch: java.lang.Throwable -> L1d java.lang.LinkageError -> L22 java.lang.ThreadDeath -> L27 java.lang.VirtualMachineError -> L29 java.lang.InterruptedException -> L64
                java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r1.f24379     // Catch: java.lang.Throwable -> L15 java.lang.LinkageError -> L17 java.lang.ThreadDeath -> L19 java.lang.VirtualMachineError -> L1b java.lang.InterruptedException -> L64
                java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L15 java.lang.LinkageError -> L17 java.lang.ThreadDeath -> L19 java.lang.VirtualMachineError -> L1b java.lang.InterruptedException -> L64
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.Throwable -> L15 java.lang.LinkageError -> L17 java.lang.ThreadDeath -> L19 java.lang.VirtualMachineError -> L1b java.lang.InterruptedException -> L64
                r6.m27110(r1, r0)     // Catch: java.lang.Throwable -> L15 java.lang.LinkageError -> L17 java.lang.ThreadDeath -> L19 java.lang.VirtualMachineError -> L1b java.lang.InterruptedException -> L64
                goto L0
            L15:
                r0 = move-exception
                goto L2b
            L17:
                r0 = move-exception
                goto L4a
            L19:
                r0 = move-exception
                goto L4a
            L1b:
                r0 = move-exception
                goto L4a
            L1d:
                r1 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
                goto L2b
            L22:
                r1 = move-exception
            L23:
                r5 = r1
                r1 = r0
                r0 = r5
                goto L4a
            L27:
                r1 = move-exception
                goto L23
            L29:
                r1 = move-exception
                goto L23
            L2b:
                Yue.ۥۢۥۢ۟ r2 = r6.f24455
                Yue.ۥ۠ۨۡۥ r2 = Yue.AbstractRunnableC6995.m27061(r2)
                java.lang.String r3 = "Uncaught exception in thread {}: {}"
                java.lang.String r4 = r6.getName()
                r2.mo10330(r3, r4, r0)
                if (r1 == 0) goto L6b
                java.lang.Exception r2 = new java.lang.Exception
                r2.<init>(r0)
                Yue.ۥۢۥۢ۟ r0 = r6.f24455
                r0.mo26979(r1, r2)
                r1.close()
                goto L6b
            L4a:
                Yue.ۥۢۥۢ۟ r2 = r6.f24455
                Yue.ۥ۠ۨۡۥ r2 = Yue.AbstractRunnableC6995.m27061(r2)
                java.lang.String r3 = "Got fatal error in worker thread {}"
                java.lang.String r4 = r6.getName()
                r2.mo10340(r3, r4)
                java.lang.Exception r2 = new java.lang.Exception
                r2.<init>(r0)
                Yue.ۥۢۥۢ۟ r0 = r6.f24455
                Yue.AbstractRunnableC6995.m27062(r0, r1, r2)
                goto L6b
            L64:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L6b:
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m27110(Yue.C6989 r3, java.nio.ByteBuffer r4) throws java.lang.InterruptedException {
                r2 = this;
                r3.m27024(r4)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> Lb
            L3:
                Yue.ۥۢۥۢ۟ r3 = r2.f24455
                Yue.AbstractRunnableC6995.m27063(r3, r4)
                goto L18
            L9:
                r3 = move-exception
                goto L19
            Lb:
                r3 = move-exception
                Yue.ۥۢۥۢ۟ r0 = r2.f24455     // Catch: java.lang.Throwable -> L9
                Yue.ۥ۠ۨۡۥ r0 = Yue.AbstractRunnableC6995.m27061(r0)     // Catch: java.lang.Throwable -> L9
                java.lang.String r1 = "Error while reading from remote connection"
                r0.error(r1, r3)     // Catch: java.lang.Throwable -> L9
                goto L3
            L18:
                return
            L19:
                Yue.ۥۢۥۢ۟ r0 = r2.f24455
                Yue.AbstractRunnableC6995.m27063(r0, r4)
                throw r3
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m27111(Yue.C6989 r2) throws java.lang.InterruptedException {
                r1 = this;
                java.util.concurrent.BlockingQueue<Yue.ۥۢۥۡۥ> r0 = r1.f24454
                r0.put(r2)
                return
        }
    }

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            Yue.AbstractRunnableC6995.f24437 = r0
            return
    }

    public AbstractRunnableC6995() {
            r3 = this;
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r1 = 80
            r0.<init>(r1)
            int r1 = Yue.AbstractRunnableC6995.f24437
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
    }

    public AbstractRunnableC6995(java.net.InetSocketAddress r3) {
            r2 = this;
            int r0 = Yue.AbstractRunnableC6995.f24437
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public AbstractRunnableC6995(java.net.InetSocketAddress r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AbstractRunnableC6995(java.net.InetSocketAddress r2, int r3, java.util.List<Yue.AbstractC1986> r4) {
            r1 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public AbstractRunnableC6995(java.net.InetSocketAddress r3, int r4, java.util.List<Yue.AbstractC1986> r5, java.util.Collection<Yue.InterfaceC6981> r6) {
            r2 = this;
            r2.<init>()
            java.lang.Class<Yue.ۥۢۥۢ۟> r0 = Yue.AbstractRunnableC6995.class
            Yue.ۥ۠ۨۡۥ r0 = Yue.C3805.m15249(r0)
            r2.f24438 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f24445 = r0
            r2.f24449 = r1
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r2.f24450 = r0
            Yue.ۥ۟ۨۧۤ r0 = new Yue.ۥ۟ۨۧۤ
            r0.<init>()
            r2.f24451 = r0
            r0 = -1
            r2.f24452 = r0
            if (r3 == 0) goto L67
            r0 = 1
            if (r4 < r0) goto L67
            if (r6 == 0) goto L67
            if (r5 != 0) goto L36
            java.util.List r5 = java.util.Collections.emptyList()
            r2.f24443 = r5
            goto L38
        L36:
            r2.f24443 = r5
        L38:
            r2.f24440 = r3
            r2.f24439 = r6
            r2.m561(r1)
            r2.m560(r1)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2.f24447 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r2.f24446 = r3
            java.util.concurrent.LinkedBlockingQueue r3 = new java.util.concurrent.LinkedBlockingQueue
            r3.<init>()
            r2.f24448 = r3
        L57:
            if (r1 >= r4) goto L66
            Yue.ۥۢۥۢ۟$ۥ r3 = new Yue.ۥۢۥۢ۟$ۥ
            r3.<init>(r2)
            java.util.List<Yue.ۥۢۥۢ۟$ۥ> r5 = r2.f24446
            r5.add(r3)
            int r1 = r1 + 1
            goto L57
        L66:
            return
        L67:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "address and connectionscontainer must not be null and you need at least 1 decoder"
            r3.<init>(r4)
            throw r3
    }

    public AbstractRunnableC6995(java.net.InetSocketAddress r2, java.util.List<Yue.AbstractC1986> r3) {
            r1 = this;
            int r0 = Yue.AbstractRunnableC6995.f24437
            r1.<init>(r2, r0, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC3804 m27061(Yue.AbstractRunnableC6995 r0) {
            Yue.ۥ۠ۨۡۥ r0 = r0.f24438
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m27062(Yue.AbstractRunnableC6995 r0, Yue.InterfaceC6981 r1, java.lang.Exception r2) {
            r0.m27088(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m27063(Yue.AbstractRunnableC6995 r0, java.nio.ByteBuffer r1) throws java.lang.InterruptedException {
            r0.m27099(r1)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            boolean r0 = r7.m27076()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.m27079()
            if (r0 != 0) goto Le
            return
        Le:
            r0 = 5
            r1 = 0
            r2 = r0
        L11:
            r3 = 0
            java.lang.Thread r4 = r7.f24444     // Catch: java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c
            boolean r4 = r4.isInterrupted()     // Catch: java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c
            if (r4 != 0) goto Lb5
            if (r2 == 0) goto Lb5
            java.util.concurrent.atomic.AtomicBoolean r4 = r7.f24445     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L3f Yue.C7137 -> L43 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            boolean r4 = r4.get()     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L3f Yue.C7137 -> L43 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            if (r4 == 0) goto L25
            r1 = r0
        L25:
            java.nio.channels.Selector r4 = r7.f24442     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L3f Yue.C7137 -> L43 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            long r5 = (long) r1     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L3f Yue.C7137 -> L43 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            int r4 = r4.select(r5)     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L3f Yue.C7137 -> L43 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            if (r4 != 0) goto L47
            java.util.concurrent.atomic.AtomicBoolean r4 = r7.f24445     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L3f Yue.C7137 -> L43 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            boolean r4 = r4.get()     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L3f Yue.C7137 -> L43 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            if (r4 == 0) goto L47
            int r2 = r2 + (-1)
            goto L47
        L39:
            r0 = move-exception
            goto Lbe
        L3c:
            r0 = move-exception
            goto Lb9
        L3f:
            r4 = move-exception
            r5 = r3
            goto L9f
        L43:
            r4 = move-exception
            r5 = r3
            goto La4
        L47:
            java.nio.channels.Selector r4 = r7.f24442     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L3f Yue.C7137 -> L43 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            java.util.Set r4 = r4.selectedKeys()     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L3f Yue.C7137 -> L43 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            java.util.Iterator r4 = r4.iterator()     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L3f Yue.C7137 -> L43 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            r5 = r3
        L52:
            boolean r6 = r4.hasNext()     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L8d Yue.C7137 -> L8f java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            if (r6 == 0) goto L91
            java.lang.Object r6 = r4.next()     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L8d Yue.C7137 -> L8f java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            java.nio.channels.SelectionKey r6 = (java.nio.channels.SelectionKey) r6     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L8d Yue.C7137 -> L8f java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            boolean r5 = r6.isValid()     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L6f Yue.C7137 -> L72 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            if (r5 != 0) goto L65
            goto L8b
        L65:
            boolean r5 = r6.isAcceptable()     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L6f Yue.C7137 -> L72 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            if (r5 == 0) goto L75
            r7.m27073(r6, r4)     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L6f Yue.C7137 -> L72 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            goto L8b
        L6f:
            r4 = move-exception
            r5 = r6
            goto L9f
        L72:
            r4 = move-exception
            r5 = r6
            goto La4
        L75:
            boolean r5 = r6.isReadable()     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L6f Yue.C7137 -> L72 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            if (r5 == 0) goto L82
            boolean r5 = r7.m27077(r6, r4)     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L6f Yue.C7137 -> L72 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            if (r5 != 0) goto L82
            goto L8b
        L82:
            boolean r5 = r6.isWritable()     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L6f Yue.C7137 -> L72 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            if (r5 == 0) goto L8b
            r7.m27080(r6)     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L6f Yue.C7137 -> L72 java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
        L8b:
            r5 = r6
            goto L52
        L8d:
            r4 = move-exception
            goto L9f
        L8f:
            r4 = move-exception
            goto La4
        L91:
            r7.m27074()     // Catch: java.nio.channels.CancelledKeyException -> L11 java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c java.io.IOException -> L8d Yue.C7137 -> L8f java.lang.InterruptedException -> L96 java.nio.channels.ClosedByInterruptException -> Lb1
            goto L11
        L96:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c
            r4.interrupt()     // Catch: java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c
            goto L11
        L9f:
            r7.m27089(r5, r3, r4)     // Catch: java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c
            goto L11
        La4:
            Yue.ۥۢۥۡ۠ r6 = r4.m27469()     // Catch: java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c
            java.io.IOException r4 = r4.m27470()     // Catch: java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c
            r7.m27089(r5, r6, r4)     // Catch: java.lang.Throwable -> L39 java.lang.RuntimeException -> L3c
            goto L11
        Lb1:
            r7.m27078()
            return
        Lb5:
            r7.m27078()
            goto Lbd
        Lb9:
            r7.m27088(r3, r0)     // Catch: java.lang.Throwable -> L39
            goto Lb5
        Lbd:
            return
        Lbe:
            r7.m27078()
            throw r0
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public final void mo26970(Yue.InterfaceC6981 r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.m27096(r1, r2)
            return
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo26971(Yue.InterfaceC6981 r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.m27091(r1, r2, r3)
            return
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public final void mo26972(Yue.InterfaceC6981 r2, int r3, java.lang.String r4, boolean r5) {
            r1 = this;
            java.nio.channels.Selector r0 = r1.f24442
            r0.wakeup()
            boolean r0 = r1.m27102(r2)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            r1.m27090(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r3 = move-exception
            goto L1d
        L11:
            r1.m27101(r2)     // Catch: java.lang.InterruptedException -> L15
            goto L1c
        L15:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
        L1c:
            return
        L1d:
            r1.m27101(r2)     // Catch: java.lang.InterruptedException -> L21
            goto L28
        L21:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
        L28:
            throw r3
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public final void mo26973(Yue.InterfaceC6981 r3) {
            r2 = this;
            Yue.ۥۢۥۡۥ r3 = (Yue.C6989) r3
            java.nio.channels.SelectionKey r0 = r3.m27032()     // Catch: java.nio.channels.CancelledKeyException -> Lb
            r1 = 5
            r0.interestOps(r1)     // Catch: java.nio.channels.CancelledKeyException -> Lb
            goto L10
        Lb:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r3 = r3.f24378
            r3.clear()
        L10:
            java.nio.channels.Selector r3 = r2.f24442
            r3.wakeup()
            return
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo26974(Yue.InterfaceC6981 r1, int r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.m27092(r1, r2, r3, r4)
            return
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public java.net.InetSocketAddress mo26975(Yue.InterfaceC6981 r1) {
            r0 = this;
            java.net.Socket r1 = r0.m27086(r1)
            java.net.SocketAddress r1 = r1.getRemoteSocketAddress()
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            return r1
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public java.net.InetSocketAddress mo26976(Yue.InterfaceC6981 r1) {
            r0 = this;
            java.net.Socket r1 = r0.m27086(r1)
            java.net.SocketAddress r1 = r1.getLocalSocketAddress()
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            return r1
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public final void mo26977(Yue.InterfaceC6981 r2, Yue.InterfaceC2981 r3) {
            r1 = this;
            boolean r0 = r1.m27064(r2)
            if (r0 == 0) goto Lb
            Yue.ۥ۟ۤۨۡ r3 = (Yue.InterfaceC1165) r3
            r1.m27097(r2, r3)
        Lb:
            return
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public final void mo26978(Yue.InterfaceC6981 r1, java.lang.String r2) {
            r0 = this;
            r0.m27095(r1, r2)
            return
    }

    @Override // Yue.InterfaceC6990
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public final void mo26979(Yue.InterfaceC6981 r1, java.lang.Exception r2) {
            r0 = this;
            r0.m27094(r1, r2)
            return
    }

    @Override // Yue.AbstractC0099
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public java.util.Collection<Yue.InterfaceC6981> mo555() {
            r3 = this;
            java.util.Collection<Yue.ۥۢۥۡ۠> r0 = r3.f24439
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L10
            java.util.Collection<Yue.ۥۢۥۡ۠> r2 = r3.f24439     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L10
            java.util.Collection r1 = java.util.Collections.unmodifiableCollection(r1)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public boolean m27064(Yue.InterfaceC6981 r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f24445
            boolean r0 = r0.get()
            if (r0 != 0) goto L16
            java.util.Collection<Yue.ۥۢۥۡ۠> r0 = r2.f24439
            monitor-enter(r0)
            java.util.Collection<Yue.ۥۢۥۡ۠> r1 = r2.f24439     // Catch: java.lang.Throwable -> L13
            boolean r3 = r1.add(r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r3
        L13:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r3
        L16:
            r0 = 1001(0x3e9, float:1.403E-42)
            r3.mo26941(r0)
            r3 = 1
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public void m27065(Yue.InterfaceC6981 r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r2 = r1.f24450
            int r2 = r2.get()
            java.util.List<Yue.ۥۢۥۢ۟$ۥ> r0 = r1.f24446
            int r0 = r0.size()
            int r0 = r0 * 2
            int r0 = r0 + 1
            if (r2 < r0) goto L13
            return
        L13:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.f24450
            r2.incrementAndGet()
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r1.f24448
            java.nio.ByteBuffer r0 = r1.m27072()
            r2.put(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public void m27066(java.lang.String r2) {
            r1 = this;
            java.util.Collection<Yue.ۥۢۥۡ۠> r0 = r1.f24439
            r1.m27067(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void m27067(java.lang.String r1, java.util.Collection<Yue.InterfaceC6981> r2) {
            r0 = this;
            if (r1 == 0) goto L8
            if (r2 == 0) goto L8
            r0.m27075(r1, r2)
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public void m27068(java.nio.ByteBuffer r2) {
            r1 = this;
            java.util.Collection<Yue.ۥۢۥۡ۠> r0 = r1.f24439
            r1.m27069(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m27069(java.nio.ByteBuffer r1, java.util.Collection<Yue.InterfaceC6981> r2) {
            r0 = this;
            if (r1 == 0) goto L8
            if (r2 == 0) goto L8
            r0.m27075(r1, r2)
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public void m27070(byte[] r2) {
            r1 = this;
            java.util.Collection<Yue.ۥۢۥۡ۠> r0 = r1.f24439
            r1.m27071(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public void m27071(byte[] r1, java.util.Collection<Yue.InterfaceC6981> r2) {
            r0 = this;
            if (r1 == 0) goto Lc
            if (r2 == 0) goto Lc
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            r0.m27069(r1, r2)
            return
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public java.nio.ByteBuffer m27072() {
            r1 = this;
            r0 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public final void m27073(java.nio.channels.SelectionKey r4, java.util.Iterator<java.nio.channels.SelectionKey> r5) throws java.io.IOException, java.lang.InterruptedException {
            r3 = this;
            boolean r0 = r3.m27093(r4)
            if (r0 != 0) goto La
            r4.cancel()
            return
        La:
            java.nio.channels.ServerSocketChannel r4 = r3.f24441
            java.nio.channels.SocketChannel r4 = r4.accept()
            if (r4 != 0) goto L13
            return
        L13:
            r0 = 0
            r4.configureBlocking(r0)
            java.net.Socket r0 = r4.socket()
            boolean r1 = r3.m557()
            r0.setTcpNoDelay(r1)
            r1 = 1
            r0.setKeepAlive(r1)
            Yue.ۥۢۥۢ۠ r0 = r3.f24451
            java.util.List<Yue.ۥ۠۠۠۟> r2 = r3.f24443
            Yue.ۥۢۥۡۥ r0 = r0.mo8469(r3, r2)
            java.nio.channels.Selector r2 = r3.f24442
            java.nio.channels.SelectionKey r1 = r4.register(r2, r1, r0)
            r0.m27038(r1)
            Yue.ۥۢۥۢ۠ r1 = r3.f24451     // Catch: java.io.IOException -> L4b
            java.nio.channels.SelectionKey r2 = r0.m27032()     // Catch: java.io.IOException -> L4b
            java.nio.channels.ByteChannel r4 = r1.mo8111(r4, r2)     // Catch: java.io.IOException -> L4b
            r0.m27037(r4)     // Catch: java.io.IOException -> L4b
            r5.remove()     // Catch: java.io.IOException -> L4b
            r3.m27065(r0)     // Catch: java.io.IOException -> L4b
            goto L61
        L4b:
            r4 = move-exception
            java.nio.channels.SelectionKey r5 = r0.m27032()
            if (r5 == 0) goto L59
            java.nio.channels.SelectionKey r5 = r0.m27032()
            r5.cancel()
        L59:
            java.nio.channels.SelectionKey r5 = r0.m27032()
            r0 = 0
            r3.m27089(r5, r0, r4)
        L61:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final void m27074() throws java.lang.InterruptedException, java.io.IOException {
            r3 = this;
        L0:
            java.util.List<Yue.ۥۢۥۡۥ> r0 = r3.f24447
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
            java.util.List<Yue.ۥۢۥۡۥ> r0 = r3.f24447
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            Yue.ۥۢۥۡۥ r0 = (Yue.C6989) r0
            java.nio.channels.ByteChannel r1 = r0.m27030()
            Yue.ۥۢۦ۠ r1 = (Yue.InterfaceC7132) r1
            java.nio.ByteBuffer r2 = r3.m27109()
            boolean r1 = Yue.C5821.m21668(r2, r0, r1)     // Catch: java.io.IOException -> L27
            if (r1 == 0) goto L29
            java.util.List<Yue.ۥۢۥۡۥ> r1 = r3.f24447     // Catch: java.io.IOException -> L27
            r1.add(r0)     // Catch: java.io.IOException -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L3c
        L29:
            boolean r1 = r2.hasRemaining()     // Catch: java.io.IOException -> L27
            if (r1 == 0) goto L38
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r1 = r0.f24379     // Catch: java.io.IOException -> L27
            r1.put(r2)     // Catch: java.io.IOException -> L27
            r3.m27100(r0)     // Catch: java.io.IOException -> L27
            goto L0
        L38:
            r3.m27099(r2)     // Catch: java.io.IOException -> L27
            goto L0
        L3c:
            r3.m27099(r2)
            throw r0
        L40:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public final void m27075(java.lang.Object r5, java.util.Collection<Yue.InterfaceC6981> r6) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            goto La
        L9:
            r0 = r1
        La:
            boolean r2 = r5 instanceof java.nio.ByteBuffer
            if (r2 == 0) goto L11
            r1 = r5
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
        L11:
            if (r0 != 0) goto L16
            if (r1 != 0) goto L16
            return
        L16:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            monitor-enter(r6)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r6 = r2.iterator()
        L26:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r6.next()
            Yue.ۥۢۥۡ۠ r2 = (Yue.InterfaceC6981) r2
            if (r2 == 0) goto L26
            Yue.ۥ۠۠۠۟ r3 = r2.mo26943()
            r4.m27081(r3, r5, r0, r1)
            java.lang.Object r3 = r5.get(r3)     // Catch: Yue.C7003 -> L26
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: Yue.C7003 -> L26
            r2.mo26946(r3)     // Catch: Yue.C7003 -> L26
            goto L26
        L45:
            return
        L46:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L46
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public final boolean m27076() {
            r3 = this;
            monitor-enter(r3)
            java.lang.Thread r0 = r3.f24444     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L1b
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L16
            r3.f24444 = r0     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f24445     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            r0 = 0
            return r0
        L16:
            r0 = move-exception
            goto L3a
        L18:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            r0 = 1
            return r0
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L16
            r1.append(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = " can only be started once."
            r1.append(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            throw r0     // Catch: java.lang.Throwable -> L16
        L3a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public final boolean m27077(java.nio.channels.SelectionKey r4, java.util.Iterator<java.nio.channels.SelectionKey> r5) throws java.lang.InterruptedException, Yue.C7137 {
            r3 = this;
            java.lang.Object r0 = r4.attachment()
            Yue.ۥۢۥۡۥ r0 = (Yue.C6989) r0
            java.nio.ByteBuffer r1 = r3.m27109()
            java.nio.channels.ByteChannel r2 = r0.m27030()
            if (r2 != 0) goto L1d
            r4.cancel()
            java.io.IOException r5 = new java.io.IOException
            r5.<init>()
            r3.m27089(r4, r0, r5)
            r4 = 0
            return r4
        L1d:
            java.nio.channels.ByteChannel r4 = r0.m27030()     // Catch: java.io.IOException -> L52
            boolean r4 = Yue.C5821.m21667(r1, r0, r4)     // Catch: java.io.IOException -> L52
            if (r4 == 0) goto L58
            boolean r4 = r1.hasRemaining()     // Catch: java.io.IOException -> L52
            if (r4 == 0) goto L54
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r4 = r0.f24379     // Catch: java.io.IOException -> L52
            r4.put(r1)     // Catch: java.io.IOException -> L52
            r3.m27100(r0)     // Catch: java.io.IOException -> L52
            r5.remove()     // Catch: java.io.IOException -> L52
            java.nio.channels.ByteChannel r4 = r0.m27030()     // Catch: java.io.IOException -> L52
            boolean r4 = r4 instanceof Yue.InterfaceC7132     // Catch: java.io.IOException -> L52
            if (r4 == 0) goto L5b
            java.nio.channels.ByteChannel r4 = r0.m27030()     // Catch: java.io.IOException -> L52
            Yue.ۥۢۦ۠ r4 = (Yue.InterfaceC7132) r4     // Catch: java.io.IOException -> L52
            boolean r4 = r4.mo568()     // Catch: java.io.IOException -> L52
            if (r4 == 0) goto L5b
            java.util.List<Yue.ۥۢۥۡۥ> r4 = r3.f24447     // Catch: java.io.IOException -> L52
            r4.add(r0)     // Catch: java.io.IOException -> L52
            goto L5b
        L52:
            r4 = move-exception
            goto L5d
        L54:
            r3.m27099(r1)     // Catch: java.io.IOException -> L52
            goto L5b
        L58:
            r3.m27099(r1)     // Catch: java.io.IOException -> L52
        L5b:
            r4 = 1
            return r4
        L5d:
            r3.m27099(r1)
            Yue.ۥۢۦۣ۠ r5 = new Yue.ۥۢۦۣ۠
            r5.<init>(r0, r4)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final void m27078() {
            r4 = this;
            r4.m563()
            java.util.List<Yue.ۥۢۥۢ۟$ۥ> r0 = r4.f24446
            if (r0 == 0) goto L1b
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۥۢ۟$ۥ r1 = (Yue.AbstractRunnableC6995.C6996) r1
            r1.interrupt()
            goto Lb
        L1b:
            java.nio.channels.Selector r0 = r4.f24442
            r1 = 0
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.io.IOException -> L24
            goto L2f
        L24:
            r0 = move-exception
            Yue.ۥ۠ۨۡۥ r2 = r4.f24438
            java.lang.String r3 = "IOException during selector.close"
            r2.error(r3, r0)
            r4.m27094(r1, r0)
        L2f:
            java.nio.channels.ServerSocketChannel r0 = r4.f24441
            if (r0 == 0) goto L42
            r0.close()     // Catch: java.io.IOException -> L37
            goto L42
        L37:
            r0 = move-exception
            Yue.ۥ۠ۨۡۥ r2 = r4.f24438
            java.lang.String r3 = "IOException during server.close"
            r2.error(r3, r0)
            r4.m27094(r1, r0)
        L42:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public final boolean m27079() {
            r4 = this;
            java.lang.Thread r0 = r4.f24444
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "WebSocketSelector-"
            r1.append(r2)
            java.lang.Thread r2 = r4.f24444
            long r2 = r2.getId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setName(r1)
            r0 = 0
            java.nio.channels.ServerSocketChannel r1 = java.nio.channels.ServerSocketChannel.open()     // Catch: java.io.IOException -> L69
            r4.f24441 = r1     // Catch: java.io.IOException -> L69
            r1.configureBlocking(r0)     // Catch: java.io.IOException -> L69
            java.nio.channels.ServerSocketChannel r1 = r4.f24441     // Catch: java.io.IOException -> L69
            java.net.ServerSocket r1 = r1.socket()     // Catch: java.io.IOException -> L69
            r2 = 16384(0x4000, float:2.2959E-41)
            r1.setReceiveBufferSize(r2)     // Catch: java.io.IOException -> L69
            boolean r2 = r4.m556()     // Catch: java.io.IOException -> L69
            r1.setReuseAddress(r2)     // Catch: java.io.IOException -> L69
            java.net.InetSocketAddress r2 = r4.f24440     // Catch: java.io.IOException -> L69
            int r3 = r4.m27084()     // Catch: java.io.IOException -> L69
            r1.bind(r2, r3)     // Catch: java.io.IOException -> L69
            java.nio.channels.Selector r1 = java.nio.channels.Selector.open()     // Catch: java.io.IOException -> L69
            r4.f24442 = r1     // Catch: java.io.IOException -> L69
            java.nio.channels.ServerSocketChannel r2 = r4.f24441     // Catch: java.io.IOException -> L69
            int r3 = r2.validOps()     // Catch: java.io.IOException -> L69
            r2.register(r1, r3)     // Catch: java.io.IOException -> L69
            r4.m562()     // Catch: java.io.IOException -> L69
            java.util.List<Yue.ۥۢۥۢ۟$ۥ> r1 = r4.f24446     // Catch: java.io.IOException -> L69
            java.util.Iterator r1 = r1.iterator()     // Catch: java.io.IOException -> L69
        L59:
            boolean r2 = r1.hasNext()     // Catch: java.io.IOException -> L69
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r1.next()     // Catch: java.io.IOException -> L69
            Yue.ۥۢۥۢ۟$ۥ r2 = (Yue.AbstractRunnableC6995.C6996) r2     // Catch: java.io.IOException -> L69
            r2.start()     // Catch: java.io.IOException -> L69
            goto L59
        L69:
            r1 = move-exception
            goto L70
        L6b:
            r4.m27098()     // Catch: java.io.IOException -> L69
            r0 = 1
            return r0
        L70:
            r2 = 0
            r4.m27088(r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public final void m27080(java.nio.channels.SelectionKey r3) throws Yue.C7137 {
            r2 = this;
            java.lang.Object r0 = r3.attachment()
            Yue.ۥۢۥۡۥ r0 = (Yue.C6989) r0
            java.nio.channels.ByteChannel r1 = r0.m27030()     // Catch: java.io.IOException -> L1b
            boolean r1 = Yue.C5821.m21666(r0, r1)     // Catch: java.io.IOException -> L1b
            if (r1 == 0) goto L1d
            boolean r1 = r3.isValid()     // Catch: java.io.IOException -> L1b
            if (r1 == 0) goto L1d
            r1 = 1
            r3.interestOps(r1)     // Catch: java.io.IOException -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L1e
        L1d:
            return
        L1e:
            Yue.ۥۢۦۣ۠ r1 = new Yue.ۥۢۦۣ۠
            r1.<init>(r0, r3)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public final void m27081(Yue.AbstractC1986 r2, java.util.Map<Yue.AbstractC1986, java.util.List<Yue.InterfaceC2813>> r3, java.lang.String r4, java.nio.ByteBuffer r5) {
            r1 = this;
            boolean r0 = r3.containsKey(r2)
            if (r0 != 0) goto L1a
            r0 = 0
            if (r4 == 0) goto Le
            java.util.List r4 = r2.mo9157(r4, r0)
            goto Lf
        Le:
            r4 = 0
        Lf:
            if (r5 == 0) goto L15
            java.util.List r4 = r2.mo9158(r5, r0)
        L15:
            if (r4 == 0) goto L1a
            r3.put(r2, r4)
        L1a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public java.net.InetSocketAddress m27082() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.f24440
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public java.util.List<Yue.AbstractC1986> m27083() {
            r1 = this;
            java.util.List<Yue.ۥ۠۠۠۟> r0 = r1.f24443
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public int m27084() {
            r1 = this;
            int r0 = r1.f24452
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public int m27085() {
            r2 = this;
            java.net.InetSocketAddress r0 = r2.m27082()
            int r0 = r0.getPort()
            if (r0 != 0) goto L16
            java.nio.channels.ServerSocketChannel r1 = r2.f24441
            if (r1 == 0) goto L16
            java.net.ServerSocket r0 = r1.socket()
            int r0 = r0.getLocalPort()
        L16:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public final java.net.Socket m27086(Yue.InterfaceC6981 r1) {
            r0 = this;
            Yue.ۥۢۥۡۥ r1 = (Yue.C6989) r1
            java.nio.channels.SelectionKey r1 = r1.m27032()
            java.nio.channels.SelectableChannel r1 = r1.channel()
            java.nio.channels.SocketChannel r1 = (java.nio.channels.SocketChannel) r1
            java.net.Socket r1 = r1.socket()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public final Yue.InterfaceC6988 m27087() {
            r1 = this;
            Yue.ۥۢۥۢ۠ r0 = r1.f24451
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public final void m27088(Yue.InterfaceC6981 r3, java.lang.Exception r4) {
            r2 = this;
            Yue.ۥ۠ۨۡۥ r0 = r2.f24438
            java.lang.String r1 = "Shutdown due to fatal error"
            r0.error(r1, r4)
            r2.m27094(r3, r4)
            java.lang.Throwable r3 = r4.getCause()
            if (r3 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = " caused by "
            r3.append(r0)
            java.lang.Throwable r0 = r4.getCause()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            goto L30
        L2e:
            java.lang.String r3 = ""
        L30:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Got error on server side: "
            r0.append(r1)
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            r2.m27108(r0, r3)     // Catch: java.lang.InterruptedException -> L51
            goto L64
        L51:
            r3 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            Yue.ۥ۠ۨۡۥ r0 = r2.f24438
            java.lang.String r1 = "Interrupt during stop"
            r0.error(r1, r4)
            r4 = 0
            r2.m27094(r4, r3)
        L64:
            java.util.List<Yue.ۥۢۥۢ۟$ۥ> r3 = r2.f24446
            if (r3 == 0) goto L7c
            java.util.Iterator r3 = r3.iterator()
        L6c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r3.next()
            Yue.ۥۢۥۢ۟$ۥ r4 = (Yue.AbstractRunnableC6995.C6996) r4
            r4.interrupt()
            goto L6c
        L7c:
            java.lang.Thread r3 = r2.f24444
            if (r3 == 0) goto L83
            r3.interrupt()
        L83:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public final void m27089(java.nio.channels.SelectionKey r1, Yue.InterfaceC6981 r2, java.io.IOException r3) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.cancel()
        L5:
            if (r2 == 0) goto L11
            r1 = 1006(0x3ee, float:1.41E-42)
            java.lang.String r3 = r3.getMessage()
            r2.mo26955(r1, r3)
            goto L29
        L11:
            if (r1 == 0) goto L29
            java.nio.channels.SelectableChannel r1 = r1.channel()
            if (r1 == 0) goto L29
            boolean r2 = r1.isOpen()
            if (r2 == 0) goto L29
            r1.close()     // Catch: java.io.IOException -> L22
        L22:
            Yue.ۥ۠ۨۡۥ r1 = r0.f24438
            java.lang.String r2 = "Connection closed because of exception"
            r1.mo10344(r2, r3)
        L29:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public abstract void m27090(Yue.InterfaceC6981 r1, int r2, java.lang.String r3, boolean r4);

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public void m27091(Yue.InterfaceC6981 r1, int r2, java.lang.String r3) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public void m27092(Yue.InterfaceC6981 r1, int r2, java.lang.String r3, boolean r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public boolean m27093(java.nio.channels.SelectionKey r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public abstract void m27094(Yue.InterfaceC6981 r1, java.lang.Exception r2);

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public abstract void m27095(Yue.InterfaceC6981 r1, java.lang.String r2);

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public void m27096(Yue.InterfaceC6981 r1, java.nio.ByteBuffer r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public abstract void m27097(Yue.InterfaceC6981 r1, Yue.InterfaceC1165 r2);

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public abstract void m27098();

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final void m27099(java.nio.ByteBuffer r3) throws java.lang.InterruptedException {
            r2 = this;
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r2.f24448
            int r0 = r0.size()
            java.util.concurrent.atomic.AtomicInteger r1 = r2.f24450
            int r1 = r1.intValue()
            if (r0 <= r1) goto Lf
            return
        Lf:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r2.f24448
            r0.put(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public void m27100(Yue.C6989 r4) throws java.lang.InterruptedException {
            r3 = this;
            Yue.ۥۢۥۢ۟$ۥ r0 = r4.m27034()
            if (r0 != 0) goto L1e
            java.util.List<Yue.ۥۢۥۢ۟$ۥ> r0 = r3.f24446
            int r1 = r3.f24449
            int r2 = r0.size()
            int r1 = r1 % r2
            java.lang.Object r0 = r0.get(r1)
            Yue.ۥۢۥۢ۟$ۥ r0 = (Yue.AbstractRunnableC6995.C6996) r0
            r4.m27039(r0)
            int r0 = r3.f24449
            int r0 = r0 + 1
            r3.f24449 = r0
        L1e:
            Yue.ۥۢۥۢ۟$ۥ r0 = r4.m27034()
            r0.m27111(r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public void m27101(Yue.InterfaceC6981 r1) throws java.lang.InterruptedException {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public boolean m27102(Yue.InterfaceC6981 r4) {
            r3 = this;
            java.util.Collection<Yue.ۥۢۥۡ۠> r0 = r3.f24439
            monitor-enter(r0)
            java.util.Collection<Yue.ۥۢۥۡ۠> r1 = r3.f24439     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.contains(r4)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.util.Collection<Yue.ۥۢۥۡ۠> r1 = r3.f24439     // Catch: java.lang.Throwable -> L12
            boolean r4 = r1.remove(r4)     // Catch: java.lang.Throwable -> L12
            goto L1c
        L12:
            r4 = move-exception
            goto L33
        L14:
            Yue.ۥ۠ۨۡۥ r1 = r3.f24438     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "Removing connection which is not in the connections collection! Possible no handshake received! {}"
            r1.mo10321(r2, r4)     // Catch: java.lang.Throwable -> L12
            r4 = 0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f24445
            boolean r0 = r0.get()
            if (r0 == 0) goto L32
            java.util.Collection<Yue.ۥۢۥۡ۠> r0 = r3.f24439
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
            java.lang.Thread r0 = r3.f24444
            r0.interrupt()
        L32:
            return r4
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public void m27103(int r1) {
            r0 = this;
            r0.f24452 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public final void m27104(Yue.InterfaceC6998 r2) {
            r1 = this;
            Yue.ۥۢۥۢ۠ r0 = r1.f24451
            if (r0 == 0) goto L7
            r0.close()
        L7:
            r1.f24451 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public void m27105() {
            r3 = this;
            java.lang.Thread r0 = r3.f24444
            if (r0 != 0) goto Ld
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r3)
            r0.start()
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " can only be started once."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public void m27106() throws java.lang.InterruptedException {
            r1 = this;
            r0 = 0
            r1.m27107(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public void m27107(int r2) throws java.lang.InterruptedException {
            r1 = this;
            java.lang.String r0 = ""
            r1.m27108(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public void m27108(int r4, java.lang.String r5) throws java.lang.InterruptedException {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f24445
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.Collection<Yue.ۥۢۥۡ۠> r0 = r3.f24439
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4a
            java.util.Collection<Yue.ۥۢۥۡ۠> r2 = r3.f24439     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r0 = r1.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۥۡ۠ r1 = (Yue.InterfaceC6981) r1
            r2 = 1001(0x3e9, float:1.403E-42)
            r1.mo26936(r2, r5)
            goto L1a
        L2c:
            Yue.ۥۢۥۢ۠ r5 = r3.f24451
            r5.close()
            monitor-enter(r3)
            java.lang.Thread r5 = r3.f24444     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L46
            java.nio.channels.Selector r5 = r3.f24442     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L46
            r5.wakeup()     // Catch: java.lang.Throwable -> L44
            java.lang.Thread r5 = r3.f24444     // Catch: java.lang.Throwable -> L44
            long r0 = (long) r4     // Catch: java.lang.Throwable -> L44
            r5.join(r0)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r4 = move-exception
            goto L48
        L46:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            return
        L48:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            throw r4
        L4a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public final java.nio.ByteBuffer m27109() throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r1.f24448
            java.lang.Object r0 = r0.take()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
    }
}
