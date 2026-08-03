package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0632 extends Yue.C6250 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0632.C0633 f1606 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.concurrent.locks.ReentrantLock f1607 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.concurrent.locks.Condition f1608 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f1609 = 65536;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final long f1610 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final long f1611 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public static Yue.C0632 f1612;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f1613;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C0632 f1614;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public long f1615;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"})
    public static final class C0633 {
        public C0633() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0633(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ boolean m4167(Yue.C0632.C0633 r0, Yue.C0632 r1) {
                boolean r0 = r0.m4170(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final /* synthetic */ void m4168(Yue.C0632.C0633 r0, Yue.C0632 r1, long r2, boolean r4) {
                r0.m4173(r1, r2, r4)
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C0632 m4169() throws java.lang.InterruptedException {
                r7 = this;
                Yue.ۥ۟ۢ۟ۤ r0 = Yue.C0632.m4147()
                Yue.C3329.m13903(r0)
                Yue.ۥ۟ۢ۟ۤ r0 = Yue.C0632.m4152(r0)
                r1 = 0
                if (r0 != 0) goto L3e
                long r2 = java.lang.System.nanoTime()
                java.util.concurrent.locks.Condition r0 = r7.m4171()
                long r4 = Yue.C0632.m4148()
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                r0.await(r4, r6)
                Yue.ۥ۟ۢ۟ۤ r0 = Yue.C0632.m4147()
                Yue.C3329.m13903(r0)
                Yue.ۥ۟ۢ۟ۤ r0 = Yue.C0632.m4152(r0)
                if (r0 != 0) goto L3d
                long r4 = java.lang.System.nanoTime()
                long r4 = r4 - r2
                long r2 = Yue.C0632.m4149()
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 < 0) goto L3d
                Yue.ۥ۟ۢ۟ۤ r1 = Yue.C0632.m4147()
            L3d:
                return r1
            L3e:
                long r2 = java.lang.System.nanoTime()
                long r2 = Yue.C0632.m4153(r0, r2)
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 <= 0) goto L56
                java.util.concurrent.locks.Condition r0 = r7.m4171()
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
                r0.await(r2, r4)
                return r1
            L56:
                Yue.ۥ۟ۢ۟ۤ r2 = Yue.C0632.m4147()
                Yue.C3329.m13903(r2)
                Yue.ۥ۟ۢ۟ۤ r3 = Yue.C0632.m4152(r0)
                Yue.C0632.m4156(r2, r3)
                Yue.C0632.m4156(r0, r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m4170(Yue.C0632 r5) {
                r4 = this;
                Yue.ۥ۟ۢ۟ۤ$ۥ r0 = Yue.C0632.f1606
                java.util.concurrent.locks.ReentrantLock r0 = r0.m4172()
                r0.lock()
                boolean r1 = Yue.C0632.m4150(r5)     // Catch: java.lang.Throwable -> L32
                r2 = 0
                if (r1 != 0) goto L14
                r0.unlock()
                return r2
            L14:
                Yue.C0632.m4155(r5, r2)     // Catch: java.lang.Throwable -> L32
                Yue.ۥ۟ۢ۟ۤ r1 = Yue.C0632.m4147()     // Catch: java.lang.Throwable -> L32
            L1b:
                if (r1 == 0) goto L39
                Yue.ۥ۟ۢ۟ۤ r3 = Yue.C0632.m4152(r1)     // Catch: java.lang.Throwable -> L32
                if (r3 != r5) goto L34
                Yue.ۥ۟ۢ۟ۤ r3 = Yue.C0632.m4152(r5)     // Catch: java.lang.Throwable -> L32
                Yue.C0632.m4156(r1, r3)     // Catch: java.lang.Throwable -> L32
                r1 = 0
                Yue.C0632.m4156(r5, r1)     // Catch: java.lang.Throwable -> L32
                r0.unlock()
                return r2
            L32:
                r5 = move-exception
                goto L3e
            L34:
                Yue.ۥ۟ۢ۟ۤ r1 = Yue.C0632.m4152(r1)     // Catch: java.lang.Throwable -> L32
                goto L1b
            L39:
                r0.unlock()
                r5 = 1
                return r5
            L3e:
                r0.unlock()
                throw r5
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final java.util.concurrent.locks.Condition m4171() {
                r1 = this;
                java.util.concurrent.locks.Condition r0 = Yue.C0632.m4146()
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final java.util.concurrent.locks.ReentrantLock m4172() {
                r1 = this;
                java.util.concurrent.locks.ReentrantLock r0 = Yue.C0632.m4151()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m4173(Yue.C0632 r6, long r7, boolean r9) {
                r5 = this;
                Yue.ۥ۟ۢ۟ۤ$ۥ r0 = Yue.C0632.f1606
                java.util.concurrent.locks.ReentrantLock r0 = r0.m4172()
                r0.lock()
                boolean r1 = Yue.C0632.m4150(r6)     // Catch: java.lang.Throwable -> L2b
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto La6
                Yue.C0632.m4155(r6, r2)     // Catch: java.lang.Throwable -> L2b
                Yue.ۥ۟ۢ۟ۤ r1 = Yue.C0632.m4147()     // Catch: java.lang.Throwable -> L2b
                if (r1 != 0) goto L2e
                Yue.ۥ۟ۢ۟ۤ r1 = new Yue.ۥ۟ۢ۟ۤ     // Catch: java.lang.Throwable -> L2b
                r1.<init>()     // Catch: java.lang.Throwable -> L2b
                Yue.C0632.m4154(r1)     // Catch: java.lang.Throwable -> L2b
                Yue.ۥ۟ۢ۟ۤ$ۥ۟ r1 = new Yue.ۥ۟ۢ۟ۤ$ۥ۟     // Catch: java.lang.Throwable -> L2b
                r1.<init>()     // Catch: java.lang.Throwable -> L2b
                r1.start()     // Catch: java.lang.Throwable -> L2b
                goto L2e
            L2b:
                r6 = move-exception
                goto Lb2
            L2e:
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2b
                r3 = 0
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 == 0) goto L48
                if (r9 == 0) goto L48
                long r3 = r6.mo12059()     // Catch: java.lang.Throwable -> L2b
                long r3 = r3 - r1
                long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L2b
                long r7 = r7 + r1
                Yue.C0632.m4157(r6, r7)     // Catch: java.lang.Throwable -> L2b
                goto L58
            L48:
                if (r3 == 0) goto L4f
                long r7 = r7 + r1
                Yue.C0632.m4157(r6, r7)     // Catch: java.lang.Throwable -> L2b
                goto L58
            L4f:
                if (r9 == 0) goto La0
                long r7 = r6.mo12059()     // Catch: java.lang.Throwable -> L2b
                Yue.C0632.m4157(r6, r7)     // Catch: java.lang.Throwable -> L2b
            L58:
                long r7 = Yue.C0632.m4153(r6, r1)     // Catch: java.lang.Throwable -> L2b
                Yue.ۥ۟ۢ۟ۤ r9 = Yue.C0632.m4147()     // Catch: java.lang.Throwable -> L2b
                Yue.C3329.m13903(r9)     // Catch: java.lang.Throwable -> L2b
            L63:
                Yue.ۥ۟ۢ۟ۤ r3 = Yue.C0632.m4152(r9)     // Catch: java.lang.Throwable -> L2b
                if (r3 == 0) goto L81
                Yue.ۥ۟ۢ۟ۤ r3 = Yue.C0632.m4152(r9)     // Catch: java.lang.Throwable -> L2b
                Yue.C3329.m13903(r3)     // Catch: java.lang.Throwable -> L2b
                long r3 = Yue.C0632.m4153(r3, r1)     // Catch: java.lang.Throwable -> L2b
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 >= 0) goto L79
                goto L81
            L79:
                Yue.ۥ۟ۢ۟ۤ r9 = Yue.C0632.m4152(r9)     // Catch: java.lang.Throwable -> L2b
                Yue.C3329.m13903(r9)     // Catch: java.lang.Throwable -> L2b
                goto L63
            L81:
                Yue.ۥ۟ۢ۟ۤ r7 = Yue.C0632.m4152(r9)     // Catch: java.lang.Throwable -> L2b
                Yue.C0632.m4156(r6, r7)     // Catch: java.lang.Throwable -> L2b
                Yue.C0632.m4156(r9, r6)     // Catch: java.lang.Throwable -> L2b
                Yue.ۥ۟ۢ۟ۤ r6 = Yue.C0632.m4147()     // Catch: java.lang.Throwable -> L2b
                if (r9 != r6) goto L9a
                Yue.ۥ۟ۢ۟ۤ$ۥ r6 = Yue.C0632.f1606     // Catch: java.lang.Throwable -> L2b
                java.util.concurrent.locks.Condition r6 = r6.m4171()     // Catch: java.lang.Throwable -> L2b
                r6.signal()     // Catch: java.lang.Throwable -> L2b
            L9a:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L2b
                r0.unlock()
                return
            La0:
                java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L2b
                r6.<init>()     // Catch: java.lang.Throwable -> L2b
                throw r6     // Catch: java.lang.Throwable -> L2b
            La6:
                java.lang.String r6 = "Unbalanced enter/exit"
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2b
                r7.<init>(r6)     // Catch: java.lang.Throwable -> L2b
                throw r7     // Catch: java.lang.Throwable -> L2b
            Lb2:
                r0.unlock()
                throw r6
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۤ$ۥ۟, reason: contains not printable characters */
    public static final class C0634 extends java.lang.Thread {
        public C0634() {
                r1 = this;
                java.lang.String r0 = "Okio Watchdog"
                r1.<init>(r0)
                r0 = 1
                r1.setDaemon(r0)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r3 = this;
            L0:
                Yue.ۥ۟ۢ۟ۤ$ۥ r0 = Yue.C0632.f1606     // Catch: java.lang.InterruptedException -> L0
                java.util.concurrent.locks.ReentrantLock r1 = r0.m4172()     // Catch: java.lang.InterruptedException -> L0
                r1.lock()     // Catch: java.lang.InterruptedException -> L0
                Yue.ۥ۟ۢ۟ۤ r0 = r0.m4169()     // Catch: java.lang.Throwable -> L1b
                Yue.ۥ۟ۢ۟ۤ r2 = Yue.C0632.m4147()     // Catch: java.lang.Throwable -> L1b
                if (r0 != r2) goto L1d
                r0 = 0
                Yue.C0632.m4154(r0)     // Catch: java.lang.Throwable -> L1b
                r1.unlock()     // Catch: java.lang.InterruptedException -> L0
                return
            L1b:
                r0 = move-exception
                goto L28
            L1d:
                Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L1b
                r1.unlock()     // Catch: java.lang.InterruptedException -> L0
                if (r0 == 0) goto L0
                r0.mo4165()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L28:
                r1.unlock()     // Catch: java.lang.InterruptedException -> L0
                throw r0     // Catch: java.lang.InterruptedException -> L0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۤ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n146#2,11:354\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n*L\n102#1:332,11\n108#1:343,11\n112#1:354,11\n*E\n"})
    public static final class C0635 implements Yue.InterfaceC5794 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0632 f1616;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC5794 f1617;

        public C0635(Yue.C0632 r1, Yue.InterfaceC5794 r2) {
                r0 = this;
                r0.f1616 = r1
                r0.f1617 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5794, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                Yue.ۥ۟ۢ۟ۤ r0 = r3.f1616
                Yue.ۥۣۢ۟ۡ r1 = r3.f1617
                r0.m4159()
                r1.close()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                boolean r1 = r0.m4160()
                if (r1 != 0) goto L13
                return
            L13:
                r1 = 0
                java.io.IOException r0 = r0.m4158(r1)
                throw r0
            L19:
                r1 = move-exception
                goto L28
            L1b:
                r1 = move-exception
                boolean r2 = r0.m4160()     // Catch: java.lang.Throwable -> L19
                if (r2 != 0) goto L23
                goto L27
            L23:
                java.io.IOException r1 = r0.m4158(r1)     // Catch: java.lang.Throwable -> L19
            L27:
                throw r1     // Catch: java.lang.Throwable -> L19
            L28:
                r0.m4160()
                throw r1
        }

        @Override // Yue.InterfaceC5794, java.io.Flushable
        public void flush() {
                r3 = this;
                Yue.ۥ۟ۢ۟ۤ r0 = r3.f1616
                Yue.ۥۣۢ۟ۡ r1 = r3.f1617
                r0.m4159()
                r1.flush()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                boolean r1 = r0.m4160()
                if (r1 != 0) goto L13
                return
            L13:
                r1 = 0
                java.io.IOException r0 = r0.m4158(r1)
                throw r0
            L19:
                r1 = move-exception
                goto L28
            L1b:
                r1 = move-exception
                boolean r2 = r0.m4160()     // Catch: java.lang.Throwable -> L19
                if (r2 != 0) goto L23
                goto L27
            L23:
                java.io.IOException r1 = r0.m4158(r1)     // Catch: java.lang.Throwable -> L19
            L27:
                throw r1     // Catch: java.lang.Throwable -> L19
            L28:
                r0.m4160()
                throw r1
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AsyncTimeout.sink("
                r0.append(r1)
                Yue.ۥۣۢ۟ۡ r1 = r2.f1617
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.InterfaceC5794
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public /* bridge */ /* synthetic */ Yue.C6250 mo4174() {
                r1 = this;
                Yue.ۥ۟ۢ۟ۤ r0 = r1.m4175()
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C0632 m4175() {
                r1 = this;
                Yue.ۥ۟ۢ۟ۤ r0 = r1.f1616
                return r0
        }

        @Override // Yue.InterfaceC5794
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void mo4176(@Yue.InterfaceC4418 Yue.C0843 r8, long r9) {
                r7 = this;
                java.lang.String r0 = "source"
                Yue.C3329.m13906(r8, r0)
                long r1 = r8.m4889()
                r3 = 0
                r5 = r9
                Yue.C0018.m264(r1, r3, r5)
            Lf:
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 <= 0) goto L61
                Yue.ۥۡۧۨ r2 = r8.f2378
                Yue.C3329.m13903(r2)
            L1a:
                r3 = 65536(0x10000, double:3.2379E-319)
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 >= 0) goto L34
                int r3 = r2.f20492
                int r4 = r2.f20491
                int r3 = r3 - r4
                long r3 = (long) r3
                long r0 = r0 + r3
                int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                if (r3 < 0) goto L2e
                r0 = r9
                goto L34
            L2e:
                Yue.ۥۡۧۨ r2 = r2.f20495
                Yue.C3329.m13903(r2)
                goto L1a
            L34:
                Yue.ۥ۟ۢ۟ۤ r2 = r7.f1616
                Yue.ۥۣۢ۟ۡ r3 = r7.f1617
                r2.m4159()
                r3.mo4176(r8, r0)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
                Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
                boolean r3 = r2.m4160()
                if (r3 != 0) goto L48
                long r9 = r9 - r0
                goto Lf
            L48:
                r8 = 0
                java.io.IOException r8 = r2.m4158(r8)
                throw r8
            L4e:
                r8 = move-exception
                goto L5d
            L50:
                r8 = move-exception
                boolean r9 = r2.m4160()     // Catch: java.lang.Throwable -> L4e
                if (r9 != 0) goto L58
                goto L5c
            L58:
                java.io.IOException r8 = r2.m4158(r8)     // Catch: java.lang.Throwable -> L4e
            L5c:
                throw r8     // Catch: java.lang.Throwable -> L4e
            L5d:
                r2.m4160()
                throw r8
            L61:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۤ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n128#1:332,11\n132#1:343,11\n*E\n"})
    public static final class C0636 implements Yue.InterfaceC5839 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0632 f1618;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC5839 f1619;

        public C0636(Yue.C0632 r1, Yue.InterfaceC5839 r2) {
                r0 = this;
                r0.f1618 = r1
                r0.f1619 = r2
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                Yue.ۥ۟ۢ۟ۤ r0 = r3.f1618
                Yue.ۥۣۢ۟ۦ r1 = r3.f1619
                r0.m4159()
                r1.close()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
                boolean r1 = r0.m4160()
                if (r1 != 0) goto L13
                return
            L13:
                r1 = 0
                java.io.IOException r0 = r0.m4158(r1)
                throw r0
            L19:
                r1 = move-exception
                goto L28
            L1b:
                r1 = move-exception
                boolean r2 = r0.m4160()     // Catch: java.lang.Throwable -> L19
                if (r2 != 0) goto L23
                goto L27
            L23:
                java.io.IOException r1 = r0.m4158(r1)     // Catch: java.lang.Throwable -> L19
            L27:
                throw r1     // Catch: java.lang.Throwable -> L19
            L28:
                r0.m4160()
                throw r1
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AsyncTimeout.source("
                r0.append(r1)
                Yue.ۥۣۢ۟ۦ r1 = r2.f1619
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.InterfaceC5839
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public /* bridge */ /* synthetic */ Yue.C6250 mo4177() {
                r1 = this;
                Yue.ۥ۟ۢ۟ۤ r0 = r1.m4178()
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C0632 m4178() {
                r1 = this;
                Yue.ۥ۟ۢ۟ۤ r0 = r1.f1618
                return r0
        }

        @Override // Yue.InterfaceC5839
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r3, long r4) {
                r2 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥ۟ۢ۟ۤ r0 = r2.f1618
                Yue.ۥۣۢ۟ۦ r1 = r2.f1619
                r0.m4159()
                long r3 = r1.mo4179(r3, r4)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L1f
                boolean r5 = r0.m4160()
                if (r5 != 0) goto L17
                return r3
            L17:
                r3 = 0
                java.io.IOException r3 = r0.m4158(r3)
                throw r3
            L1d:
                r3 = move-exception
                goto L2c
            L1f:
                r3 = move-exception
                boolean r4 = r0.m4160()     // Catch: java.lang.Throwable -> L1d
                if (r4 != 0) goto L27
                goto L2b
            L27:
                java.io.IOException r3 = r0.m4158(r3)     // Catch: java.lang.Throwable -> L1d
            L2b:
                throw r3     // Catch: java.lang.Throwable -> L1d
            L2c:
                r0.m4160()
                throw r3
        }
    }

    static {
            Yue.ۥ۟ۢ۟ۤ$ۥ r0 = new Yue.ۥ۟ۢ۟ۤ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C0632.f1606 = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            Yue.C0632.f1607 = r0
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            java.lang.String r1 = "newCondition(...)"
            Yue.C3329.m13905(r0, r1)
            Yue.C0632.f1608 = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 60
            long r0 = r0.toMillis(r1)
            Yue.C0632.f1610 = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r2.toNanos(r0)
            Yue.C0632.f1611 = r0
            return
    }

    public C0632() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.locks.Condition m4146() {
            java.util.concurrent.locks.Condition r0 = Yue.C0632.f1608
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C0632 m4147() {
            Yue.ۥ۟ۢ۟ۤ r0 = Yue.C0632.f1612
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ long m4148() {
            long r0 = Yue.C0632.f1610
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final /* synthetic */ long m4149() {
            long r0 = Yue.C0632.f1611
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final /* synthetic */ boolean m4150(Yue.C0632 r0) {
            boolean r0 = r0.f1613
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.locks.ReentrantLock m4151() {
            java.util.concurrent.locks.ReentrantLock r0 = Yue.C0632.f1607
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C0632 m4152(Yue.C0632 r0) {
            Yue.ۥ۟ۢ۟ۤ r0 = r0.f1614
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ long m4153(Yue.C0632 r0, long r1) {
            long r0 = r0.m4162(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final /* synthetic */ void m4154(Yue.C0632 r0) {
            Yue.C0632.f1612 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ void m4155(Yue.C0632 r0, boolean r1) {
            r0.f1613 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ void m4156(Yue.C0632 r0, Yue.C0632 r1) {
            r0.f1614 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ void m4157(Yue.C0632 r0, long r1) {
            r0.f1615 = r1
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.io.IOException m4158(@Yue.InterfaceC4543 java.io.IOException r1) {
            r0 = this;
            java.io.IOException r1 = r0.mo4161(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m4159() {
            r5 = this;
            long r0 = r5.mo12064()
            boolean r2 = r5.mo12061()
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L11
            if (r2 != 0) goto L11
            return
        L11:
            Yue.ۥ۟ۢ۟ۤ$ۥ r3 = Yue.C0632.f1606
            Yue.C0632.C0633.m4168(r3, r5, r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean m4160() {
            r1 = this;
            Yue.ۥ۟ۢ۟ۤ$ۥ r0 = Yue.C0632.f1606
            boolean r0 = Yue.C0632.C0633.m4167(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public java.io.IOException mo4161(@Yue.InterfaceC4543 java.io.IOException r3) {
            r2 = this;
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Lc
            r0.initCause(r3)
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final long m4162(long r3) {
            r2 = this;
            long r0 = r2.f1615
            long r0 = r0 - r3
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final Yue.InterfaceC5794 m4163(@Yue.InterfaceC4418 Yue.InterfaceC5794 r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟ۢ۟ۤ$ۥ۟۟ r0 = new Yue.ۥ۟ۢ۟ۤ$ۥ۟۟
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final Yue.InterfaceC5839 m4164(@Yue.InterfaceC4418 Yue.InterfaceC5839 r2) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟ۢ۟ۤ$ۥ۟۟۟ r0 = new Yue.ۥ۟ۢ۟ۤ$ۥ۟۟۟
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void mo4165() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final <T> T m4166(@Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r3, r0)
            r2.m4159()
            r0 = 1
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            Yue.C3249.m13687(r0)
            boolean r1 = r2.m4160()
            if (r1 != 0) goto L1a
            Yue.C3249.m13686(r0)
            return r3
        L1a:
            r3 = 0
            java.io.IOException r3 = r2.m4158(r3)
            throw r3
        L20:
            r3 = move-exception
            goto L2f
        L22:
            r3 = move-exception
            boolean r1 = r2.m4160()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L2a
            goto L2e
        L2a:
            java.io.IOException r3 = r2.m4158(r3)     // Catch: java.lang.Throwable -> L20
        L2e:
            throw r3     // Catch: java.lang.Throwable -> L20
        L2f:
            Yue.C3249.m13687(r0)
            r2.m4160()
            Yue.C3249.m13686(r0)
            throw r3
    }
}
